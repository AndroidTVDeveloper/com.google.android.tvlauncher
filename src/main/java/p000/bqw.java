package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: bqw */
/* compiled from: PG */
final class bqw extends bvm {

    /* renamed from: a */
    private final /* synthetic */ bqx f4643a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqw(bqx bqx, Looper looper) {
        super(looper);
        this.f4643a = bqx;
    }

    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i == 1) {
            bqv bqv = (bqv) message.obj;
            bqx bqx = this.f4643a;
            bqx.f4644a.lock();
            try {
                if (bqx.f4653j != bqv.f4642a) {
                    lock = bqx.f4644a;
                } else {
                    bqv.mo2304a();
                    lock = bqx.f4644a;
                }
                lock.unlock();
            } catch (Throwable th) {
                bqx.f4644a.unlock();
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
