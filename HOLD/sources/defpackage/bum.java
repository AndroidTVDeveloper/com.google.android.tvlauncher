package defpackage;

import android.os.Process;

/* renamed from: bum  reason: default package */
/* compiled from: PG */
final class bum implements Runnable {
    private final Runnable a;

    public bum(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
