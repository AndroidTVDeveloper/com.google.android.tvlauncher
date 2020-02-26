package p000;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: cqx */
/* compiled from: PG */
public final class cqx extends Handler {

    /* renamed from: a */
    private final WeakReference f7042a;

    public /* synthetic */ cqx(cqy cqy) {
        this.f7042a = new WeakReference(cqy);
    }

    public final void handleMessage(Message message) {
        cqy cqy = (cqy) this.f7042a.get();
        if (cqy != null) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            cqy.f7045c = z;
            cqy.f7043a.mo3597c(z);
        }
    }
}
