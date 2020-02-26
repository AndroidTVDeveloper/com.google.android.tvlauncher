package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: byq */
/* compiled from: PG */
final /* synthetic */ class byq implements dff {

    /* renamed from: a */
    private final Application f5033a;

    public byq(Application application) {
        this.f5033a = application;
    }

    /* renamed from: a */
    public final Object mo2551a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ccx.m4548a(this.f5033a).getRunningAppProcesses();
        boolean z = false;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == Process.myPid()) {
                    if (next.importance == 100) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
