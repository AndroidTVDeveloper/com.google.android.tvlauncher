package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* renamed from: bis  reason: default package */
/* compiled from: PG */
final class bis extends Handler implements Runnable {
    public final int a;
    public IOException b;
    public int c;
    private final bit d;
    private final long e;
    private biq f;
    private volatile Thread g;
    private volatile boolean h;
    private volatile boolean i;
    private final /* synthetic */ bix j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bis(bix bix, Looper looper, bit bit, biq biq, int i2, long j2) {
        super(looper);
        this.j = bix;
        this.d = bit;
        this.f = biq;
        this.a = i2;
        this.e = j2;
    }

    public final void a(boolean z) {
        this.i = z;
        this.b = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.h = true;
            this.d.a();
            if (this.g != null) {
                this.g.interrupt();
            }
            if (!z) {
                return;
            }
        }
        b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f.a(this.d, elapsedRealtime, elapsedRealtime - this.e, true);
        this.f = null;
    }

    private final void a() {
        this.b = null;
        bix bix = this.j;
        bir bir = bix.a;
        bix.c.execute(bix.d);
    }

    private final void b() {
        bix bix = this.j;
        bir bir = bix.a;
        bix.d = null;
    }

    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        if (message.what == 0) {
            a();
        } else if (message.what != 4) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.e;
            if (this.h) {
                this.f.a(this.d, elapsedRealtime, j2, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.f.a(this.d, elapsedRealtime, j2, false);
            } else if (i2 == 2) {
                try {
                    this.f.a(this.d, elapsedRealtime, j2);
                } catch (RuntimeException e2) {
                    Log.e("LoadTask", "Unexpected exception handling load completed", e2);
                    bix bix = this.j;
                    biw biw = new biw(e2);
                    bir bir = bix.a;
                    bix.e = biw;
                }
            } else if (i2 == 3) {
                IOException iOException = (IOException) message.obj;
                this.b = iOException;
                int i3 = this.c + 1;
                this.c = i3;
                bir a2 = this.f.a(this.d, elapsedRealtime, j2, iOException, i3);
                int i4 = a2.a;
                if (i4 == 3) {
                    bix bix2 = this.j;
                    IOException iOException2 = this.b;
                    bir bir2 = bix.a;
                    bix2.e = iOException2;
                } else if (i4 != 2) {
                    if (i4 == 1) {
                        this.c = 1;
                    }
                    long j3 = a2.b;
                    if (j3 == -9223372036854775807L) {
                        j3 = (long) Math.min((this.c - 1) * 1000, 5000);
                    }
                    a(j3);
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    public final void run() {
        try {
            this.g = Thread.currentThread();
            if (!this.h) {
                String valueOf = String.valueOf(this.d.getClass().getSimpleName());
                blk.a(valueOf.length() == 0 ? new String("load:") : "load:".concat(valueOf));
                this.d.b();
                blk.a();
            }
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.i) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (InterruptedException e3) {
            bks.b(this.h);
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            if (!this.i) {
                obtainMessage(3, new biw(e4)).sendToTarget();
            }
        } catch (OutOfMemoryError e5) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e5);
            if (!this.i) {
                obtainMessage(3, new biw(e5)).sendToTarget();
            }
        } catch (Error e6) {
            Log.e("LoadTask", "Unexpected error loading stream", e6);
            if (!this.i) {
                obtainMessage(4, e6).sendToTarget();
            }
            throw e6;
        } catch (Throwable th) {
            blk.a();
            throw th;
        }
    }

    public final void a(long j2) {
        bix bix = this.j;
        bir bir = bix.a;
        bks.b(bix.d == null);
        this.j.d = this;
        if (j2 <= 0) {
            a();
        } else {
            sendEmptyMessageDelayed(0, j2);
        }
    }
}
