package p000;

import java.util.Arrays;

/* renamed from: anb */
/* compiled from: PG */
final class anb {

    /* renamed from: a */
    public final int f879a;

    /* renamed from: b */
    public final float f880b;

    /* renamed from: c */
    public final float f881c;

    /* renamed from: d */
    public final float f882d;

    /* renamed from: e */
    public final int f883e;

    /* renamed from: f */
    public short[] f884f;

    /* renamed from: g */
    public int f885g;

    /* renamed from: h */
    public short[] f886h;

    /* renamed from: i */
    public int f887i;

    /* renamed from: j */
    public int f888j;

    /* renamed from: k */
    public int f889k;

    /* renamed from: l */
    public int f890l;

    /* renamed from: m */
    public int f891m;

    /* renamed from: n */
    public int f892n;

    /* renamed from: o */
    public int f893o;

    /* renamed from: p */
    public int f894p;

    /* renamed from: q */
    public int f895q;

    /* renamed from: r */
    private final int f896r;

    /* renamed from: s */
    private final int f897s;

    /* renamed from: t */
    private final int f898t;

    /* renamed from: u */
    private final short[] f899u;

    /* renamed from: v */
    private short[] f900v;

    public anb(int i, int i2, float f, float f2, int i3) {
        this.f896r = i;
        this.f879a = i2;
        this.f880b = f;
        this.f881c = f2;
        this.f882d = ((float) i) / ((float) i3);
        this.f897s = i / 400;
        int i4 = i / 65;
        this.f898t = i4;
        int i5 = i4 + i4;
        this.f883e = i5;
        this.f899u = new short[i5];
        int i6 = i5 * i2;
        this.f884f = new short[i6];
        this.f886h = new short[i6];
        this.f900v = new short[i6];
    }

    /* renamed from: a */
    public final int mo685a() {
        int i = this.f887i * this.f879a;
        return i + i;
    }

    /* renamed from: b */
    private final void m1189b(short[] sArr, int i, int i2) {
        short[] a = mo686a(this.f886h, this.f887i, i2);
        this.f886h = a;
        int i3 = this.f879a;
        System.arraycopy(sArr, i * i3, a, this.f887i * i3, i3 * i2);
        this.f887i += i2;
    }

