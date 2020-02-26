package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bhm */
/* compiled from: PG */
public final class bhm extends bho {

    /* renamed from: a */
    private final AssetManager f3973a;

    /* renamed from: b */
    private Uri f3974b;

    /* renamed from: c */
    private InputStream f3975c;

    /* renamed from: d */
    private long f3976d;

    /* renamed from: e */
    private boolean f3977e;

    public bhm(Context context) {
        super(false);
        this.f3973a = context.getAssets();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f3974b;
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f3974b = null;
        try {
            InputStream inputStream = this.f3975c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f3975c = null;
            if (this.f3977e) {
                this.f3977e = false;
                mo1944d();
            }
        } catch (IOException e) {
            throw new bhl(e);
        } catch (Throwable th) {
            this.f3975c = null;
            if (this.f3977e) {
                this.f3977e = false;
                mo1944d();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        try {
            Uri uri = bhy.f3998a;
            this.f3974b = uri;
            String str = (String) bks.m3507a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            mo1945e();
            InputStream open = this.f3973a.open(str, 1);
            this.f3975c = open;
            if (open.skip(bhy.f4002e) >= bhy.f4002e) {
                long j = bhy.f4003f;
                if (j == -1) {
                    long available = (long) this.f3975c.available();
                    this.f3976d = available;
                    if (available == 2147483647L) {
                        this.f3976d = -1;
                    }
                } else {
                    this.f3976d = j;
                }
                this.f3977e = true;
                mo1943b(bhy);
                return this.f3976d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new bhl(e);
        }
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3976d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new bhl(e);
            }
        }
        int read = ((InputStream) blm.m3636a((Object) this.f3975c)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f3976d;
            if (j2 != -1) {
                this.f3976d = j2 - ((long) read);
            }
            mo1942a(read);
            return read;
        } else if (this.f3976d == -1) {
            return -1;
        } else {
            throw new bhl(new EOFException());
        }
    }
}
