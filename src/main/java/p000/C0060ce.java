package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: ce */
/* compiled from: PG */
final class C0060ce implements Handler.Callback {

    /* renamed from: a */
    private final /* synthetic */ C0065cj f5347a;

    public C0060ce(C0065cj cjVar) {
        this.f5347a = cjVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C0065cj cjVar = this.f5347a;
            synchronized (cjVar.f5671a) {
                if (!cjVar.f5673c.hasMessages(1)) {
                    cjVar.f5672b.quit();
                    cjVar.f5672b = null;
                    cjVar.f5673c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            C0065cj cjVar2 = this.f5347a;
            ((Runnable) message.obj).run();
            synchronized (cjVar2.f5671a) {
                cjVar2.f5673c.removeMessages(0);
                Handler handler = cjVar2.f5673c;
                handler.sendMessageDelayed(handler.obtainMessage(0), (long) cjVar2.f5674d);
            }
            return true;
        }
    }
}
