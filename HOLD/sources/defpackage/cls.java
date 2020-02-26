package defpackage;

import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cls  reason: default package */
/* compiled from: PG */
public final class cls extends ThreadPoolExecutor {
    private final ConcurrentMap a = new ConcurrentHashMap();

    public cls(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(3, 3, 30, timeUnit, blockingQueue);
    }

    public final void a(Runnable runnable) {
        if (!this.a.containsKey(runnable)) {
            if (getQueue().remainingCapacity() <= 0) {
                Runnable peek = getQueue().peek();
                if (!remove(peek)) {
                    Log.e("DoubleClickThreadPoolExecutor", "Could not remove the first queued task from working queue");
                    return;
                }
                this.a.remove(peek);
            }
            execute(runnable);
            this.a.put(runnable, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.a.remove(runnable);
    }
}
