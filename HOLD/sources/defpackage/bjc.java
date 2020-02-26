package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bjc  reason: default package */
/* compiled from: PG */
public final class bjc extends bho {
    private final Resources a;
    private Uri b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public bjc(Context context) {
        super(false);
        this.a = context.getResources();
    }

    public final Uri a() {
        return this.b;
    }

    public final void c() {
        this.b = null;
        try {
            InputStream inputStream = this.d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
            } catch (IOException e2) {
                throw new bjb(e2);
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new bjb(e3);
        } catch (Throwable th2) {
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th2;
            } catch (IOException e4) {
                throw new bjb(e4);
            } catch (Throwable th3) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th3;
            }
        }
    }

    public final long a(bhy bhy) {
        try {
            Uri uri = bhy.a;
            this.b = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                int parseInt = Integer.parseInt((String) bks.a((Object) uri.getLastPathSegment()));
                e();
                AssetFileDescriptor openRawResourceFd = this.a.openRawResourceFd(parseInt);
                this.c = openRawResourceFd;
                if (openRawResourceFd != null) {
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.d = fileInputStream;
                    fileInputStream.skip(openRawResourceFd.getStartOffset());
                    if (fileInputStream.skip(bhy.e) >= bhy.e) {
                        long j = bhy.f;
                        long j2 = -1;
                        if (j == -1) {
                            long length = openRawResourceFd.getLength();
                            if (length != -1) {
                                j2 = length - bhy.e;
                            }
                            this.e = j2;
                        } else {
                            this.e = j;
                        }
                        this.f = true;
                        b(bhy);
                        return this.e;
                    }
                    throw new EOFException();
                }
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Resource is compressed: ");
                sb.append(valueOf);
                throw new bjb(sb.toString());
            }
            throw new bjb("URI must use scheme rawresource");
        } catch (NumberFormatException e2) {
            throw new bjb("Resource identifier must be an integer.");
        } catch (IOException e3) {
            throw new bjb(e3);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new bjb(e2);
            }
        }
        int read = ((InputStream) blm.a((Object) this.d)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.e;
            if (j2 != -1) {
                this.e = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.e == -1) {
            return -1;
        } else {
            throw new bjb(new EOFException());
        }
    }
}
