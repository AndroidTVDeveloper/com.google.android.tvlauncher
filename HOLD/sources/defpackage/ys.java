package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;

/* renamed from: ys  reason: default package */
/* compiled from: PG */
final class ys extends Thread {
    private final /* synthetic */ yt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ys(yt ytVar, Runnable runnable, String str) {
        super(runnable, str);
        this.a = ytVar;
    }

    public final void run() {
        Process.setThreadPriority(9);
        if (this.a.a) {
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
