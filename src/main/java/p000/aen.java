package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: aen */
/* compiled from: PG */
final class aen implements Handler.Callback {

    /* renamed from: a */
    private final /* synthetic */ aeo f190a;

    public aen(aeo aeo) {
        this.f190a = aeo;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f190a.mo117a((ael) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            this.f190a.f193c.mo5947a((ahg) ((ael) message.obj));
            return false;
        }
    }
}
