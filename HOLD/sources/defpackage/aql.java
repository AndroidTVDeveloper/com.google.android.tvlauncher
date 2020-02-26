package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: aql  reason: default package */
/* compiled from: PG */
public final class aql implements aoi, aos {
    private final bky a;
    private final bky b;
    private final bky c;
    private final bky d;
    private final ArrayDeque e;
    private int f;
    private int g;
    private long h;
    private int i;
    private bky j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private aok o;
    private aqk[] p;
    private long[][] q;
    private int r;
    private long s;
    private boolean t;

    public aql() {
        this((byte) 0);
    }

    public final long b() {
        return this.s;
    }

    public final boolean d() {
        return true;
    }

    public aql(byte b2) {
        this.d = new bky(16);
        this.e = new ArrayDeque();
        this.a = new bky(bkw.a);
        this.b = new bky(4);
        this.c = new bky();
        this.k = -1;
    }

    private final void c() {
        this.f = 0;
        this.i = 0;
    }

    public final aoq d(long j2) {
        long j3;
        long j4;
        long j5;
        int b2;
        aqk[] aqkArr = this.p;
        if (aqkArr.length == 0) {
            return new aoq(aot.a);
        }
        int i2 = this.r;
        long j6 = -1;
        if (i2 == -1) {
            j4 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        } else {
            aqr aqr = aqkArr[i2].b;
            int a2 = a(aqr, j2);
            if (a2 == -1) {
                return new aoq(aot.a);
            }
            long j7 = aqr.f[a2];
            long j8 = aqr.c[a2];
            if (j7 >= j2 || a2 >= aqr.b - 1 || (b2 = aqr.b(j2)) == -1 || b2 == a2) {
                j5 = -9223372036854775807L;
            } else {
                j5 = aqr.f[b2];
                j6 = aqr.c[b2];
            }
            j2 = j7;
            j3 = j5;
            j4 = j8;
        }
        int i3 = 0;
        while (true) {
            aqk[] aqkArr2 = this.p;
            if (i3 >= aqkArr2.length) {
                break;
            }
            if (i3 != this.r) {
                aqr aqr2 = aqkArr2[i3].b;
                j4 = a(aqr2, j2, j4);
                if (j3 != -9223372036854775807L) {
                    j6 = a(aqr2, j3, j6);
                }
            }
            i3++;
        }
        aot aot = new aot(j2, j4);
        if (j3 == -9223372036854775807L) {
            return new aoq(aot);
        }
        return new aoq(aot, new aot(j3, j6));
    }

    private static int a(aqr aqr, long j2) {
        int a2 = aqr.a(j2);
        return a2 == -1 ? aqr.b(j2) : a2;
    }

    public final void a(aok aok) {
        this.o = aok;
    }

    private static long a(aqr aqr, long j2, long j3) {
        int a2 = a(aqr, j2);
        return a2 != -1 ? Math.min(aqr.c[a2], j3) : j3;
    }

