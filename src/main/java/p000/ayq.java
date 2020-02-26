package p000;

/* renamed from: ayq */
/* compiled from: PG */
public final class ayq implements axx {

    /* renamed from: a */
    public final ays f2792a;

    /* renamed from: b */
    private final axw f2793b;

    /* renamed from: c */
    private final int f2794c;

    /* renamed from: d */
    private boolean f2795d;

    /* renamed from: e */
    private final /* synthetic */ ays f2796e;

    public ayq(ays ays, ays ays2, axw axw, int i) {
        this.f2796e = ays;
        this.f2792a = ays2;
        this.f2793b = axw;
        this.f2794c = i;
    }

    /* renamed from: b */
    public final void mo1479b() {
    }

    /* renamed from: a */
    public final boolean mo1478a() {
        return !this.f2796e.mo1634h() && this.f2793b.mo1589b(this.f2796e.f2806j);
    }

    /* renamed from: d */
    private final void m2461d() {
        if (!this.f2795d) {
            ays ays = this.f2796e;
            ays.f2802f.mo1528b(ays.f2804h);
            this.f2795d = true;
        }
    }

    /* renamed from: a */
    public final int mo1477a(aki aki, anj anj, boolean z) {
        if (this.f2796e.mo1634h()) {
            return -3;
        }
        m2461d();
        axw axw = this.f2793b;
        ays ays = this.f2796e;
        return axw.mo1580a(aki, anj, z, ays.f2806j, ays.f2805i);
    }

    /* renamed from: c */
    public final void mo1627c() {
        bks.m3512b(this.f2796e.f2800d[this.f2794c]);
        this.f2796e.f2800d[this.f2794c] = false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* renamed from: a */
    public final int mo1476a(long j) {
        if (this.f2796e.mo1634h()) {
            return 0;
        }
        m2461d();
        if (this.f2796e.f2806j && j > this.f2793b.mo1595h()) {
            return this.f2793b.mo1600m();
        }
        int a = this.f2793b.mo1579a(j, true);
        if (a == -1) {
            return 0;
        }
        return a;
    }
}
