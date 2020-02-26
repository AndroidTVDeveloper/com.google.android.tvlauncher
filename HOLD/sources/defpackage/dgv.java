package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: dgv  reason: default package */
/* compiled from: PG */
public final class dgv implements Runnable {
    private final Future a;
    private final dgu b;

    public dgv(Future future, dgu dgu) {
        this.a = future;
        this.b = dgu;
    }

    public final void run() {
        boolean z;
        Object obj;
        try {
            Future future = this.a;
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
            throw new IllegalStateException(dgx.a("Future was expected to be done: %s", future));
        } catch (InterruptedException e) {
            z = true;
        } catch (ExecutionException e2) {
            this.b.a(e2.getCause());
        } catch (Error | RuntimeException e3) {
            this.b.a(e3);
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public final String toString() {
        dfb dfb = new dfb(getClass().getSimpleName());
        dgu dgu = this.b;
        dfa dfa = new dfa((byte) 0);
        dfb.a.b = dfa;
        dfb.a = dfa;
        dfa.a = dgu;
        return dfb.toString();
    }
}
