package defpackage;

/* renamed from: cqb  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cqb implements Runnable {
    private final cqp a;
    private final long b;

    public cqb(cqp cqp, long j) {
        this.a = cqp;
        this.b = j;
    }

    public final void run() {
        cqp cqp = this.a;
        cqp.c.b(this.b);
    }
}
