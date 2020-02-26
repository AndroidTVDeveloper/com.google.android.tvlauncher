package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b  reason: default package */
/* compiled from: PG */
public final class b implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.a.getAndIncrement())));
        return thread;
    }
}
