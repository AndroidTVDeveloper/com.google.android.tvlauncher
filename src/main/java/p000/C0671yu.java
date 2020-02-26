package p000;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: yu */
/* compiled from: PG */
public final class C0671yu implements ExecutorService {

    /* renamed from: a */
    public static final long f10837a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f10838b;

    /* renamed from: c */
    private final ExecutorService f10839c;

    public C0671yu(ExecutorService executorService) {
        this.f10839c = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f10839c.awaitTermination(j, timeUnit);
    }

    /* renamed from: a */
    public static int m8687a() {
        if (f10838b == 0) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int i = Build.VERSION.SDK_INT;
            f10838b = Math.min(4, availableProcessors);
        }
        return f10838b;
    }

    public final void execute(Runnable runnable) {
        this.f10839c.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f10839c.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f10839c.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.f10839c.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f10839c.invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f10839c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f10839c.isTerminated();
    }

    public final void shutdown() {
        this.f10839c.shutdown();
    }

    public final List shutdownNow() {
        return this.f10839c.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f10839c.submit(runnable);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f10839c.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f10839c.submit(callable);
    }

    public final String toString() {
        return this.f10839c.toString();
    }
}
