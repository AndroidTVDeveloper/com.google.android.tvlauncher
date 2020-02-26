package defpackage;

/* renamed from: cqg  reason: default package */
/* compiled from: PG */
final class cqg implements Runnable {
    private final /* synthetic */ cqp a;

    public cqg(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        cqp cqp = this.a;
        if (cqp.t) {
            cqp.c.n();
        }
        cqp cqp2 = this.a;
        cqp2.H.postDelayed(cqp2.J, 600000);
    }
}
