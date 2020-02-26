package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: arr */
/* compiled from: PG */
public final class arr implements art {

    /* renamed from: a */
    private final bky f2052a = new bky(new byte[18]);

    /* renamed from: b */
    private final String f2053b;

    /* renamed from: c */
    private String f2054c;

    /* renamed from: d */
    private aov f2055d;

    /* renamed from: e */
    private int f2056e = 0;

    /* renamed from: f */
    private int f2057f;

    /* renamed from: g */
    private int f2058g;

    /* renamed from: h */
    private long f2059h;

    /* renamed from: i */
    private akh f2060i;

    /* renamed from: j */
    private int f2061j;

    /* renamed from: k */
    private long f2062k;

    public arr(String str) {
        this.f2053b = str;
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        bkx bkx;
        int i;
        bky bky2 = bky;
        while (bky.mo2070b() > 0) {
            int i2 = this.f2056e;
            int i3 = 2;
            int i4 = 1;
            if (i2 == 0) {
                while (true) {
                    if (bky.mo2070b() <= 0) {
                        break;
                    }
                    int i5 = this.f2058g << 8;
                    this.f2058g = i5;
                    int d = i5 | bky.mo2074d();
                    this.f2058g = d;
                    if (amv.m1137a(d)) {
                        byte[] bArr = this.f2052a.f4258a;
                        int i6 = this.f2058g;
                        bArr[0] = (byte) (i6 >> 24);
                        bArr[1] = (byte) (i6 >> 16);
                        bArr[2] = (byte) (i6 >> 8);
                        bArr[3] = (byte) i6;
                        this.f2057f = 4;
                        this.f2058g = 0;
                        this.f2056e = 1;
                        break;
                    }
                }
            } else if (i2 != 1) {
                int min = Math.min(bky.mo2070b(), this.f2061j - this.f2057f);
                this.f2055d.mo1205a(bky2, min);
                int i7 = this.f2057f + min;
                this.f2057f = i7;
                int i8 = this.f2061j;
                if (i7 == i8) {
                    this.f2055d.mo1203a(this.f2062k, 1, i8, 0, null);
                    this.f2062k += this.f2059h;
                    this.f2056e = 0;
                }
            } else {
                byte[] bArr2 = this.f2052a.f4258a;
                int min2 = Math.min(bky.mo2070b(), 18 - this.f2057f);
                bky2.mo2069a(bArr2, this.f2057f, min2);
                int i9 = this.f2057f + min2;
                this.f2057f = i9;
                if (i9 == 18) {
                    byte[] bArr3 = this.f2052a.f4258a;
                    if (this.f2060i == null) {
                        String str = this.f2054c;
                        String str2 = this.f2053b;
                        int[] iArr = amv.f849a;
                        int i10 = -1;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            bkx = new bkx(bArr3);
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b = copyOf[0];
                            if (b == -2 || b == -1) {
                                for (int i11 = 0; i11 < copyOf.length - 1; i11 += 2) {
                                    byte b2 = copyOf[i11];
                                    int i12 = i11 + 1;
                                    copyOf[i11] = copyOf[i12];
                                    copyOf[i12] = b2;
                                }
                            }
                            bkx bkx2 = new bkx(copyOf);
                            if (copyOf[0] == 31) {
                                bkx bkx3 = new bkx(copyOf);
                                while (bkx3.mo2049a() >= 16) {
                                    bkx3.mo2054b(i3);
                                    int c = bkx3.mo2057c(14) & 16383;
                                    int min3 = Math.min(8 - bkx2.f4256c, 14);
                                    int i13 = bkx2.f4256c;
                                    int i14 = (8 - i13) - min3;
                                    byte[] bArr4 = bkx2.f4254a;
                                    int i15 = bkx2.f4255b;
                                    byte b3 = (byte) (bArr4[i15] & ((65280 >> i13) | ((1 << i14) - 1)));
                                    bArr4[i15] = b3;
                                    int i16 = 14 - min3;
                                    bArr4[i15] = (byte) (b3 | ((c >>> i16) << i14));
                                    int i17 = i15 + 1;
                                    while (i16 > 8) {
                                        i16 -= 8;
                                        bkx2.f4254a[i17] = (byte) (c >>> i16);
                                        i17++;
                                    }
                                    int i18 = 8 - i16;
                                    byte[] bArr5 = bkx2.f4254a;
                                    byte b4 = (byte) (bArr5[i17] & ((1 << i18) - 1));
                                    bArr5[i17] = b4;
                                    bArr5[i17] = (byte) (((((1 << i16) - 1) & c) << i18) | b4);
                                    bkx2.mo2054b(14);
                                    bkx2.mo2062g();
                                    i3 = 2;
                                }
                            }
                            bkx2.mo2051a(copyOf);
                            bkx = bkx2;
                        }
                        bkx.mo2054b(60);
                        int i19 = amv.f849a[bkx.mo2057c(6)];
                        int i20 = amv.f850b[bkx.mo2057c(4)];
                        int c2 = bkx.mo2057c(5);
                        if (c2 < amv.f851c.length) {
                            i = 2;
                            i10 = (amv.f851c[c2] * 1000) / 2;
                        } else {
                            i = 2;
                        }
                        bkx.mo2054b(10);
                        if (bkx.mo2057c(i) <= 0) {
                            i4 = 0;
                        }
                        akh a = akh.m731a(str, "audio/vnd.dts", i10, -1, i19 + i4, i20, (List) null, (anq) null, str2);
                        this.f2060i = a;
                        this.f2055d.mo1204a(a);
                    }
                    this.f2061j = amv.m1138b(bArr3);
                    this.f2059h = (long) ((int) ((((long) amv.m1136a(bArr3)) * 1000000) / ((long) this.f2060i.f570w)));
                    this.f2052a.mo2073c(0);
                    this.f2055d.mo1205a(this.f2052a, 18);
                    this.f2056e = 2;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2054c = asw.mo1310c();
        this.f2055d = aok.mo1211a(asw.mo1309b(), 1);
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f2062k = j;
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f2056e = 0;
        this.f2057f = 0;
        this.f2058g = 0;
    }
}
