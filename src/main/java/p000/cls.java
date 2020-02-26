package p000;

import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cls */
/* compiled from: PG */
public final class cls extends ThreadPoolExecutor {

    /* renamed from: a */
    private final ConcurrentMap f5928a = new ConcurrentHashMap();

    public cls(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(3, 3, 30, timeUnit, blockingQueue);
    }

    /* renamed from: a */
    public final void mo3105a(Runnable runnable) {
        if (!this.f5928a.containsKey(runnable)) {
            if (getQueue().remainingCapacity() <= 0) {
                Runnable peek = getQueue().peek();
                if (!remove(peek)) {
                    Log.e("DoubleClickThreadPoolExecutor", "Could not remove the first queued task from working queue");
                    return;
                }
                this.f5928a.remove(peek);
            }
            execute(runnable);
            this.f5928a.put(runnable, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f5928a.remove(runnable);
    }
}
