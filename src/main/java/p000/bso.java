package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bso */
/* compiled from: PG */
public final class bso implements ServiceConnection {

    /* renamed from: a */
    private final int f4733a;

    /* renamed from: b */
    private final /* synthetic */ bst f4734b;

    public bso(bst bst, int i) {
        this.f4734b = bst;
        this.f4733a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        btv btv;
        int i;
        int i2;
        if (iBinder == null) {
            bst bst = this.f4734b;
            synchronized (bst.f4744e) {
                i = bst.f4749j;
            }
            if (i == 3) {
                bst.f4753n = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = bst.f4743d;
            handler.sendMessage(handler.obtainMessage(i2, bst.f4755p.get(), 16));
            return;
        }
        synchronized (this.f4734b.f4745f) {
            bst bst2 = this.f4734b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null) {
                if (queryLocalInterface instanceof btv) {
                    btv = (btv) queryLocalInterface;
                    bst2.f4746g = btv;
                }
            }
            btv = new btu(iBinder);
            bst2.f4746g = btv;
        }
        this.f4734b.mo2383a(0, this.f4733a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4734b.f4745f) {
            this.f4734b.f4746g = null;
        }
        Handler handler = this.f4734b.f4743d;
        handler.sendMessage(handler.obtainMessage(6, this.f4733a, 1));
    }
}
