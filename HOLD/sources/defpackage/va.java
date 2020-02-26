package defpackage;

import android.os.Process;

/* renamed from: va  reason: default package */
/* compiled from: PG */
final class va implements Runnable {
    private final /* synthetic */ Runnable a;

    public va(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
