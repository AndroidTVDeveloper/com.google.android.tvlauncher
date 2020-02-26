package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: cjy  reason: default package */
/* compiled from: PG */
final class cjy extends Handler {
    public cjy() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        cjz cjz = (cjz) message.obj;
        int i = cjz.j;
        if (!cjz.a) {
            cjz.c.b(cjz);
        } else {
            cjz.c.c(cjz);
        }
        cjz.a();
    }
}