    private final void b(long j2) {
        atw atw;
        long j3;
        int i2;
        int i3;
        aqo a2;
        while (!this.e.isEmpty() && ((aps) this.e.peek()).a == j2) {
            aps aps = (aps) this.e.pop();
            if (aps.d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                aom aom = new aom();
                apt a3 = aps.a(1969517665);
                atw atw2 = null;
                if (a3 != null) {
                    atw = aqb.a(a3, this.t);
                    if (atw != null) {
                        aom.a(atw);
                    }
                } else {
                    atw = null;
                }
                aps b2 = aps.b(1835365473);
                if (b2 != null) {
                    atw2 = aqb.a(b2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < aps.c.size(); i4++) {
                    aps aps2 = (aps) aps.c.get(i4);
                    if (aps2.d == 1953653099 && (a2 = aqb.a(aps2, aps.a(1836476516), -9223372036854775807L, null, this.t)) != null) {
                        aqr a4 = aqb.a(a2, aps2.b(1835297121).b(1835626086).b(1937007212), aom);
                        if (a4.b != 0) {
                            arrayList2.add(a4);
                        }
                    }
                }
                int size = arrayList2.size();
                long j4 = -9223372036854775807L;
                long j5 = -9223372036854775807L;
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    j3 = 0;
                    if (i5 >= size) {
                        break;
                    }
                    aqr aqr = (aqr) arrayList2.get(i5);
                    aqo aqo = aqr.a;
                    ArrayList arrayList3 = arrayList;
                    long j6 = aqo.e;
                    if (j6 == j4) {
                        j6 = aqr.h;
                    }
                    long max = Math.max(j5, j6);
                    int i7 = size;
                    aqk aqk = new aqk(aqo, aqr, this.o.a(i5, aqo.b));
                    int i8 = aqr.e;
                    akh akh = aqo.f;
                    long j7 = max;
                    int i9 = i5;
                    int i10 = i6;
                    Class cls = akh.C;
                    akh akh2 = new akh(akh.a, akh.b, akh.c, akh.d, akh.e, akh.f, akh.g, akh.h, akh.i, i8 + 30, akh.k, akh.l, akh.m, akh.n, akh.o, akh.p, akh.q, akh.r, akh.t, akh.s, akh.u, akh.v, akh.w, akh.x, akh.y, akh.z, akh.A, akh.B);
                    if (aqo.b == 2 && j6 > 0 && (i3 = aqr.b) > 1) {
                        akh2 = akh2.a(((float) i3) / (((float) j6) / 1000000.0f));
                    }
                    aqk.c.a(aqj.a(aqo.b, akh2, atw, atw2, aom));
                    if (aqo.b != 2) {
                        i2 = i10;
                    } else {
                        i2 = i10;
                        if (i2 == -1) {
                            i6 = arrayList3.size();
                            arrayList = arrayList3;
                            arrayList.add(aqk);
                            i5 = i9 + 1;
                            size = i7;
                            j5 = j7;
                            j4 = -9223372036854775807L;
                        }
                    }
                    i6 = i2;
                    arrayList = arrayList3;
                    arrayList.add(aqk);
                    i5 = i9 + 1;
                    size = i7;
                    j5 = j7;
                    j4 = -9223372036854775807L;
                }
                this.r = i6;
                this.s = j5;
                aqk[] aqkArr = (aqk[]) arrayList.toArray(new aqk[0]);
                this.p = aqkArr;
                int length = aqkArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < aqkArr.length; i11++) {
                    jArr[i11] = new long[aqkArr[i11].b.b];
                    jArr2[i11] = aqkArr[i11].b.f[0];
                }
                int i12 = 0;
                while (i12 < aqkArr.length) {
                    long j8 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < aqkArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j9 = jArr2[i14];
                            if (j9 <= j8) {
                                i13 = i14;
                                j8 = j9;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j3;
                    aqr aqr2 = aqkArr[i13].b;
                    j3 += (long) aqr2.d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = aqr2.f[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                this.q = jArr;
                this.o.S();
                this.o.a(this);
                this.e.clear();
                this.f = 2;
            } else if (!this.e.isEmpty()) {
                ((aps) this.e.peek()).a(aps);
            }
        }
        if (this.f != 2) {
            c();
        }
    }

    public final int a(aoj aoj, aop aop) {
        boolean z;
        boolean z2;
        aqk[] aqkArr;
        int i2;
        boolean z3;
        boolean z4;
        aoj aoj2 = aoj;
        aop aop2 = aop;
        while (true) {
            int i3 = this.f;
            if (i3 == 0) {
                if (this.i == 0) {
                    if (!aoj2.a(this.d.a, 0, 8, true)) {
                        return -1;
                    }
                    this.i = 8;
                    this.d.c(0);
                    this.h = this.d.h();
                    this.g = this.d.j();
                }
                long j2 = this.h;
                if (j2 == 1) {
                    aoj2.b(this.d.a, 8, 8);
                    this.i += 8;
                    this.h = this.d.p();
                } else if (j2 == 0) {
                    aof aof = (aof) aoj2;
                    long j3 = aof.b;
                    if (j3 == -1 && !this.e.isEmpty()) {
                        j3 = ((aps) this.e.peek()).a;
                    }
                    if (j3 != -1) {
                        this.h = (j3 - aof.c) + ((long) this.i);
                    }
                }
                long j4 = this.h;
                int i4 = this.i;
                long j5 = (long) i4;
                if (j4 >= j5) {
                    int i5 = this.g;
                    if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1701082227 || i5 == 1835365473) {
                        long j6 = (((aof) aoj2).c + j4) - j5;
                        this.e.push(new aps(i5, j6));
                        if (this.h != ((long) this.i)) {
                            if (this.g == 1835365473) {
                                this.c.a(8);
                                aoj2.c(this.c.a, 0, 8);
                                this.c.d(4);
                                if (this.c.j() == 1751411826) {
                                    aoj.a();
                                } else {
                                    aoj2.a(4);
                                }
                            }
                            c();
                        } else {
                            b(j6);
                        }
                    } else if (i5 == 1835296868 || i5 == 1836476516 || i5 == 1751411826 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1937011571 || i5 == 1668576371 || i5 == 1701606260 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1953196132 || i5 == 1718909296 || i5 == 1969517665 || i5 == 1801812339 || i5 == 1768715124) {
                        if (i4 == 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bks.b(z);
                        bks.b(this.h <= 2147483647L);
                        this.j = new bky((int) this.h);
                        System.arraycopy(this.d.a, 0, this.j.a, 0, 8);
                        this.f = 1;
                    } else {
                        this.j = null;
                        this.f = 1;
                    }
                } else {
                    throw new ako("Atom size less than header length (unsupported).");
                }
            } else if (i3 != 1) {
                long j7 = ((aof) aoj2).c;
                if (this.k == -1) {
                    long j8 = Long.MAX_VALUE;
                    long j9 = Long.MAX_VALUE;
                    long j10 = Long.MAX_VALUE;
                    boolean z5 = true;
                    int i6 = 0;
                    boolean z6 = true;
                    int i7 = -1;
                    int i8 = -1;
                    while (true) {
                        aqkArr = this.p;
                        if (i6 >= aqkArr.length) {
                            break;
                        }
                        aqk aqk = aqkArr[i6];
                        int i9 = aqk.d;
                        aqr aqr = aqk.b;
                        if (i9 != aqr.b) {
                            long j11 = aqr.c[i9];
                            long j12 = this.q[i6][i9];
                            long j13 = j11 - j7;
                            boolean z7 = j13 < 0 || j13 >= 262144;
                            if ((z7 || !z5) && (z7 != z5 || j13 >= j9)) {
                                j13 = j9;
                            } else {
                                i7 = i6;
                                z5 = z7;
                                j10 = j12;
                            }
                            if (j12 < j8) {
                                i8 = i6;
                                z6 = z7;
                                j8 = j12;
                            }
                            j9 = j13;
                        }
                        i6++;
                    }
                    if (j8 != Long.MAX_VALUE && z6 && j10 >= j8 + 10485760) {
                        i2 = i8;
                    } else {
                        i2 = i7;
                    }
                    this.k = i2;
                    if (i2 == -1) {
                        return -1;
                    }
                    this.n = "audio/ac4".equals(aqkArr[i2].a.f.i);
                }
                aqk aqk2 = this.p[this.k];
                aov aov = aqk2.c;
                int i10 = aqk2.d;
                aqr aqr2 = aqk2.b;
                long j14 = aqr2.c[i10];
                int i11 = aqr2.d[i10];
                long j15 = (j14 - j7) + ((long) this.l);
                if (j15 >= 0 && j15 < 262144) {
                    if (aqk2.a.g == 1) {
                        j15 += 8;
                        i11 -= 8;
                    }
                    aoj2.a((int) j15);
                    int i12 = aqk2.a.j;
                    if (i12 == 0) {
                        if (this.n) {
                            alp.a(i11, this.c);
                            bky bky = this.c;
                            int i13 = bky.c;
                            aov.a(bky, i13);
                            i11 += i13;
                            this.l += i13;
                            z2 = false;
                            this.n = false;
                        } else {
                            z2 = false;
                        }
                        while (true) {
                            int i14 = this.l;
                            if (i14 >= i11) {
                                break;
                            }
                            int a2 = aov.a(aoj2, i11 - i14, z2);
                            this.l += a2;
                            this.m -= a2;
                            z2 = false;
                        }
                    } else {
                        byte[] bArr = this.b.a;
                        boolean z8 = false;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i15 = 4 - i12;
                        while (this.l < i11) {
                            int i16 = this.m;
                            if (i16 != 0) {
                                int a3 = aov.a(aoj2, i16, z8);
                                this.l += a3;
                                this.m -= a3;
                                z8 = false;
                            } else {
                                aoj2.b(bArr, i15, i12);
                                this.b.c(0);
                                int j16 = this.b.j();
                                if (j16 >= 0) {
                                    this.m = j16;
                                    this.a.c(0);
                                    aov.a(this.a, 4);
                                    this.l += 4;
                                    i11 += i15;
                                    z8 = false;
                                } else {
                                    throw new ako("Invalid NAL length");
                                }
                            }
                        }
                    }
                    aqr aqr3 = aqk2.b;
                    aov.a(aqr3.f[i10], aqr3.g[i10], i11, 0, null);
                    aqk2.d++;
                    this.k = -1;
                    this.l = 0;
                    this.m = 0;
                    return 0;
                }
                aop2.a = j14;
                return 1;
            } else {
                long j17 = this.h;
                int i17 = this.i;
                long j18 = j17 - ((long) i17);
                long j19 = ((aof) aoj2).c + j18;
                bky bky2 = this.j;
                if (bky2 != null) {
                    aoj2.b(bky2.a, i17, (int) j18);
                    if (this.g != 1718909296) {
                        if (!this.e.isEmpty()) {
                            ((aps) this.e.peek()).a(new apt(this.g, this.j));
                        }
                        z3 = false;
                    } else {
                        bky bky3 = this.j;
                        bky3.c(8);
                        if (bky3.j() != 1903435808) {
                            bky3.d(4);
                            while (true) {
                                if (bky3.b() > 0) {
                                    if (bky3.j() == 1903435808) {
                                        break;
                                    }
                                } else {
                                    z4 = false;
                                    break;
                                }
                            }
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        this.t = z4;
                        z3 = false;
                    }
                } else if (j18 < 262144) {
                    aoj2.a((int) j18);
                    z3 = false;
                } else {
                    aop2.a = j19;
                    z3 = true;
                }
                b(j19);
                if (z3 && this.f != 2) {
                    return 1;
                }
            }
        }
    }

    public final void a(long j2, long j3) {
        this.e.clear();
        this.i = 0;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.n = false;
        if (j2 != 0) {
            aqk[] aqkArr = this.p;
            if (aqkArr != null) {
                for (aqk aqk : aqkArr) {
                    aqr aqr = aqk.b;
                    int a2 = aqr.a(j3);
                    if (a2 == -1) {
                        a2 = aqr.b(j3);
                    }
                    aqk.d = a2;
                }
                return;
            }
            return;
        }
        c();
    }

    public final boolean a(aoj aoj) {
        return aqn.a(aoj, false);
    }
}
