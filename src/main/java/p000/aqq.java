package p000;

/* renamed from: aqq */
/* compiled from: PG */
final class aqq {

    /* renamed from: a */
    public aqc f1881a;

    /* renamed from: b */
    public long f1882b;

    /* renamed from: c */
    public long f1883c;

    /* renamed from: d */
    public int f1884d;

    /* renamed from: e */
    public int f1885e;

    /* renamed from: f */
    public long[] f1886f;

    /* renamed from: g */
    public int[] f1887g;

    /* renamed from: h */
    public int[] f1888h;

    /* renamed from: i */
    public int[] f1889i;

    /* renamed from: j */
    public long[] f1890j;

    /* renamed from: k */
    public boolean[] f1891k;

    /* renamed from: l */
    public boolean f1892l;

    /* renamed from: m */
    public boolean[] f1893m;

    /* renamed from: n */
    public aqp f1894n;

    /* renamed from: o */
    public int f1895o;

    /* renamed from: p */
    public bky f1896p;

    /* renamed from: q */
    public boolean f1897q;

    /* renamed from: r */
    public long f1898r;

    /* renamed from: b */
    public final long mo1262b(int i) {
        return this.f1890j[i] + ((long) this.f1889i[i]);
    }

    /* renamed from: a */
    public final void mo1261a(int i) {
        bky bky = this.f1896p;
        if (bky == null || bky.f4260c < i) {
            this.f1896p = new bky(i);
        }
        this.f1895o = i;
        this.f1892l = true;
        this.f1897q = true;
    }

    /* renamed from: c */
    public final boolean mo1263c(int i) {
        return this.f1892l && this.f1893m[i];
    }
}
