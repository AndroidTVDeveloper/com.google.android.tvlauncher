package p000;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;

/* renamed from: ys */
/* compiled from: PG */
final class C0669ys extends Thread {

    /* renamed from: a */
    private final /* synthetic */ C0670yt f10833a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0669ys(C0670yt ytVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f10833a = ytVar;
    }

    public final void run() {
        Process.setThreadPriority(9);
        if (this.f10833a.f10834a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
