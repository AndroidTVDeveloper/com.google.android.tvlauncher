package p000;

/* renamed from: arm */
/* compiled from: PG */
public final class arm implements aoi {

    /* renamed from: a */
    private final arn f2004a = new arn();

    /* renamed from: b */
    private final bky f2005b = new bky(16384);

    /* renamed from: c */
    private boolean f2006c;

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f2004a.mo1283a(aok, new asw(0, 1));
        aok.mo1210S();
        aok.mo1212a(new aor(-9223372036854775807L));
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        int a = aoj.mo1189a(this.f2005b.f4258a, 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.f2005b.mo2073c(0);
        this.f2005b.mo2071b(a);
        if (!this.f2006c) {
            this.f2004a.f2007a = 0;
            this.f2006c = true;
        }
        this.f2004a.mo1284a(this.f2005b);
        return 0;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f2006c = false;
        this.f2004a.mo1281a();
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        bky bky = new bky(10);
        int i = 0;
        while (true) {
            aoj.mo1199c(bky.f4258a, 0, 10);
            bky.mo2073c(0);
            if (bky.mo2080g() != 4801587) {
                break;
            }
            bky.mo2075d(3);
            int m = bky.mo2086m();
            i += m + 10;
            aoj.mo1195b(m);
        }
        aoj.mo1191a();
        aoj.mo1195b(i);
        int i2 = i;
        int i3 = 0;
        while (true) {
            aoj.mo1199c(bky.f4258a, 0, 7);
            bky.mo2073c(0);
            int e = bky.mo2076e();
            if (e == 44096 || e == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a = alp.m1037a(bky.f4258a, e);
                if (a == -1) {
                    return false;
                }
                aoj.mo1195b(a - 7);
            } else {
                aoj.mo1191a();
                i2++;
                if (i2 - i >= 8192) {
                    return false;
                }
                aoj.mo1195b(i2);
                i3 = 0;
            }
        }
    }
}
