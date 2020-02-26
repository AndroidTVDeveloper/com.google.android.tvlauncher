package p000;

/* renamed from: aro */
/* compiled from: PG */
public final class aro implements aoi {

    /* renamed from: a */
    private final arp f2019a;

    /* renamed from: b */
    private final bky f2020b;

    /* renamed from: c */
    private final bky f2021c;

    /* renamed from: d */
    private final bkx f2022d;

    /* renamed from: e */
    private aok f2023e;

    /* renamed from: f */
    private long f2024f;

    /* renamed from: g */
    private long f2025g;

    /* renamed from: h */
    private boolean f2026h;

    /* renamed from: i */
    private boolean f2027i;

    public aro() {
        this((byte) 0);
    }

    public aro(byte b) {
        this.f2019a = new arp();
        this.f2020b = new bky(2048);
        this.f2025g = -1;
        this.f2021c = new bky(10);
        this.f2022d = new bkx(this.f2021c.f4258a);
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f2023e = aok;
        this.f2019a.mo1283a(aok, new asw(0, 1));
        aok.mo1210S();
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        int a = aoj.mo1189a(this.f2020b.f4258a, 0, 2048);
        if (!this.f2027i) {
            ((aok) bks.m3507a(this.f2023e)).mo1212a(new aor(-9223372036854775807L));
            this.f2027i = true;
        }
        if (a == -1) {
            return -1;
        }
        this.f2020b.mo2073c(0);
        this.f2020b.mo2071b(a);
        if (!this.f2026h) {
            this.f2019a.f2029a = this.f2024f;
            this.f2026h = true;
        }
        this.f2019a.mo1284a(this.f2020b);
        return 0;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f2026h = false;
        this.f2019a.mo1286c();
        this.f2024f = j2;
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        int i = 0;
        while (true) {
            aoj.mo1199c(this.f2021c.f4258a, 0, 10);
            this.f2021c.mo2073c(0);
            if (this.f2021c.mo2080g() != 4801587) {
                break;
            }
            this.f2021c.mo2075d(3);
            int m = this.f2021c.mo2086m();
            i += m + 10;
            aoj.mo1195b(m);
        }
        aoj.mo1191a();
        aoj.mo1195b(i);
        if (this.f2025g == -1) {
            this.f2025g = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            aoj.mo1199c(this.f2021c.f4258a, 0, 2);
            this.f2021c.mo2073c(0);
            if (!arp.m1912a(this.f2021c.mo2076e())) {
                aoj.mo1191a();
                i2++;
                if (i2 - i >= 8192) {
                    return false;
                }
                aoj.mo1195b(i2);
                i3 = 0;
                i4 = 0;
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                aoj.mo1199c(this.f2021c.f4258a, 0, 4);
                this.f2022d.mo2050a(14);
                int c = this.f2022d.mo2057c(13);
                if (c <= 6) {
                    return false;
                }
                aoj.mo1195b(c - 6);
                i4 += c;
            }
        }
    }
}
