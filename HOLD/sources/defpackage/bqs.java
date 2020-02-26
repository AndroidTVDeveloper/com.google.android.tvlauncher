package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: bqs  reason: default package */
/* compiled from: PG */
final class bqs extends bvm {
    private final /* synthetic */ bqt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqs(bqt bqt, Looper looper) {
        super(looper);
        this.a = bqt;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            bqt bqt = this.a;
            int i2 = bqt.j;
            bqt.b.lock();
            try {
                if (bqt.f()) {
                    bqt.d();
                }
            } finally {
                bqt.b.unlock();
            }
        } else if (i != 2) {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i3);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            bqt bqt2 = this.a;
            int i4 = bqt.j;
            bqt2.e();
        }
    }
}
