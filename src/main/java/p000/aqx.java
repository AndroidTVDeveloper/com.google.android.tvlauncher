package p000;

import java.util.Arrays;

/* renamed from: aqx */
/* compiled from: PG */
final class aqx {

    /* renamed from: a */
    public final aqy f1930a = new aqy();

    /* renamed from: b */
    public final bky f1931b = new bky(new byte[65025], 0);

    /* renamed from: c */
    public int f1932c = -1;

    /* renamed from: d */
    public boolean f1933d;

    /* renamed from: e */
    private int f1934e;

    /* renamed from: a */
    private final int m1856a(int i) {
        int i2;
        int i3 = 0;
        this.f1934e = 0;
        do {
            int i4 = this.f1934e;
            int i5 = i + i4;
            aqy aqy = this.f1930a;
            if (i5 >= aqy.f1937c) {
                break;
            }
            int[] iArr = aqy.f1940f;
            this.f1934e = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final boolean mo1272a(aoj aoj) {
        bks.m3512b(true);
        if (this.f1933d) {
            this.f1933d = false;
            this.f1931b.mo2064a();
        }
        while (!this.f1933d) {
            int i = this.f1932c;
            if (i < 0) {
                if (!this.f1930a.mo1274a(aoj, true)) {
                    return false;
                }
                aqy aqy = this.f1930a;
                int i2 = aqy.f1938d;
                if ((aqy.f1935a & 1) == 1 && this.f1931b.f4260c == 0) {
                    i2 += m1856a(0);
                    i = this.f1934e;
                } else {
                    i = 0;
                }
                aoj.mo1192a(i2);
                this.f1932c = i;
            }
            int a = m1856a(i);
            int i3 = this.f1932c + this.f1934e;
            if (a > 0) {
                int c = this.f1931b.mo2072c();
                bky bky = this.f1931b;
                int i4 = bky.f4260c + a;
                if (c < i4) {
                    bky.f4258a = Arrays.copyOf(bky.f4258a, i4);
                }
                bky bky2 = this.f1931b;
                aoj.mo1196b(bky2.f4258a, bky2.f4260c, a);
                bky bky3 = this.f1931b;
                bky3.mo2071b(bky3.f4260c + a);
                this.f1933d = this.f1930a.f1940f[i3 + -1] != 255;
            }
            if (i3 == this.f1930a.f1937c) {
                i3 = -1;
            }
            this.f1932c = i3;
        }
        return true;
    }
}
