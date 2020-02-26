package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b */
/* compiled from: PG */
public final class C0028b implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f2952a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f2952a.getAndIncrement())));
        return thread;
    }
}
