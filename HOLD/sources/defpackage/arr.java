package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: arr  reason: default package */
/* compiled from: PG */
public final class arr implements art {
    private final bky a = new bky(new byte[18]);
    private final String b;
    private String c;
    private aov d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private akh i;
    private int j;
    private long k;

    public arr(String str) {
        this.b = str;
    }

    public final void b() {
    }

    public final void a(bky bky) {
        bkx bkx;
        int i2;
        bky bky2 = bky;
        while (bky.b() > 0) {
            int i3 = this.e;
            int i4 = 2;
            int i5 = 1;
            if (i3 == 0) {
                while (true) {
                    if (bky.b() <= 0) {
                        break;
                    }
                    int i6 = this.g << 8;
                    this.g = i6;
                    int d2 = i6 | bky.d();
                    this.g = d2;
                    if (amv.a(d2)) {
                        byte[] bArr = this.a.a;
                        int i7 = this.g;
                        bArr[0] = (byte) (i7 >> 24);
                        bArr[1] = (byte) (i7 >> 16);
                        bArr[2] = (byte) (i7 >> 8);
                        bArr[3] = (byte) i7;
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i3 != 1) {
                int min = Math.min(bky.b(), this.j - this.f);
                this.d.a(bky2, min);
                int i8 = this.f + min;
                this.f = i8;
                int i9 = this.j;
                if (i8 == i9) {
                    this.d.a(this.k, 1, i9, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            } else {
                byte[] bArr2 = this.a.a;
                int min2 = Math.min(bky.b(), 18 - this.f);
                bky2.a(bArr2, this.f, min2);
                int i10 = this.f + min2;
                this.f = i10;
                if (i10 == 18) {
                    byte[] bArr3 = this.a.a;
                    if (this.i == null) {
                        String str = this.c;
                        String str2 = this.b;
                        int[] iArr = amv.a;
                        int i11 = -1;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            bkx = new bkx(bArr3);
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b2 = copyOf[0];
                            if (b2 == -2 || b2 == -1) {
                                for (int i12 = 0; i12 < copyOf.length - 1; i12 += 2) {
                                    byte b3 = copyOf[i12];
                                    int i13 = i12 + 1;
                                    copyOf[i12] = copyOf[i13];
                                    copyOf[i13] = b3;
                                }
                            }
                            bkx bkx2 = new bkx(copyOf);
                            if (copyOf[0] == 31) {
                                bkx bkx3 = new bkx(copyOf);
                                while (bkx3.a() >= 16) {
                                    bkx3.b(i4);
                                    int c2 = bkx3.c(14) & 16383;
                                    int min3 = Math.min(8 - bkx2.c, 14);
                                    int i14 = bkx2.c;
                                    int i15 = (8 - i14) - min3;
                                    byte[] bArr4 = bkx2.a;
                                    int i16 = bkx2.b;
                                    byte b4 = (byte) (bArr4[i16] & ((65280 >> i14) | ((1 << i15) - 1)));
                                    bArr4[i16] = b4;
                                    int i17 = 14 - min3;
                                    bArr4[i16] = (byte) (b4 | ((c2 >>> i17) << i15));
                                    int i18 = i16 + 1;
                                    while (i17 > 8) {
                                        i17 -= 8;
                                        bkx2.a[i18] = (byte) (c2 >>> i17);
                                        i18++;
                                    }
                                    int i19 = 8 - i17;
                                    byte[] bArr5 = bkx2.a;
                                    byte b5 = (byte) (bArr5[i18] & ((1 << i19) - 1));
                                    bArr5[i18] = b5;
                                    bArr5[i18] = (byte) (((((1 << i17) - 1) & c2) << i19) | b5);
                                    bkx2.b(14);
                                    bkx2.g();
                                    i4 = 2;
                                }
                            }
                            bkx2.a(copyOf);
                            bkx = bkx2;
                        }
                        bkx.b(60);
                        int i20 = amv.a[bkx.c(6)];
                        int i21 = amv.b[bkx.c(4)];
                        int c3 = bkx.c(5);
                        if (c3 < amv.c.length) {
                            i2 = 2;
                            i11 = (amv.c[c3] * 1000) / 2;
                        } else {
                            i2 = 2;
                        }
                        bkx.b(10);
                        if (bkx.c(i2) <= 0) {
                            i5 = 0;
                        }
                        akh a2 = akh.a(str, "audio/vnd.dts", i11, -1, i20 + i5, i21, (List) null, (anq) null, str2);
                        this.i = a2;
                        this.d.a(a2);
                    }
                    this.j = amv.b(bArr3);
                    this.h = (long) ((int) ((((long) amv.a(bArr3)) * 1000000) / ((long) this.i.w)));
                    this.a.c(0);
                    this.d.a(this.a, 18);
                    this.e = 2;
                }
            }
        }
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.c = asw.c();
        this.d = aok.a(asw.b(), 1);
    }

    public final void a(long j2, int i2) {
        this.k = j2;
    }

    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }
}