    /* renamed from: c */
    private final void m1190c(short[] sArr, int i, int i2) {
        int i3 = this.f883e / i2;
        int i4 = this.f879a;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f899u[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    public final short[] mo686a(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f879a;
        int i4 = length / i3;
        return i + i2 > i4 ? Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3) : sArr;
    }

    /* renamed from: a */
    private final int m1187a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f879a;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i6;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i9 * i8;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i9;
            }
            if (i13 > i14) {
                i8 = i2;
            }
            i2++;
        }
        this.f894p = i5 / i6;
        this.f895q = i7 / i8;
        return i6;
    }

    /* renamed from: a */
    private static void m1188a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: b */
    public final void mo687b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.f887i;
        float f = this.f880b;
        float f2 = this.f881c;
        float f3 = f / f2;
        float f4 = this.f882d * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i11 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            m1189b(this.f884f, 0, this.f885g);
            this.f885g = 0;
        } else {
            int i12 = this.f885g;
            if (i12 >= this.f883e) {
                int i13 = 0;
                while (true) {
                    int i14 = this.f891m;
                    if (i14 > 0) {
                        int min = Math.min(this.f883e, i14);
                        m1189b(this.f884f, i13, min);
                        this.f891m -= min;
                        i13 += min;
                    } else {
                        short[] sArr = this.f884f;
                        int i15 = this.f896r;
                        int i16 = i15 > 4000 ? i15 / 4000 : 1;
                        if (this.f879a == i11 && i16 == i11) {
                            i5 = m1187a(sArr, i13, this.f897s, this.f898t);
                        } else {
                            m1190c(sArr, i13, i16);
                            int a = m1187a(this.f899u, 0, this.f897s / i16, this.f898t / i16);
                            if (i16 != i11) {
                                int i17 = a * i16;
                                int i18 = i16 << 2;
                                int i19 = i17 - i18;
                                int i20 = i17 + i18;
                                int i21 = this.f897s;
                                if (i19 >= i21) {
                                    i21 = i19;
                                }
                                int i22 = this.f898t;
                                if (i20 > i22) {
                                    i20 = i22;
                                }
                                if (this.f879a != i11) {
                                    m1190c(sArr, i13, i11);
                                    i5 = m1187a(this.f899u, 0, i21, i20);
                                } else {
                                    i5 = m1187a(sArr, i13, i21, i20);
                                }
                            } else {
                                i5 = a;
                            }
                        }
                        int i23 = this.f894p;
                        int i24 = this.f895q;
                        if (i23 == 0 || (i9 = this.f892n) == 0 || i24 > i23 * 3 || i23 + i23 <= this.f893o * 3) {
                            i6 = i5;
                        } else {
                            i6 = i9;
                        }
                        this.f893o = i23;
                        this.f892n = i5;
                        if (d <= 1.0d) {
                            short[] sArr2 = this.f884f;
                            if (f3 >= 0.5f) {
                                this.f891m = (int) ((((float) i6) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i8 = i6;
                            } else {
                                i8 = (int) ((((float) i6) * f3) / (f5 - f3));
                            }
                            int i25 = i6 + i8;
                            short[] a2 = mo686a(this.f886h, this.f887i, i25);
                            this.f886h = a2;
                            int i26 = this.f879a;
                            System.arraycopy(sArr2, i13 * i26, a2, this.f887i * i26, i26 * i6);
                            short[] sArr3 = sArr2;
                            m1188a(i8, this.f879a, this.f886h, this.f887i + i6, sArr3, i13 + i6, sArr3, i13);
                            this.f887i += i25;
                            i13 += i8;
                        } else {
                            short[] sArr4 = this.f884f;
                            if (f3 < 2.0f) {
                                this.f891m = (int) ((((float) i6) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i6;
                            } else {
                                i7 = (int) (((float) i6) / (-1.0f + f3));
                            }
                            short[] a3 = mo686a(this.f886h, this.f887i, i7);
                            this.f886h = a3;
                            m1188a(i7, this.f879a, a3, this.f887i, sArr4, i13, sArr4, i13 + i6);
                            this.f887i += i7;
                            i13 += i6 + i7;
                        }
                    }
                    if (this.f883e + i13 > i12) {
                        break;
                    }
                    f5 = 1.0f;
                    i11 = 1;
                }
                int i27 = this.f885g - i13;
                short[] sArr5 = this.f884f;
                int i28 = this.f879a;
                System.arraycopy(sArr5, i13 * i28, sArr5, 0, i28 * i27);
                this.f885g = i27;
                f5 = 1.0f;
            }
        }
        if (f4 != f5 && this.f887i != i10) {
            int i29 = this.f896r;
            int i30 = (int) (((float) i29) / f4);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.f887i - i10;
            short[] a4 = mo686a(this.f900v, this.f888j, i31);
            this.f900v = a4;
            short[] sArr6 = this.f886h;
            int i32 = this.f879a;
            System.arraycopy(sArr6, i10 * i32, a4, this.f888j * i32, i32 * i31);
            this.f887i = i10;
            this.f888j += i31;
            int i33 = 0;
            while (true) {
                i = this.f888j;
                i2 = i - 1;
                if (i33 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f889k + 1;
                    i4 = this.f890l;
                    if (i3 * i30 <= i4 * i29) {
                        break;
                    }
                    this.f886h = mo686a(this.f886h, this.f887i, 1);
                    int i34 = 0;
                    while (true) {
                        int i35 = this.f879a;
                        if (i34 >= i35) {
                            break;
                        }
                        short[] sArr7 = this.f886h;
                        int i36 = this.f887i;
                        short[] sArr8 = this.f900v;
                        int i37 = (i33 * i35) + i34;
                        short s = sArr8[i37];
                        short s2 = sArr8[i37 + i35];
                        int i38 = this.f890l;
                        int i39 = this.f889k;
                        int i40 = (i39 + 1) * i30;
                        int i41 = i40 - (i38 * i29);
                        int i42 = i40 - (i39 * i30);
                        sArr7[(i36 * i35) + i34] = (short) (((s * i41) + ((i42 - i41) * s2)) / i42);
                        i34++;
                    }
                    this.f890l++;
                    this.f887i++;
                }
                this.f889k = i3;
                if (i3 == i29) {
                    this.f889k = 0;
                    bks.m3512b(i4 == i30);
                    this.f890l = 0;
                }
                i33++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f900v;
                int i43 = this.f879a;
                System.arraycopy(sArr9, i2 * i43, sArr9, 0, (i - i2) * i43);
                this.f888j -= i2;
            }
        }
    }
}
