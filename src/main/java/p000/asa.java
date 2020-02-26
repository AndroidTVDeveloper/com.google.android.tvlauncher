package p000;

import android.util.Log;
import java.util.Collections;

/* renamed from: asa */
/* compiled from: PG */
public final class asa implements art {

    /* renamed from: a */
    private final asm f2156a;

    /* renamed from: b */
    private String f2157b;

    /* renamed from: c */
    private aov f2158c;

    /* renamed from: d */
    private arz f2159d;

    /* renamed from: e */
    private boolean f2160e;

    /* renamed from: f */
    private final boolean[] f2161f = new boolean[3];

    /* renamed from: g */
    private final ase f2162g = new ase(32);

    /* renamed from: h */
    private final ase f2163h = new ase(33);

    /* renamed from: i */
    private final ase f2164i = new ase(34);

    /* renamed from: j */
    private final ase f2165j = new ase(39);

    /* renamed from: k */
    private final ase f2166k = new ase(40);

    /* renamed from: l */
    private long f2167l;

    /* renamed from: m */
    private long f2168m;

    /* renamed from: n */
    private final bky f2169n = new bky();

    public asa(asm asm) {
        this.f2156a = asm;
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        int i;
        long j;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        long j2;
        int i5;
        boolean z;
        float f;
        int i6;
        while (true) {
            bky bky2 = bky;
            if (bky.mo2070b() > 0) {
                int i7 = bky2.f4259b;
                int i8 = bky2.f4260c;
                byte[] bArr2 = bky2.f4258a;
                this.f2167l += (long) bky.mo2070b();
                this.f2158c.mo1205a(bky2, bky.mo2070b());
                while (i7 < i8) {
                    int a = bkw.m3525a(bArr2, i7, i8, this.f2161f);
                    if (a != i8) {
                        int c = bkw.m3531c(bArr2, a);
                        int i9 = a - i7;
                        if (i9 > 0) {
                            m1961a(bArr2, i7, a);
                        }
                        int i10 = i8 - a;
                        long j3 = this.f2167l - ((long) i10);
                        if (i9 < 0) {
                            i = -i9;
                        } else {
                            i = 0;
                        }
                        long j4 = this.f2168m;
                        if (!this.f2160e) {
                            this.f2162g.mo1298b(i);
                            this.f2163h.mo1298b(i);
                            this.f2164i.mo1298b(i);
                            ase ase = this.f2162g;
                            if (ase.f2208a) {
                                ase ase2 = this.f2163h;
                                if (ase2.f2208a) {
                                    ase ase3 = this.f2164i;
                                    if (ase3.f2208a) {
                                        aov aov = this.f2158c;
                                        String str = this.f2157b;
                                        i4 = i8;
                                        int i11 = ase.f2210c;
                                        bArr = bArr2;
                                        i3 = a;
                                        byte[] bArr3 = new byte[(ase2.f2210c + i11 + ase3.f2210c)];
                                        i2 = c;
                                        System.arraycopy(ase.f2209b, 0, bArr3, 0, i11);
                                        j = j4;
                                        System.arraycopy(ase2.f2209b, 0, bArr3, ase.f2210c, ase2.f2210c);
                                        System.arraycopy(ase3.f2209b, 0, bArr3, ase.f2210c + ase2.f2210c, ase3.f2210c);
                                        bkz bkz = new bkz(ase2.f2209b, 0, ase2.f2210c);
                                        bkz.mo2093a(44);
                                        int c2 = bkz.mo2097c(3);
                                        bkz.mo2092a();
                                        bkz.mo2093a(88);
                                        bkz.mo2093a(8);
                                        int i12 = 0;
                                        for (int i13 = 0; i13 < c2; i13++) {
                                            if (bkz.mo2095b()) {
                                                i12 += 89;
                                            }
                                            if (bkz.mo2095b()) {
                                                i12 += 8;
                                            }
                                        }
                                        bkz.mo2093a(i12);
                                        if (c2 > 0) {
                                            int i14 = 8 - c2;
                                            bkz.mo2093a(i14 + i14);
                                        }
                                        bkz.mo2100e();
                                        int e = bkz.mo2100e();
                                        if (e == 3) {
                                            bkz.mo2092a();
                                        }
                                        int e2 = bkz.mo2100e();
                                        int e3 = bkz.mo2100e();
                                        if (bkz.mo2095b()) {
                                            int e4 = bkz.mo2100e();
                                            int e5 = bkz.mo2100e();
                                            int e6 = bkz.mo2100e();
                                            int e7 = bkz.mo2100e();
                                            e2 -= ((e == 1 || e == 2) ? 2 : 1) * (e4 + e5);
                                            e3 -= (e == 1 ? 2 : 1) * (e6 + e7);
                                        }
                                        int i15 = e2;
                                        bkz.mo2100e();
                                        bkz.mo2100e();
                                        int e8 = bkz.mo2100e();
                                        for (int i16 = bkz.mo2095b() ? 0 : c2; i16 <= c2; i16++) {
                                            bkz.mo2100e();
                                            bkz.mo2100e();
                                            bkz.mo2100e();
                                        }
                                        bkz.mo2100e();
                                        bkz.mo2100e();
                                        bkz.mo2100e();
                                        bkz.mo2100e();
                                        bkz.mo2100e();
                                        bkz.mo2100e();
                                        if (bkz.mo2095b() && bkz.mo2095b()) {
                                            int i17 = 0;
                                            while (true) {
                                                int i18 = 4;
                                                if (i17 >= 4) {
                                                    break;
                                                }
                                                int i19 = 0;
                                                while (i19 < 6) {
                                                    if (bkz.mo2095b()) {
                                                        int min = Math.min(64, 1 << ((i17 + i17) + i18));
                                                        if (i17 > 1) {
                                                            bkz.mo2099d();
                                                        }
                                                        for (int i20 = 0; i20 < min; i20++) {
                                                            bkz.mo2099d();
                                                        }
                                                    } else {
                                                        bkz.mo2100e();
                                                    }
                                                    i19 += i17 == 3 ? 3 : 1;
                                                    i18 = 4;
                                                }
                                                i17++;
                                            }
                                        }
                                        bkz.mo2093a(2);
                                        if (bkz.mo2095b()) {
                                            bkz.mo2093a(8);
                                            bkz.mo2100e();
                                            bkz.mo2100e();
                                            bkz.mo2092a();
                                        }
                                        int e9 = bkz.mo2100e();
                                        int i21 = 0;
                                        boolean z2 = false;
                                        int i22 = 0;
                                        while (i21 < e9) {
                                            if (i21 != 0) {
                                                z2 = bkz.mo2095b();
                                            }
                                            if (!z2) {
                                                int e10 = bkz.mo2100e();
                                                int e11 = bkz.mo2100e();
                                                int i23 = e10 + e11;
                                                i6 = e9;
                                                for (int i24 = 0; i24 < e10; i24++) {
                                                    bkz.mo2100e();
                                                    bkz.mo2092a();
                                                }
                                                for (int i25 = 0; i25 < e11; i25++) {
                                                    bkz.mo2100e();
                                                    bkz.mo2092a();
                                                }
                                                i22 = i23;
                                            } else {
                                                i6 = e9;
                                                bkz.mo2092a();
                                                bkz.mo2100e();
                                                for (int i26 = 0; i26 <= i22; i26++) {
                                                    if (bkz.mo2095b()) {
                                                        bkz.mo2092a();
                                                    }
                                                }
                                            }
                                            i21++;
                                            e9 = i6;
                                        }
                                        if (bkz.mo2095b()) {
                                            for (int i27 = 0; i27 < bkz.mo2100e(); i27++) {
                                                bkz.mo2093a(e8 + 5);
                                            }
                                        }
                                        bkz.mo2093a(2);
                                        if (bkz.mo2095b() && bkz.mo2095b()) {
                                            int c3 = bkz.mo2097c(8);
                                            if (c3 == 255) {
                                                int c4 = bkz.mo2097c(16);
                                                int c5 = bkz.mo2097c(16);
                                                if (!(c4 == 0 || c5 == 0)) {
                                                    f = ((float) c4) / ((float) c5);
                                                }
                                            } else if (c3 >= bkw.f4251b.length) {
                                                StringBuilder sb = new StringBuilder(46);
                                                sb.append("Unexpected aspect_ratio_idc value: ");
                                                sb.append(c3);
                                                Log.w("H265Reader", sb.toString());
                                                f = 1.0f;
                                            } else {
                                                f = bkw.f4251b[c3];
                                            }
                                            aov.mo1204a(akh.m737a(str, "video/hevc", null, i15, e3, Collections.singletonList(bArr3), f));
                                            this.f2160e = true;
                                        }
                                        f = 1.0f;
                                        aov.mo1204a(akh.m737a(str, "video/hevc", null, i15, e3, Collections.singletonList(bArr3), f));
                                        this.f2160e = true;
                                    }
                                }
                            }
                            i4 = i8;
                            bArr = bArr2;
                            i3 = a;
                            i2 = c;
                            j = j4;
                        } else {
                            i4 = i8;
                            bArr = bArr2;
                            i3 = a;
                            i2 = c;
                            j = j4;
                            arz arz = this.f2159d;
                            if (arz.f2148i && arz.f2145f) {
                                arz.f2151l = arz.f2141b;
                                arz.f2148i = false;
                            } else if (arz.f2146g || arz.f2145f) {
                                if (arz.f2147h) {
                                    arz.mo1294a(((int) (j3 - arz.f2140a)) + i10);
                                }
                                arz.f2149j = arz.f2140a;
                                arz.f2150k = arz.f2143d;
                                arz.f2147h = true;
                                arz.f2151l = arz.f2141b;
                            }
                        }
                        if (this.f2165j.mo1298b(i)) {
                            ase ase4 = this.f2165j;
                            this.f2169n.mo2068a(this.f2165j.f2209b, bkw.m3524a(ase4.f2209b, ase4.f2210c));
                            this.f2169n.mo2075d(5);
                            j2 = j;
                            this.f2156a.mo1305a(j2, this.f2169n);
                        } else {
                            j2 = j;
                        }
                        if (this.f2166k.mo1298b(i)) {
                            ase ase5 = this.f2166k;
                            this.f2169n.mo2068a(this.f2166k.f2209b, bkw.m3524a(ase5.f2209b, ase5.f2210c));
                            this.f2169n.mo2075d(5);
                            this.f2156a.mo1305a(j2, this.f2169n);
                        }
                        long j5 = this.f2168m;
                        if (this.f2160e) {
                            arz arz2 = this.f2159d;
                            arz2.f2145f = false;
                            arz2.f2146g = false;
                            arz2.f2143d = j5;
                            arz2.f2142c = 0;
                            arz2.f2140a = j3;
                            i5 = i2;
                            if (i5 >= 32) {
                                if (!arz2.f2148i && arz2.f2147h) {
                                    arz2.mo1294a(i10);
                                    arz2.f2147h = false;
                                }
                                if (i5 <= 34) {
                                    z = true;
                                    arz2.f2146g = !arz2.f2148i;
                                    arz2.f2148i = true;
                                } else {
                                    z = true;
                                }
                            } else {
                                z = true;
                            }
                            boolean z3 = i5 >= 16 && i5 <= 21;
                            arz2.f2141b = z3;
                            if (!z3 && i5 > 9) {
                                z = false;
                            }
                            arz2.f2144e = z;
                        } else {
                            i5 = i2;
                            this.f2162g.mo1296a(i5);
                            this.f2163h.mo1296a(i5);
                            this.f2164i.mo1296a(i5);
                        }
                        this.f2165j.mo1296a(i5);
                        this.f2166k.mo1296a(i5);
                        i7 = i3 + 3;
                        i8 = i4;
                        bArr2 = bArr;
                    } else {
                        m1961a(bArr2, i7, i8);
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2157b = asw.mo1310c();
        this.f2158c = aok.mo1211a(asw.mo1309b(), 2);
        this.f2159d = new arz(this.f2158c);
        this.f2156a.mo1306a(aok, asw);
    }

    /* renamed from: a */
    private final void m1961a(byte[] bArr, int i, int i2) {
        boolean z;
        if (!this.f2160e) {
            this.f2162g.mo1297a(bArr, i, i2);
            this.f2163h.mo1297a(bArr, i, i2);
            this.f2164i.mo1297a(bArr, i, i2);
        } else {
            arz arz = this.f2159d;
            if (arz.f2144e) {
                int i3 = arz.f2142c;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    if ((bArr[i4] & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arz.f2145f = z;
                    arz.f2144e = false;
                } else {
                    arz.f2142c = i3 + (i2 - i);
                }
            }
        }
        this.f2165j.mo1297a(bArr, i, i2);
        this.f2166k.mo1297a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f2168m = j;
    }

    /* renamed from: a */
    public final void mo1281a() {
        bkw.m3528a(this.f2161f);
        this.f2162g.mo1295a();
        this.f2163h.mo1295a();
        this.f2164i.mo1295a();
        this.f2165j.mo1295a();
        this.f2166k.mo1295a();
        arz arz = this.f2159d;
        arz.f2144e = false;
        arz.f2145f = false;
        arz.f2146g = false;
        arz.f2147h = false;
        arz.f2148i = false;
        this.f2167l = 0;
    }
}
