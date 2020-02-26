package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: wz */
/* compiled from: PG */
final class C0622wz implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((C0619ww) message.obj).mo35d();
        return true;
    }
}
