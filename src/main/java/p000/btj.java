package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: btj */
/* compiled from: PG */
final class btj implements ServiceConnection {

    /* renamed from: a */
    public final Map f4810a = new HashMap();

    /* renamed from: b */
    public int f4811b = 2;

    /* renamed from: c */
    public boolean f4812c;

    /* renamed from: d */
    public IBinder f4813d;

    /* renamed from: e */
    public final bth f4814e;

    /* renamed from: f */
    public ComponentName f4815f;

    /* renamed from: g */
    public final /* synthetic */ btk f4816g;

    public btj(btk btk, bth bth) {
        this.f4816g = btk;
        this.f4814e = bth;
    }

    /* renamed from: a */
    public final void mo2428a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f4814e.mo2421a();
        this.f4810a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: b */
    public final void mo2431b() {
        this.f4811b = 3;
        boolean a = bui.m4229a(this.f4816g.f4818d, this.f4814e.mo2421a(), this, 129);
        this.f4812c = a;
        if (a) {
            Message obtainMessage = this.f4816g.f4819e.obtainMessage(1, this.f4814e);
            btk btk = this.f4816g;
            btk.f4819e.sendMessageDelayed(obtainMessage, btk.f4820f);
            return;
        }
        this.f4811b = 2;
        try {
            this.f4816g.f4818d.unbindService(this);
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo2430a(ServiceConnection serviceConnection) {
        return this.f4810a.containsKey(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo2429a() {
        return this.f4810a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4816g.f4817c) {
            this.f4816g.f4819e.removeMessages(1, this.f4814e);
            this.f4813d = iBinder;
            this.f4815f = componentName;
            for (ServiceConnection onServiceConnected : this.f4810a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f4811b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4816g.f4817c) {
            this.f4816g.f4819e.removeMessages(1, this.f4814e);
            this.f4813d = null;
            this.f4815f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f4810a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f4811b = 2;
        }
    }
}
