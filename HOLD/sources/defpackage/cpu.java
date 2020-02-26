package defpackage;

/* renamed from: cpu  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpu implements Runnable {
    private final cqp a;

    public cpu(cqp cqp) {
        this.a = cqp;
    }

    public final void run() {
        this.a.a(0, "PAYLOAD_STATE");
    }
}
