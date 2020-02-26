package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* renamed from: bis */
/* compiled from: PG */
final class bis extends Handler implements Runnable {

    /* renamed from: a */
    public final int f4081a;

    /* renamed from: b */
    public IOException f4082b;

    /* renamed from: c */
    public int f4083c;

    /* renamed from: d */
    private final bit f4084d;

    /* renamed from: e */
    private final long f4085e;

    /* renamed from: f */
    private biq f4086f;

    /* renamed from: g */
    private volatile Thread f4087g;

    /* renamed from: h */
    private volatile boolean f4088h;

    /* renamed from: i */
    private volatile boolean f4089i;

    /* renamed from: j */
    private final /* synthetic */ bix f4090j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bis(bix bix, Looper looper, bit bit, biq biq, int i, long j) {
        super(looper);
        this.f4090j = bix;
        this.f4084d = bit;
        this.f4086f = biq;
        this.f4081a = i;
        this.f4085e = j;
    }

    /* renamed from: a */
    public final void mo1980a(boolean z) {
        this.f4089i = z;
        this.f4082b = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f4088h = true;
            this.f4084d.mo1538a();
            if (this.f4087g != null) {
                this.f4087g.interrupt();
            }
            if (!z) {
                return;
            }
        }
        m3354b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f4086f.mo1549a(this.f4084d, elapsedRealtime, elapsedRealtime - this.f4085e, true);
        this.f4086f = null;
    }

    /* renamed from: a */
    private final void m3353a() {
        this.f4082b = null;
        bix bix = this.f4090j;
        bir bir = bix.f4092a;
        bix.f4094c.execute(bix.f4095d);
    }

    /* renamed from: b */
    private final void m3354b() {
        bix bix = this.f4090j;
        bir bir = bix.f4092a;
        bix.f4095d = null;
    }

    public final void handleMessage(Message message) {
        if (this.f4089i) {
            return;
        }
        if (message.what == 0) {
            m3353a();
        } else if (message.what != 4) {
            m3354b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f4085e;
            if (this.f4088h) {
                this.f4086f.mo1549a(this.f4084d, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.f4086f.mo1549a(this.f4084d, elapsedRealtime, j, false);
            } else if (i == 2) {
                try {
                    this.f4086f.mo1548a(this.f4084d, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    Log.e("LoadTask", "Unexpected exception handling load completed", e);
                    bix bix = this.f4090j;
                    biw biw = new biw(e);
                    bir bir = bix.f4092a;
                    bix.f4096e = biw;
                }
            } else if (i == 3) {
                IOException iOException = (IOException) message.obj;
                this.f4082b = iOException;
                int i2 = this.f4083c + 1;
                this.f4083c = i2;
                bir a = this.f4086f.mo1546a(this.f4084d, elapsedRealtime, j, iOException, i2);
                int i3 = a.f4079a;
                if (i3 == 3) {
                    bix bix2 = this.f4090j;
                    IOException iOException2 = this.f4082b;
                    bir bir2 = bix.f4092a;
                    bix2.f4096e = iOException2;
                } else if (i3 != 2) {
                    if (i3 == 1) {
                        this.f4083c = 1;
                    }
                    long j2 = a.f4080b;
                    if (j2 == -9223372036854775807L) {
                        j2 = (long) Math.min((this.f4083c - 1) * 1000, 5000);
                    }
                    mo1979a(j2);
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    public final void run() {
        try {
            this.f4087g = Thread.currentThread();
            if (!this.f4088h) {
                String valueOf = String.valueOf(this.f4084d.getClass().getSimpleName());
                blk.m3619a(valueOf.length() == 0 ? new String("load:") : "load:".concat(valueOf));
                this.f4084d.mo1540b();
                blk.m3618a();
            }
            if (!this.f4089i) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f4089i) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException e2) {
            bks.m3512b(this.f4088h);
            if (!this.f4089i) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.f4089i) {
                obtainMessage(3, new biw(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.f4089i) {
                obtainMessage(3, new biw(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.f4089i) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        } catch (Throwable th) {
            blk.m3618a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo1979a(long j) {
        bix bix = this.f4090j;
        bir bir = bix.f4092a;
        bks.m3512b(bix.f4095d == null);
        this.f4090j.f4095d = this;
        if (j <= 0) {
            m3353a();
        } else {
            sendEmptyMessageDelayed(0, j);
        }
    }
}
