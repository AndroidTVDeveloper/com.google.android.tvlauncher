package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public abstract class BasePendingResult extends bou {
    private static final ThreadLocal a = new bpq();
    public static /* synthetic */ int g;
    private final bpr b;
    public final Object c;
    public final WeakReference d;
    public box e;
    public boolean f;
    private final CountDownLatch h;
    private final ArrayList i;
    private boy j;
    private final AtomicReference k;
    private Status l;
    private volatile boolean m;
    public bps mResultGuardian;
    private boolean n;
    private boolean o;
    private volatile bpb p;

    /* access modifiers changed from: protected */
    public abstract box a(Status status);

    @Deprecated
    BasePendingResult() {
        this.c = new Object();
        this.h = new CountDownLatch(1);
        this.i = new ArrayList();
        this.k = new AtomicReference();
        this.f = false;
        this.b = new bpr(Looper.getMainLooper());
        this.d = new WeakReference(null);
    }

    protected BasePendingResult(bos bos) {
        this.c = new Object();
        this.h = new CountDownLatch(1);
        this.i = new ArrayList();
        this.k = new AtomicReference();
        this.f = false;
        this.b = new bpr(bos != null ? bos.a() : Looper.getMainLooper());
        this.d = new WeakReference(bos);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buh.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      buh.b(android.os.Parcel, int):void
      buh.b(boolean, java.lang.Object):void */
    public final void a(bot bot) {
        buh.b(true, (Object) "Callback cannot be null.");
        synchronized (this.c) {
            if (!d()) {
                this.i.add(bot);
            } else {
                bot.a(this.l);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buh.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      buh.a(android.os.Parcel, int):int
      buh.a(java.lang.Object, java.lang.Object):java.lang.Object
      buh.a(android.os.Handler, java.lang.String):void
      buh.a(boolean, java.lang.Object):void */
    public final void a(TimeUnit timeUnit) {
        buh.a(!this.m, "Result has already been consumed.");
        buh.a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.h.await(0, timeUnit)) {
                c(Status.d);
            }
        } catch (InterruptedException e2) {
            c(Status.b);
        }
        buh.a(d(), "Result is not ready.");
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            boolean r1 = r2.n     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            boolean r1 = r2.m     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            box r1 = r2.e     // Catch:{ all -> 0x0020 }
            b(r1)     // Catch:{ all -> 0x0020 }
            r1 = 1
            r2.n = r1     // Catch:{ all -> 0x0020 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x0020 }
            box r1 = r2.a(r1)     // Catch:{ all -> 0x0020 }
            r2.c(r1)     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a():void");
    }

    public final void c(Status status) {
        synchronized (this.c) {
            if (!d()) {
                a(a(status));
                this.o = true;
            }
        }
    }

    private final box e() {
        box box;
        synchronized (this.c) {
            buh.a(!this.m, "Result has already been consumed.");
            buh.a(d(), "Result is not ready.");
            box = this.e;
            this.e = null;
            this.j = null;
            this.m = true;
        }
        bsd bsd = (bsd) this.k.getAndSet(null);
        if (bsd != null) {
            bsd.a(this);
        }
        return box;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.n;
        }
        return z;
    }

    private final boolean d() {
        return this.h.getCount() == 0;
    }

    public final void c() {
        boolean z = true;
        if (!this.f && !((Boolean) a.get()).booleanValue()) {
            z = false;
        }
        this.f = z;
    }

    public static void b(box box) {
        if (box instanceof bov) {
            try {
                ((bov) box).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(box);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    public final void a(box box) {
        synchronized (this.c) {
            if (this.o || this.n) {
                b(box);
                return;
            }
            d();
            buh.a(!d(), "Results have already been set");
            buh.a(!this.m, "Result has already been consumed");
            c(box);
        }
    }

    private final void c(box box) {
        this.e = box;
        this.h.countDown();
        this.l = this.e.a();
        if (this.n) {
            this.j = null;
        } else if (this.j != null) {
            this.b.removeMessages(2);
            this.b.a(this.j, e());
        } else if (this.e instanceof bov) {
            this.mResultGuardian = new bps(this);
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bot) arrayList.get(i2)).a(this.l);
        }
        this.i.clear();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buh.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      buh.a(android.os.Parcel, int):int
      buh.a(java.lang.Object, java.lang.Object):java.lang.Object
      buh.a(android.os.Handler, java.lang.String):void
      buh.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.boy r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            if (r5 == 0) goto L_0x002f
            boolean r1 = r4.m     // Catch:{ all -> 0x0034 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            defpackage.buh.a(r1, r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            defpackage.buh.a(r2, r1)     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.b()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x002d
            boolean r1 = r4.d()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0029
            bpr r1 = r4.b     // Catch:{ all -> 0x0034 }
            box r2 = r4.e()     // Catch:{ all -> 0x0034 }
            r1.a(r5, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x002b
        L_0x0029:
            r4.j = r5     // Catch:{ all -> 0x0034 }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x002f:
            r5 = 0
            r4.j = r5     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(boy):void");
    }

    public final void a(bsd bsd) {
        this.k.set(bsd);
    }
}
