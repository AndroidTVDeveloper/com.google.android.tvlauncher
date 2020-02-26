package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import java.util.List;

/* renamed from: cgg  reason: default package */
/* compiled from: PG */
public class cgg extends Application {
    private final Object a = new Object();
    private dbj b;
    public final Object g = new Object();
    public dbh h;

    public final dbj e() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = new dbj(this);
                }
            }
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) getSystemService(ActivityManager.class);
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid && next.processName != null && next.processName.contains(":youtube")) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onCreate() {
        super.onCreate();
        if (!Build.TYPE.equals("unknown") && !d() && !dcx.a()) {
            cja a2 = dbq.a(this);
            int i = a2.o;
            a2.o = i + 1;
            if (i == 0) {
                a2.a.registerReceiver(a2.f, chv.a());
                Context context = a2.a;
                BroadcastReceiver broadcastReceiver = a2.g;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
                intentFilter.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
                context.registerReceiver(broadcastReceiver, intentFilter);
            }
            if (getSystemService("wallpaper") != null) {
                if (ddv.a == null) {
                    synchronized (ddv.class) {
                        if (ddv.a == null) {
                            ddv.a = new ddv();
                        }
                    }
                }
                ddv ddv = ddv.a;
                Context applicationContext = getApplicationContext();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                int i2 = defaultSharedPreferences.getInt("wallpaper_version", 0);
                boolean z = !Build.FINGERPRINT.equals(defaultSharedPreferences.getString("android_build_fingerprint", ""));
                if (!ddv.b && (z || i2 < 2)) {
                    ddv.b = true;
                    new ddu(ddv, applicationContext).execute(new Void[0]);
                }
            }
            daj daj = new daj();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.LOCALE_CHANGED");
            registerReceiver(daj, intentFilter2);
        }
    }
}
