package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: aql */
/* compiled from: PG */
public final class aql implements aoi, aos {

    /* renamed from: a */
    private final bky f1843a;

    /* renamed from: b */
    private final bky f1844b;

    /* renamed from: c */
    private final bky f1845c;

    /* renamed from: d */
    private final bky f1846d;

    /* renamed from: e */
    private final ArrayDeque f1847e;

    /* renamed from: f */
    private int f1848f;

    /* renamed from: g */
    private int f1849g;

    /* renamed from: h */
    private long f1850h;

    /* renamed from: i */
    private int f1851i;

    /* renamed from: j */
    private bky f1852j;

    /* renamed from: k */
    private int f1853k;

    /* renamed from: l */
    private int f1854l;

    /* renamed from: m */
    private int f1855m;

    /* renamed from: n */
    private boolean f1856n;

    /* renamed from: o */
    private aok f1857o;

    /* renamed from: p */
    private aqk[] f1858p;

    /* renamed from: q */
    private long[][] f1859q;

    /* renamed from: r */
    private int f1860r;

    /* renamed from: s */
    private long f1861s;

    /* renamed from: t */
    private boolean f1862t;

    public aql() {
        this((byte) 0);
    }

    /* renamed from: b */
    public final long mo1175b() {
        return this.f1861s;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return true;
    }

    public aql(byte b) {
        this.f1846d = new bky(16);
        this.f1847e = new ArrayDeque();
        this.f1843a = new bky(bkw.f4250a);
        this.f1844b = new bky(4);
        this.f1845c = new bky();
        this.f1853k = -1;
    }

    /* renamed from: c */
    private final void m1818c() {
        this.f1848f = 0;
        this.f1851i = 0;
    }

    /* renamed from: d */
    public final aoq mo1176d(long j) {
        long j2;
        long j3;
        long j4;
        int b;
        aqk[] aqkArr = this.f1858p;
        if (aqkArr.length == 0) {
            return new aoq(aot.f1519a);
        }
        int i = this.f1860r;
        long j5 = -1;
        if (i == -1) {
            j3 = Long.MAX_VALUE;
            j2 = -9223372036854775807L;
        } else {
            aqr aqr = aqkArr[i].f1840b;
            int a = m1815a(aqr, j);
            if (a == -1) {
                return new aoq(aot.f1519a);
            }
            long j6 = aqr.f1904f[a];
            long j7 = aqr.f1901c[a];
            if (j6 >= j || a >= aqr.f1900b - 1 || (b = aqr.mo1265b(j)) == -1 || b == a) {
                j4 = -9223372036854775807L;
            } else {
                j4 = aqr.f1904f[b];
                j5 = aqr.f1901c[b];
            }
            j = j6;
            j2 = j4;
            j3 = j7;
        }
        int i2 = 0;
        while (true) {
            aqk[] aqkArr2 = this.f1858p;
            if (i2 >= aqkArr2.length) {
                break;
            }
            if (i2 != this.f1860r) {
                aqr aqr2 = aqkArr2[i2].f1840b;
                j3 = m1816a(aqr2, j, j3);
                if (j2 != -9223372036854775807L) {
                    j5 = m1816a(aqr2, j2, j5);
                }
            }
            i2++;
        }
        aot aot = new aot(j, j3);
        if (j2 == -9223372036854775807L) {
            return new aoq(aot);
        }
        return new aoq(aot, new aot(j2, j5));
    }

    /* renamed from: a */
    private static int m1815a(aqr aqr, long j) {
        int a = aqr.mo1264a(j);
        return a == -1 ? aqr.mo1265b(j) : a;
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1857o = aok;
    }

    /* renamed from: a */
    private static long m1816a(aqr aqr, long j, long j2) {
        int a = m1815a(aqr, j);
        return a != -1 ? Math.min(aqr.f1901c[a], j2) : j2;
    }

