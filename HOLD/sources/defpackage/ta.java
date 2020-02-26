package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: ta  reason: default package */
/* compiled from: PG */
final class ta implements ThreadFactory {
    private ta() {
    }

    public /* synthetic */ ta(byte b) {
    }

    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
