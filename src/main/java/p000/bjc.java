package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bjc */
/* compiled from: PG */
public final class bjc extends bho {

    /* renamed from: a */
    private final Resources f4109a;

    /* renamed from: b */
    private Uri f4110b;

    /* renamed from: c */
    private AssetFileDescriptor f4111c;

    /* renamed from: d */
    private InputStream f4112d;

    /* renamed from: e */
    private long f4113e;

    /* renamed from: f */
    private boolean f4114f;

    public bjc(Context context) {
        super(false);
        this.f4109a = context.getResources();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f4110b;
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f4110b = null;
        try {
            InputStream inputStream = this.f4112d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f4112d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f4111c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f4111c = null;
                if (this.f4114f) {
                    this.f4114f = false;
                    mo1944d();
                }
            } catch (IOException e) {
                throw new bjb(e);
            } catch (Throwable th) {
                this.f4111c = null;
                if (this.f4114f) {
                    this.f4114f = false;
                    mo1944d();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new bjb(e2);
        } catch (Throwable th2) {
            this.f4112d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f4111c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f4111c = null;
                if (this.f4114f) {
                    this.f4114f = false;
                    mo1944d();
                }
                throw th2;
            } catch (IOException e3) {
                throw new bjb(e3);
            } catch (Throwable th3) {
                this.f4111c = null;
                if (this.f4114f) {
                    this.f4114f = false;
                    mo1944d();
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        try {
            Uri uri = bhy.f3998a;
            this.f4110b = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                int parseInt = Integer.parseInt((String) bks.m3507a((Object) uri.getLastPathSegment()));
                mo1945e();
                AssetFileDescriptor openRawResourceFd = this.f4109a.openRawResourceFd(parseInt);
                this.f4111c = openRawResourceFd;
                if (openRawResourceFd != null) {
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.f4112d = fileInputStream;
                    fileInputStream.skip(openRawResourceFd.getStartOffset());
                    if (fileInputStream.skip(bhy.f4002e) >= bhy.f4002e) {
                        long j = bhy.f4003f;
                        long j2 = -1;
                        if (j == -1) {
                            long length = openRawResourceFd.getLength();
                            if (length != -1) {
                                j2 = length - bhy.f4002e;
                            }
                            this.f4113e = j2;
                        } else {
                            this.f4113e = j;
                        }
                        this.f4114f = true;
                        mo1943b(bhy);
                        return this.f4113e;
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
        } catch (NumberFormatException e) {
            throw new bjb("Resource identifier must be an integer.");
        } catch (IOException e2) {
            throw new bjb(e2);
        }
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4113e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new bjb(e);
            }
        }
        int read = ((InputStream) blm.m3636a((Object) this.f4112d)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f4113e;
            if (j2 != -1) {
                this.f4113e = j2 - ((long) read);
            }
            mo1942a(read);
            return read;
        } else if (this.f4113e == -1) {
            return -1;
        } else {
            throw new bjb(new EOFException());
        }
    }
}
