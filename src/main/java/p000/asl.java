package p000;

/* renamed from: asl */
/* compiled from: PG */
public final class asl implements asx {

    /* renamed from: a */
    private final ask f2253a;

    /* renamed from: b */
    private final bky f2254b = new bky(32);

    /* renamed from: c */
    private int f2255c;

    /* renamed from: d */
    private int f2256d;

    /* renamed from: e */
    private boolean f2257e;

    /* renamed from: f */
    private boolean f2258f;

    public asl(ask ask) {
        this.f2253a = ask;
    }

    /* renamed from: a */
    public final void mo1300a(bky bky, int i) {
        int i2 = i & 1;
        int d = i2 != 0 ? bky.mo2074d() + bky.f4259b : -1;
        if (this.f2258f) {
            if (i2 != 0) {
                this.f2258f = false;
                bky.mo2073c(d);
                this.f2256d = 0;
            } else {
                return;
            }
        }
        while (bky.mo2070b() > 0) {
            int i3 = this.f2256d;
            if (i3 >= 3) {
                int min = Math.min(bky.mo2070b(), this.f2255c - this.f2256d);
                bky.mo2069a(this.f2254b.f4258a, this.f2256d, min);
                int i4 = this.f2256d + min;
                this.f2256d = i4;
                int i5 = this.f2255c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.f2257e) {
                        this.f2254b.mo2065a(i5);
                    } else if (blm.m3627a(this.f2254b.f4258a, i5) == 0) {
                        this.f2254b.mo2065a(this.f2255c - 4);
                    } else {
                        this.f2258f = true;
                        return;
                    }
                    this.f2253a.mo1303a(this.f2254b);
                    this.f2256d = 0;
                }
            } else {
                if (i3 == 0) {
                    int d2 = bky.mo2074d();
                    bky.mo2073c(bky.f4259b - 1);
                    if (d2 == 255) {
                        this.f2258f = true;
                        return;
                    }
                }
                int min2 = Math.min(bky.mo2070b(), 3 - this.f2256d);
                bky.mo2069a(this.f2254b.f4258a, this.f2256d, min2);
                int i6 = this.f2256d + min2;
                this.f2256d = i6;
                if (i6 == 3) {
                    this.f2254b.mo2065a(3);
                    this.f2254b.mo2075d(1);
                    int d3 = this.f2254b.mo2074d();
                    int d4 = this.f2254b.mo2074d();
                    this.f2257e = (d3 & 128) != 0;
                    this.f2255c = (((d3 & 15) << 8) | d4) + 3;
                    int c = this.f2254b.mo2072c();
                    int i7 = this.f2255c;
                    if (c < i7) {
                        bky bky2 = this.f2254b;
                        byte[] bArr = bky2.f4258a;
                        int length = bArr.length;
                        bky2.mo2065a(Math.min(4098, Math.max(i7, length + length)));
                        System.arraycopy(bArr, 0, this.f2254b.f4258a, 0, 3);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1301a(blj blj, aok aok, asw asw) {
        this.f2253a.mo1304a(blj, aok, asw);
        this.f2258f = true;
    }

    /* renamed from: a */
    public final void mo1299a() {
        this.f2258f = true;
    }
}
