package defpackage;

/* renamed from: cpx  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpx implements Runnable {
    private final cqp a;

    public cpx(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        cqp cqp = this.a;
        cqp.a(cqp.r, "PAYLOAD_CHANNEL_ITEM_METADATA");
    }
}
