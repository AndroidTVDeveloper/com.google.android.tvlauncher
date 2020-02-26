package p000;

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

/* renamed from: dgn */
/* compiled from: PG */
public abstract class dgn extends dhk implements dhb {

    /* renamed from: a */
    public static final boolean f8507a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    public static final Logger f8508b;

    /* renamed from: c */
    public static final dga f8509c;

    /* renamed from: d */
    public static final Object f8510d = new Object();
    public volatile dge listeners;
    public volatile Object value;
    public volatile dgm waiters;

    static {
        Throwable th;
        Throwable th2;
        dga dga;
        Class<dgn> cls = dgn.class;
        f8508b = Logger.getLogger(cls.getName());
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
        f8509c = dga;
        if (th2 != null) {
            f8508b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            f8508b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4302a() {
    }

    protected dgn() {
    }

    /* renamed from: b */
    private final void m6376b(StringBuilder sb) {
        try {
            Object a = m6370a((Future) this);
            sb.append("SUCCESS, result=[");
            m6374a(sb, a);
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

    /* renamed from: a */
    public final void mo4303a(Runnable runnable, Executor executor) {
        dge dge;
        dgx.m6403a(runnable, "Runnable was null.");
        dgx.m6403a(executor, "Executor was null.");
        if (isDone() || (dge = this.listeners) == dge.f8490a) {
            m6375b(runnable, executor);
        }
        dge dge2 = new dge(runnable, executor);
        do {
            dge2.next = dge;
            if (!f8509c.mo4295a(this, dge, dge2)) {
                dge = this.listeners;
            } else {
                return;
            }
        } while (dge != dge.f8490a);
        m6375b(runnable, executor);
    }

    /* renamed from: a */
    private final void m6373a(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof dgg) {
            sb.append(", setFuture=[");
            m6374a(sb, ((dgg) obj).f8499b);
            sb.append("]");
        } else {
            try {
                str = dfd.m6295a(mo4306c());
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
            m6376b(sb);
        }
    }

    /* renamed from: a */
    private final void m6374a(StringBuilder sb, Object obj) {
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
        if (f8507a) {
            dgb = new dgb(z, new CancellationException("Future.cancel() was called."));
        } else {
            dgb = z ? dgb.f8484a : dgb.f8485b;
        }
        boolean z2 = false;
        Object obj2 = obj;
        dgn dgn = this;
        while (true) {
            if (f8509c.mo4297a(dgn, obj2, dgb)) {
                m6372a(dgn);
                if (!(obj2 instanceof dgg)) {
                    return true;
                }
                dhb dhb = ((dgg) obj2).f8499b;
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

    /* renamed from: a */
    public static void m6372a(dgn dgn) {
        dge dge;
        dge dge2 = null;
        while (true) {
            dgm dgm = dgn.waiters;
            if (f8509c.mo4296a(dgn, dgm, dgm.f8506a)) {
                while (dgm != null) {
                    Thread thread = dgm.thread;
                    if (thread != null) {
                        dgm.thread = null;
                        LockSupport.unpark(thread);
                    }
                    dgm = dgm.next;
                }
                dgn.mo4302a();
                do {
                    dge = dgn.listeners;
                } while (!f8509c.mo4295a(dgn, dge, dge.f8490a));
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
                    Runnable runnable = dge3.f8491b;
                    if (runnable instanceof dgg) {
                        dgg dgg = (dgg) runnable;
                        dgn = dgg.f8498a;
                        if (dgn.value == dgg) {
                            if (f8509c.mo4297a(dgn, dgg, m6368a(dgg.f8499b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m6375b(runnable, dge3.f8492c);
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
    /* renamed from: b */
    private static void m6375b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f8508b;
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
                return m6369a(obj2);
            }
            dgm dgm = this.waiters;
            if (dgm != dgm.f8506a) {
                dgm dgm2 = new dgm();
                do {
                    dgm2.mo4301a(dgm);
                    if (f8509c.mo4296a(this, dgm, dgm2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m6371a(dgm2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof dgg))));
                        return m6369a(obj);
                    }
                    dgm = this.waiters;
                } while (dgm != dgm.f8506a);
            }
            return m6369a(this.value);
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
                return m6369a(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                dgm dgm = this.waiters;
                if (dgm != dgm.f8506a) {
                    dgm dgm2 = new dgm();
                    do {
                        dgm2.mo4301a(dgm);
                        if (!f8509c.mo4296a(this, dgm, dgm2)) {
                            dgm = this.waiters;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof dgg))) {
                                        return m6369a(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m6371a(dgm2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m6371a(dgm2);
                        }
                    } while (dgm != dgm.f8506a);
                }
                return m6369a(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (obj3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (!(obj3 instanceof dgg))) {
                    return m6369a(obj3);
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

    /* renamed from: a */
    private static final Object m6369a(Object obj) {
        if (obj instanceof dgb) {
            Throwable th = ((dgb) obj).f8487d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof dgd) {
            throw new ExecutionException(((dgd) obj).f8489b);
        } else if (obj == f8510d) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    public static Object m6368a(dhb dhb) {
        Throwable b;
        if (dhb instanceof dgi) {
            Object obj = ((dgn) dhb).value;
            if (!(obj instanceof dgb)) {
                return obj;
            }
            dgb dgb = (dgb) obj;
            if (!dgb.f8486c) {
                return obj;
            }
            Throwable th = dgb.f8487d;
            return th != null ? new dgb(false, th) : dgb.f8485b;
        } else if ((dhb instanceof dhk) && (b = ((dhk) dhb).mo4305b()) != null) {
            return new dgd(b);
        } else {
            boolean isCancelled = dhb.isCancelled();
            if ((!f8507a) && isCancelled) {
                return dgb.f8485b;
            }
            try {
                Object a = m6370a((Future) dhb);
                if (!isCancelled) {
                    return a == null ? f8510d : a;
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

    /* renamed from: a */
    private static Object m6370a(Future future) {
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
    /* renamed from: c */
    public String mo4306c() {
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

    /* renamed from: a */
    private final void m6371a(dgm dgm) {
        dgm.thread = null;
        while (true) {
            dgm dgm2 = this.waiters;
            if (dgm2 != dgm.f8506a) {
                dgm dgm3 = null;
                while (dgm2 != null) {
                    dgm dgm4 = dgm2.next;
                    if (dgm2.thread != null) {
                        dgm3 = dgm2;
                    } else if (dgm3 != null) {
                        dgm3.next = dgm4;
                        if (dgm3.thread == null) {
                        }
                    } else if (!f8509c.mo4296a(this, dgm2, dgm4)) {
                    }
                    dgm2 = dgm4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4304a(Throwable th) {
        if (f8509c.mo4297a(this, (Object) null, new dgd((Throwable) dgx.m6401a(th)))) {
            m6372a(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m6376b(sb);
        } else {
            m6373a(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Throwable mo4305b() {
        if (!(this instanceof dgi)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof dgd) {
            return ((dgd) obj).f8489b;
        }
        return null;
    }
}
