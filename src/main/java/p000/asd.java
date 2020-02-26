package p000;

import java.util.List;

/* renamed from: asd */
/* compiled from: PG */
public final class asd implements art {

    /* renamed from: a */
    private final bky f2196a;

    /* renamed from: b */
    private final aoo f2197b;

    /* renamed from: c */
    private final String f2198c;

    /* renamed from: d */
    private String f2199d;

    /* renamed from: e */
    private aov f2200e;

    /* renamed from: f */
    private int f2201f;

    /* renamed from: g */
    private int f2202g;

    /* renamed from: h */
    private boolean f2203h;

    /* renamed from: i */
    private boolean f2204i;

    /* renamed from: j */
    private long f2205j;

    /* renamed from: k */
    private int f2206k;

    /* renamed from: l */
    private long f2207l;

    public asd() {
        this(null);
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    public asd(String str) {
        this.f2201f = 0;
        bky bky = new bky(4);
        this.f2196a = bky;
        bky.f4258a[0] = -1;
        this.f2197b = new aoo();
        this.f2198c = str;
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        boolean z;
        bky bky2 = bky;
        while (bky.mo2070b() > 0) {
            int i = this.f2201f;
            if (i == 0) {
                byte[] bArr = bky2.f4258a;
                int i2 = bky2.f4259b;
                int i3 = bky2.f4260c;
                while (true) {
                    if (i2 >= i3) {
                        bky2.mo2073c(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z2 = (b & 255) == 255;
                    if (!this.f2204i || (b & 224) != 224) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f2204i = z2;
                    if (z) {
                        bky2.mo2073c(i2 + 1);
                        this.f2204i = false;
                        this.f2196a.f4258a[1] = bArr[i2];
                        this.f2202g = 2;
                        this.f2201f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i != 1) {
                int min = Math.min(bky.mo2070b(), this.f2206k - this.f2202g);
                this.f2200e.mo1205a(bky2, min);
                int i4 = this.f2202g + min;
                this.f2202g = i4;
                int i5 = this.f2206k;
                if (i4 >= i5) {
                    this.f2200e.mo1203a(this.f2207l, 1, i5, 0, null);
                    this.f2207l += this.f2205j;
                    this.f2202g = 0;
                    this.f2201f = 0;
                }
            } else {
                int min2 = Math.min(bky.mo2070b(), 4 - this.f2202g);
                bky2.mo2069a(this.f2196a.f4258a, this.f2202g, min2);
                int i6 = this.f2202g + min2;
                this.f2202g = i6;
                if (i6 >= 4) {
                    this.f2196a.mo2073c(0);
                    if (!aoo.m1673a(this.f2196a.mo2083j(), this.f2197b)) {
                        this.f2202g = 0;
                        this.f2201f = 1;
                    } else {
                        aoo aoo = this.f2197b;
                        this.f2206k = aoo.f1509c;
                        if (!this.f2203h) {
                            int i7 = aoo.f1513g;
                            int i8 = aoo.f1510d;
                            this.f2205j = (((long) i7) * 1000000) / ((long) i8);
                            this.f2200e.mo1204a(akh.m731a(this.f2199d, aoo.f1508b, -1, 4096, aoo.f1511e, i8, (List) null, (anq) null, this.f2198c));
                            this.f2203h = true;
                        }
                        this.f2196a.mo2073c(0);
                        this.f2200e.mo1205a(this.f2196a, 4);
                        this.f2201f = 2;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2199d = asw.mo1310c();
        this.f2200e = aok.mo1211a(asw.mo1309b(), 1);
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f2207l = j;
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f2201f = 0;
        this.f2202g = 0;
        this.f2204i = false;
    }
}
