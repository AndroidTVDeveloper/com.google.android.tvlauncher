package p000;

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

/* renamed from: cgg */
/* compiled from: PG */
public class cgg extends Application {

    /* renamed from: a */
    private final Object f5459a = new Object();

    /* renamed from: b */
    private dbj f5460b;

    /* renamed from: g */
    public final Object f5461g = new Object();

    /* renamed from: h */
    public dbh f5462h;

    /* renamed from: e */
    public final dbj mo2750e() {
        if (this.f5460b == null) {
            synchronized (this.f5459a) {
                if (this.f5460b == null) {
                    this.f5460b = new dbj(this);
                }
            }
        }
        return this.f5460b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo2749d() {
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
        if (!Build.TYPE.equals("unknown") && !mo2749d() && !dcx.m6183a()) {
            cja a = dbq.m6093a(this);
            int i = a.f5693o;
            a.f5693o = i + 1;
            if (i == 0) {
                a.f5679a.registerReceiver(a.f5684f, chv.m4765a());
                Context context = a.f5679a;
                BroadcastReceiver broadcastReceiver = a.f5685g;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
                intentFilter.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
                context.registerReceiver(broadcastReceiver, intentFilter);
            }
            if (getSystemService("wallpaper") != null) {
                if (ddv.f8348a == null) {
                    synchronized (ddv.class) {
                        if (ddv.f8348a == null) {
                            ddv.f8348a = new ddv();
                        }
                    }
                }
                ddv ddv = ddv.f8348a;
                Context applicationContext = getApplicationContext();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                int i2 = defaultSharedPreferences.getInt("wallpaper_version", 0);
                boolean z = !Build.FINGERPRINT.equals(defaultSharedPreferences.getString("android_build_fingerprint", ""));
                if (!ddv.f8349b && (z || i2 < 2)) {
                    ddv.f8349b = true;
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
