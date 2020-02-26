package p000;

import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cap */
/* compiled from: PG */
final class cap implements Thread.UncaughtExceptionHandler, caq {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f5131a;

    /* renamed from: b */
    private final AtomicReference f5132b;

    /* renamed from: c */
    private final AtomicReference f5133c;

    /* renamed from: d */
    private volatile cat f5134d;

    public /* synthetic */ cap(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f5131a = uncaughtExceptionHandler;
        this.f5132b = atomicReference;
        this.f5133c = atomicReference2;
    }

    /* renamed from: a */
    public final void mo2606a(bzh bzh) {
        this.f5134d = bzh;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.f5134d == null) {
            Runnable runnable = (Runnable) this.f5132b.getAndSet(null);
            CountDownLatch countDownLatch = (CountDownLatch) this.f5133c.getAndSet(null);
            if (runnable == null || countDownLatch == null) {
                Thread.sleep(100);
            } else {
                try {
                    Executors.newSingleThreadExecutor(cao.f5130a).execute(runnable);
                    countDownLatch.await(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    bog.m3837c("Primes", "Wait for initialization is interrupted", new Object[0]);
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (this.f5134d != null) {
            cat cat = this.f5134d;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5131a;
            bzh bzh = (bzh) cat;
            if (bzh.f5047a.mo2589a()) {
                uncaughtExceptionHandler = bzh.f5047a.mo2590b().mo2582a(uncaughtExceptionHandler);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f5131a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
