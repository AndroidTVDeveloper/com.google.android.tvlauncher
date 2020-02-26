package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: dgo  reason: default package */
/* compiled from: PG */
public final class dgo extends AbstractExecutorService implements dhd, dhe {
    private final ExecutorService a;
    private final ScheduledExecutorService b;

    public dgo() {
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return dhj.a(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return dhj.a(callable);
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
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public dgo(ScheduledExecutorService scheduledExecutorService) {
        this.a = (ExecutorService) dgx.a(scheduledExecutorService);
        this.b = (ScheduledExecutorService) dgx.a(scheduledExecutorService);
    }

    /* renamed from: a */
    public final dhc schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        dhj a2 = dhj.a(runnable, (Object) null);
        return new dhf(a2, this.b.schedule(a2, j, timeUnit));
    }

    /* renamed from: a */
    public final dhc schedule(Callable callable, long j, TimeUnit timeUnit) {
        dhj a2 = dhj.a(callable);
        return new dhf(a2, this.b.schedule(a2, j, timeUnit));
    }

    /* renamed from: a */
    public final dhc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dhg dhg = new dhg(runnable);
        return new dhf(dhg, this.b.scheduleAtFixedRate(dhg, j, j2, timeUnit));
    }

    /* renamed from: b */
    public final dhc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dhg dhg = new dhg(runnable);
        return new dhf(dhg, this.b.scheduleWithFixedDelay(dhg, j, j2, timeUnit));
    }
}
