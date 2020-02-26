package defpackage;

/* renamed from: cbn  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cbn implements Runnable {
    private final Runnable a;

    public cbn(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        this.a.run();
    }
}
