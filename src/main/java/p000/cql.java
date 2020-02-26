package p000;

/* renamed from: cql */
/* compiled from: PG */
final class cql implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ cqp f6969a;

    public cql(cqp cqp) {
        this.f6969a = cqp;
    }

    public final void run() {
        cqp cqp = this.f6969a;
        if (cqp.f6978D && cqp.f7026r == 1) {
            cqz g = cqp.mo3600g(1);
            if (g instanceof cpq) {
                ((cpq) g).mo3564c();
                this.f6969a.f6978D = false;
            }
        }
    }
}
