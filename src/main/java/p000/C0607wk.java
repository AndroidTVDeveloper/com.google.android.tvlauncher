package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wk */
/* compiled from: PG */
public final class C0607wk implements C0583vn, aik {

    /* renamed from: a */
    public final C0606wj f10683a = new C0606wj();

    /* renamed from: b */
    public final ain f10684b = ain.m578a();

    /* renamed from: c */
    public final C0610wn f10685c;

    /* renamed from: d */
    public final C0608wl f10686d;

    /* renamed from: e */
    public C0534ts f10687e;

    /* renamed from: f */
    public boolean f10688f;

    /* renamed from: g */
    public boolean f10689g;

    /* renamed from: h */
    public C0619ww f10690h;

    /* renamed from: i */
    public boolean f10691i;

    /* renamed from: j */
    public C0613wq f10692j;

    /* renamed from: k */
    public boolean f10693k;

    /* renamed from: l */
    public C0611wo f10694l;

    /* renamed from: m */
    public volatile boolean f10695m;

    /* renamed from: n */
    public int f10696n;

    /* renamed from: o */
    private final C0082cz f10697o;

    /* renamed from: p */
    private final C0671yu f10698p;

    /* renamed from: q */
    private final C0671yu f10699q;

    /* renamed from: r */
    private final C0671yu f10700r;

    /* renamed from: s */
    private final AtomicInteger f10701s = new AtomicInteger();

    /* renamed from: t */
    private boolean f10702t;

    /* renamed from: u */
    private C0588vs f10703u;

    public C0607wk(C0671yu yuVar, C0671yu yuVar2, C0671yu yuVar3, C0608wl wlVar, C0610wn wnVar, C0082cz czVar) {
        this.f10698p = yuVar;
        this.f10699q = yuVar2;
        this.f10700r = yuVar3;
        this.f10686d = wlVar;
        this.f10685c = wnVar;
        this.f10697o = czVar;
    }

    /* renamed from: d */
    private final C0671yu m8544d() {
        return this.f10702t ? this.f10700r : this.f10699q;
    }

    /* renamed from: e */
    private final boolean m8545e() {
        return this.f10693k || this.f10691i || this.f10695m;
    }

    /* renamed from: P */
    public final ain mo319P() {
        return this.f10684b;
    }

    /* renamed from: a */
    public final synchronized void mo6068a(agr agr, Executor executor) {
        this.f10684b.mo320b();
        this.f10683a.f10682a.add(new C0605wi(agr, executor));
        if (this.f10691i) {
            mo6066a(1);
            executor.execute(new C0604wh(this, agr));
        } else if (this.f10693k) {
            mo6066a(1);
            executor.execute(new C0603wg(this, agr));
        } else {
            aic.m546a(!this.f10695m, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6065a() {
        boolean z;
        C0611wo woVar;
        synchronized (this) {
            this.f10684b.mo320b();
            aic.m546a(m8545e(), "Not yet complete!");
            int decrementAndGet = this.f10701s.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            aic.m546a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                woVar = this.f10694l;
                mo6071c();
            } else {
                woVar = null;
            }
        }
        if (woVar != null) {
            woVar.mo6074f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo6066a(int i) {
        C0611wo woVar;
        aic.m546a(m8545e(), "Not yet complete!");
        if (this.f10701s.getAndAdd(i) == 0 && (woVar = this.f10694l) != null) {
            woVar.mo6073e();
        }
    }

    /* renamed from: a */
    public final synchronized void mo6069a(C0534ts tsVar, boolean z, boolean z2) {
        this.f10687e = tsVar;
        this.f10688f = z;
        this.f10702t = z2;
        this.f10689g = false;
    }

    /* renamed from: c */
    public final synchronized void mo6071c() {
        if (this.f10687e != null) {
            this.f10683a.f10682a.clear();
            this.f10687e = null;
            this.f10694l = null;
            this.f10690h = null;
            this.f10693k = false;
            this.f10695m = false;
            this.f10691i = false;
            C0588vs vsVar = this.f10703u;
            if (vsVar.f10620c.mo6042d()) {
                vsVar.mo6044a();
            }
            this.f10703u = null;
            this.f10692j = null;
            this.f10696n = 0;
            this.f10697o.mo318a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final synchronized void mo6067a(agr agr) {
        this.f10684b.mo320b();
        this.f10683a.f10682a.remove(C0606wj.m8539b(agr));
        if (this.f10683a.mo6060a()) {
            if (!m8545e()) {
                this.f10695m = true;
                C0588vs vsVar = this.f10703u;
                vsVar.f10633p = true;
                C0581vl vlVar = vsVar.f10632o;
                if (vlVar != null) {
                    vlVar.mo6023b();
                }
                this.f10686d.mo6054a(this, this.f10687e);
            }
            if (!this.f10691i) {
                if (!this.f10693k) {
                }
            }
            if (this.f10701s.get() == 0) {
                mo6071c();
            }
        }
    }

    /* renamed from: a */
    public final void mo6036a(C0588vs vsVar) {
        m8544d().execute(vsVar);
    }

    /* renamed from: b */
    public final synchronized void mo6070b(C0588vs vsVar) {
        C0671yu yuVar;
        this.f10703u = vsVar;
        int a = vsVar.mo6043a(1);
        if (a != 2) {
            if (a != 3) {
                yuVar = m8544d();
                yuVar.execute(vsVar);
            }
        }
        yuVar = this.f10698p;
        yuVar.execute(vsVar);
    }
}
