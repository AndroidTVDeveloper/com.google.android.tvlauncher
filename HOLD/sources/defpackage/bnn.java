package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: bnn  reason: default package */
/* compiled from: PG */
public final class bnn implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue b = new LinkedBlockingQueue();

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }
}
