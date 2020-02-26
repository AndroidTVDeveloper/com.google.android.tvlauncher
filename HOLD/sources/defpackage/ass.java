package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: ass  reason: default package */
/* compiled from: PG */
public final class ass implements aoi {
    public final int a;
    public final List b;
    public final asv c;
    public final SparseArray d;
    public final SparseBooleanArray e;
    public final SparseBooleanArray f;
    public aok g;
    public int h;
    public boolean i;
    public asx j;
    public int k;
    private final bky l;
    private final SparseIntArray m;
    private final asp n;
    private boolean o;
    private boolean p;
    private int q;
    private aoc r;

    public ass() {
        this((byte) 0);
    }

    public ass(byte b2) {
        this(1, new blj(0), new arq((byte) 0));
    }

    public ass(int i2, blj blj, asv asv) {
        this.c = (asv) bks.a(asv);
        this.a = i2;
        this.b = Collections.singletonList(blj);
        this.l = new bky(new byte[9400], 0);
        this.e = new SparseBooleanArray();
        this.f = new SparseBooleanArray();
        this.d = new SparseArray();
        this.m = new SparseIntArray();
        this.n = new asp();
        this.k = -1;
        this.e.clear();
        this.d.clear();
        SparseArray a2 = this.c.a();
        int size = a2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.d.put(a2.keyAt(i3), (asx) a2.valueAt(i3));
        }
        this.d.put(0, new asl(new asq(this)));
        this.j = null;
    }

    public final void a(aok aok) {
        this.g = aok;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final int a(aoj aoj, aop aop) {
        boolean z;
        boolean z2;
        aoj aoj2;
        int i2;
        int i3;
        long j2;
        aop aop2;
        long j3;
        long j4;
        aoj aoj3 = aoj;
        aop aop3 = aop;
        aof aof = (aof) aoj3;
        long j5 = aof.b;
        if (this.i) {
            if (!(j5 == -1 || this.a == 2)) {
                asp asp = this.n;
                if (!asp.c) {
                    int i4 = this.k;
                    if (i4 <= 0) {
                        return asp.a(aoj3);
                    }
                    if (!asp.e) {
                        int min = (int) Math.min(112800L, j5);
                        long j6 = j5 - ((long) min);
                        if (aof.c == j6) {
                            asp.b.a(min);
                            aoj.a();
                            aoj3.c(asp.b.a, 0, min);
                            bky bky = asp.b;
                            int i5 = bky.b;
                            int i6 = bky.c - 1;
                            while (true) {
                                if (i6 < i5) {
                                    j4 = -9223372036854775807L;
                                    break;
                                }
                                if (bky.a[i6] == 71) {
                                    j4 = atc.a(bky, i6, i4);
                                    if (j4 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i6--;
                            }
                            asp.g = j4;
                            asp.e = true;
                            return 0;
                        }
                        aop3.a = j6;
                        return 1;
                    } else if (asp.g == -9223372036854775807L) {
                        return asp.a(aoj3);
                    } else {
                        if (!asp.d) {
                            int min2 = (int) Math.min(112800L, j5);
                            if (aof.c == 0) {
                                asp.b.a(min2);
                                aoj.a();
                                aoj3.c(asp.b.a, 0, min2);
                                bky bky2 = asp.b;
                                int i7 = bky2.b;
                                int i8 = bky2.c;
                                while (true) {
                                    if (i7 >= i8) {
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                    if (bky2.a[i7] == 71) {
                                        j3 = atc.a(bky2, i7, i4);
                                        if (j3 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i7++;
                                }
                                asp.f = j3;
                                asp.d = true;
                                return 0;
                            }
                            aop3.a = 0;
                            return 1;
                        }
                        long j7 = asp.f;
                        if (j7 == -9223372036854775807L) {
                            return asp.a(aoj3);
                        }
                        asp.h = asp.a.b(asp.g) - asp.a.b(j7);
                        return asp.a(aoj3);
                    }
                }
            }
            if (!this.o) {
                this.o = true;
                asp asp2 = this.n;
                long j8 = asp2.h;
                if (j8 != -9223372036854775807L) {
                    aoc aoc = r4;
                    j2 = 0;
                    aoc aoc2 = new aoc(asp2.a, j8, j5, this.k);
                    this.r = aoc;
                    this.g.a(aoc.a);
                    z2 = true;
                    z = false;
                } else {
                    j2 = 0;
                    z2 = true;
                    z = false;
                    this.g.a(new aor(j8));
                }
            } else {
                j2 = 0;
                z2 = true;
                z = false;
            }
            if (this.p) {
                this.p = z;
                a(j2, j2);
                if (aof.c == j2) {
                    aop2 = aop;
                } else {
                    aop.a = j2;
                    return z2 ? 1 : 0;
                }
            } else {
                aop2 = aop;
            }
            aoc aoc3 = this.r;
            if (aoc3 == null) {
                aoj2 = aoj;
            } else if (aoc3.a()) {
                return this.r.a(aoj, aop2);
            } else {
                aoj2 = aoj;
            }
        } else {
            aoj2 = aoj3;
            z2 = true;
            z = false;
        }
        bky bky3 = this.l;
        byte[] bArr = bky3.a;
        if (9400 - bky3.b < 188) {
            int b2 = bky3.b();
            if (b2 > 0) {
                System.arraycopy(bArr, this.l.b, bArr, z, b2);
            }
            this.l.a(bArr, b2);
        }
        while (this.l.b() < 188) {
            int i9 = this.l.c;
            int a2 = aoj2.a(bArr, i9, 9400 - i9);
            if (a2 == -1) {
                return -1;
            }
            this.l.b(i9 + a2);
        }
        bky bky4 = this.l;
        int i10 = bky4.b;
        int i11 = bky4.c;
        int a3 = atc.a(bky4.a, i10, i11);
        this.l.c(a3);
        int i12 = a3 + 188;
        if (i12 > i11) {
            int i13 = this.q + (a3 - i10);
            this.q = i13;
            i2 = 2;
            if (this.a == 2 && i13 > 376) {
                throw new ako("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i2 = 2;
            this.q = z;
        }
        bky bky5 = this.l;
        int i14 = bky5.c;
        if (i12 <= i14) {
            int j9 = bky5.j();
            if ((8388608 & j9) == 0) {
                int i15 = (4194304 & j9) != 0 ? 1 : 0;
                int i16 = (j9 >> 8) & 8191;
                int i17 = j9 & 32;
                asx asx = (j9 & 16) != 0 ? (asx) this.d.get(i16) : null;
                if (asx == null) {
                    this.l.c(i12);
                    return z;
                }
                if (this.a != i2) {
                    int i18 = j9 & 15;
                    int i19 = this.m.get(i16, i18 - 1);
                    this.m.put(i16, i18);
                    if (i19 == i18) {
                        this.l.c(i12);
                        return z;
                    } else if (i18 != ((i19 + (z2 ? 1 : 0)) & 15)) {
                        asx.a();
                    }
                }
                if (i17 != 0) {
                    int d2 = this.l.d();
                    if ((this.l.d() & 64) != 0) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    i15 |= i3;
                    this.l.d(d2 - 1);
                }
                boolean z3 = this.i;
                if (this.a == i2 || z3 || !this.f.get(i16, z)) {
                    this.l.b(i12);
                    asx.a(this.l, i15);
                    this.l.b(i14);
                }
                if (this.a != i2 && !z3 && this.i && j5 != -1) {
                    this.p = z2;
                }
                this.l.c(i12);
                return z;
            }
            this.l.c(i12);
        }
        return z ? 1 : 0;
    }

    public final void a(long j2, long j3) {
        aoc aoc;
        bks.b(this.a != 2);
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            blj blj = (blj) this.b.get(i2);
            if (blj.a() == -9223372036854775807L || !(blj.a() == 0 || blj.a == j3)) {
                blj.b();
                blj.a(j3);
            }
        }
        if (!(j3 == 0 || (aoc = this.r) == null)) {
            aoc.a(j3);
        }
        this.l.a();
        this.m.clear();
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            ((asx) this.d.valueAt(i3)).a();
        }
        this.q = 0;
    }

    public final boolean a(aoj aoj) {
        byte[] bArr = this.l.a;
        aoj.c(bArr, 0, 940);
        int i2 = 0;
        while (i2 < 188) {
            int i3 = 0;
            while (i3 < 5) {
                if (bArr[(i3 * 188) + i2] != 71) {
                    i2++;
                } else {
                    i3++;
                }
            }
            aoj.a(i2);
            return true;
        }
        return false;
    }
}
