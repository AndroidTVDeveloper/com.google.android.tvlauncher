package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: btk */
/* compiled from: PG */
final class btk extends bti implements Handler.Callback {

    /* renamed from: c */
    public final HashMap f4817c = new HashMap();

    /* renamed from: d */
    public final Context f4818d;

    /* renamed from: e */
    public final Handler f4819e;

    /* renamed from: f */
    public final long f4820f;

    /* renamed from: g */
    private final long f4821g;

    public btk(Context context) {
        this.f4818d = context.getApplicationContext();
        this.f4819e = new bvm(context.getMainLooper(), this);
        bui.m4228a();
        this.f4821g = 5000;
        this.f4820f = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo2427b(bth bth, ServiceConnection serviceConnection) {
        boolean z;
        buh.m4200a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4817c) {
            btj btj = (btj) this.f4817c.get(bth);
            if (btj == null) {
                btj = new btj(this, bth);
                btj.mo2428a(serviceConnection, serviceConnection);
                btj.mo2431b();
                this.f4817c.put(bth, btj);
            } else {
                this.f4819e.removeMessages(0, bth);
                if (!btj.mo2430a(serviceConnection)) {
                    btj.mo2428a(serviceConnection, serviceConnection);
                    int i = btj.f4811b;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(btj.f4815f, btj.f4813d);
                    } else if (i == 2) {
                        btj.mo2431b();
                    }
                } else {
                    String valueOf = String.valueOf(bth);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = btj.f4812c;
        }
        return z;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f4817c) {
                bth bth = (bth) message.obj;
                btj btj = (btj) this.f4817c.get(bth);
                if (btj != null && btj.mo2429a()) {
                    if (btj.f4812c) {
                        btj.f4816g.f4819e.removeMessages(1, btj.f4814e);
                        btj.f4816g.f4818d.unbindService(btj);
                        btj.f4812c = false;
                        btj.f4811b = 2;
                    }
                    this.f4817c.remove(bth);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f4817c) {
                bth bth2 = (bth) message.obj;
                btj btj2 = (btj) this.f4817c.get(bth2);
                if (btj2 != null && btj2.f4811b == 3) {
                    String valueOf = String.valueOf(bth2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = btj2.f4815f;
                    if (componentName == null) {
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(bth2.f4806a, "unknown");
                    }
                    btj2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2425a(bth bth, ServiceConnection serviceConnection) {
        buh.m4200a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4817c) {
            btj btj = (btj) this.f4817c.get(bth);
            if (btj == null) {
                String valueOf = String.valueOf(bth);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (btj.mo2430a(serviceConnection)) {
                btj.f4810a.remove(serviceConnection);
                if (btj.mo2429a()) {
                    this.f4819e.sendMessageDelayed(this.f4819e.obtainMessage(0, bth), this.f4821g);
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
