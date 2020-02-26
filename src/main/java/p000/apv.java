package p000;

/* renamed from: apv */
/* compiled from: PG */
final class apv {

    /* renamed from: a */
    public final int f1736a;

    /* renamed from: b */
    public int f1737b;

    /* renamed from: c */
    public int f1738c;

    /* renamed from: d */
    public long f1739d;

    /* renamed from: e */
    private final boolean f1740e;

    /* renamed from: f */
    private final bky f1741f;

    /* renamed from: g */
    private final bky f1742g;

    /* renamed from: h */
    private int f1743h;

    /* renamed from: i */
    private int f1744i;

    public apv(bky bky, bky bky2, boolean z) {
        this.f1742g = bky;
        this.f1741f = bky2;
        this.f1740e = z;
        bky2.mo2073c(12);
        this.f1736a = bky2.mo2087n();
        bky.mo2073c(12);
        this.f1744i = bky.mo2087n();
        bks.m3513b(bky.mo2083j() != 1 ? false : true, "first_chunk must be 1");
        this.f1737b = -1;
    }

    /* renamed from: a */
    public final boolean mo1240a() {
        long j;
        int i = this.f1737b + 1;
        this.f1737b = i;
        if (i == this.f1736a) {
            return false;
        }
        if (!this.f1740e) {
            j = this.f1741f.mo2081h();
        } else {
            j = this.f1741f.mo2089p();
        }
        this.f1739d = j;
        if (this.f1737b == this.f1743h) {
            this.f1738c = this.f1742g.mo2087n();
            this.f1742g.mo2075d(4);
            int i2 = -1;
            int i3 = this.f1744i - 1;
            this.f1744i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f1742g.mo2087n();
            }
            this.f1743h = i2;
        }
        return true;
    }
}
