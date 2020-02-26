package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: bqs */
/* compiled from: PG */
final class bqs extends bvm {

    /* renamed from: a */
    private final /* synthetic */ bqt f4616a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqs(bqt bqt, Looper looper) {
        super(looper);
        this.f4616a = bqt;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            bqt bqt = this.f4616a;
            int i2 = bqt.f4617j;
            bqt.f4618b.lock();
            try {
                if (bqt.mo2329f()) {
                    bqt.mo2327d();
                }
            } finally {
                bqt.f4618b.unlock();
            }
        } else if (i != 2) {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i3);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            bqt bqt2 = this.f4616a;
            int i4 = bqt.f4617j;
            bqt2.mo2328e();
        }
    }
}
