package p000;

import java.util.concurrent.Executor;

/* renamed from: bwz */
/* compiled from: PG */
final class bwz implements bxc {

    /* renamed from: a */
    public final Object f4968a = new Object();

    /* renamed from: b */
    private final Executor f4969b;

    public bwz(Executor executor) {
        this.f4969b = executor;
    }

    /* renamed from: a */
    public final void mo2508a(bxb bxb) {
        boolean z;
        bxh bxh = (bxh) bxb;
        synchronized (bxh.f4977a) {
            z = false;
            if (((bxh) bxb).f4979c) {
                boolean z2 = ((bxh) bxb).f4980d;
                if (((bxh) bxb).f4981e == null) {
                    z = true;
                }
            }
        }
        if (!z) {
            boolean z3 = bxh.f4980d;
            synchronized (this.f4968a) {
            }
            this.f4969b.execute(new bwy(this, bxb));
        }
    }
}
