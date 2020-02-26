package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: cao */
/* compiled from: PG */
final /* synthetic */ class cao implements ThreadFactory {

    /* renamed from: a */
    public static final ThreadFactory f5130a = new cao();

    private cao() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "Primes-preInit");
    }
}
