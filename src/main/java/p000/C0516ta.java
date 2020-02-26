package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: ta */
/* compiled from: PG */
final class C0516ta implements ThreadFactory {
    private C0516ta() {
    }

    public /* synthetic */ C0516ta(byte b) {
    }

    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
