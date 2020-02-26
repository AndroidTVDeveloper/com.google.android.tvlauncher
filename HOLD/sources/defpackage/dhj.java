package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* renamed from: dhj  reason: default package */
/* compiled from: PG */
final class dhj extends dgr implements RunnableFuture {
    private volatile dha e;

    public dhj(dgp dgp) {
        this.e = new dhh(this, dgp);
    }

    private dhj(Callable callable) {
        this.e = new dhi(this, callable);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dha dha;
        Object obj = this.value;
        if ((obj instanceof dgb) && ((dgb) obj).c && (dha = this.e) != null) {
            Runnable runnable = (Runnable) dha.get();
            if ((runnable instanceof Thread) && dha.compareAndSet(runnable, dha.b)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) dha.getAndSet(dha.a)) == dha.c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) dha.getAndSet(dha.a)) == dha.c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
        this.e = null;
    }

    static dhj a(Runnable runnable, Object obj) {
        return new dhj(Executors.callable(runnable, obj));
    }

    static dhj a(Callable callable) {
        return new dhj(callable);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        dha dha = this.e;
        if (dha == null) {
            return super.c();
        }
        String valueOf = String.valueOf(dha);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        dha dha = this.e;
        if (dha != null) {
            dha.run();
        }
        this.e = null;
    }
}
