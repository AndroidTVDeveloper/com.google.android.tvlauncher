package defpackage;

/* renamed from: cqi  reason: default package */
/* compiled from: PG */
final class cqi implements Runnable {
    private final /* synthetic */ cqp a;

    public cqi(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        crz crz;
        cqp cqp = this.a;
        if (!cqp.w.b && cqp.f != null && (crz = cqp.v) != null && crz.i()) {
            cqp cqp2 = this.a;
            pp ppVar = cqp2.v.t;
            if (ppVar != null) {
                cqp2.f.a(dej.a(ppVar.a(ppVar.a(pq.e, -16777216)), 0.4f), dej.a(ppVar.a(pq.c, ppVar.a(pq.f, -16777216)), 0.4f), dej.a(ppVar.a(pq.a, ppVar.a(pq.d, -16777216)), 0.4f), false);
            }
        }
    }
}
