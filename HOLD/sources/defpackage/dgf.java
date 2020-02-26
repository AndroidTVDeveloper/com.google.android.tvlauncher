package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: dgf  reason: default package */
/* compiled from: PG */
final class dgf extends dga {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public dgf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    public final boolean a(dgn dgn, dge dge, dge dge2) {
        return this.d.compareAndSet(dgn, dge, dge2);
    }

    public final boolean a(dgn dgn, Object obj, Object obj2) {
        return this.e.compareAndSet(dgn, obj, obj2);
    }

    public final boolean a(dgn dgn, dgm dgm, dgm dgm2) {
        return this.c.compareAndSet(dgn, dgm, dgm2);
    }

    public final void a(dgm dgm, dgm dgm2) {
        this.b.lazySet(dgm, dgm2);
    }

    public final void a(dgm dgm, Thread thread) {
        this.a.lazySet(dgm, thread);
    }
}
