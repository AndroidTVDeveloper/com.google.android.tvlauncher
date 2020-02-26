package p000;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: dgo */
/* compiled from: PG */
public final class dgo extends AbstractExecutorService implements dhd, dhe {

    /* renamed from: a */
    private final ExecutorService f8511a;

    /* renamed from: b */
    private final ScheduledExecutorService f8512b;

    public dgo() {
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return dhj.m6432a(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return dhj.m6433a(callable);
    }

    /* renamed from: a */
    public final dhb submit(Runnable runnable) {
        return (dhb) super.submit(runnable);
    }

    /* renamed from: a */
    public final dhb submit(Runnable runnable, Object obj) {
        return (dhb) super.submit(runnable, obj);
    }

    /* renamed from: a */
    public final dhb submit(Callable callable) {
        return (dhb) super.submit(callable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f8511a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f8511a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f8511a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f8511a.isTerminated();
    }

    public final void shutdown() {
        this.f8511a.shutdown();
    }

    public final List shutdownNow() {
        return this.f8511a.shutdownNow();
    }

    public dgo(ScheduledExecutorService scheduledExecutorService) {
        this.f8511a = (ExecutorService) dgx.m6401a(scheduledExecutorService);
        this.f8512b = (ScheduledExecutorService) dgx.m6401a(scheduledExecutorService);
    }

    /* renamed from: a */
    public final dhc schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        dhj a = dhj.m6432a(runnable, (Object) null);
        return new dhf(a, this.f8512b.schedule(a, j, timeUnit));
    }

    /* renamed from: a */
    public final dhc schedule(Callable callable, long j, TimeUnit timeUnit) {
        dhj a = dhj.m6433a(callable);
        return new dhf(a, this.f8512b.schedule(a, j, timeUnit));
    }

    /* renamed from: a */
    public final dhc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dhg dhg = new dhg(runnable);
        return new dhf(dhg, this.f8512b.scheduleAtFixedRate(dhg, j, j2, timeUnit));
    }

    /* renamed from: b */
    public final dhc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dhg dhg = new dhg(runnable);
        return new dhf(dhg, this.f8512b.scheduleWithFixedDelay(dhg, j, j2, timeUnit));
    }
}
