package p000;

import java.util.List;

/* renamed from: arl */
/* compiled from: PG */
public final class arl implements art {

    /* renamed from: a */
    public long f1992a;

    /* renamed from: b */
    private final bkx f1993b;

    /* renamed from: c */
    private final bky f1994c;

    /* renamed from: d */
    private final String f1995d;

    /* renamed from: e */
    private String f1996e;

    /* renamed from: f */
    private aov f1997f;

    /* renamed from: g */
    private int f1998g;

    /* renamed from: h */
    private int f1999h;

    /* renamed from: i */
    private boolean f2000i;

    /* renamed from: j */
    private long f2001j;

    /* renamed from: k */
    private akh f2002k;

    /* renamed from: l */
    private int f2003l;

    public arl() {
        this(null);
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    public arl(String str) {
        this.f1993b = new bkx(new byte[128]);
        this.f1994c = new bky(this.f1993b.f4254a);
        this.f1998g = 0;
        this.f1995d = str;
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        boolean z;
        bky bky2 = bky;
        while (bky.mo2070b() > 0) {
            int i = this.f1998g;
            if (i == 0) {
                while (true) {
                    if (bky.mo2070b() <= 0) {
                        break;
                    } else if (this.f2000i) {
                        int d = bky.mo2074d();
                        if (d == 119) {
                            this.f2000i = false;
                            this.f1998g = 1;
                            byte[] bArr = this.f1994c.f4258a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f1999h = 2;
                            break;
                        }
                        if (d == 11) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f2000i = z;
                    } else {
                        this.f2000i = bky.mo2074d() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(bky.mo2070b(), this.f2003l - this.f1999h);
                this.f1997f.mo1205a(bky2, min);
                int i2 = this.f1999h + min;
                this.f1999h = i2;
                int i3 = this.f2003l;
                if (i2 == i3) {
                    this.f1997f.mo1203a(this.f1992a, 1, i3, 0, null);
                    this.f1992a += this.f2001j;
                    this.f1998g = 0;
                }
            } else {
                byte[] bArr2 = this.f1994c.f4258a;
                int min2 = Math.min(bky.mo2070b(), 128 - this.f1999h);
                bky2.mo2069a(bArr2, this.f1999h, min2);
                int i4 = this.f1999h + min2;
                this.f1999h = i4;
                if (i4 == 128) {
                    this.f1993b.mo2050a(0);
                    alm a = aln.m1032a(this.f1993b);
                    akh akh = this.f2002k;
                    if (!(akh != null && a.f703c == akh.f569v && a.f702b == akh.f570w && a.f701a == akh.f556i)) {
                        akh a2 = akh.m731a(this.f1996e, a.f701a, -1, -1, a.f703c, a.f702b, (List) null, (anq) null, this.f1995d);
                        this.f2002k = a2;
                        this.f1997f.mo1204a(a2);
                    }
                    this.f2003l = a.f704d;
                    this.f2001j = (((long) a.f705e) * 1000000) / ((long) this.f2002k.f570w);
                    this.f1994c.mo2073c(0);
                    this.f1997f.mo1205a(this.f1994c, 128);
                    this.f1998g = 2;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f1996e = asw.mo1310c();
        this.f1997f = aok.mo1211a(asw.mo1309b(), 1);
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f1992a = j;
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f1998g = 0;
        this.f1999h = 0;
        this.f2000i = false;
    }
}
