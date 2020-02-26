package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: dgv */
/* compiled from: PG */
public final class dgv implements Runnable {

    /* renamed from: a */
    private final Future f8516a;

    /* renamed from: b */
    private final dgu f8517b;

    public dgv(Future future, dgu dgu) {
        this.f8516a = future;
        this.f8517b = dgu;
    }

    public final void run() {
        boolean z;
        Object obj;
        try {
            Future future = this.f8516a;
            z = false;
            if (future.isDone()) {
                while (true) {
                    obj = future.get();
                    break;
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                Void voidR = (Void) obj;
                return;
            }
            throw new IllegalStateException(dgx.m6405a("Future was expected to be done: %s", future));
        } catch (InterruptedException e) {
            z = true;
        } catch (ExecutionException e2) {
            this.f8517b.mo2623a(e2.getCause());
        } catch (Error | RuntimeException e3) {
            this.f8517b.mo2623a(e3);
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public final String toString() {
        dfb dfb = new dfb(getClass().getSimpleName());
        dgu dgu = this.f8517b;
        dfa dfa = new dfa((byte) 0);
        dfb.f8441a.f8440b = dfa;
        dfb.f8441a = dfa;
        dfa.f8439a = dgu;
        return dfb.toString();
    }
}
