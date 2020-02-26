package defpackage;

import java.util.Arrays;

/* renamed from: anb  reason: default package */
/* compiled from: PG */
final class anb {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    private final int r;
    private final int s;
    private final int t;
    private final short[] u;
    private short[] v;

    public anb(int i2, int i3, float f2, float f3, int i4) {
        this.r = i2;
        this.a = i3;
        this.b = f2;
        this.c = f3;
        this.d = ((float) i2) / ((float) i4);
        this.s = i2 / 400;
        int i5 = i2 / 65;
        this.t = i5;
        int i6 = i5 + i5;
        this.e = i6;
        this.u = new short[i6];
        int i7 = i6 * i3;
        this.f = new short[i7];
        this.h = new short[i7];
        this.v = new short[i7];
    }

    public final int a() {
        int i2 = this.i * this.a;
        return i2 + i2;
    }

    private final void b(short[] sArr, int i2, int i3) {
        short[] a2 = a(this.h, this.i, i3);
        this.h = a2;
        int i4 = this.a;
        System.arraycopy(sArr, i2 * i4, a2, this.i * i4, i4 * i3);
        this.i += i3;
    }

    private final void c(short[] sArr, int i2, int i3) {
        int i4 = this.e / i3;
        int i5 = this.a;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.u[i8] = (short) (i9 / i6);
        }
    }

    public final short[] a(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.a;
        int i5 = length / i4;
        return i2 + i3 > i5 ? Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4) : sArr;
    }

    private final int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.a;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            int i12 = i10 * i7;
            int i13 = i6 * i3;
            if (i12 < i13) {
                i6 = i10;
            }
            if (i12 < i13) {
                i7 = i3;
            }
            int i14 = i10 * i9;
            int i15 = i8 * i3;
            if (i14 > i15) {
                i8 = i10;
            }
            if (i14 > i15) {
                i9 = i3;
            }
            i3++;
        }
        this.p = i6 / i7;
        this.q = i8 / i9;
        return i7;
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    public final void b() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.i;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = f2 / f3;
        float f5 = this.d * f3;
        double d2 = (double) f4;
        float f6 = 1.0f;
        int i12 = 1;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            b(this.f, 0, this.g);
            this.g = 0;
        } else {
            int i13 = this.g;
            if (i13 >= this.e) {
                int i14 = 0;
                while (true) {
                    int i15 = this.m;
                    if (i15 > 0) {
                        int min = Math.min(this.e, i15);
                        b(this.f, i14, min);
                        this.m -= min;
                        i14 += min;
                    } else {
                        short[] sArr = this.f;
                        int i16 = this.r;
                        int i17 = i16 > 4000 ? i16 / 4000 : 1;
                        if (this.a == i12 && i17 == i12) {
                            i6 = a(sArr, i14, this.s, this.t);
                        } else {
                            c(sArr, i14, i17);
                            int a2 = a(this.u, 0, this.s / i17, this.t / i17);
                            if (i17 != i12) {
                                int i18 = a2 * i17;
                                int i19 = i17 << 2;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                int i22 = this.s;
                                if (i20 >= i22) {
                                    i22 = i20;
                                }
                                int i23 = this.t;
                                if (i21 > i23) {
                                    i21 = i23;
                                }
                                if (this.a != i12) {
                                    c(sArr, i14, i12);
                                    i6 = a(this.u, 0, i22, i21);
                                } else {
                                    i6 = a(sArr, i14, i22, i21);
                                }
                            } else {
                                i6 = a2;
                            }
                        }
                        int i24 = this.p;
                        int i25 = this.q;
                        if (i24 == 0 || (i10 = this.n) == 0 || i25 > i24 * 3 || i24 + i24 <= this.o * 3) {
                            i7 = i6;
                        } else {
                            i7 = i10;
                        }
                        this.o = i24;
                        this.n = i6;
                        if (d2 <= 1.0d) {
                            short[] sArr2 = this.f;
                            if (f4 >= 0.5f) {
                                this.m = (int) ((((float) i7) * ((f4 + f4) - 4.0f)) / (f6 - f4));
                                i9 = i7;
                            } else {
                                i9 = (int) ((((float) i7) * f4) / (f6 - f4));
                            }
                            int i26 = i7 + i9;
                            short[] a3 = a(this.h, this.i, i26);
                            this.h = a3;
                            int i27 = this.a;
                            System.arraycopy(sArr2, i14 * i27, a3, this.i * i27, i27 * i7);
                            short[] sArr3 = sArr2;
                            a(i9, this.a, this.h, this.i + i7, sArr3, i14 + i7, sArr3, i14);
                            this.i += i26;
                            i14 += i9;
                        } else {
                            short[] sArr4 = this.f;
                            if (f4 < 2.0f) {
                                this.m = (int) ((((float) i7) * (2.0f - f4)) / (-1.0f + f4));
                                i8 = i7;
                            } else {
                                i8 = (int) (((float) i7) / (-1.0f + f4));
                            }
                            short[] a4 = a(this.h, this.i, i8);
                            this.h = a4;
                            a(i8, this.a, a4, this.i, sArr4, i14, sArr4, i14 + i7);
                            this.i += i8;
                            i14 += i7 + i8;
                        }
                    }
                    if (this.e + i14 > i13) {
                        break;
                    }
                    f6 = 1.0f;
                    i12 = 1;
                }
                int i28 = this.g - i14;
                short[] sArr5 = this.f;
                int i29 = this.a;
                System.arraycopy(sArr5, i14 * i29, sArr5, 0, i29 * i28);
                this.g = i28;
                f6 = 1.0f;
            }
        }
        if (f5 != f6 && this.i != i11) {
            int i30 = this.r;
            int i31 = (int) (((float) i30) / f5);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.i - i11;
            short[] a5 = a(this.v, this.j, i32);
            this.v = a5;
            short[] sArr6 = this.h;
            int i33 = this.a;
            System.arraycopy(sArr6, i11 * i33, a5, this.j * i33, i33 * i32);
            this.i = i11;
            this.j += i32;
            int i34 = 0;
            while (true) {
                i2 = this.j;
                i3 = i2 - 1;
                if (i34 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.k + 1;
                    i5 = this.l;
                    if (i4 * i31 <= i5 * i30) {
                        break;
                    }
                    this.h = a(this.h, this.i, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.a;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.h;
                        int i37 = this.i;
                        short[] sArr8 = this.v;
                        int i38 = (i34 * i36) + i35;
                        short s2 = sArr8[i38];
                        short s3 = sArr8[i38 + i36];
                        int i39 = this.l;
                        int i40 = this.k;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s2 * i42) + ((i43 - i42) * s3)) / i43);
                        i35++;
                    }
                    this.l++;
                    this.i++;
                }
                this.k = i4;
                if (i4 == i30) {
                    this.k = 0;
                    bks.b(i5 == i31);
                    this.l = 0;
                }
                i34++;
            }
            if (i3 != 0) {
                short[] sArr9 = this.v;
                int i44 = this.a;
                System.arraycopy(sArr9, i3 * i44, sArr9, 0, (i2 - i3) * i44);
                this.j -= i3;
            }
        }
    }
}
