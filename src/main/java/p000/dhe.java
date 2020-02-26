package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: dhe */
/* compiled from: PG */
public interface dhe extends ScheduledExecutorService, dhd {
    /* renamed from: a */
    dhc mo2632a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    /* renamed from: a */
    dhc mo2633a(Runnable runnable, long j, TimeUnit timeUnit);

    /* renamed from: a */
    dhc mo2634a(Callable callable, long j, TimeUnit timeUnit);

    /* renamed from: b */
    dhc mo2636b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
