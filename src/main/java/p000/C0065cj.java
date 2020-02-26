package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: cj */
/* compiled from: PG */
public final class C0065cj {

    /* renamed from: a */
    public final Object f5671a = new Object();

    /* renamed from: b */
    public HandlerThread f5672b;

    /* renamed from: c */
    public Handler f5673c;

    /* renamed from: d */
    public final int f5674d;

    /* renamed from: e */
    private int f5675e;

    /* renamed from: f */
    private final Handler.Callback f5676f = new C0060ce(this);

    /* renamed from: g */
    private final int f5677g;

    /* renamed from: h */
    private final String f5678h;

    public C0065cj(String str) {
        this.f5678h = str;
        this.f5677g = 10;
        this.f5674d = 10000;
        this.f5675e = 0;
    }

    /* renamed from: a */
    public final void mo2881a(Runnable runnable) {
        synchronized (this.f5671a) {
            if (this.f5672b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f5678h, this.f5677g);
                this.f5672b = handlerThread;
                handlerThread.start();
                this.f5673c = new Handler(this.f5672b.getLooper(), this.f5676f);
                this.f5675e++;
            }
            this.f5673c.removeMessages(0);
            Handler handler = this.f5673c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
