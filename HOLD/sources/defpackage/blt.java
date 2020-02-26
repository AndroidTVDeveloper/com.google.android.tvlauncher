package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: blt  reason: default package */
/* compiled from: PG */
public final class blt {
    public final List a;
    public final int b;

    private blt(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public static blt a(bky bky) {
        List list;
        try {
            bky.d(21);
            int d = bky.d() & 3;
            int d2 = bky.d();
            int i = bky.b;
            int i2 = 0;
            int i3 = 0;
            while (i2 < d2) {
                bky.d(1);
                int e = bky.e();
                int i4 = i3;
                for (int i5 = 0; i5 < e; i5++) {
                    int e2 = bky.e();
                    i4 += e2 + 4;
                    bky.d(e2);
                }
                i2++;
                i3 = i4;
            }
            bky.c(i);
            byte[] bArr = new byte[i3];
            int i6 = 0;
            int i7 = 0;
            while (i6 < d2) {
                bky.d(1);
                int e3 = bky.e();
                int i8 = i7;
                for (int i9 = 0; i9 < e3; i9++) {
                    int e4 = bky.e();
                    System.arraycopy(bkw.a, 0, bArr, i8, bkw.a.length);
                    int length = i8 + bkw.a.length;
                    System.arraycopy(bky.a, bky.b, bArr, length, e4);
                    i8 = length + e4;
                    bky.d(e4);
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
