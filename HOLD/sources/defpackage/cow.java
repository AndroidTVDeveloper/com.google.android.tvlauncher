package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: cow  reason: default package */
/* compiled from: PG */
final class cow extends Handler {
    private final WeakReference a;

    public /* synthetic */ cow(cox cox) {
        this.a = new WeakReference(cox);
    }

    public final void handleMessage(Message message) {
        cox cox = (cox) this.a.get();
        if (cox != null && message != null && message.what == 99 && message.obj != null) {
            long longValue = ((Long) message.obj).longValue();
            cox.a.remove(Long.valueOf(longValue));
            cox.b.b(longValue);
        }
    }
}
