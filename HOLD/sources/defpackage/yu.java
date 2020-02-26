package defpackage;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: yu  reason: default package */
/* compiled from: PG */
public final class yu implements ExecutorService {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    private static volatile int b;
    private final ExecutorService c;

    public yu(ExecutorService executorService) {
        this.c = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.c.awaitTermination(j, timeUnit);
    }

    public static int a() {
        if (b == 0) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int i = Build.VERSION.SDK_INT;
            b = Math.min(4, availableProcessors);
        }
        return b;
    }

    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.c.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.c.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    public final void shutdown() {
        this.c.shutdown();
    }

    public final List shutdownNow() {
        return this.c.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.c.submit(runnable);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.c.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.c.submit(callable);
    }

    public final String toString() {
        return this.c.toString();
    }
}
