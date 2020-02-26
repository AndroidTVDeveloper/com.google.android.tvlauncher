package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cav */
/* compiled from: PG */
final class cav implements Runnable {

    /* renamed from: a */
    private final AtomicReference f5147a = new AtomicReference(this.f5148b);

    /* renamed from: b */
    private final /* synthetic */ Runnable f5148b;

    public cav(Runnable runnable) {
        this.f5148b = runnable;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.f5147a.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
