package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: ahc  reason: default package */
/* compiled from: PG */
final class ahc implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ahd ahd = (ahd) message.obj;
        ahd.a.a((ahg) ahd);
        return true;
    }
}
