package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: bhq */
/* compiled from: PG */
public final class bhq extends bho {

    /* renamed from: a */
    private final ContentResolver f3982a;

    /* renamed from: b */
    private Uri f3983b;

    /* renamed from: c */
    private AssetFileDescriptor f3984c;

    /* renamed from: d */
    private FileInputStream f3985d;

    /* renamed from: e */
    private long f3986e;

    /* renamed from: f */
    private boolean f3987f;

    public bhq(Context context) {
        super(false);
        this.f3982a = context.getContentResolver();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f3983b;
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f3983b = null;
        try {
            FileInputStream fileInputStream = this.f3985d;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f3985d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f3984c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f3984c = null;
                if (this.f3987f) {
                    this.f3987f = false;
                    mo1944d();
                }
            } catch (IOException e) {
                throw new bhp(e);
            } catch (Throwable th) {
                this.f3984c = null;
                if (this.f3987f) {
                    this.f3987f = false;
                    mo1944d();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new bhp(e2);
        } catch (Throwable th2) {
            this.f3985d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f3984c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f3984c = null;
                if (this.f3987f) {
                    this.f3987f = false;
                    mo1944d();
                }
                throw th2;
            } catch (IOException e3) {
                throw new bhp(e3);
            } catch (Throwable th3) {
                this.f3984c = null;
                if (this.f3987f) {
                    this.f3987f = false;
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
            this.f3983b = uri;
            mo1945e();
            AssetFileDescriptor openAssetFileDescriptor = this.f3982a.openAssetFileDescriptor(uri, "r");
            this.f3984c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f3985d = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(bhy.f4002e + startOffset) - startOffset;
                if (skip == bhy.f4002e) {
                    long j = bhy.f4003f;
                    long j2 = -1;
                    if (j == -1) {
                        long length = openAssetFileDescriptor.getLength();
                        if (length != -1) {
                            this.f3986e = length - skip;
                        } else {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j2 = size - channel.position();
                            }
                            this.f3986e = j2;
                        }
                    } else {
                        this.f3986e = j;
                    }
                    this.f3987f = true;
                    mo1943b(bhy);
                    return this.f3986e;
                }
                throw new EOFException();
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new bhp(e);
        }
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3986e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new bhp(e);
            }
        }
        int read = ((FileInputStream) blm.m3636a((Object) this.f3985d)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f3986e;
            if (j2 != -1) {
                this.f3986e = j2 - ((long) read);
            }
            mo1942a(read);
            return read;
        } else if (this.f3986e == -1) {
            return -1;
        } else {
            throw new bhp(new EOFException());
        }
    }
}
