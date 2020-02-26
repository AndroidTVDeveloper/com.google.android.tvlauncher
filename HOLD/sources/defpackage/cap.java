package defpackage;

import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cap  reason: default package */
/* compiled from: PG */
final class cap implements Thread.UncaughtExceptionHandler, caq {
    private final Thread.UncaughtExceptionHandler a;
    private final AtomicReference b;
    private final AtomicReference c;
    private volatile cat d;

    public /* synthetic */ cap(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = uncaughtExceptionHandler;
        this.b = atomicReference;
        this.c = atomicReference2;
    }

    public final void a(bzh bzh) {
        this.d = bzh;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.d == null) {
            Runnable runnable = (Runnable) this.b.getAndSet(null);
            CountDownLatch countDownLatch = (CountDownLatch) this.c.getAndSet(null);
            if (runnable == null || countDownLatch == null) {
                Thread.sleep(100);
            } else {
                try {
                    Executors.newSingleThreadExecutor(cao.a).execute(runnable);
                    countDownLatch.await(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    bog.c("Primes", "Wait for initialization is interrupted", new Object[0]);
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (this.d != null) {
            cat cat = this.d;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
            bzh bzh = (bzh) cat;
            if (bzh.a.a()) {
                uncaughtExceptionHandler = bzh.a.b().a(uncaughtExceptionHandler);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
