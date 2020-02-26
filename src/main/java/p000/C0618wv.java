package p000;

/* renamed from: wv */
/* compiled from: PG */
final class C0618wv implements C0619ww, aik {

    /* renamed from: a */
    private static final C0082cz f10731a = aim.m576a(20, new C0617wu());

    /* renamed from: b */
    private final ain f10732b = ain.m578a();

    /* renamed from: c */
    private C0619ww f10733c;

    /* renamed from: d */
    private boolean f10734d;

    /* renamed from: e */
    private boolean f10735e;

    /* renamed from: P */
    public final ain mo319P() {
        return this.f10732b;
    }

    /* renamed from: b */
    public final Object mo33b() {
        return this.f10733c.mo33b();
    }

    /* renamed from: a */
    public final Class mo32a() {
        return this.f10733c.mo32a();
    }

    /* renamed from: c */
    public final int mo34c() {
        return this.f10733c.mo34c();
    }

    /* renamed from: a */
    static C0618wv m8574a(C0619ww wwVar) {
        C0618wv wvVar = (C0618wv) aic.m542a((C0618wv) f10731a.mo317a());
        wvVar.f10735e = false;
        wvVar.f10734d = true;
        wvVar.f10733c = wwVar;
        return wvVar;
    }

    /* renamed from: d */
    public final synchronized void mo35d() {
        this.f10732b.mo320b();
        this.f10735e = true;
        if (!this.f10734d) {
            this.f10733c.mo35d();
            this.f10733c = null;
            f10731a.mo318a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo6089e() {
        this.f10732b.mo320b();
        if (this.f10734d) {
            this.f10734d = false;
            if (this.f10735e) {
                mo35d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
