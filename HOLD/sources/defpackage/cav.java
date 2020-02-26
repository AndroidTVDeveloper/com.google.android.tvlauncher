package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cav  reason: default package */
/* compiled from: PG */
final class cav implements Runnable {
    private final AtomicReference a = new AtomicReference(this.b);
    private final /* synthetic */ Runnable b;

    public cav(Runnable runnable) {
        this.b = runnable;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.a.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
