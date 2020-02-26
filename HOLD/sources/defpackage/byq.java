package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: byq  reason: default package */
/* compiled from: PG */
final /* synthetic */ class byq implements dff {
    private final Application a;

    public byq(Application application) {
        this.a = application;
    }

    public final Object a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ccx.a(this.a).getRunningAppProcesses();
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
