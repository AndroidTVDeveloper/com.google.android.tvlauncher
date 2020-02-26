package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bxf  reason: default package */
/* compiled from: PG */
final class bxf implements Executor {
    private final Handler a = new bvm(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
