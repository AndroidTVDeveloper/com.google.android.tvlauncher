package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bhm  reason: default package */
/* compiled from: PG */
public final class bhm extends bho {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public bhm(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    public final Uri a() {
        return this.b;
    }

    public final void c() {
        this.b = null;
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.c = null;
            if (this.e) {
                this.e = false;
                d();
            }
        } catch (IOException e2) {
            throw new bhl(e2);
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                d();
            }
            throw th;
        }
    }

    public final long a(bhy bhy) {
        try {
            Uri uri = bhy.a;
            this.b = uri;
            String str = (String) bks.a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            e();
            InputStream open = this.a.open(str, 1);
            this.c = open;
            if (open.skip(bhy.e) >= bhy.e) {
                long j = bhy.f;
                if (j == -1) {
                    long available = (long) this.c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1;
                    }
                } else {
                    this.d = j;
                }
                this.e = true;
                b(bhy);
                return this.d;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new bhl(e2);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new bhl(e2);
            }
        }
        int read = ((InputStream) blm.a((Object) this.c)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.d == -1) {
            return -1;
        } else {
            throw new bhl(new EOFException());
        }
    }
}
