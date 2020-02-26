package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: btk  reason: default package */
/* compiled from: PG */
final class btk extends bti implements Handler.Callback {
    public final HashMap c = new HashMap();
    public final Context d;
    public final Handler e;
    public final long f;
    private final long g;

    public btk(Context context) {
        this.d = context.getApplicationContext();
        this.e = new bvm(context.getMainLooper(), this);
        bui.a();
        this.g = 5000;
        this.f = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean b(bth bth, ServiceConnection serviceConnection) {
        boolean z;
        buh.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            btj btj = (btj) this.c.get(bth);
            if (btj == null) {
                btj = new btj(this, bth);
                btj.a(serviceConnection, serviceConnection);
                btj.b();
                this.c.put(bth, btj);
            } else {
                this.e.removeMessages(0, bth);
                if (!btj.a(serviceConnection)) {
                    btj.a(serviceConnection, serviceConnection);
                    int i = btj.b;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(btj.f, btj.d);
                    } else if (i == 2) {
                        btj.b();
                    }
                } else {
                    String valueOf = String.valueOf(bth);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = btj.c;
        }
        return z;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.c) {
                bth bth = (bth) message.obj;
                btj btj = (btj) this.c.get(bth);
                if (btj != null && btj.a()) {
                    if (btj.c) {
                        btj.g.e.removeMessages(1, btj.e);
                        btj.g.d.unbindService(btj);
                        btj.c = false;
                        btj.b = 2;
                    }
                    this.c.remove(bth);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.c) {
                bth bth2 = (bth) message.obj;
                btj btj2 = (btj) this.c.get(bth2);
                if (btj2 != null && btj2.b == 3) {
                    String valueOf = String.valueOf(bth2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = btj2.f;
                    if (componentName == null) {
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(bth2.a, "unknown");
                    }
                    btj2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(bth bth, ServiceConnection serviceConnection) {
        buh.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            btj btj = (btj) this.c.get(bth);
            if (btj == null) {
                String valueOf = String.valueOf(bth);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (btj.a(serviceConnection)) {
                btj.a.remove(serviceConnection);
                if (btj.a()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, bth), this.g);
                }
            } else {
                String valueOf2 = String.valueOf(bth);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
