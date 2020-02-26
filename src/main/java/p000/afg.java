package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: afg */
/* compiled from: PG */
public final class afg implements afd {

    /* renamed from: a */
    public final afc f230a;

    /* renamed from: b */
    public boolean f231b;

    /* renamed from: c */
    private final Context f232c;

    /* renamed from: d */
    private boolean f233d;

    /* renamed from: e */
    private final BroadcastReceiver f234e = new aff(this);

    public afg(Context context, afc afc) {
        this.f232c = context.getApplicationContext();
        this.f230a = afc;
    }

    /* renamed from: c */
    public final void mo160c() {
    }

    /* renamed from: a */
    static final boolean m289a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) aic.m542a((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo158a() {
        if (!this.f233d) {
            this.f231b = m289a(this.f232c);
            try {
                this.f232c.registerReceiver(this.f234e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f233d = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo159b() {
        if (this.f233d) {
            this.f232c.unregisterReceiver(this.f234e);
            this.f233d = false;
        }
    }
}
