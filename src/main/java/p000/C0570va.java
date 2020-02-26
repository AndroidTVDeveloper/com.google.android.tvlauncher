package p000;

import android.os.Process;

/* renamed from: va */
/* compiled from: PG */
final class C0570va implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Runnable f10568a;

    public C0570va(Runnable runnable) {
        this.f10568a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f10568a.run();
    }
}
