package p000;

import java.util.List;

/* renamed from: arn */
/* compiled from: PG */
public final class arn implements art {

    /* renamed from: a */
    public long f2007a;

    /* renamed from: b */
    private final bkx f2008b;

    /* renamed from: c */
    private final bky f2009c;

    /* renamed from: d */
    private final String f2010d;

    /* renamed from: e */
    private String f2011e;

    /* renamed from: f */
    private aov f2012f;

    /* renamed from: g */
    private int f2013g;

    /* renamed from: h */
    private int f2014h;

    /* renamed from: i */
    private boolean f2015i;

    /* renamed from: j */
    private long f2016j;

    /* renamed from: k */
    private akh f2017k;

    /* renamed from: l */
    private int f2018l;

    public arn() {
        this(null);
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    public arn(String str) {
        this.f2008b = new bkx(new byte[16]);
        this.f2009c = new bky(this.f2008b.f4254a);
        this.f2013g = 0;
        this.f2014h = 0;
        this.f2015i = false;
        this.f2010d = str;
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        int d;
        boolean z;
        byte b;
        bky bky2 = bky;
        while (bky.mo2070b() > 0) {
            int i = this.f2013g;
            if (i == 0) {
                while (true) {
                    if (bky.mo2070b() <= 0) {
                        break;
                    } else if (this.f2015i) {
                        d = bky.mo2074d();
                        if (d == 172) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f2015i = z;
                        b = 64;
                        if (!(d == 64 || d == 65)) {
                        }
                    } else {
                        this.f2015i = bky.mo2074d() == 172;
                    }
                }
                this.f2013g = 1;
                byte[] bArr = this.f2009c.f4258a;
                bArr[0] = -84;
                if (d == 65) {
                    b = 65;
                }
                bArr[1] = b;
                this.f2014h = 2;
            } else if (i != 1) {
                int min = Math.min(bky.mo2070b(), this.f2018l - this.f2014h);
                this.f2012f.mo1205a(bky2, min);
                int i2 = this.f2014h + min;
                this.f2014h = i2;
                int i3 = this.f2018l;
                if (i2 == i3) {
                    this.f2012f.mo1203a(this.f2007a, 1, i3, 0, null);
                    this.f2007a += this.f2016j;
                    this.f2013g = 0;
                }
            } else {
                byte[] bArr2 = this.f2009c.f4258a;
                int min2 = Math.min(bky.mo2070b(), 16 - this.f2014h);
                bky2.mo2069a(bArr2, this.f2014h, min2);
                int i4 = this.f2014h + min2;
                this.f2014h = i4;
                if (i4 == 16) {
                    this.f2008b.mo2050a(0);
                    alo a = alp.m1039a(this.f2008b);
                    akh akh = this.f2017k;
                    if (akh == null || akh.f569v != 2 || a.f712a != akh.f570w || !"audio/ac4".equals(akh.f556i)) {
                        akh a2 = akh.m731a(this.f2011e, "audio/ac4", -1, -1, 2, a.f712a, (List) null, (anq) null, this.f2010d);
                        this.f2017k = a2;
                        this.f2012f.mo1204a(a2);
                    }
                    this.f2018l = a.f713b;
                    this.f2016j = (((long) a.f714c) * 1000000) / ((long) this.f2017k.f570w);
                    this.f2009c.mo2073c(0);
                    this.f2012f.mo1205a(this.f2009c, 16);
                    this.f2013g = 2;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2011e = asw.mo1310c();
        this.f2012f = aok.mo1211a(asw.mo1309b(), 1);
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f2007a = j;
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f2013g = 0;
        this.f2014h = 0;
        this.f2015i = false;
    }
}
