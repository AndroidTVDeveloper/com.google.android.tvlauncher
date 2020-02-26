package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: cbt  reason: default package */
/* compiled from: PG */
final class cbt implements dhe {
    public final cbs a;
    private final dhe b;

    public cbt(dhe dhe, cbs cbs) {
        this.b = (dhe) cev.a(dhe);
        this.a = (cbs) cev.a(cbs);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.b.execute(b(runnable));
    }

    public final List invokeAll(Collection collection) {
        return this.b.invokeAll(a(collection));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(a(collection), j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.b.invokeAny(a(collection));
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAny(a(collection), j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    /* renamed from: a */
    public final dhc schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.a(b(runnable), j, timeUnit);
    }

    /* renamed from: a */
    public final dhc schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.b.a(b(callable), j, timeUnit);
    }

    /* renamed from: a */
    public final dhc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.a(b(runnable), j, j2, timeUnit);
    }

    /* renamed from: b */
    public final dhc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.b(b(runnable), j, j2, timeUnit);
    }

    public final void shutdown() {
        this.b.shutdown();
    }

    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    /* renamed from: a */
    public final dhb submit(Runnable runnable) {
        return this.b.a(b(runnable));
    }

    /* renamed from: a */
    public final dhb submit(Runnable runnable, Object obj) {
        return this.b.a(b(runnable), obj);
    }

    /* renamed from: a */
    public final dhb submit(Callable callable) {
        return this.b.a(b(callable));
    }

    private final Runnable b(Runnable runnable) {
        return new cbq(this, runnable);
    }

    private final Callable b(Callable callable) {
        return new cbr(this, callable);
    }

    private final List a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Callable) it.next()));
        }
        return arrayList;
    }
}
