package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: dha */
/* compiled from: PG */
abstract class dha extends AtomicReference implements Runnable {

    /* renamed from: a */
    public static final Runnable f8522a = new dgz((byte) 0);

    /* renamed from: b */
    public static final Runnable f8523b = new dgz((byte) 0);

    /* renamed from: c */
    public static final Runnable f8524c = new dgz((byte) 0);

    /* renamed from: a */
    public abstract void mo4348a(Object obj, Throwable th);

    /* renamed from: a */
    public abstract boolean mo4349a();

    /* renamed from: b */
    public abstract Object mo4350b();

    /* renamed from: c */
    public abstract String mo4351c();

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !mo4349a();
            if (z) {
                try {
                    obj = mo4350b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f8522a)) {
                        Runnable runnable = (Runnable) get();
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            if (runnable != f8523b && runnable != f8524c) {
                                break;
                            }
                            i++;
                            if (i <= 1000) {
                                Thread.yield();
                            } else {
                                Runnable runnable2 = f8524c;
                                if (runnable == runnable2 || compareAndSet(f8523b, runnable2)) {
                                    boolean z3 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                    z2 = z3;
                                }
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    mo4348a(null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f8522a)) {
                Runnable runnable3 = (Runnable) get();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (runnable3 != f8523b && runnable3 != f8524c) {
                        break;
                    }
                    i2++;
                    if (i2 <= 1000) {
                        Thread.yield();
                    } else {
                        Runnable runnable4 = f8524c;
                        if (runnable3 == runnable4 || compareAndSet(f8523b, runnable4)) {
                            boolean z5 = Thread.interrupted() || z4;
                            LockSupport.park(this);
                            z4 = z5;
                        }
                    }
                    runnable3 = (Runnable) get();
                }
                if (z4) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                mo4348a(obj, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f8522a) {
            str = "running=[DONE]";
        } else if (runnable == f8523b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c = mo4351c();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(c).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(c);
        return sb2.toString();
    }
}
