package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: blz */
/* compiled from: PG */
final class blz implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: b */
    public static final blz f4372b = new blz();

    /* renamed from: a */
    public volatile long f4373a = -9223372036854775807L;

    /* renamed from: c */
    public final Handler f4374c;

    /* renamed from: d */
    private final HandlerThread f4375d;

    /* renamed from: e */
    private Choreographer f4376e;

    /* renamed from: f */
    private int f4377f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
     arg types: [android.os.Looper, blz]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object, java.lang.Object):boolean
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler */
    private blz() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f4375d = handlerThread;
        handlerThread.start();
        Handler a = blm.m3634a(this.f4375d.getLooper(), (Handler.Callback) this);
        this.f4374c = a;
        a.sendEmptyMessage(0);
    }

    public final void doFrame(long j) {
        this.f4373a = j;
        this.f4376e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f4376e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f4377f + 1;
            this.f4377f = i2;
            if (i2 == 1) {
                this.f4376e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f4377f - 1;
            this.f4377f = i3;
            if (i3 == 0) {
                this.f4376e.removeFrameCallback(this);
                this.f4373a = -9223372036854775807L;
            }
            return true;
        }
    }
}
