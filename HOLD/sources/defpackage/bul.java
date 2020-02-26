package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bul  reason: default package */
/* compiled from: PG */
public final class bul implements ThreadFactory {
    private final String a;
    private final AtomicInteger b = new AtomicInteger();
    private final ThreadFactory c = Executors.defaultThreadFactory();

    public bul(String str) {
        this.a = (String) buh.a(str, "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new bum(runnable));
        String str = this.a;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
