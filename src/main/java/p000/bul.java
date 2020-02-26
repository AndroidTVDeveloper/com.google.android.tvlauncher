package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bul */
/* compiled from: PG */
public final class bul implements ThreadFactory {

    /* renamed from: a */
    private final String f4850a;

    /* renamed from: b */
    private final AtomicInteger f4851b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f4852c = Executors.defaultThreadFactory();

    public bul(String str) {
        this.f4850a = (String) buh.m4200a(str, "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4852c.newThread(new bum(runnable));
        String str = this.f4850a;
        int andIncrement = this.f4851b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
