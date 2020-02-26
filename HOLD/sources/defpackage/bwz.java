package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bwz  reason: default package */
/* compiled from: PG */
final class bwz implements bxc {
    public final Object a = new Object();
    private final Executor b;

    public bwz(Executor executor) {
        this.b = executor;
    }

    public final void a(bxb bxb) {
        boolean z;
        bxh bxh = (bxh) bxb;
        synchronized (bxh.a) {
            z = false;
            if (((bxh) bxb).c) {
                boolean z2 = ((bxh) bxb).d;
                if (((bxh) bxb).e == null) {
                    z = true;
                }
            }
        }
        if (!z) {
            boolean z3 = bxh.d;
            synchronized (this.a) {
            }
            this.b.execute(new bwy(this, bxb));
        }
    }
}
