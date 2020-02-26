package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: cao  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cao implements ThreadFactory {
    public static final ThreadFactory a = new cao();

    private cao() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "Primes-preInit");
    }
}
