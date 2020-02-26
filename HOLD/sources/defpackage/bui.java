package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Collections;

/* renamed from: bui  reason: default package */
/* compiled from: PG */
public final class bui {
    private static final Object a = new Object();
    private static volatile bui b;

    private bui() {
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
    }

    public static final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((buo.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public static void a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new bui();
                }
            }
        }
    }
}
