package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wk  reason: default package */
/* compiled from: PG */
public final class wk implements vn, aik {
    public final wj a = new wj();
    public final ain b = ain.a();
    public final wn c;
    public final wl d;
    public ts e;
    public boolean f;
    public boolean g;
    public ww h;
    public boolean i;
    public wq j;
    public boolean k;
    public wo l;
    public volatile boolean m;
    public int n;
    private final cz o;
    private final yu p;
    private final yu q;
    private final yu r;
    private final AtomicInteger s = new AtomicInteger();
    private boolean t;
    private vs u;

    public wk(yu yuVar, yu yuVar2, yu yuVar3, wl wlVar, wn wnVar, cz czVar) {
        this.p = yuVar;
        this.q = yuVar2;
        this.r = yuVar3;
        this.d = wlVar;
        this.c = wnVar;
        this.o = czVar;
    }

    private final yu d() {
        return this.t ? this.r : this.q;
    }

    private final boolean e() {
        return this.k || this.i || this.m;
    }

    public final ain P() {
        return this.b;
    }

    public final synchronized void a(agr agr, Executor executor) {
        this.b.b();
        this.a.a.add(new wi(agr, executor));
        if (this.i) {
            a(1);
            executor.execute(new wh(this, agr));
        } else if (this.k) {
            a(1);
            executor.execute(new wg(this, agr));
        } else {
            aic.a(!this.m, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        boolean z;
        wo woVar;
        synchronized (this) {
            this.b.b();
            aic.a(e(), "Not yet complete!");
            int decrementAndGet = this.s.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            aic.a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                woVar = this.l;
                c();
            } else {
                woVar = null;
            }
        }
        if (woVar != null) {
            woVar.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2) {
        wo woVar;
        aic.a(e(), "Not yet complete!");
        if (this.s.getAndAdd(i2) == 0 && (woVar = this.l) != null) {
            woVar.e();
        }
    }

    public final synchronized void a(ts tsVar, boolean z, boolean z2) {
        this.e = tsVar;
        this.f = z;
        this.t = z2;
        this.g = false;
    }

    public final synchronized void c() {
        if (this.e != null) {
            this.a.a.clear();
            this.e = null;
            this.l = null;
            this.h = null;
            this.k = false;
            this.m = false;
            this.i = false;
            vs vsVar = this.u;
            if (vsVar.c.d()) {
                vsVar.a();
            }
            this.u = null;
            this.j = null;
            this.n = 0;
            this.o.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(agr agr) {
        this.b.b();
        this.a.a.remove(wj.b(agr));
        if (this.a.a()) {
            if (!e()) {
                this.m = true;
                vs vsVar = this.u;
                vsVar.p = true;
                vl vlVar = vsVar.o;
                if (vlVar != null) {
                    vlVar.b();
                }
                this.d.a(this, this.e);
            }
            if (!this.i) {
                if (!this.k) {
                }
            }
            if (this.s.get() == 0) {
                c();
            }
        }
    }

    public final void a(vs vsVar) {
        d().execute(vsVar);
    }

    public final synchronized void b(vs vsVar) {
        yu yuVar;
        this.u = vsVar;
        int a2 = vsVar.a(1);
        if (a2 != 2) {
            if (a2 != 3) {
                yuVar = d();
                yuVar.execute(vsVar);
            }
        }
        yuVar = this.p;
        yuVar.execute(vsVar);
    }
}
