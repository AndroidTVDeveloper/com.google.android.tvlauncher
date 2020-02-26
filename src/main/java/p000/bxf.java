package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bxf */
/* compiled from: PG */
final class bxf implements Executor {

    /* renamed from: a */
    private final Handler f4975a = new bvm(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f4975a.post(runnable);
    }
}
