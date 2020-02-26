package p000;

/* renamed from: bbl */
/* compiled from: PG */
final class bbl implements axx {

    /* renamed from: a */
    public final int f3128a;

    /* renamed from: b */
    public final bbs f3129b;

    /* renamed from: c */
    public int f3130c = -1;

    public bbl(bbs bbs, int i) {
        this.f3129b = bbs;
        this.f3128a = i;
    }

    /* renamed from: d */
    private final boolean m2730d() {
        int i = this.f3130c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: c */
    public final void mo1719c() {
        bks.m3510a(this.f3130c == -1);
        bbs bbs = this.f3129b;
        int i = this.f3128a;
        bbs.mo1736o();
        bks.m3507a(bbs.f3181s);
        int i2 = bbs.f3181s[i];
        if (i2 != -1) {
            boolean[] zArr = bbs.f3183u;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.f3130c = i2;
            }
        } else if (bbs.f3180r.contains(bbs.f3179q.mo1612a(i))) {
            i2 = -3;
            this.f3130c = i2;
        }
        i2 = -2;
        this.f3130c = i2;
    }

    /* renamed from: a */
    public final boolean mo1478a() {
        if (this.f3130c == -3) {
            return true;
        }
        if (!m2730d()) {
            return false;
        }
        bbs bbs = this.f3129b;
        return !bbs.mo1734m() && bbs.f3171i[this.f3130c].mo1589b(bbs.f3187y);
    }

    /* renamed from: b */
    public final void mo1479b() {
        int i = this.f3130c;
        if (i == -2) {
            throw new bbx(this.f3129b.mo1729c().mo1612a(this.f3128a).mo1604a(0).f556i);
        } else if (i == -1) {
            this.f3129b.mo1730h();
        } else if (i != -3) {
            bbs bbs = this.f3129b;
            bbs.mo1730h();
            bbs.f3171i[i].mo1590c();
        }
    }

    /* renamed from: a */
    public final int mo1477a(aki aki, anj anj, boolean z) {
        akh akh;
        int i = -3;
        if (this.f3130c == -3) {
            anj.mo1143n(4);
            return -4;
        } else if (!m2730d()) {
            return -3;
        } else {
            bbs bbs = this.f3129b;
            int i2 = this.f3130c;
            if (!bbs.mo1734m()) {
                int i3 = 0;
                if (!bbs.f3168f.isEmpty()) {
                    int i4 = 0;
                    loop0:
                    while (i4 < bbs.f3168f.size() - 1) {
                        int i5 = ((bbi) bbs.f3168f.get(i4)).f3085a;
                        int length = bbs.f3171i.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (bbs.f3183u[i6] && bbs.f3171i[i6].mo1593f() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    blm.m3646a(bbs.f3168f, 0, i4);
                    bbi bbi = (bbi) bbs.f3168f.get(0);
                    akh akh2 = bbi.f2769g;
                    if (!akh2.equals(bbs.f3177o)) {
                        axg axg = bbs.f3167e;
                        int i7 = bbs.f3163a;
                        axg.mo1528b(bbi.f2772j);
                    }
                    bbs.f3177o = akh2;
                }
                i = bbs.f3171i[i2].mo1580a(aki, anj, z, bbs.f3187y, bbs.f3184v);
                if (i == -5) {
                    akh akh3 = (akh) bks.m3507a(aki.f576c);
                    if (i2 == bbs.f3172j) {
                        int f = bbs.f3171i[i2].mo1593f();
                        while (i3 < bbs.f3168f.size() && ((bbi) bbs.f3168f.get(i3)).f3085a != f) {
                            i3++;
                        }
                        if (i3 < bbs.f3168f.size()) {
                            akh = ((bbi) bbs.f3168f.get(i3)).f2769g;
                        } else {
                            akh = (akh) bks.m3507a(bbs.f3176n);
                        }
                        akh3 = akh3.mo422a(akh);
                    }
                    aki.f576c = akh3;
                }
            }
            return i;
        }
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
        if (!m2730d()) {
            return 0;
        }
        bbs bbs = this.f3129b;
        int i = this.f3130c;
        if (bbs.mo1734m()) {
            return 0;
        }
        axw axw = bbs.f3171i[i];
        if (bbs.f3187y && j > axw.mo1595h()) {
            return axw.mo1600m();
        }
        int a = axw.mo1579a(j, true);
        if (a == -1) {
            return 0;
        }
        return a;
    }
}
