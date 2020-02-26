package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bso  reason: default package */
/* compiled from: PG */
public final class bso implements ServiceConnection {
    private final int a;
    private final /* synthetic */ bst b;

    public bso(bst bst, int i) {
        this.b = bst;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        btv btv;
        int i;
        int i2;
        if (iBinder == null) {
            bst bst = this.b;
            synchronized (bst.e) {
                i = bst.j;
            }
            if (i == 3) {
                bst.n = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = bst.d;
            handler.sendMessage(handler.obtainMessage(i2, bst.p.get(), 16));
            return;
        }
        synchronized (this.b.f) {
            bst bst2 = this.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null) {
                if (queryLocalInterface instanceof btv) {
                    btv = (btv) queryLocalInterface;
                    bst2.g = btv;
                }
            }
            btv = new btu(iBinder);
            bst2.g = btv;
        }
        this.b.a(0, this.a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.f) {
            this.b.g = null;
        }
        Handler handler = this.b.d;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
