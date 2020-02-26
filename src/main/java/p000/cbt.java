package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: cbt */
/* compiled from: PG */
final class cbt implements dhe {

    /* renamed from: a */
    public final cbs f5225a;

    /* renamed from: b */
    private final dhe f5226b;

    public cbt(dhe dhe, cbs cbs) {
        this.f5226b = (dhe) cev.m4629a(dhe);
        this.f5225a = (cbs) cev.m4629a(cbs);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f5226b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f5226b.execute(m4511b(runnable));
    }

    public final List invokeAll(Collection collection) {
        return this.f5226b.invokeAll(m4510a(collection));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f5226b.invokeAll(m4510a(collection), j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.f5226b.invokeAny(m4510a(collection));
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f5226b.invokeAny(m4510a(collection), j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f5226b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f5226b.isTerminated();
    }

    /* renamed from: a */
    public final dhc schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f5226b.mo2633a(m4511b(runnable), j, timeUnit);
    }

    /* renamed from: a */
    public final dhc schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f5226b.mo2634a(m4512b(callable), j, timeUnit);
    }

    /* renamed from: a */
    public final dhc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f5226b.mo2632a(m4511b(runnable), j, j2, timeUnit);
    }

    /* renamed from: b */
    public final dhc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f5226b.mo2636b(m4511b(runnable), j, j2, timeUnit);
    }

    public final void shutdown() {
        this.f5226b.shutdown();
    }

    public final List shutdownNow() {
        return this.f5226b.shutdownNow();
    }

    /* renamed from: a */
    public final dhb submit(Runnable runnable) {
        return this.f5226b.mo2629a(m4511b(runnable));
    }

    /* renamed from: a */
    public final dhb submit(Runnable runnable, Object obj) {
        return this.f5226b.mo2630a(m4511b(runnable), obj);
    }

    /* renamed from: a */
    public final dhb submit(Callable callable) {
        return this.f5226b.mo2631a(m4512b(callable));
    }

    /* renamed from: b */
    private final Runnable m4511b(Runnable runnable) {
        return new cbq(this, runnable);
    }

    /* renamed from: b */
    private final Callable m4512b(Callable callable) {
        return new cbr(this, callable);
    }

    /* renamed from: a */
    private final List m4510a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m4512b((Callable) it.next()));
        }
        return arrayList;
    }
}
