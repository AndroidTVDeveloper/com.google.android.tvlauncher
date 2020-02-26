package defpackage;

/* renamed from: cqj  reason: default package */
/* compiled from: PG */
final class cqj implements Runnable {
    private final /* synthetic */ cqp a;

    public cqj(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        cqp cqp = this.a;
        cpt cpt = cqp.f;
        if (cpt != null && cqp.r <= 1 && !cpt.e) {
            cpt.a(dej.a(cpt.b, 0.5f), dej.a(cpt.c, 0.5f), dej.a(cpt.d, 0.5f), false);
            cpt.e = true;
        }
    }
}
