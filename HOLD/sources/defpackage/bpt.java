package defpackage;

import android.os.Bundle;

/* renamed from: bpt  reason: default package */
/* compiled from: PG */
public final class bpt implements boq, bor {
    public final bok a;
    public bpu b;
    private final boolean c;

    public bpt(bok bok, boolean z) {
        this.a = bok;
        this.c = z;
    }

    private final void a() {
        buh.a(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void a(Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    public final void a(bno bno) {
        a();
        bpu bpu = this.b;
        bok bok = this.a;
        boolean z = this.c;
        bqx bqx = (bqx) bpu;
        bqx.a.lock();
        try {
            ((bqx) bpu).j.a(bno, bok, z);
        } finally {
            bqx.a.unlock();
        }
    }

    public final void a(int i) {
        a();
        this.b.a(i);
    }
}
