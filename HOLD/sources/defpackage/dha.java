package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: dha  reason: default package */
/* compiled from: PG */
abstract class dha extends AtomicReference implements Runnable {
    public static final Runnable a = new dgz((byte) 0);
    public static final Runnable b = new dgz((byte) 0);
    public static final Runnable c = new dgz((byte) 0);

    public abstract void a(Object obj, Throwable th);

    public abstract boolean a();

    public abstract Object b();

    public abstract String c();

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !a();
            if (z) {
                try {
                    obj = b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, a)) {
                        Runnable runnable = (Runnable) get();
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            if (runnable != b && runnable != c) {
                                break;
                            }
                            i++;
                            if (i <= 1000) {
                                Thread.yield();
                            } else {
                                Runnable runnable2 = c;
                                if (runnable == runnable2 || compareAndSet(b, runnable2)) {
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
                    a(null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, a)) {
                Runnable runnable3 = (Runnable) get();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (runnable3 != b && runnable3 != c) {
                        break;
                    }
                    i2++;
                    if (i2 <= 1000) {
                        Thread.yield();
                    } else {
                        Runnable runnable4 = c;
                        if (runnable3 == runnable4 || compareAndSet(b, runnable4)) {
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
                a(obj, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable == b) {
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
        String c2 = c();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(c2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(c2);
        return sb2.toString();
    }
}
