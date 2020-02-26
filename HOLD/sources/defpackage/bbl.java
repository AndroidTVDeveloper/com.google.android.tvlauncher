package defpackage;

/* renamed from: bbl  reason: default package */
/* compiled from: PG */
final class bbl implements axx {
    public final int a;
    public final bbs b;
    public int c = -1;

    public bbl(bbs bbs, int i) {
        this.b = bbs;
        this.a = i;
    }

    private final boolean d() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public final void c() {
        bks.a(this.c == -1);
        bbs bbs = this.b;
        int i = this.a;
        bbs.o();
        bks.a(bbs.s);
        int i2 = bbs.s[i];
        if (i2 != -1) {
            boolean[] zArr = bbs.u;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (bbs.r.contains(bbs.q.a(i))) {
            i2 = -3;
            this.c = i2;
        }
        i2 = -2;
        this.c = i2;
    }

    public final boolean a() {
        if (this.c == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        bbs bbs = this.b;
        return !bbs.m() && bbs.i[this.c].b(bbs.y);
    }

    public final void b() {
        int i = this.c;
        if (i == -2) {
            throw new bbx(this.b.c().a(this.a).a(0).i);
        } else if (i == -1) {
            this.b.h();
        } else if (i != -3) {
            bbs bbs = this.b;
            bbs.h();
            bbs.i[i].c();
        }
    }

    public final int a(aki aki, anj anj, boolean z) {
        akh akh;
        int i = -3;
        if (this.c == -3) {
            anj.n(4);
            return -4;
        } else if (!d()) {
            return -3;
        } else {
            bbs bbs = this.b;
            int i2 = this.c;
            if (!bbs.m()) {
                int i3 = 0;
                if (!bbs.f.isEmpty()) {
                    int i4 = 0;
                    loop0:
                    while (i4 < bbs.f.size() - 1) {
                        int i5 = ((bbi) bbs.f.get(i4)).a;
                        int length = bbs.i.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (bbs.u[i6] && bbs.i[i6].f() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    blm.a(bbs.f, 0, i4);
                    bbi bbi = (bbi) bbs.f.get(0);
                    akh akh2 = bbi.g;
                    if (!akh2.equals(bbs.o)) {
                        axg axg = bbs.e;
                        int i7 = bbs.a;
                        axg.b(bbi.j);
                    }
                    bbs.o = akh2;
                }
                i = bbs.i[i2].a(aki, anj, z, bbs.y, bbs.v);
                if (i == -5) {
                    akh akh3 = (akh) bks.a(aki.c);
                    if (i2 == bbs.j) {
                        int f = bbs.i[i2].f();
                        while (i3 < bbs.f.size() && ((bbi) bbs.f.get(i3)).a != f) {
                            i3++;
                        }
                        if (i3 < bbs.f.size()) {
                            akh = ((bbi) bbs.f.get(i3)).g;
                        } else {
                            akh = (akh) bks.a(bbs.n);
                        }
                        akh3 = akh3.a(akh);
                    }
                    aki.c = akh3;
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
    public final int a(long j) {
        if (!d()) {
            return 0;
        }
        bbs bbs = this.b;
        int i = this.c;
        if (bbs.m()) {
            return 0;
        }
        axw axw = bbs.i[i];
        if (bbs.y && j > axw.h()) {
            return axw.m();
        }
        int a2 = axw.a(j, true);
        if (a2 == -1) {
            return 0;
        }
        return a2;
    }
}
