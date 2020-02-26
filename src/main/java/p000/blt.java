package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: blt */
/* compiled from: PG */
public final class blt {

    /* renamed from: a */
    public final List f4325a;

    /* renamed from: b */
    public final int f4326b;

    private blt(List list, int i) {
        this.f4325a = list;
        this.f4326b = i;
    }

    /* renamed from: a */
    public static blt m3687a(bky bky) {
        List list;
        try {
            bky.mo2075d(21);
            int d = bky.mo2074d() & 3;
            int d2 = bky.mo2074d();
            int i = bky.f4259b;
            int i2 = 0;
            int i3 = 0;
            while (i2 < d2) {
                bky.mo2075d(1);
                int e = bky.mo2076e();
                int i4 = i3;
                for (int i5 = 0; i5 < e; i5++) {
                    int e2 = bky.mo2076e();
                    i4 += e2 + 4;
                    bky.mo2075d(e2);
                }
                i2++;
                i3 = i4;
            }
            bky.mo2073c(i);
            byte[] bArr = new byte[i3];
            int i6 = 0;
            int i7 = 0;
            while (i6 < d2) {
                bky.mo2075d(1);
                int e3 = bky.mo2076e();
                int i8 = i7;
                for (int i9 = 0; i9 < e3; i9++) {
                    int e4 = bky.mo2076e();
                    System.arraycopy(bkw.f4250a, 0, bArr, i8, bkw.f4250a.length);
                    int length = i8 + bkw.f4250a.length;
                    System.arraycopy(bky.f4258a, bky.f4259b, bArr, length, e4);
                    i8 = length + e4;
                    bky.mo2075d(e4);
                }
                i6++;
                i7 = i8;
            }
            if (i3 != 0) {
                list = Collections.singletonList(bArr);
            } else {
                list = null;
            }
            return new blt(list, d + 1);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new ako("Error parsing HEVC config", e5);
        }
    }
}
