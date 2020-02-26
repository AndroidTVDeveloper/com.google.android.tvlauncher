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

    /* renamed from: a */
    private static final ThreadLocal f6269a = new bpq();

    /* renamed from: g */
    public static /* synthetic */ int f6270g;

    /* renamed from: b */
    private final bpr f6271b;

    /* renamed from: c */
    public final Object f6272c;

    /* renamed from: d */
    public final WeakReference f6273d;

    /* renamed from: e */
    public box f6274e;

    /* renamed from: f */
    public boolean f6275f;

    /* renamed from: h */
    private final CountDownLatch f6276h;

    /* renamed from: i */
    private final ArrayList f6277i;

    /* renamed from: j */
    private boy f6278j;

    /* renamed from: k */
    private final AtomicReference f6279k;

    /* renamed from: l */
    private Status f6280l;

    /* renamed from: m */
    private volatile boolean f6281m;
    public bps mResultGuardian;

    /* renamed from: n */
    private boolean f6282n;

    /* renamed from: o */
    private boolean f6283o;

    /* renamed from: p */
    private volatile bpb f6284p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract box mo2178a(Status status);

    @Deprecated
    BasePendingResult() {
        this.f6272c = new Object();
        this.f6276h = new CountDownLatch(1);
        this.f6277i = new ArrayList();
        this.f6279k = new AtomicReference();
        this.f6275f = false;
        this.f6271b = new bpr(Looper.getMainLooper());
        this.f6273d = new WeakReference(null);
    }

    protected BasePendingResult(bos bos) {
        this.f6272c = new Object();
        this.f6276h = new CountDownLatch(1);
        this.f6277i = new ArrayList();
        this.f6279k = new AtomicReference();
        this.f6275f = false;
        this.f6271b = new bpr(bos != null ? bos.mo2244a() : Looper.getMainLooper());
        this.f6273d = new WeakReference(bos);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buh.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      buh.b(android.os.Parcel, int):void
      buh.b(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo2249a(bot bot) {
        buh.m4213b(true, (Object) "Callback cannot be null.");
        synchronized (this.f6272c) {
            if (!m5228d()) {
                this.f6277i.add(bot);
            } else {
                bot.mo2248a(this.f6280l);
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
    /* renamed from: a */
    public final void mo2251a(TimeUnit timeUnit) {
        buh.m4206a(!this.f6281m, "Result has already been consumed.");
        buh.m4206a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.f6276h.await(0, timeUnit)) {
                mo3199c(Status.f6263d);
            }
        } catch (InterruptedException e) {
            mo3199c(Status.f6261b);
        }
        buh.m4206a(m5228d(), "Result is not ready.");
        m5229e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3194a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6272c
            monitor-enter(r0)
            boolean r1 = r2.f6282n     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            boolean r1 = r2.f6281m     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            box r1 = r2.f6274e     // Catch:{ all -> 0x0020 }
            m5226b(r1)     // Catch:{ all -> 0x0020 }
            r1 = 1
            r2.f6282n = r1     // Catch:{ all -> 0x0020 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f6264e     // Catch:{ all -> 0x0020 }
            box r1 = r2.mo2178a(r1)     // Catch:{ all -> 0x0020 }
            r2.m5227c(r1)     // Catch:{ all -> 0x0020 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo3194a():void");
    }

    /* renamed from: c */
    public final void mo3199c(Status status) {
        synchronized (this.f6272c) {
            if (!m5228d()) {
                mo3195a(mo2178a(status));
                this.f6283o = true;
            }
        }
    }

    /* renamed from: e */
    private final box m5229e() {
        box box;
        synchronized (this.f6272c) {
            buh.m4206a(!this.f6281m, "Result has already been consumed.");
            buh.m4206a(m5228d(), "Result is not ready.");
            box = this.f6274e;
            this.f6274e = null;
            this.f6278j = null;
            this.f6281m = true;
        }
        bsd bsd = (bsd) this.f6279k.getAndSet(null);
        if (bsd != null) {
            bsd.mo2367a(this);
        }
        return box;
    }

    /* renamed from: b */
    public final boolean mo3197b() {
        boolean z;
        synchronized (this.f6272c) {
            z = this.f6282n;
        }
        return z;
    }

    /* renamed from: d */
    private final boolean m5228d() {
        return this.f6276h.getCount() == 0;
    }

    /* renamed from: c */
    public final void mo3198c() {
        boolean z = true;
        if (!this.f6275f && !((Boolean) f6269a.get()).booleanValue()) {
            z = false;
        }
        this.f6275f = z;
    }

    /* renamed from: b */
    public static void m5226b(box box) {
        if (box instanceof bov) {
            try {
                ((bov) box).mo2252a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(box);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo3195a(box box) {
        synchronized (this.f6272c) {
            if (this.f6283o || this.f6282n) {
                m5226b(box);
                return;
            }
            m5228d();
            buh.m4206a(!m5228d(), "Results have already been set");
            buh.m4206a(!this.f6281m, "Result has already been consumed");
            m5227c(box);
        }
    }

    /* renamed from: c */
    private final void m5227c(box box) {
        this.f6274e = box;
        this.f6276h.countDown();
        this.f6280l = this.f6274e.mo2253a();
        if (this.f6282n) {
            this.f6278j = null;
        } else if (this.f6278j != null) {
            this.f6271b.removeMessages(2);
            this.f6271b.mo2285a(this.f6278j, m5229e());
        } else if (this.f6274e instanceof bov) {
            this.mResultGuardian = new bps(this);
        }
        ArrayList arrayList = this.f6277i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bot) arrayList.get(i)).mo2248a(this.f6280l);
        }
        this.f6277i.clear();
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2250a(p000.boy r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6272c
            monitor-enter(r0)
            if (r5 == 0) goto L_0x002f
            boolean r1 = r4.f6281m     // Catch:{ all -> 0x0034 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            p000.buh.m4206a(r1, r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            p000.buh.m4206a(r2, r1)     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.mo3197b()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x002d
            boolean r1 = r4.m5228d()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0029
            bpr r1 = r4.f6271b     // Catch:{ all -> 0x0034 }
            box r2 = r4.m5229e()     // Catch:{ all -> 0x0034 }
            r1.mo2285a(r5, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x002b
        L_0x0029:
            r4.f6278j = r5     // Catch:{ all -> 0x0034 }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x002f:
            r5 = 0
            r4.f6278j = r5     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo2250a(boy):void");
    }

    /* renamed from: a */
    public final void mo3196a(bsd bsd) {
        this.f6279k.set(bsd);
    }
}
