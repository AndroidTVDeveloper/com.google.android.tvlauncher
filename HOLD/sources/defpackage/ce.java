package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: ce  reason: default package */
/* compiled from: PG */
final class ce implements Handler.Callback {
    private final /* synthetic */ cj a;

    public ce(cj cjVar) {
        this.a = cjVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            cj cjVar = this.a;
            synchronized (cjVar.a) {
                if (!cjVar.c.hasMessages(1)) {
                    cjVar.b.quit();
                    cjVar.b = null;
                    cjVar.c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            cj cjVar2 = this.a;
            ((Runnable) message.obj).run();
            synchronized (cjVar2.a) {
                cjVar2.c.removeMessages(0);
                Handler handler = cjVar2.c;
                handler.sendMessageDelayed(handler.obtainMessage(0), (long) cjVar2.d);
            }
            return true;
        }
    }
}
