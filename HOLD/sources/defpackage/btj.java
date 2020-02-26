package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: btj  reason: default package */
/* compiled from: PG */
final class btj implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final bth e;
    public ComponentName f;
    public final /* synthetic */ btk g;

    public btj(btk btk, bth bth) {
        this.g = btk;
        this.e = bth;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.e.a();
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void b() {
        this.b = 3;
        boolean a2 = bui.a(this.g.d, this.e.a(), this, 129);
        this.c = a2;
        if (a2) {
            Message obtainMessage = this.g.e.obtainMessage(1, this.e);
            btk btk = this.g;
            btk.e.sendMessageDelayed(obtainMessage, btk.f);
            return;
        }
        this.b = 2;
        try {
            this.g.d.unbindService(this);
        } catch (IllegalArgumentException e2) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
