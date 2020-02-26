package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Collections;

/* renamed from: bui */
/* compiled from: PG */
public final class bui {

    /* renamed from: a */
    private static final Object f4845a = new Object();

    /* renamed from: b */
    private static volatile bui f4846b;

    private bui() {
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
    }

    /* renamed from: a */
    public static final boolean m4229a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((buo.m4260a(context).mo2453a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    /* renamed from: a */
    public static void m4228a() {
        if (f4846b == null) {
            synchronized (f4845a) {
                if (f4846b == null) {
                    f4846b = new bui();
                }
            }
        }
    }
}
