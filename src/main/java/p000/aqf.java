package p000;

/* renamed from: aqf */
/* compiled from: PG */
final class aqf {

    /* renamed from: a */
    public final aov f1786a;

    /* renamed from: b */
    public final aqq f1787b = new aqq();

    /* renamed from: c */
    public aqo f1788c;

    /* renamed from: d */
    public aqc f1789d;

    /* renamed from: e */
    public int f1790e;

    /* renamed from: f */
    public int f1791f;

    /* renamed from: g */
    public int f1792g;

    /* renamed from: h */
    public int f1793h;

    /* renamed from: i */
    public final bky f1794i = new bky(1);

    /* renamed from: j */
    public final bky f1795j = new bky();

    public aqf(aov aov) {
        this.f1786a = aov;
    }

    /* renamed from: c */
    public final aqp mo1250c() {
        aqq aqq = this.f1787b;
        int i = aqq.f1881a.f1774a;
        aqp aqp = aqq.f1894n;
        if (aqp == null) {
            aqp = this.f1788c.mo1260a(i);
        }
        if (aqp == null || !aqp.f1876a) {
            return null;
        }
        return aqp;
    }

    /* renamed from: a */
    public final void mo1248a(aqo aqo, aqc aqc) {
        this.f1788c = (aqo) bks.m3507a(aqo);
        this.f1789d = (aqc) bks.m3507a(aqc);
        this.f1786a.mo1204a(aqo.f1870f);
        mo1247a();
    }

    /* renamed from: b */
    public final boolean mo1249b() {
        this.f1790e++;
        int i = this.f1791f + 1;
        this.f1791f = i;
        int[] iArr = this.f1787b.f1887g;
        int i2 = this.f1792g;
        if (i != iArr[i2]) {
            return true;
        }
        this.f1792g = i2 + 1;
        this.f1791f = 0;
        return false;
    }

    /* renamed from: a */
    public final void mo1247a() {
        aqq aqq = this.f1787b;
        aqq.f1884d = 0;
        aqq.f1898r = 0;
        aqq.f1892l = false;
        aqq.f1897q = false;
        aqq.f1894n = null;
        this.f1790e = 0;
        this.f1792g = 0;
        this.f1791f = 0;
        this.f1793h = 0;
    }
}
