package defpackage;

/* renamed from: cql  reason: default package */
/* compiled from: PG */
final class cql implements Runnable {
    private final /* synthetic */ cqp a;

    public cql(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        cqp cqp = this.a;
        if (cqp.D && cqp.r == 1) {
            cqz g = cqp.g(1);
            if (g instanceof cpq) {
                ((cpq) g).c();
                this.a.D = false;
            }
        }
    }
}
