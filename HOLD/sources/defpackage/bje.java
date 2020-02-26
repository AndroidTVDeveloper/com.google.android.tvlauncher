package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: bje  reason: default package */
/* compiled from: PG */
public final class bje implements bhv {
    private final bhv a;
    private final bht b;
    private boolean c;
    private long d;

    public bje(bhv bhv, bht bht) {
        this.a = (bhv) bks.a(bhv);
        this.b = (bht) bks.a(bht);
    }

    public final void a(bjf bjf) {
        this.a.a(bjf);
    }

    public final void c() {
        try {
            this.a.c();
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
            throw th;
        }
    }

    public final Map b() {
        return this.a.b();
    }

    public final Uri a() {
        return this.a.a();
    }

    public final long a(bhy bhy) {
        long a2 = this.a.a(bhy);
        this.d = a2;
        if (a2 == 0) {
            return 0;
        }
        if (bhy.f == -1 && a2 != -1) {
            bhy = bhy.a(0, a2);
        }
        this.c = true;
        this.b.a(bhy);
        return this.d;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int a2 = this.a.a(bArr, i, i2);
        if (a2 > 0) {
            this.b.a(bArr, i, a2);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) a2);
            }
        }
        return a2;
    }
}
