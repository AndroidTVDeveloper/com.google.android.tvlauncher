package defpackage;

import android.util.Log;
import java.util.Collections;

/* renamed from: asa  reason: default package */
/* compiled from: PG */
public final class asa implements art {
    private final asm a;
    private String b;
    private aov c;
    private arz d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final ase g = new ase(32);
    private final ase h = new ase(33);
    private final ase i = new ase(34);
    private final ase j = new ase(39);
    private final ase k = new ase(40);
    private long l;
    private long m;
    private final bky n = new bky();

    public asa(asm asm) {
        this.a = asm;
    }

    public final void b() {
    }

    public final void a(bky bky) {
        int i2;
        long j2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        long j3;
        int i6;
        boolean z;
        float f2;
        int i7;
        while (true) {
            bky bky2 = bky;
            if (bky.b() > 0) {
                int i8 = bky2.b;
                int i9 = bky2.c;
                byte[] bArr2 = bky2.a;
                this.l += (long) bky.b();
                this.c.a(bky2, bky.b());
                while (i8 < i9) {
                    int a2 = bkw.a(bArr2, i8, i9, this.f);
                    if (a2 != i9) {
                        int c2 = bkw.c(bArr2, a2);
                        int i10 = a2 - i8;
                        if (i10 > 0) {
                            a(bArr2, i8, a2);
                        }
                        int i11 = i9 - a2;
                        long j4 = this.l - ((long) i11);
                        if (i10 < 0) {
                            i2 = -i10;
                        } else {
                            i2 = 0;
                        }
                        long j5 = this.m;
                        if (!this.e) {
                            this.g.b(i2);
                            this.h.b(i2);
                            this.i.b(i2);
                            ase ase = this.g;
                            if (ase.a) {
                                ase ase2 = this.h;
                                if (ase2.a) {
                                    ase ase3 = this.i;
                                    if (ase3.a) {
                                        aov aov = this.c;
                                        String str = this.b;
                                        i5 = i9;
                                        int i12 = ase.c;
                                        bArr = bArr2;
                                        i4 = a2;
                                        byte[] bArr3 = new byte[(ase2.c + i12 + ase3.c)];
                                        i3 = c2;
                                        System.arraycopy(ase.b, 0, bArr3, 0, i12);
                                        j2 = j5;
                                        System.arraycopy(ase2.b, 0, bArr3, ase.c, ase2.c);
                                        System.arraycopy(ase3.b, 0, bArr3, ase.c + ase2.c, ase3.c);
                                        bkz bkz = new bkz(ase2.b, 0, ase2.c);
                                        bkz.a(44);
                                        int c3 = bkz.c(3);
                                        bkz.a();
                                        bkz.a(88);
                                        bkz.a(8);
                                        int i13 = 0;
                                        for (int i14 = 0; i14 < c3; i14++) {
                                            if (bkz.b()) {
                                                i13 += 89;
                                            }
                                            if (bkz.b()) {
                                                i13 += 8;
                                            }
                                        }
                                        bkz.a(i13);
                                        if (c3 > 0) {
                                            int i15 = 8 - c3;
                                            bkz.a(i15 + i15);
                                        }
                                        bkz.e();
                                        int e2 = bkz.e();
                                        if (e2 == 3) {
                                            bkz.a();
                                        }
                                        int e3 = bkz.e();
                                        int e4 = bkz.e();
                                        if (bkz.b()) {
                                            int e5 = bkz.e();
                                            int e6 = bkz.e();
                                            int e7 = bkz.e();
                                            int e8 = bkz.e();
                                            e3 -= ((e2 == 1 || e2 == 2) ? 2 : 1) * (e5 + e6);
                                            e4 -= (e2 == 1 ? 2 : 1) * (e7 + e8);
                                        }
                                        int i16 = e3;
                                        bkz.e();
                                        bkz.e();
                                        int e9 = bkz.e();
                                        for (int i17 = bkz.b() ? 0 : c3; i17 <= c3; i17++) {
                                            bkz.e();
                                            bkz.e();
                                            bkz.e();
                                        }
                                        bkz.e();
                                        bkz.e();
                                        bkz.e();
                                        bkz.e();
                                        bkz.e();
                                        bkz.e();
                                        if (bkz.b() && bkz.b()) {
                                            int i18 = 0;
                                            while (true) {
                                                int i19 = 4;
                                                if (i18 >= 4) {
                                                    break;
                                                }
                                                int i20 = 0;
                                                while (i20 < 6) {
                                                    if (bkz.b()) {
                                                        int min = Math.min(64, 1 << ((i18 + i18) + i19));
                                                        if (i18 > 1) {
                                                            bkz.d();
                                                        }
                                                        for (int i21 = 0; i21 < min; i21++) {
                                                            bkz.d();
                                                        }
                                                    } else {
                                                        bkz.e();
                                                    }
                                                    i20 += i18 == 3 ? 3 : 1;
                                                    i19 = 4;
                                                }
                                                i18++;
                                            }
                                        }
                                        bkz.a(2);
                                        if (bkz.b()) {
                                            bkz.a(8);
                                            bkz.e();
                                            bkz.e();
                                            bkz.a();
                                        }
                                        int e10 = bkz.e();
                                        int i22 = 0;
                                        boolean z2 = false;
                                        int i23 = 0;
                                        while (i22 < e10) {
                                            if (i22 != 0) {
                                                z2 = bkz.b();
                                            }
                                            if (!z2) {
                                                int e11 = bkz.e();
                                                int e12 = bkz.e();
                                                int i24 = e11 + e12;
                                                i7 = e10;
                                                for (int i25 = 0; i25 < e11; i25++) {
                                                    bkz.e();
                                                    bkz.a();
                                                }
                                                for (int i26 = 0; i26 < e12; i26++) {
                                                    bkz.e();
                                                    bkz.a();
                                                }
                                                i23 = i24;
                                            } else {
                                                i7 = e10;
                                                bkz.a();
                                                bkz.e();
                                                for (int i27 = 0; i27 <= i23; i27++) {
                                                    if (bkz.b()) {
                                                        bkz.a();
                                                    }
                                                }
                                            }
                                            i22++;
                                            e10 = i7;
                                        }
                                        if (bkz.b()) {
                                            for (int i28 = 0; i28 < bkz.e(); i28++) {
                                                bkz.a(e9 + 5);
                                            }
                                        }
                                        bkz.a(2);
                                        if (bkz.b() && bkz.b()) {
                                            int c4 = bkz.c(8);
                                            if (c4 == 255) {
                                                int c5 = bkz.c(16);
                                                int c6 = bkz.c(16);
                                                if (!(c5 == 0 || c6 == 0)) {
                                                    f2 = ((float) c5) / ((float) c6);
                                                }
                                            } else if (c4 >= bkw.b.length) {
                                                StringBuilder sb = new StringBuilder(46);
                                                sb.append("Unexpected aspect_ratio_idc value: ");
                                                sb.append(c4);
                                                Log.w("H265Reader", sb.toString());
                                                f2 = 1.0f;
                                            } else {
                                                f2 = bkw.b[c4];
                                            }
                                            aov.a(akh.a(str, "video/hevc", null, i16, e4, Collections.singletonList(bArr3), f2));
                                            this.e = true;
                                        }
                                        f2 = 1.0f;
                                        aov.a(akh.a(str, "video/hevc", null, i16, e4, Collections.singletonList(bArr3), f2));
                                        this.e = true;
                                    }
                                }
                            }
                            i5 = i9;
                            bArr = bArr2;
                            i4 = a2;
                            i3 = c2;
                            j2 = j5;
                        } else {
                            i5 = i9;
                            bArr = bArr2;
                            i4 = a2;
                            i3 = c2;
                            j2 = j5;
                            arz arz = this.d;
                            if (arz.i && arz.f) {
                                arz.l = arz.b;
                                arz.i = false;
                            } else if (arz.g || arz.f) {
                                if (arz.h) {
                                    arz.a(((int) (j4 - arz.a)) + i11);
                                }
                                arz.j = arz.a;
                                arz.k = arz.d;
                                arz.h = true;
                                arz.l = arz.b;
                            }
                        }
                        if (this.j.b(i2)) {
                            ase ase4 = this.j;
                            this.n.a(this.j.b, bkw.a(ase4.b, ase4.c));
                            this.n.d(5);
                            j3 = j2;
                            this.a.a(j3, this.n);
                        } else {
                            j3 = j2;
                        }
                        if (this.k.b(i2)) {
                            ase ase5 = this.k;
                            this.n.a(this.k.b, bkw.a(ase5.b, ase5.c));
                            this.n.d(5);
                            this.a.a(j3, this.n);
                        }
                        long j6 = this.m;
                        if (this.e) {
                            arz arz2 = this.d;
                            arz2.f = false;
                            arz2.g = false;
                            arz2.d = j6;
                            arz2.c = 0;
                            arz2.a = j4;
                            i6 = i3;
                            if (i6 >= 32) {
                                if (!arz2.i && arz2.h) {
                                    arz2.a(i11);
                                    arz2.h = false;
                                }
                                if (i6 <= 34) {
                                    z = true;
                                    arz2.g = !arz2.i;
                                    arz2.i = true;
                                } else {
                                    z = true;
                                }
                            } else {
                                z = true;
                            }
                            boolean z3 = i6 >= 16 && i6 <= 21;
                            arz2.b = z3;
                            if (!z3 && i6 > 9) {
                                z = false;
                            }
                            arz2.e = z;
                        } else {
                            i6 = i3;
                            this.g.a(i6);
                            this.h.a(i6);
                            this.i.a(i6);
                        }
                        this.j.a(i6);
                        this.k.a(i6);
                        i8 = i4 + 3;
                        i9 = i5;
                        bArr2 = bArr;
                    } else {
                        a(bArr2, i8, i9);
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.b = asw.c();
        this.c = aok.a(asw.b(), 2);
        this.d = new arz(this.c);
        this.a.a(aok, asw);
    }

    private final void a(byte[] bArr, int i2, int i3) {
        boolean z;
        if (!this.e) {
            this.g.a(bArr, i2, i3);
            this.h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        } else {
            arz arz = this.d;
            if (arz.e) {
                int i4 = arz.c;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    if ((bArr[i5] & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arz.f = z;
                    arz.e = false;
                } else {
                    arz.c = i4 + (i3 - i2);
                }
            }
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    public final void a(long j2, int i2) {
        this.m = j2;
    }

    public final void a() {
        bkw.a(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        arz arz = this.d;
        arz.e = false;
        arz.f = false;
        arz.g = false;
        arz.h = false;
        arz.i = false;
        this.l = 0;
    }
}
