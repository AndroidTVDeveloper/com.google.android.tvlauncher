package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: ass */
/* compiled from: PG */
public final class ass implements aoi {

    /* renamed from: a */
    public final int f2282a;

    /* renamed from: b */
    public final List f2283b;

    /* renamed from: c */
    public final asv f2284c;

    /* renamed from: d */
    public final SparseArray f2285d;

    /* renamed from: e */
    public final SparseBooleanArray f2286e;

    /* renamed from: f */
    public final SparseBooleanArray f2287f;

    /* renamed from: g */
    public aok f2288g;

    /* renamed from: h */
    public int f2289h;

    /* renamed from: i */
    public boolean f2290i;

    /* renamed from: j */
    public asx f2291j;

    /* renamed from: k */
    public int f2292k;

    /* renamed from: l */
    private final bky f2293l;

    /* renamed from: m */
    private final SparseIntArray f2294m;

    /* renamed from: n */
    private final asp f2295n;

    /* renamed from: o */
    private boolean f2296o;

    /* renamed from: p */
    private boolean f2297p;

    /* renamed from: q */
    private int f2298q;

    /* renamed from: r */
    private aoc f2299r;

    public ass() {
        this((byte) 0);
    }

    public ass(byte b) {
        this(1, new blj(0), new arq((byte) 0));
    }

