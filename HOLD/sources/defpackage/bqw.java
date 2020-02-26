package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: bqw  reason: default package */
/* compiled from: PG */
final class bqw extends bvm {
    private final /* synthetic */ bqx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqw(bqx bqx, Looper looper) {
        super(looper);
        this.a = bqx;
    }

    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i == 1) {
            bqv bqv = (bqv) message.obj;
            bqx bqx = this.a;
            bqx.a.lock();
            try {
                if (bqx.j != bqv.a) {
                    lock = bqx.a;
                } else {
                    bqv.a();
                    lock = bqx.a;
                }
                lock.unlock();
            } catch (Throwable th) {
                bqx.a.unlock();
                throw th;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
