package p000;

import android.os.Process;

/* renamed from: bum */
/* compiled from: PG */
final class bum implements Runnable {

    /* renamed from: a */
    private final Runnable f4853a;

    public bum(Runnable runnable) {
        this.f4853a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f4853a.run();
    }
}
