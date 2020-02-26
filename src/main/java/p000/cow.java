package p000;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: cow */
/* compiled from: PG */
final class cow extends Handler {

    /* renamed from: a */
    private final WeakReference f6854a;

    public /* synthetic */ cow(cox cox) {
        this.f6854a = new WeakReference(cox);
    }

    public final void handleMessage(Message message) {
        cox cox = (cox) this.f6854a.get();
        if (cox != null && message != null && message.what == 99 && message.obj != null) {
            long longValue = ((Long) message.obj).longValue();
            cox.f6855a.remove(Long.valueOf(longValue));
            cox.f6856b.mo3062b(longValue);
        }
    }
}
