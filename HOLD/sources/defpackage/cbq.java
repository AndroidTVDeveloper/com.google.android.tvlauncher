package defpackage;

/* renamed from: cbq  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cbq implements Runnable {
    private final cbt a;
    private final Runnable b;

    public cbq(cbt cbt, Runnable runnable) {
        this.a = cbt;
        this.b = runnable;
    }

    public final void run() {
        cbt cbt = this.a;
        try {
            this.b.run();
        } catch (Throwable th) {
            cbt.a.a(th);
            throw th;
        }
    }
}
