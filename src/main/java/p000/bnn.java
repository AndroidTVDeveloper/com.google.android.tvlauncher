package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: bnn */
/* compiled from: PG */
public final class bnn implements ServiceConnection {

    /* renamed from: a */
    public boolean f4479a = false;

    /* renamed from: b */
    public final BlockingQueue f4480b = new LinkedBlockingQueue();

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4480b.add(iBinder);
    }
}
