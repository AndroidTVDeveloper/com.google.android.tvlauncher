package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: bhq  reason: default package */
/* compiled from: PG */
public final class bhq extends bho {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public bhq(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    public final Uri a() {
        return this.b;
    }

    public final void c() {
        this.b = null;
        try {
            FileInputStream fileInputStream = this.d;
            if (fileInputStream != null) {
                fileInputStream.close();
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
                throw new bhp(e2);
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new bhp(e3);
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
                throw new bhp(e4);
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
            e();
            AssetFileDescriptor openAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
            this.c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(bhy.e + startOffset) - startOffset;
                if (skip == bhy.e) {
                    long j = bhy.f;
                    long j2 = -1;
                    if (j == -1) {
                        long length = openAssetFileDescriptor.getLength();
                        if (length != -1) {
                            this.e = length - skip;
                        } else {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j2 = size - channel.position();
                            }
                            this.e = j2;
                        }
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
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e2) {
            throw new bhp(e2);
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
                throw new bhp(e2);
            }
        }
        int read = ((FileInputStream) blm.a((Object) this.d)).read(bArr, i, i2);
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
            throw new bhp(new EOFException());
        }
    }
}