    /* renamed from: b */
    private final void m1817b(long j) {
        atw atw;
        long j2;
        int i;
        int i2;
        aqo a;
        while (!this.f1847e.isEmpty() && ((aps) this.f1847e.peek()).f1731a == j) {
            aps aps = (aps) this.f1847e.pop();
            if (aps.f1735d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                aom aom = new aom();
                apt a2 = aps.mo1235a(1969517665);
                atw atw2 = null;
                if (a2 != null) {
                    atw = aqb.m1790a(a2, this.f1862t);
                    if (atw != null) {
                        aom.mo1213a(atw);
                    }
                } else {
                    atw = null;
                }
                aps b = aps.mo1238b(1835365473);
                if (b != null) {
                    atw2 = aqb.m1789a(b);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < aps.f1733c.size(); i3++) {
                    aps aps2 = (aps) aps.f1733c.get(i3);
                    if (aps2.f1735d == 1953653099 && (a = aqb.m1787a(aps2, aps.mo1235a(1836476516), -9223372036854775807L, null, this.f1862t)) != null) {
                        aqr a3 = aqb.m1788a(a, aps2.mo1238b(1835297121).mo1238b(1835626086).mo1238b(1937007212), aom);
                        if (a3.f1900b != 0) {
                            arrayList2.add(a3);
                        }
                    }
                }
                int size = arrayList2.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    aqr aqr = (aqr) arrayList2.get(i4);
                    aqo aqo = aqr.f1899a;
                    ArrayList arrayList3 = arrayList;
                    long j5 = aqo.f1869e;
                    if (j5 == j3) {
                        j5 = aqr.f1906h;
                    }
                    long max = Math.max(j4, j5);
                    int i6 = size;
                    aqk aqk = new aqk(aqo, aqr, this.f1857o.mo1211a(i4, aqo.f1866b));
                    int i7 = aqr.f1903e;
                    akh akh = aqo.f1870f;
                    long j6 = max;
                    int i8 = i4;
                    int i9 = i5;
                    Class cls = akh.f546C;
                    akh akh2 = new akh(akh.f548a, akh.f549b, akh.f550c, akh.f551d, akh.f552e, akh.f553f, akh.f554g, akh.f555h, akh.f556i, i7 + 30, akh.f558k, akh.f559l, akh.f560m, akh.f561n, akh.f562o, akh.f563p, akh.f564q, akh.f565r, akh.f567t, akh.f566s, akh.f568u, akh.f569v, akh.f570w, akh.f571x, akh.f572y, akh.f573z, akh.f544A, akh.f545B);
                    if (aqo.f1866b == 2 && j5 > 0 && (i2 = aqr.f1900b) > 1) {
                        akh2 = akh2.mo419a(((float) i2) / (((float) j5) / 1000000.0f));
                    }
                    aqk.f1841c.mo1204a(aqj.m1808a(aqo.f1866b, akh2, atw, atw2, aom));
                    if (aqo.f1866b != 2) {
                        i = i9;
                    } else {
                        i = i9;
                        if (i == -1) {
                            i5 = arrayList3.size();
                            arrayList = arrayList3;
                            arrayList.add(aqk);
                            i4 = i8 + 1;
                            size = i6;
                            j4 = j6;
                            j3 = -9223372036854775807L;
                        }
                    }
                    i5 = i;
                    arrayList = arrayList3;
                    arrayList.add(aqk);
                    i4 = i8 + 1;
                    size = i6;
                    j4 = j6;
                    j3 = -9223372036854775807L;
                }
                this.f1860r = i5;
                this.f1861s = j4;
                aqk[] aqkArr = (aqk[]) arrayList.toArray(new aqk[0]);
                this.f1858p = aqkArr;
                int length = aqkArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i10 = 0; i10 < aqkArr.length; i10++) {
                    jArr[i10] = new long[aqkArr[i10].f1840b.f1900b];
                    jArr2[i10] = aqkArr[i10].f1840b.f1904f[0];
                }
                int i11 = 0;
                while (i11 < aqkArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < aqkArr.length; i13++) {
                        if (!zArr[i13]) {
                            long j8 = jArr2[i13];
                            if (j8 <= j7) {
                                i12 = i13;
                                j7 = j8;
                            }
                        }
                    }
                    int i14 = iArr[i12];
                    long[] jArr3 = jArr[i12];
                    jArr3[i14] = j2;
                    aqr aqr2 = aqkArr[i12].f1840b;
                    j2 += (long) aqr2.f1902d[i14];
                    int i15 = i14 + 1;
                    iArr[i12] = i15;
                    if (i15 < jArr3.length) {
                        jArr2[i12] = aqr2.f1904f[i15];
                    } else {
                        zArr[i12] = true;
                        i11++;
                    }
                }
                this.f1859q = jArr;
                this.f1857o.mo1210S();
                this.f1857o.mo1212a(this);
                this.f1847e.clear();
                this.f1848f = 2;
            } else if (!this.f1847e.isEmpty()) {
                ((aps) this.f1847e.peek()).mo1236a(aps);
            }
        }
        if (this.f1848f != 2) {
            m1818c();
        }
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        boolean z;
        boolean z2;
        aqk[] aqkArr;
        int i;
        boolean z3;
        boolean z4;
        aoj aoj2 = aoj;
        aop aop2 = aop;
        while (true) {
            int i2 = this.f1848f;
            if (i2 == 0) {
                if (this.f1851i == 0) {
                    if (!aoj2.mo1193a(this.f1846d.f4258a, 0, 8, true)) {
                        return -1;
                    }
                    this.f1851i = 8;
                    this.f1846d.mo2073c(0);
                    this.f1850h = this.f1846d.mo2081h();
                    this.f1849g = this.f1846d.mo2083j();
                }
                long j = this.f1850h;
                if (j == 1) {
                    aoj2.mo1196b(this.f1846d.f4258a, 8, 8);
                    this.f1851i += 8;
                    this.f1850h = this.f1846d.mo2089p();
                } else if (j == 0) {
                    aof aof = (aof) aoj2;
                    long j2 = aof.f1489b;
                    if (j2 == -1 && !this.f1847e.isEmpty()) {
                        j2 = ((aps) this.f1847e.peek()).f1731a;
                    }
                    if (j2 != -1) {
                        this.f1850h = (j2 - aof.f1490c) + ((long) this.f1851i);
                    }
                }
                long j3 = this.f1850h;
                int i3 = this.f1851i;
                long j4 = (long) i3;
                if (j3 >= j4) {
                    int i4 = this.f1849g;
                    if (i4 == 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1701082227 || i4 == 1835365473) {
                        long j5 = (((aof) aoj2).f1490c + j3) - j4;
                        this.f1847e.push(new aps(i4, j5));
                        if (this.f1850h != ((long) this.f1851i)) {
                            if (this.f1849g == 1835365473) {
                                this.f1845c.mo2065a(8);
                                aoj2.mo1199c(this.f1845c.f4258a, 0, 8);
                                this.f1845c.mo2075d(4);
                                if (this.f1845c.mo2083j() == 1751411826) {
                                    aoj.mo1191a();
                                } else {
                                    aoj2.mo1192a(4);
                                }
                            }
                            m1818c();
                        } else {
                            m1817b(j5);
                        }
                    } else if (i4 == 1835296868 || i4 == 1836476516 || i4 == 1751411826 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1937011571 || i4 == 1668576371 || i4 == 1701606260 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1953196132 || i4 == 1718909296 || i4 == 1969517665 || i4 == 1801812339 || i4 == 1768715124) {
                        if (i3 == 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bks.m3512b(z);
                        bks.m3512b(this.f1850h <= 2147483647L);
                        this.f1852j = new bky((int) this.f1850h);
                        System.arraycopy(this.f1846d.f4258a, 0, this.f1852j.f4258a, 0, 8);
                        this.f1848f = 1;
                    } else {
                        this.f1852j = null;
                        this.f1848f = 1;
                    }
                } else {
                    throw new ako("Atom size less than header length (unsupported).");
                }
            } else if (i2 != 1) {
                long j6 = ((aof) aoj2).f1490c;
                if (this.f1853k == -1) {
                    long j7 = Long.MAX_VALUE;
                    long j8 = Long.MAX_VALUE;
                    long j9 = Long.MAX_VALUE;
                    boolean z5 = true;
                    int i5 = 0;
                    boolean z6 = true;
                    int i6 = -1;
                    int i7 = -1;
                    while (true) {
                        aqkArr = this.f1858p;
                        if (i5 >= aqkArr.length) {
                            break;
                        }
                        aqk aqk = aqkArr[i5];
                        int i8 = aqk.f1842d;
                        aqr aqr = aqk.f1840b;
                        if (i8 != aqr.f1900b) {
                            long j10 = aqr.f1901c[i8];
                            long j11 = this.f1859q[i5][i8];
                            long j12 = j10 - j6;
                            boolean z7 = j12 < 0 || j12 >= 262144;
                            if ((z7 || !z5) && (z7 != z5 || j12 >= j8)) {
                                j12 = j8;
                            } else {
                                i6 = i5;
                                z5 = z7;
                                j9 = j11;
                            }
                            if (j11 < j7) {
                                i7 = i5;
                                z6 = z7;
                                j7 = j11;
                            }
                            j8 = j12;
                        }
                        i5++;
                    }
                    if (j7 != Long.MAX_VALUE && z6 && j9 >= j7 + 10485760) {
                        i = i7;
                    } else {
                        i = i6;
                    }
                    this.f1853k = i;
                    if (i == -1) {
                        return -1;
                    }
                    this.f1856n = "audio/ac4".equals(aqkArr[i].f1839a.f1870f.f556i);
                }
                aqk aqk2 = this.f1858p[this.f1853k];
                aov aov = aqk2.f1841c;
                int i9 = aqk2.f1842d;
                aqr aqr2 = aqk2.f1840b;
                long j13 = aqr2.f1901c[i9];
                int i10 = aqr2.f1902d[i9];
                long j14 = (j13 - j6) + ((long) this.f1854l);
                if (j14 >= 0 && j14 < 262144) {
                    if (aqk2.f1839a.f1871g == 1) {
                        j14 += 8;
                        i10 -= 8;
                    }
                    aoj2.mo1192a((int) j14);
                    int i11 = aqk2.f1839a.f1874j;
                    if (i11 == 0) {
                        if (this.f1856n) {
                            alp.m1040a(i10, this.f1845c);
                            bky bky = this.f1845c;
                            int i12 = bky.f4260c;
                            aov.mo1205a(bky, i12);
                            i10 += i12;
                            this.f1854l += i12;
                            z2 = false;
                            this.f1856n = false;
                        } else {
                            z2 = false;
                        }
                        while (true) {
                            int i13 = this.f1854l;
                            if (i13 >= i10) {
                                break;
                            }
                            int a = aov.mo1202a(aoj2, i10 - i13, z2);
                            this.f1854l += a;
                            this.f1855m -= a;
                            z2 = false;
                        }
                    } else {
                        byte[] bArr = this.f1844b.f4258a;
                        boolean z8 = false;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i14 = 4 - i11;
                        while (this.f1854l < i10) {
                            int i15 = this.f1855m;
                            if (i15 != 0) {
                                int a2 = aov.mo1202a(aoj2, i15, z8);
                                this.f1854l += a2;
                                this.f1855m -= a2;
                                z8 = false;
                            } else {
                                aoj2.mo1196b(bArr, i14, i11);
                                this.f1844b.mo2073c(0);
                                int j15 = this.f1844b.mo2083j();
                                if (j15 >= 0) {
                                    this.f1855m = j15;
                                    this.f1843a.mo2073c(0);
                                    aov.mo1205a(this.f1843a, 4);
                                    this.f1854l += 4;
                                    i10 += i14;
                                    z8 = false;
                                } else {
                                    throw new ako("Invalid NAL length");
                                }
                            }
                        }
                    }
                    aqr aqr3 = aqk2.f1840b;
                    aov.mo1203a(aqr3.f1904f[i9], aqr3.f1905g[i9], i10, 0, null);
                    aqk2.f1842d++;
                    this.f1853k = -1;
                    this.f1854l = 0;
                    this.f1855m = 0;
                    return 0;
                }
                aop2.f1514a = j13;
                return 1;
            } else {
                long j16 = this.f1850h;
                int i16 = this.f1851i;
                long j17 = j16 - ((long) i16);
                long j18 = ((aof) aoj2).f1490c + j17;
                bky bky2 = this.f1852j;
                if (bky2 != null) {
                    aoj2.mo1196b(bky2.f4258a, i16, (int) j17);
                    if (this.f1849g != 1718909296) {
                        if (!this.f1847e.isEmpty()) {
                            ((aps) this.f1847e.peek()).mo1237a(new apt(this.f1849g, this.f1852j));
                        }
                        z3 = false;
                    } else {
                        bky bky3 = this.f1852j;
                        bky3.mo2073c(8);
                        if (bky3.mo2083j() != 1903435808) {
                            bky3.mo2075d(4);
                            while (true) {
                                if (bky3.mo2070b() > 0) {
                                    if (bky3.mo2083j() == 1903435808) {
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
                        this.f1862t = z4;
                        z3 = false;
                    }
                } else if (j17 < 262144) {
                    aoj2.mo1192a((int) j17);
                    z3 = false;
                } else {
                    aop2.f1514a = j18;
                    z3 = true;
                }
                m1817b(j18);
                if (z3 && this.f1848f != 2) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1847e.clear();
        this.f1851i = 0;
        this.f1853k = -1;
        this.f1854l = 0;
        this.f1855m = 0;
        this.f1856n = false;
        if (j != 0) {
            aqk[] aqkArr = this.f1858p;
            if (aqkArr != null) {
                for (aqk aqk : aqkArr) {
                    aqr aqr = aqk.f1840b;
                    int a = aqr.mo1264a(j2);
                    if (a == -1) {
                        a = aqr.mo1265b(j2);
                    }
                    aqk.f1842d = a;
                }
                return;
            }
            return;
        }
        m1818c();
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        return aqn.m1826a(aoj, false);
    }
}
