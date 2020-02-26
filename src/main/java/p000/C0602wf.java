package p000;

/* renamed from: wf */
/* compiled from: PG */
public final class C0602wf implements C0608wl, C0659yi, C0610wn {

    /* renamed from: a */
    public final C0615ws f10669a;

    /* renamed from: b */
    public final C0660yj f10670b;

    /* renamed from: c */
    public final C0599wc f10671c;

    /* renamed from: d */
    public final C0624xa f10672d;

    /* renamed from: e */
    public final C0597wa f10673e;

    /* renamed from: f */
    public final C0575vf f10674f;

    /* renamed from: g */
    private final C0600wd f10675g;

    public C0602wf(C0660yj yjVar, C0646xw xwVar, C0671yu yuVar, C0671yu yuVar2, C0671yu yuVar3, C0671yu yuVar4) {
        this.f10670b = yjVar;
        this.f10675g = new C0600wd(xwVar);
        C0575vf vfVar = new C0575vf();
        this.f10674f = vfVar;
        synchronized (this) {
            synchronized (vfVar) {
            }
        }
        this.f10669a = new C0615ws();
        this.f10671c = new C0599wc(yuVar, yuVar2, yuVar4, this, this);
        this.f10673e = new C0597wa(this.f10675g);
        this.f10672d = new C0624xa();
        ((C0658yh) yjVar).f10817a = this;
    }

    /* renamed from: a */
    public final synchronized void mo6054a(C0607wk wkVar, C0534ts tsVar) {
        this.f10669a.mo6087a(tsVar, wkVar);
    }

    /* renamed from: a */
    public final synchronized void mo6055a(C0607wk wkVar, C0534ts tsVar, C0611wo woVar) {
        if (woVar != null) {
            if (woVar.f10713a) {
                this.f10674f.mo6019a(tsVar, woVar);
            }
        }
        this.f10669a.mo6087a(tsVar, wkVar);
    }

    /* renamed from: a */
    public final void mo6053a(C0534ts tsVar, C0611wo woVar) {
        this.f10674f.mo6018a(tsVar);
        if (woVar.f10713a) {
            this.f10670b.mo6132a(tsVar, woVar);
        } else {
            this.f10672d.mo6092a(woVar);
        }
    }

    /* renamed from: a */
    public static final void m8535a(C0619ww wwVar) {
        if (wwVar instanceof C0611wo) {
            ((C0611wo) wwVar).mo6074f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
