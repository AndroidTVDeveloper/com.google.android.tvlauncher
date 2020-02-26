package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: blz  reason: default package */
/* compiled from: PG */
final class blz implements Choreographer.FrameCallback, Handler.Callback {
    public static final blz b = new blz();
    public volatile long a = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

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
        this.d = handlerThread;
        handlerThread.start();
        Handler a2 = blm.a(this.d.getLooper(), (Handler.Callback) this);
        this.c = a2;
        a2.sendEmptyMessage(0);
    }

    public final void doFrame(long j) {
        this.a = j;
        this.e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
                this.e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                this.e.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
            return true;
        }
    }
}
