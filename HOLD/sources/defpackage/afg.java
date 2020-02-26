package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: afg  reason: default package */
/* compiled from: PG */
public final class afg implements afd {
    public final afc a;
    public boolean b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e = new aff(this);

    public afg(Context context, afc afc) {
        this.c = context.getApplicationContext();
        this.a = afc;
    }

    public final void c() {
    }

    static final boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) aic.a((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    public final void a() {
        if (!this.d) {
            this.b = a(this.c);
            try {
                this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.d = true;
            } catch (SecurityException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e2);
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.c.unregisterReceiver(this.e);
            this.d = false;
        }
    }
}
