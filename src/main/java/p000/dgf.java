package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: dgf */
/* compiled from: PG */
final class dgf extends dga {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f8493a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f8494b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f8495c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f8496d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f8497e;

    public dgf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8493a = atomicReferenceFieldUpdater;
        this.f8494b = atomicReferenceFieldUpdater2;
        this.f8495c = atomicReferenceFieldUpdater3;
        this.f8496d = atomicReferenceFieldUpdater4;
        this.f8497e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    public final boolean mo4295a(dgn dgn, dge dge, dge dge2) {
        return this.f8496d.compareAndSet(dgn, dge, dge2);
    }

    /* renamed from: a */
    public final boolean mo4297a(dgn dgn, Object obj, Object obj2) {
        return this.f8497e.compareAndSet(dgn, obj, obj2);
    }

    /* renamed from: a */
    public final boolean mo4296a(dgn dgn, dgm dgm, dgm dgm2) {
        return this.f8495c.compareAndSet(dgn, dgm, dgm2);
    }

    /* renamed from: a */
    public final void mo4293a(dgm dgm, dgm dgm2) {
        this.f8494b.lazySet(dgm, dgm2);
    }

    /* renamed from: a */
    public final void mo4294a(dgm dgm, Thread thread) {
        this.f8493a.lazySet(dgm, thread);
    }
}
