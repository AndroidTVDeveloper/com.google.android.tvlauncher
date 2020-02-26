package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dgn  reason: default package */
/* compiled from: PG */
public abstract class dgn extends dhk implements dhb {
    public static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger b;
    public static final dga c;
    public static final Object d = new Object();
    public volatile dge listeners;
    public volatile Object value;
    public volatile dgm waiters;

    static {
        Throwable th;
        Throwable th2;
        dga dga;
        Class<dgn> cls = dgn.class;
        b = Logger.getLogger(cls.getName());
        try {
            th2 = null;
            th = null;
            dga = new dgl((byte) 0);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            dga = new dgh((byte) 0);
            th2 = th4;
            th = th;
        }
        c = dga;
        if (th2 != null) {
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    protected dgn() {
    }

    private final void b(StringBuilder sb) {
        try {
            Object a2 = a((Future) this);
            sb.append("SUCCESS, result=[");
            a(sb, a2);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        dge dge;
        dgx.a(runnable, "Runnable was null.");
        dgx.a(executor, "Executor was null.");
        if (isDone() || (dge = this.listeners) == dge.a) {
            b(runnable, executor);
        }
        dge dge2 = new dge(runnable, executor);
        do {
            dge2.next = dge;
            if (!c.a(this, dge, dge2)) {
                dge = this.listeners;
            } else {
                return;
            }
        } while (dge != dge.a);
        b(runnable, executor);
    }

    private final void a(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof dgg) {
            sb.append(", setFuture=[");
            a(sb, ((dgg) obj).b);
            sb.append("]");
        } else {
            try {
                str = dfd.a(c());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            b(sb);
        }
    }

    private final void a(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    public final boolean cancel(boolean z) {
        dgb dgb;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof dgg)) {
            return false;
        }
        if (a) {
            dgb = new dgb(z, new CancellationException("Future.cancel() was called."));
        } else {
            dgb = z ? dgb.a : dgb.b;
        }
        boolean z2 = false;
        Object obj2 = obj;
        dgn dgn = this;
        while (true) {
            if (c.a(dgn, obj2, dgb)) {
                a(dgn);
                if (!(obj2 instanceof dgg)) {
                    return true;
                }
                dhb dhb = ((dgg) obj2).b;
                if (dhb instanceof dgi) {
                    dgn = (dgn) dhb;
                    obj2 = dgn.value;
                    if (!(obj2 == null) && !(obj2 instanceof dgg)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    dhb.cancel(z);
                    return true;
                }
            } else {
                obj2 = dgn.value;
                if (!(obj2 instanceof dgg)) {
                    return z2;
                }
            }
        }
    }

    public static void a(dgn dgn) {
        dge dge;
        dge dge2 = null;
        while (true) {
            dgm dgm = dgn.waiters;
            if (c.a(dgn, dgm, dgm.a)) {
                while (dgm != null) {
                    Thread thread = dgm.thread;
                    if (thread != null) {
                        dgm.thread = null;
                        LockSupport.unpark(thread);
                    }
                    dgm = dgm.next;
                }
                dgn.a();
                do {
                    dge = dgn.listeners;
                } while (!c.a(dgn, dge, dge.a));
                dge dge3 = dge2;
                dge dge4 = dge;
                while (dge4 != null) {
                    dge dge5 = dge4.next;
                    dge4.next = dge3;
                    dge3 = dge4;
                    dge4 = dge5;
                }
                while (dge3 != null) {
                    dge2 = dge3.next;
                    Runnable runnable = dge3.b;
                    if (runnable instanceof dgg) {
                        dgg dgg = (dgg) runnable;
                        dgn = dgg.a;
                        if (dgn.value == dgg) {
                            if (c.a(dgn, dgg, a(dgg.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, dge3.c);
                    }
                    dge3 = dge2;
                }
                return;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof dgg))) {
                return a(obj2);
            }
            dgm dgm = this.waiters;
            if (dgm != dgm.a) {
                dgm dgm2 = new dgm();
                do {
                    dgm2.a(dgm);
                    if (c.a(this, dgm, dgm2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                a(dgm2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof dgg))));
                        return a(obj);
                    }
                    dgm = this.waiters;
                } while (dgm != dgm.a);
            }
            return a(this.value);
        }
        throw new InterruptedException();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z3 = true;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj instanceof dgg))) {
                return a(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                dgm dgm = this.waiters;
                if (dgm != dgm.a) {
                    dgm dgm2 = new dgm();
                    do {
                        dgm2.a(dgm);
                        if (!c.a(this, dgm, dgm2)) {
                            dgm = this.waiters;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof dgg))) {
                                        return a(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    a(dgm2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(dgm2);
                        }
                    } while (dgm != dgm.a);
                }
                return a(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (obj3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (!(obj3 instanceof dgg))) {
                    return a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String dgn = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z3) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z3) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(dgn).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(dgn);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    private static final Object a(Object obj) {
        if (obj instanceof dgb) {
            Throwable th = ((dgb) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof dgd) {
            throw new ExecutionException(((dgd) obj).b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object a(dhb dhb) {
        Throwable b2;
        if (dhb instanceof dgi) {
            Object obj = ((dgn) dhb).value;
            if (!(obj instanceof dgb)) {
                return obj;
            }
            dgb dgb = (dgb) obj;
            if (!dgb.c) {
                return obj;
            }
            Throwable th = dgb.d;
            return th != null ? new dgb(false, th) : dgb.b;
        } else if ((dhb instanceof dhk) && (b2 = ((dhk) dhb).b()) != null) {
            return new dgd(b2);
        } else {
            boolean isCancelled = dhb.isCancelled();
            if ((!a) && isCancelled) {
                return dgb.b;
            }
            try {
                Object a2 = a((Future) dhb);
                if (!isCancelled) {
                    return a2 == null ? d : a2;
                }
                String valueOf = String.valueOf(dhb);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new dgb(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new dgd(e.getCause());
                }
                String valueOf2 = String.valueOf(dhb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new dgb(false, new IllegalArgumentException(sb2.toString(), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new dgb(false, e2);
                }
                String valueOf3 = String.valueOf(dhb);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new dgd(new IllegalArgumentException(sb3.toString(), e2));
            } catch (Throwable th2) {
                return new dgd(th2);
            }
        }
    }

    private static Object a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final boolean isCancelled() {
        return this.value instanceof dgb;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof dgg)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    private final void a(dgm dgm) {
        dgm.thread = null;
        while (true) {
            dgm dgm2 = this.waiters;
            if (dgm2 != dgm.a) {
                dgm dgm3 = null;
                while (dgm2 != null) {
                    dgm dgm4 = dgm2.next;
                    if (dgm2.thread != null) {
                        dgm3 = dgm2;
                    } else if (dgm3 != null) {
                        dgm3.next = dgm4;
                        if (dgm3.thread == null) {
                        }
                    } else if (!c.a(this, dgm2, dgm4)) {
                    }
                    dgm2 = dgm4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        if (c.a(this, (Object) null, new dgd((Throwable) dgx.a(th)))) {
            a(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            a(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final Throwable b() {
        if (!(this instanceof dgi)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof dgd) {
            return ((dgd) obj).b;
        }
        return null;
    }
}
