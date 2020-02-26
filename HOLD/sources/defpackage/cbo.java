package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cbo  reason: default package */
/* compiled from: PG */
final class cbo implements ThreadFactory {
    private final AtomicInteger a;
    private final String b;

    public cbo() {
        this("Primes");
    }

    public cbo(String str) {
        this.a = new AtomicInteger(1);
        this.b = str;
    }

    public final Thread newThread(Runnable runnable) {
        cbn cbn = new cbn(runnable);
        String str = this.b;
        int andIncrement = this.a.getAndIncrement();
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
