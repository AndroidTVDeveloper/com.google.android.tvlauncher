package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bln  reason: default package */
/* compiled from: PG */
public final class bln {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    private bln(List list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] b(bky bky) {
        int e2 = bky.e();
        int i = bky.b;
        bky.d(e2);
        byte[] bArr = bky.a;
        byte[] bArr2 = new byte[(bkg.a.length + e2)];
        System.arraycopy(bkg.a, 0, bArr2, 0, bkg.a.length);
        System.arraycopy(bArr, i, bArr2, bkg.a.length, e2);
        return bArr2;
    }

    public static bln a(bky bky) {
        float f;
        int i;
        int i2;
        try {
            bky.d(4);
            int d2 = (bky.d() & 3) + 1;
            if (d2 != 3) {
                ArrayList arrayList = new ArrayList();
                int d3 = bky.d() & 31;
                for (int i3 = 0; i3 < d3; i3++) {
                    arrayList.add(b(bky));
                }
                int d4 = bky.d();
                for (int i4 = 0; i4 < d4; i4++) {
                    arrayList.add(b(bky));
                }
                if (d3 > 0) {
                    bkv a2 = bkw.a((byte[]) arrayList.get(0), d2, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.e;
                    int i6 = a2.f;
                    f = a2.g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new bln(arrayList, d2, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ako("Error parsing AVC config", e2);
        }
    }
}
