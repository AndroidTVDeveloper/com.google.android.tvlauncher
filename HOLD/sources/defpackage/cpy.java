package defpackage;

/* renamed from: cpy  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpy implements Runnable {
    private final cqp a;

    public cpy(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        cqp cqp = this.a;
        cqp.a(cqp.r, "PAYLOAD_WATCH_NEXT_CARD_SELECTION_CHANGED");
    }
}
