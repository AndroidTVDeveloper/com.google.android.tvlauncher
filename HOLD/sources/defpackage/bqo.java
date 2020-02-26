package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: bqo  reason: default package */
/* compiled from: PG */
abstract class bqo implements Runnable {
    private final /* synthetic */ bqp a;

    public /* synthetic */ bqo(bqp bqp) {
        this.a = bqp;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Lock lock;
        this.a.b.lock();
        try {
            if (Thread.interrupted()) {
                lock = this.a.b;
            } else {
                a();
                lock = this.a.b;
            }
        } catch (RuntimeException e) {
            bqx bqx = this.a.a;
            bqx.e.sendMessage(bqx.e.obtainMessage(2, e));
            lock = this.a.b;
        } catch (Throwable th) {
            this.a.b.unlock();
            throw th;
        }
        lock.unlock();
    }
}
