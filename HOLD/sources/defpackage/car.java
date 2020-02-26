package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: car  reason: default package */
/* compiled from: PG */
final class car implements cat {
    public volatile bzh a;
    public final Queue b = new ConcurrentLinkedQueue();
    public final dfc c = dez.a;
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    public final void a(bzh bzh) {
        caq caq = (caq) this.b.poll();
        while (caq != null) {
            caq.a(bzh);
            caq = (caq) this.b.poll();
        }
    }

    private final void a(caq caq) {
        synchronized (this.b) {
            if (this.a == null) {
                this.b.add(caq);
            } else {
                caq.a(this.a);
            }
        }
    }

    public final void a() {
        this.b.clear();
    }

    public final void c() {
        cap cap = new cap(Thread.getDefaultUncaughtExceptionHandler(), this.d, this.e);
        a(cap);
        Thread.setDefaultUncaughtExceptionHandler(cap);
    }

    public final void b() {
        a(new can());
    }
}
