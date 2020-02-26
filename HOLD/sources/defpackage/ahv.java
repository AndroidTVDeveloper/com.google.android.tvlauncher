package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ahv  reason: default package */
/* compiled from: PG */
final class ahv implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
