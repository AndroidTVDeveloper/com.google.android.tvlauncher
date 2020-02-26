package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: aen  reason: default package */
/* compiled from: PG */
final class aen implements Handler.Callback {
    private final /* synthetic */ aeo a;

    public aen(aeo aeo) {
        this.a = aeo;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.a((ael) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            this.a.c.a((ahg) ((ael) message.obj));
            return false;
        }
    }
}
