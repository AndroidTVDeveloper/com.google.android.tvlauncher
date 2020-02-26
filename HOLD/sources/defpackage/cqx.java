package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: cqx  reason: default package */
/* compiled from: PG */
public final class cqx extends Handler {
    private final WeakReference a;

    public /* synthetic */ cqx(cqy cqy) {
        this.a = new WeakReference(cqy);
    }

    public final void handleMessage(Message message) {
        cqy cqy = (cqy) this.a.get();
        if (cqy != null) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            cqy.c = z;
            cqy.a.c(z);
        }
    }
}
