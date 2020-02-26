package defpackage;

import java.util.Arrays;

/* renamed from: aqx  reason: default package */
/* compiled from: PG */
final class aqx {
    public final aqy a = new aqy();
    public final bky b = new bky(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int a(int i) {
        int i2;
        int i3 = 0;
        this.e = 0;
        do {
            int i4 = this.e;
            int i5 = i + i4;
            aqy aqy = this.a;
            if (i5 >= aqy.c) {
                break;
            }
            int[] iArr = aqy.f;
            this.e = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(aoj aoj) {
        bks.b(true);
        if (this.d) {
            this.d = false;
            this.b.a();
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                if (!this.a.a(aoj, true)) {
                    return false;
                }
                aqy aqy = this.a;
                int i2 = aqy.d;
                if ((aqy.a & 1) == 1 && this.b.c == 0) {
                    i2 += a(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                aoj.a(i2);
                this.c = i;
            }
            int a2 = a(i);
            int i3 = this.c + this.e;
            if (a2 > 0) {
                int c2 = this.b.c();
                bky bky = this.b;
                int i4 = bky.c + a2;
                if (c2 < i4) {
                    bky.a = Arrays.copyOf(bky.a, i4);
                }
                bky bky2 = this.b;
                aoj.b(bky2.a, bky2.c, a2);
                bky bky3 = this.b;
                bky3.b(bky3.c + a2);
                this.d = this.a.f[i3 + -1] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
