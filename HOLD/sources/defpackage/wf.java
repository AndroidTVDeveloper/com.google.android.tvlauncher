package defpackage;

/* renamed from: wf  reason: default package */
/* compiled from: PG */
public final class wf implements wl, yi, wn {
    public final ws a;
    public final yj b;
    public final wc c;
    public final xa d;
    public final wa e;
    public final vf f;
    private final wd g;

    public wf(yj yjVar, xw xwVar, yu yuVar, yu yuVar2, yu yuVar3, yu yuVar4) {
        this.b = yjVar;
        this.g = new wd(xwVar);
        vf vfVar = new vf();
        this.f = vfVar;
        synchronized (this) {
            synchronized (vfVar) {
            }
        }
        this.a = new ws();
        this.c = new wc(yuVar, yuVar2, yuVar4, this, this);
        this.e = new wa(this.g);
        this.d = new xa();
        ((yh) yjVar).a = this;
    }

    public final synchronized void a(wk wkVar, ts tsVar) {
        this.a.a(tsVar, wkVar);
    }

    public final synchronized void a(wk wkVar, ts tsVar, wo woVar) {
        if (woVar != null) {
            if (woVar.a) {
                this.f.a(tsVar, woVar);
            }
        }
        this.a.a(tsVar, wkVar);
    }

    public final void a(ts tsVar, wo woVar) {
        this.f.a(tsVar);
        if (woVar.a) {
            this.b.a(tsVar, woVar);
        } else {
            this.d.a(woVar);
        }
    }

    public static final void a(ww wwVar) {
        if (wwVar instanceof wo) {
            ((wo) wwVar).f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
