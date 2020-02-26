package p000;

import java.util.concurrent.locks.Lock;

/* renamed from: bqo */
/* compiled from: PG */
abstract class bqo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bqp f4592a;

    public /* synthetic */ bqo(bqp bqp) {
        this.f4592a = bqp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2315a();

    public final void run() {
        Lock lock;
        this.f4592a.f4594b.lock();
        try {
            if (Thread.interrupted()) {
                lock = this.f4592a.f4594b;
            } else {
                mo2315a();
                lock = this.f4592a.f4594b;
            }
        } catch (RuntimeException e) {
            bqx bqx = this.f4592a.f4593a;
            bqx.f4648e.sendMessage(bqx.f4648e.obtainMessage(2, e));
            lock = this.f4592a.f4594b;
        } catch (Throwable th) {
            this.f4592a.f4594b.unlock();
            throw th;
        }
        lock.unlock();
    }
}
