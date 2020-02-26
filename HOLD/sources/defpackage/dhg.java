package defpackage;

/* renamed from: dhg  reason: default package */
/* compiled from: PG */
final class dhg extends dgj implements Runnable {
    private final Runnable e;

    public dhg(Runnable runnable) {
        this.e = (Runnable) dgx.a(runnable);
    }

    public final void run() {
        try {
            this.e.run();
        } catch (Throwable th) {
            a(th);
            dfj.a(th);
            throw new RuntimeException(th);
        }
    }
}
