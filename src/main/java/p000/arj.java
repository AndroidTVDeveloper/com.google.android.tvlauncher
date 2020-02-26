package p000;

import java.io.IOException;

/* renamed from: arj */
/* compiled from: PG */
public final class arj implements aoi {

    /* renamed from: a */
    private final akh f1981a;

    /* renamed from: b */
    private final bky f1982b = new bky(9);

    /* renamed from: c */
    private aov f1983c;

    /* renamed from: d */
    private int f1984d = 0;

    /* renamed from: e */
    private int f1985e;

    /* renamed from: f */
    private long f1986f;

    /* renamed from: g */
    private int f1987g;

    /* renamed from: h */
    private int f1988h;

    public arj(akh akh) {
        this.f1981a = akh;
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        aok.mo1212a(new aor(-9223372036854775807L));
        this.f1983c = aok.mo1211a(0, 3);
        aok.mo1210S();
        this.f1983c.mo1204a(this.f1981a);
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        while (true) {
            int i = this.f1984d;
            if (i == 0) {
                this.f1982b.mo2064a();
                if (!aoj.mo1193a(this.f1982b.f4258a, 0, 8, true)) {
                    return -1;
                }
                if (this.f1982b.mo2083j() == 1380139777) {
                    this.f1985e = this.f1982b.mo2074d();
                    this.f1984d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i != 1) {
                while (this.f1987g > 0) {
                    this.f1982b.mo2064a();
                    aoj.mo1196b(this.f1982b.f4258a, 0, 3);
                    this.f1983c.mo1205a(this.f1982b, 3);
                    this.f1988h += 3;
                    this.f1987g--;
                }
                int i2 = this.f1988h;
                if (i2 > 0) {
                    this.f1983c.mo1203a(this.f1986f, 1, i2, 0, null);
                }
                this.f1984d = 1;
                return 0;
            } else {
                this.f1982b.mo2064a();
                int i3 = this.f1985e;
                if (i3 == 0) {
                    if (!aoj.mo1193a(this.f1982b.f4258a, 0, 5, true)) {
                        break;
                    }
                    this.f1986f = (this.f1982b.mo2081h() * 1000) / 45;
                } else if (i3 == 1) {
                    if (!aoj.mo1193a(this.f1982b.f4258a, 0, 9, true)) {
                        break;
                    }
                    this.f1986f = this.f1982b.mo2085l();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i3);
                    throw new ako(sb.toString());
                }
                this.f1987g = this.f1982b.mo2074d();
                this.f1988h = 0;
                this.f1984d = 2;
            }
        }
        this.f1984d = 0;
        return -1;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1984d = 0;
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        this.f1982b.mo2064a();
        aoj.mo1199c(this.f1982b.f4258a, 0, 8);
        if (this.f1982b.mo2083j() == 1380139777) {
            return true;
        }
        return false;
    }
}