    public ass(int i, blj blj, asv asv) {
        this.f2284c = (asv) bks.m3507a(asv);
        this.f2282a = i;
        this.f2283b = Collections.singletonList(blj);
        this.f2293l = new bky(new byte[9400], 0);
        this.f2286e = new SparseBooleanArray();
        this.f2287f = new SparseBooleanArray();
        this.f2285d = new SparseArray();
        this.f2294m = new SparseIntArray();
        this.f2295n = new asp();
        this.f2292k = -1;
        this.f2286e.clear();
        this.f2285d.clear();
        SparseArray a = this.f2284c.mo1287a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2285d.put(a.keyAt(i2), (asx) a.valueAt(i2));
        }
        this.f2285d.put(0, new asl(new asq(this)));
        this.f2291j = null;
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f2288g = aok;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        boolean z;
        boolean z2;
        aoj aoj2;
        int i;
        int i2;
        long j;
        aop aop2;
        long j2;
        long j3;
        aoj aoj3 = aoj;
        aop aop3 = aop;
        aof aof = (aof) aoj3;
        long j4 = aof.f1489b;
        if (this.f2290i) {
            if (!(j4 == -1 || this.f2282a == 2)) {
                asp asp = this.f2295n;
                if (!asp.f2269c) {
                    int i3 = this.f2292k;
                    if (i3 <= 0) {
                        return asp.mo1307a(aoj3);
                    }
                    if (!asp.f2271e) {
                        int min = (int) Math.min(112800L, j4);
                        long j5 = j4 - ((long) min);
                        if (aof.f1490c == j5) {
                            asp.f2268b.mo2065a(min);
                            aoj.mo1191a();
                            aoj3.mo1199c(asp.f2268b.f4258a, 0, min);
                            bky bky = asp.f2268b;
                            int i4 = bky.f4259b;
                            int i5 = bky.f4260c - 1;
                            while (true) {
                                if (i5 < i4) {
                                    j3 = -9223372036854775807L;
                                    break;
                                }
                                if (bky.f4258a[i5] == 71) {
                                    j3 = atc.m2044a(bky, i5, i3);
                                    if (j3 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i5--;
                            }
                            asp.f2273g = j3;
                            asp.f2271e = true;
                            return 0;
                        }
                        aop3.f1514a = j5;
                        return 1;
                    } else if (asp.f2273g == -9223372036854775807L) {
                        return asp.mo1307a(aoj3);
                    } else {
                        if (!asp.f2270d) {
                            int min2 = (int) Math.min(112800L, j4);
                            if (aof.f1490c == 0) {
                                asp.f2268b.mo2065a(min2);
                                aoj.mo1191a();
                                aoj3.mo1199c(asp.f2268b.f4258a, 0, min2);
                                bky bky2 = asp.f2268b;
                                int i6 = bky2.f4259b;
                                int i7 = bky2.f4260c;
                                while (true) {
                                    if (i6 >= i7) {
                                        j2 = -9223372036854775807L;
                                        break;
                                    }
                                    if (bky2.f4258a[i6] == 71) {
                                        j2 = atc.m2044a(bky2, i6, i3);
                                        if (j2 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i6++;
                                }
                                asp.f2272f = j2;
                                asp.f2270d = true;
                                return 0;
                            }
                            aop3.f1514a = 0;
                            return 1;
                        }
                        long j6 = asp.f2272f;
                        if (j6 == -9223372036854775807L) {
                            return asp.mo1307a(aoj3);
                        }
                        asp.f2274h = asp.f2267a.mo2115b(asp.f2273g) - asp.f2267a.mo2115b(j6);
                        return asp.mo1307a(aoj3);
                    }
                }
            }
            if (!this.f2296o) {
                this.f2296o = true;
                asp asp2 = this.f2295n;
                long j7 = asp2.f2274h;
                if (j7 != -9223372036854775807L) {
                    aoc aoc = r4;
                    j = 0;
                    aoc aoc2 = new aoc(asp2.f2267a, j7, j4, this.f2292k);
                    this.f2299r = aoc;
                    this.f2288g.mo1212a(aoc.f1472a);
                    z2 = true;
                    z = false;
                } else {
                    j = 0;
                    z2 = true;
                    z = false;
                    this.f2288g.mo1212a(new aor(j7));
                }
            } else {
                j = 0;
                z2 = true;
                z = false;
            }
            if (this.f2297p) {
                this.f2297p = z;
                mo1207a(j, j);
                if (aof.f1490c == j) {
                    aop2 = aop;
                } else {
                    aop.f1514a = j;
                    return z2 ? 1 : 0;
                }
            } else {
                aop2 = aop;
            }
            aoc aoc3 = this.f2299r;
            if (aoc3 == null) {
                aoj2 = aoj;
            } else if (aoc3.mo1184a()) {
                return this.f2299r.mo1182a(aoj, aop2);
            } else {
                aoj2 = aoj;
            }
        } else {
            aoj2 = aoj3;
            z2 = true;
            z = false;
        }
        bky bky3 = this.f2293l;
        byte[] bArr = bky3.f4258a;
        if (9400 - bky3.f4259b < 188) {
            int b = bky3.mo2070b();
            if (b > 0) {
                System.arraycopy(bArr, this.f2293l.f4259b, bArr, z, b);
            }
            this.f2293l.mo2068a(bArr, b);
        }
        while (this.f2293l.mo2070b() < 188) {
            int i8 = this.f2293l.f4260c;
            int a = aoj2.mo1189a(bArr, i8, 9400 - i8);
            if (a == -1) {
                return -1;
            }
            this.f2293l.mo2071b(i8 + a);
        }
        bky bky4 = this.f2293l;
        int i9 = bky4.f4259b;
        int i10 = bky4.f4260c;
        int a2 = atc.m2043a(bky4.f4258a, i9, i10);
        this.f2293l.mo2073c(a2);
        int i11 = a2 + 188;
        if (i11 > i10) {
            int i12 = this.f2298q + (a2 - i9);
            this.f2298q = i12;
            i = 2;
            if (this.f2282a == 2 && i12 > 376) {
                throw new ako("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i = 2;
            this.f2298q = z;
        }
        bky bky5 = this.f2293l;
        int i13 = bky5.f4260c;
        if (i11 <= i13) {
            int j8 = bky5.mo2083j();
            if ((8388608 & j8) == 0) {
                int i14 = (4194304 & j8) != 0 ? 1 : 0;
                int i15 = (j8 >> 8) & 8191;
                int i16 = j8 & 32;
                asx asx = (j8 & 16) != 0 ? (asx) this.f2285d.get(i15) : null;
                if (asx == null) {
                    this.f2293l.mo2073c(i11);
                    return z;
                }
                if (this.f2282a != i) {
                    int i17 = j8 & 15;
                    int i18 = this.f2294m.get(i15, i17 - 1);
                    this.f2294m.put(i15, i17);
                    if (i18 == i17) {
                        this.f2293l.mo2073c(i11);
                        return z;
                    } else if (i17 != ((i18 + (z2 ? 1 : 0)) & 15)) {
                        asx.mo1299a();
                    }
                }
                if (i16 != 0) {
                    int d = this.f2293l.mo2074d();
                    if ((this.f2293l.mo2074d() & 64) != 0) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    i14 |= i2;
                    this.f2293l.mo2075d(d - 1);
                }
                boolean z3 = this.f2290i;
                if (this.f2282a == i || z3 || !this.f2287f.get(i15, z)) {
                    this.f2293l.mo2071b(i11);
                    asx.mo1300a(this.f2293l, i14);
                    this.f2293l.mo2071b(i13);
                }
                if (this.f2282a != i && !z3 && this.f2290i && j4 != -1) {
                    this.f2297p = z2;
                }
                this.f2293l.mo2073c(i11);
                return z;
            }
            this.f2293l.mo2073c(i11);
        }
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        aoc aoc;
        bks.m3512b(this.f2282a != 2);
        int size = this.f2283b.size();
        for (int i = 0; i < size; i++) {
            blj blj = (blj) this.f2283b.get(i);
            if (blj.mo2113a() == -9223372036854775807L || !(blj.mo2113a() == 0 || blj.f4289a == j2)) {
                blj.mo2116b();
                blj.mo2114a(j2);
            }
        }
        if (!(j2 == 0 || (aoc = this.f2299r) == null)) {
            aoc.mo1183a(j2);
        }
        this.f2293l.mo2064a();
        this.f2294m.clear();
        for (int i2 = 0; i2 < this.f2285d.size(); i2++) {
            ((asx) this.f2285d.valueAt(i2)).mo1299a();
        }
        this.f2298q = 0;
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        byte[] bArr = this.f2293l.f4258a;
        aoj.mo1199c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            aoj.mo1192a(i);
            return true;
        }
        return false;
    }
}
