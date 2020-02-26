package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: wz  reason: default package */
/* compiled from: PG */
final class wz implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((ww) message.obj).d();
        return true;
    }
}
