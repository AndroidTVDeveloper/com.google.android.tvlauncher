package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agp  reason: default package */
/* compiled from: PG */
public final class agp implements agl, agq {
    private final int a;
    private final int b;
    private Object c;
    private agm d;
    private boolean e;
    private boolean f;
    private boolean g;
    private wq h;

    public agp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a() {
    }

    public final void a(Drawable drawable) {
    }

    public final synchronized void a(Object obj) {
    }

    public final void b() {
    }

    public final void b(ahf ahf) {
    }

    public final void b(Drawable drawable) {
    }

    public final void c() {
    }

    public final synchronized void c(Drawable drawable) {
    }

    public final synchronized agm d() {
        return this.d;
    }

    public final synchronized boolean isCancelled() {
        return this.e;
    }

    public final synchronized boolean isDone() {
        return this.e || this.f || this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r3.b();
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
            r2.e = r0     // Catch:{ all -> 0x0021 }
            r2.notifyAll()     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x0015
            agm r3 = r2.d     // Catch:{ all -> 0x0021 }
            r2.d = r1     // Catch:{ all -> 0x0021 }
            goto L_0x0017
        L_0x0015:
            r3 = r1
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x001d
            r3.b()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agp.cancel(boolean):boolean");
    }

    private final synchronized Object a(Long l) {
        if (!isDone()) {
            if (!aie.c()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.e) {
            throw new CancellationException();
        } else if (this.g) {
            throw new ExecutionException(this.h);
        } else if (!this.f) {
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
            } else if (this.g) {
                throw new ExecutionException(this.h);
            } else if (this.e) {
                throw new CancellationException();
            } else if (this.f) {
                return this.c;
            } else {
                throw new TimeoutException();
            }
        } else {
            return this.c;
        }
    }

    public final Object get() {
        try {
            return a((Long) null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return a(Long.valueOf(timeUnit.toMillis(j)));
    }

    public final void a(ahf ahf) {
        ahf.a(this.a, this.b);
    }

    public final synchronized void a(wq wqVar) {
        this.g = true;
        this.h = wqVar;
        notifyAll();
    }

    public final synchronized void b(Object obj) {
        this.f = true;
        this.c = obj;
        notifyAll();
    }

    public final synchronized void a(agm agm) {
        this.d = agm;
    }
}
