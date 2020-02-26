package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: cjy */
/* compiled from: PG */
final class cjy extends Handler {
    public cjy() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        cjz cjz = (cjz) message.obj;
        int i = cjz.f5765j;
        if (!cjz.f5776a) {
            cjz.f5778c.mo2943b(cjz);
        } else {
            cjz.f5778c.mo2944c(cjz);
        }
        cjz.mo2946a();
    }
}
