package p000;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agp */
/* compiled from: PG */
public final class agp implements agl, agq {

    /* renamed from: a */
    private final int f305a;

    /* renamed from: b */
    private final int f306b;

    /* renamed from: c */
    private Object f307c;

    /* renamed from: d */
    private agm f308d;

    /* renamed from: e */
    private boolean f309e;

    /* renamed from: f */
    private boolean f310f;

    /* renamed from: g */
    private boolean f311g;

    /* renamed from: h */
    private C0613wq f312h;

    public agp(int i, int i2) {
        this.f305a = i;
        this.f306b = i2;
    }

    /* renamed from: a */
    public final void mo158a() {
    }

    /* renamed from: a */
    public final void mo113a(Drawable drawable) {
    }

    /* renamed from: a */
    public final synchronized void mo114a(Object obj) {
    }

    /* renamed from: b */
    public final void mo159b() {
    }

    /* renamed from: b */
    public final void mo232b(ahf ahf) {
    }

    /* renamed from: b */
    public final void mo233b(Drawable drawable) {
    }

    /* renamed from: c */
    public final void mo160c() {
    }

    /* renamed from: c */
    public final synchronized void mo235c(Drawable drawable) {
    }

    /* renamed from: d */
    public final synchronized agm mo237d() {
        return this.f308d;
    }

    public final synchronized boolean isCancelled() {
        return this.f309e;
    }

    public final synchronized boolean isDone() {
        return this.f309e || this.f310f || this.f311g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r3.mo217b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r3 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001e
            r0 = 1
            r2.f309e = r0     // Catch:{ all -> 0x0021 }
            r2.notifyAll()     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x0015
            agm r3 = r2.f308d     // Catch:{ all -> 0x0021 }
            r2.f308d = r1     // Catch:{ all -> 0x0021 }
            goto L_0x0017
        L_0x0015:
            r3 = r1
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x001d
            r3.mo217b()
        L_0x001d:
            return r0
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r3 = 0
            return r3
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.agp.cancel(boolean):boolean");
    }

    /* renamed from: a */
    private final synchronized Object m398a(Long l) {
        if (!isDone()) {
            if (!aie.m566c()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f309e) {
            throw new CancellationException();
        } else if (this.f311g) {
            throw new ExecutionException(this.f312h);
        } else if (!this.f310f) {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f311g) {
                throw new ExecutionException(this.f312h);
            } else if (this.f309e) {
                throw new CancellationException();
            } else if (this.f310f) {
                return this.f307c;
            } else {
                throw new TimeoutException();
            }
        } else {
            return this.f307c;
        }
    }

    public final Object get() {
        try {
            return m398a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return m398a(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: a */
    public final void mo230a(ahf ahf) {
        ahf.mo245a(this.f305a, this.f306b);
    }

    /* renamed from: a */
    public final synchronized void mo231a(C0613wq wqVar) {
        this.f311g = true;
        this.f312h = wqVar;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo234b(Object obj) {
        this.f310f = true;
        this.f307c = obj;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void mo229a(agm agm) {
        this.f308d = agm;
    }
}
