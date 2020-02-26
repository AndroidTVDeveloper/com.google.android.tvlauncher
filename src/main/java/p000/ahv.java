package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ahv */
/* compiled from: PG */
final class ahv implements Executor {

    /* renamed from: a */
    private final Handler f386a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f386a.post(runnable);
    }
}
