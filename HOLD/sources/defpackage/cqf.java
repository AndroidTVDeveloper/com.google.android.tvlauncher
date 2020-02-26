package defpackage;

/* renamed from: cqf  reason: default package */
/* compiled from: PG */
final class cqf implements Runnable {
    private final /* synthetic */ cqp a;

    public cqf(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        cqp cqp = this.a;
        if (cqp.t) {
            cla cla = cqp.c;
            cld cld = cla.r;
            if (cld != null) {
                int i = cld.b;
                cld.d();
                if (i != cld.b) {
                    cla.f();
                }
            }
            this.a.e();
        }
        cqp cqp2 = this.a;
        cqp2.H.postDelayed(cqp2.I, 600000);
    }
}
