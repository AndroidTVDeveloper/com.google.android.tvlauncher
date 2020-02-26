package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: dhe  reason: default package */
/* compiled from: PG */
public interface dhe extends ScheduledExecutorService, dhd {
    dhc a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    dhc a(Runnable runnable, long j, TimeUnit timeUnit);

    dhc a(Callable callable, long j, TimeUnit timeUnit);

    dhc b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
