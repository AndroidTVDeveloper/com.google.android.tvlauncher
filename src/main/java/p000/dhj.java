package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* renamed from: dhj */
/* compiled from: PG */
final class dhj extends dgr implements RunnableFuture {

    /* renamed from: e */
    private volatile dha f8531e;

    public dhj(dgp dgp) {
        this.f8531e = new dhh(this, dgp);
    }

    private dhj(Callable callable) {
        this.f8531e = new dhi(this, callable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4302a() {
        dha dha;
        Object obj = this.value;
        if ((obj instanceof dgb) && ((dgb) obj).f8486c && (dha = this.f8531e) != null) {
            Runnable runnable = (Runnable) dha.get();
            if ((runnable instanceof Thread) && dha.compareAndSet(runnable, dha.f8523b)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) dha.getAndSet(dha.f8522a)) == dha.f8524c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) dha.getAndSet(dha.f8522a)) == dha.f8524c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
        this.f8531e = null;
    }

    /* renamed from: a */
    static dhj m6432a(Runnable runnable, Object obj) {
        return new dhj(Executors.callable(runnable, obj));
    }

    /* renamed from: a */
    static dhj m6433a(Callable callable) {
        return new dhj(callable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo4306c() {
        dha dha = this.f8531e;
        if (dha == null) {
            return super.mo4306c();
        }
        String valueOf = String.valueOf(dha);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        dha dha = this.f8531e;
        if (dha != null) {
            dha.run();
        }
        this.f8531e = null;
    }
}
