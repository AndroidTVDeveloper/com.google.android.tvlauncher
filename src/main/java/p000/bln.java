package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bln */
/* compiled from: PG */
public final class bln {

    /* renamed from: a */
    public final List f4305a;

    /* renamed from: b */
    public final int f4306b;

    /* renamed from: c */
    public final int f4307c;

    /* renamed from: d */
    public final int f4308d;

    /* renamed from: e */
    public final float f4309e;

    private bln(List list, int i, int i2, int i3, float f) {
        this.f4305a = list;
        this.f4306b = i;
        this.f4307c = i2;
        this.f4308d = i3;
        this.f4309e = f;
    }

    /* renamed from: b */
    private static byte[] m3684b(bky bky) {
        int e = bky.mo2076e();
        int i = bky.f4259b;
        bky.mo2075d(e);
        byte[] bArr = bky.f4258a;
        byte[] bArr2 = new byte[(bkg.f4207a.length + e)];
        System.arraycopy(bkg.f4207a, 0, bArr2, 0, bkg.f4207a.length);
        System.arraycopy(bArr, i, bArr2, bkg.f4207a.length, e);
        return bArr2;
    }

    /* renamed from: a */
    public static bln m3683a(bky bky) {
        float f;
        int i;
        int i2;
        try {
            bky.mo2075d(4);
            int d = (bky.mo2074d() & 3) + 1;
            if (d != 3) {
                ArrayList arrayList = new ArrayList();
                int d2 = bky.mo2074d() & 31;
                for (int i3 = 0; i3 < d2; i3++) {
                    arrayList.add(m3684b(bky));
                }
                int d3 = bky.mo2074d();
                for (int i4 = 0; i4 < d3; i4++) {
                    arrayList.add(m3684b(bky));
                }
                if (d2 > 0) {
                    bkv a = bkw.m3526a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f4241e;
                    int i6 = a.f4242f;
                    f = a.f4243g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new bln(arrayList, d, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ako("Error parsing AVC config", e);
        }
    }
}
