package p000;

/* renamed from: dhg */
/* compiled from: PG */
final class dhg extends dgj implements Runnable {

    /* renamed from: e */
    private final Runnable f8526e;

    public dhg(Runnable runnable) {
        this.f8526e = (Runnable) dgx.m6401a(runnable);
    }

    public final void run() {
        try {
            this.f8526e.run();
        } catch (Throwable th) {
            mo4304a(th);
            dfj.m6304a(th);
            throw new RuntimeException(th);
        }
    }
}
