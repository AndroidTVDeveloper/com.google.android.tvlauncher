package p000;

/* renamed from: cqj */
/* compiled from: PG */
final class cqj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ cqp f6967a;

    public cqj(cqp cqp) {
        this.f6967a = cqp;
    }

    public final void run() {
        cqp cqp = this.f6967a;
        cpt cpt = cqp.f7014f;
        if (cpt != null && cqp.f7026r <= 1 && !cpt.f6942e) {
            cpt.mo3567a(dej.m6247a(cpt.f6939b, 0.5f), dej.m6247a(cpt.f6940c, 0.5f), dej.m6247a(cpt.f6941d, 0.5f), false);
            cpt.f6942e = true;
        }
    }
}
