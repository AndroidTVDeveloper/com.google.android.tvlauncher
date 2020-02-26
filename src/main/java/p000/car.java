package p000;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: car */
/* compiled from: PG */
final class car implements cat {

    /* renamed from: a */
    public volatile bzh f5135a;

    /* renamed from: b */
    public final Queue f5136b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final dfc f5137c = dez.f8438a;

    /* renamed from: d */
    private final AtomicReference f5138d = new AtomicReference();

    /* renamed from: e */
    private final AtomicReference f5139e = new AtomicReference();

    /* renamed from: a */
    public final void mo2609a(bzh bzh) {
        caq caq = (caq) this.f5136b.poll();
        while (caq != null) {
            caq.mo2606a(bzh);
            caq = (caq) this.f5136b.poll();
        }
    }

    /* renamed from: a */
    private final void m4452a(caq caq) {
        synchronized (this.f5136b) {
            if (this.f5135a == null) {
                this.f5136b.add(caq);
            } else {
                caq.mo2606a(this.f5135a);
            }
        }
    }

    /* renamed from: a */
    public final void mo2576a() {
        this.f5136b.clear();
    }

    /* renamed from: c */
    public final void mo2578c() {
        cap cap = new cap(Thread.getDefaultUncaughtExceptionHandler(), this.f5138d, this.f5139e);
        m4452a(cap);
        Thread.setDefaultUncaughtExceptionHandler(cap);
    }

    /* renamed from: b */
    public final void mo2577b() {
        m4452a(new can());
    }
}
