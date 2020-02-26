package p000;

import java.util.concurrent.Executor;

/* renamed from: bww */
/* compiled from: PG */
final class bww implements bxc {

    /* renamed from: a */
    public final Object f4963a = new Object();

    /* renamed from: b */
    public final bwx f4964b;

    /* renamed from: c */
    private final Executor f4965c;

    public bww(Executor executor, bwx bwx) {
        this.f4965c = executor;
        this.f4964b = bwx;
    }

    /* renamed from: a */
    public final void mo2508a(bxb bxb) {
        synchronized (this.f4963a) {
            if (this.f4964b != null) {
                this.f4965c.execute(new bwv(this));
            }
        }
    }
}
