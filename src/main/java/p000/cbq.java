package p000;

/* renamed from: cbq */
/* compiled from: PG */
final /* synthetic */ class cbq implements Runnable {

    /* renamed from: a */
    private final cbt f5221a;

    /* renamed from: b */
    private final Runnable f5222b;

    public cbq(cbt cbt, Runnable runnable) {
        this.f5221a = cbt;
        this.f5222b = runnable;
    }

    public final void run() {
        cbt cbt = this.f5221a;
        try {
            this.f5222b.run();
        } catch (Throwable th) {
            cbt.f5225a.mo2623a(th);
            throw th;
        }
    }
}
