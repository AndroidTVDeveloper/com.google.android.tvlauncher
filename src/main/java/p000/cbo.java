package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cbo */
/* compiled from: PG */
final class cbo implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f5219a;

    /* renamed from: b */
    private final String f5220b;

    public cbo() {
        this("Primes");
    }

    public cbo(String str) {
        this.f5219a = new AtomicInteger(1);
        this.f5220b = str;
    }

    public final Thread newThread(Runnable runnable) {
        cbn cbn = new cbn(runnable);
        String str = this.f5220b;
        int andIncrement = this.f5219a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(andIncrement);
        Thread thread = new Thread(cbn, sb.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
