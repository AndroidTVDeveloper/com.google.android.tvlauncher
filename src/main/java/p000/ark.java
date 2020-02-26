package p000;

/* renamed from: ark */
/* compiled from: PG */
public final class ark implements aoi {

    /* renamed from: a */
    private final arl f1989a = new arl();

    /* renamed from: b */
    private final bky f1990b = new bky(2786);

    /* renamed from: c */
    private boolean f1991c;

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1989a.mo1283a(aok, new asw(0, 1));
        aok.mo1210S();
        aok.mo1212a(new aor(-9223372036854775807L));
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        int a = aoj.mo1189a(this.f1990b.f4258a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f1990b.mo2073c(0);
        this.f1990b.mo2071b(a);
        if (!this.f1991c) {
            this.f1989a.f1992a = 0;
            this.f1991c = true;
        }
        this.f1989a.mo1284a(this.f1990b);
        return 0;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1991c = false;
        this.f1989a.mo1281a();
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
            aoj.mo1199c(bky.f4258a, 0, 6);
            bky.mo2073c(0);
            if (bky.mo2076e() != 2935) {
                aoj.mo1191a();
                i2++;
                if (i2 - i >= 8192) {
                    return false;
                }
                aoj.mo1195b(i2);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a = aln.m1030a(bky.f4258a);
                if (a == -1) {
                    return false;
                }
                aoj.mo1195b(a - 6);
            }
        }
    }
}
