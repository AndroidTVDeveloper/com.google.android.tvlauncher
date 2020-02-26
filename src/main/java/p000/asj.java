package p000;

import android.util.SparseArray;

/* renamed from: asj */
/* compiled from: PG */
public final class asj implements aoi {

    /* renamed from: a */
    private final blj f2242a = new blj(0);

    /* renamed from: b */
    private final SparseArray f2243b = new SparseArray();

    /* renamed from: c */
    private final bky f2244c = new bky(4096);

    /* renamed from: d */
    private final ash f2245d = new ash();

    /* renamed from: e */
    private boolean f2246e;

    /* renamed from: f */
    private boolean f2247f;

    /* renamed from: g */
    private boolean f2248g;

    /* renamed from: h */
    private long f2249h;

    /* renamed from: i */
    private aok f2250i;

    /* renamed from: j */
    private boolean f2251j;

    /* renamed from: k */
    private aoc f2252k;

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f2250i = aok;
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
        int i;
        long j;
        art art;
        aoj aoj2 = aoj;
        aop aop2 = aop;
        aof aof = (aof) aoj2;
        long j2 = aof.f1489b;
        long j3 = -9223372036854775807L;
        if (j2 != -1) {
            ash ash = this.f2245d;
            if (!ash.f2228c) {
                if (!ash.f2230e) {
                    int min = (int) Math.min(20000L, j2);
                    long j4 = j2 - ((long) min);
                    if (aof.f1490c == j4) {
                        ash.f2227b.mo2065a(min);
                        aoj.mo1191a();
                        aoj2.mo1199c(ash.f2227b.f4258a, 0, min);
                        bky bky = ash.f2227b;
                        int i2 = bky.f4259b;
                        int i3 = bky.f4260c - 4;
                        while (true) {
                            if (i3 < i2) {
                                break;
                            }
                            if (ash.m1995a(bky.f4258a, i3) == 442) {
                                bky.mo2073c(i3 + 4);
                                long a = ash.m1996a(bky);
                                if (a != -9223372036854775807L) {
                                    j3 = a;
                                    break;
                                }
                            }
                            i3--;
                        }
                        ash.f2232g = j3;
                        ash.f2230e = true;
                        return 0;
                    }
                    aop2.f1514a = j4;
                    return 1;
                } else if (ash.f2232g == -9223372036854775807L) {
                    return ash.mo1302a(aoj2);
                } else {
                    if (!ash.f2229d) {
                        int min2 = (int) Math.min(20000L, j2);
                        if (aof.f1490c == 0) {
                            ash.f2227b.mo2065a(min2);
                            aoj.mo1191a();
                            aoj2.mo1199c(ash.f2227b.f4258a, 0, min2);
                            bky bky2 = ash.f2227b;
                            int i4 = bky2.f4259b;
                            int i5 = bky2.f4260c;
                            while (true) {
                                if (i4 >= i5 - 3) {
                                    break;
                                }
                                if (ash.m1995a(bky2.f4258a, i4) == 442) {
                                    bky2.mo2073c(i4 + 4);
                                    long a2 = ash.m1996a(bky2);
                                    if (a2 != -9223372036854775807L) {
                                        j3 = a2;
                                        break;
                                    }
                                }
                                i4++;
                            }
                            ash.f2231f = j3;
                            ash.f2229d = true;
                            return 0;
                        }
                        aop2.f1514a = 0;
                        return 1;
                    }
                    long j5 = ash.f2231f;
                    if (j5 == -9223372036854775807L) {
                        return ash.mo1302a(aoj2);
                    }
                    ash.f2233h = ash.f2226a.mo2115b(ash.f2232g) - ash.f2226a.mo2115b(j5);
                    return ash.mo1302a(aoj2);
                }
            }
        }
        if (!this.f2251j) {
            this.f2251j = true;
            ash ash2 = this.f2245d;
            long j6 = ash2.f2233h;
            if (j6 != -9223372036854775807L) {
                aoc aoc = r4;
                aoc aoc2 = new aoc(ash2.f2226a, j6, j2);
                this.f2252k = aoc;
                this.f2250i.mo1212a(aoc.f1472a);
                i = 0;
                z = true;
            } else {
                i = 0;
                z = true;
                this.f2250i.mo1212a(new aor(j6));
            }
        } else {
            i = 0;
            z = true;
        }
        aoc aoc3 = this.f2252k;
        if (aoc3 != null && aoc3.mo1184a()) {
            return this.f2252k.mo1182a(aoj2, aop2);
        }
        aoj.mo1191a();
        if (j2 != -1) {
            j = j2 - aoj.mo1194b();
        } else {
            j = -1;
        }
        if ((j == -1 || j >= 4) && aoj2.mo1197b(this.f2244c.f4258a, i, 4, z)) {
            this.f2244c.mo2073c(i);
            int j7 = this.f2244c.mo2083j();
            if (j7 != 441) {
                if (j7 == 442) {
                    aoj2.mo1199c(this.f2244c.f4258a, i, 10);
                    this.f2244c.mo2073c(9);
                    aoj2.mo1192a((this.f2244c.mo2074d() & 7) + 14);
                    return i;
                } else if (j7 == 443) {
                    aoj2.mo1199c(this.f2244c.f4258a, i, 2);
                    this.f2244c.mo2073c(i);
                    aoj2.mo1192a(this.f2244c.mo2076e() + 6);
                    return i;
                } else if ((j7 >> 8) == z) {
                    int i6 = j7 & 255;
                    asi asi = (asi) this.f2243b.get(i6);
                    if (!this.f2246e) {
                        if (asi == null) {
                            if (i6 == 189) {
                                art = new arl();
                                this.f2247f = z;
                                this.f2249h = aof.f1490c;
                            } else if ((i6 & 224) == 192) {
                                art = new asd();
                                this.f2247f = z;
                                this.f2249h = aof.f1490c;
                            } else if ((i6 & 240) == 224) {
                                art = new arv();
                                this.f2248g = z;
                                this.f2249h = aof.f1490c;
                            } else {
                                art = null;
                            }
                            if (art != null) {
                                art.mo1283a(this.f2250i, new asw(i6, 256));
                                asi = new asi(art, this.f2242a);
                                this.f2243b.put(i6, asi);
                            }
                        }
                        long j8 = 1048576;
                        if (this.f2247f && this.f2248g) {
                            j8 = this.f2249h + 8192;
                        }
                        if (aof.f1490c > j8) {
                            this.f2246e = z;
                            this.f2250i.mo1210S();
                        }
                    }
                    aoj2.mo1199c(this.f2244c.f4258a, i, 2);
                    this.f2244c.mo2073c(i);
                    int e = this.f2244c.mo2076e() + 6;
                    if (asi != null) {
                        this.f2244c.mo2065a(e);
                        aoj2.mo1196b(this.f2244c.f4258a, i, e);
                        this.f2244c.mo2073c(6);
                        bky bky3 = this.f2244c;
                        bky3.mo2069a(asi.f2236c.f4254a, i, 3);
                        asi.f2236c.mo2050a(i);
                        asi.f2236c.mo2054b(8);
                        asi.f2237d = asi.f2236c.mo2060e();
                        asi.f2238e = asi.f2236c.mo2060e();
                        asi.f2236c.mo2054b(6);
                        int c = asi.f2236c.mo2057c(8);
                        asi.f2240g = c;
                        bky3.mo2069a(asi.f2236c.f4254a, i, c);
                        asi.f2236c.mo2050a(i);
                        long j9 = 0;
                        asi.f2241h = 0;
                        if (asi.f2237d) {
                            asi.f2236c.mo2054b(4);
                            int c2 = asi.f2236c.mo2057c(3);
                            asi.f2236c.mo2054b(z);
                            int c3 = asi.f2236c.mo2057c(15);
                            asi.f2236c.mo2054b(z);
                            long c4 = (((long) c2) << 30) | ((long) (c3 << 15)) | ((long) asi.f2236c.mo2057c(15));
                            asi.f2236c.mo2054b(z);
                            if (!asi.f2239f && asi.f2238e) {
                                asi.f2236c.mo2054b(4);
                                int c5 = asi.f2236c.mo2057c(3);
                                asi.f2236c.mo2054b(z);
                                int c6 = asi.f2236c.mo2057c(15);
                                asi.f2236c.mo2054b(z);
                                int c7 = asi.f2236c.mo2057c(15);
                                asi.f2236c.mo2054b(z);
                                asi.f2235b.mo2115b((((long) c5) << 30) | ((long) (c6 << 15)) | ((long) c7));
                                asi.f2239f = z;
                            }
                            j9 = asi.f2235b.mo2115b(c4);
                            asi.f2241h = j9;
                        }
                        asi.f2234a.mo1282a(j9, 4);
                        asi.f2234a.mo1284a(bky3);
                        asi.f2234a.mo1285b();
                        bky bky4 = this.f2244c;
                        bky4.mo2071b(bky4.mo2072c());
                    } else {
                        aoj2.mo1192a(e);
                    }
                    return i;
                } else {
                    aoj2.mo1192a(z ? 1 : 0);
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r4 == r6) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[LOOP:0: B:11:0x0034->B:13:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1207a(long r4, long r6) {
        /*
            r3 = this;
            blj r4 = r3.f2242a
            long r4 = r4.mo2113a()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
            blj r4 = r3.f2242a
            long r4 = r4.f4289a
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
        L_0x001e:
            blj r4 = r3.f2242a
            r4.mo2116b()
            blj r4 = r3.f2242a
            r4.mo2114a(r6)
        L_0x0028:
            aoc r4 = r3.f2252k
            r5 = 0
            if (r4 == 0) goto L_0x0031
            r4.mo1183a(r6)
            goto L_0x0033
        L_0x0031:
        L_0x0033:
            r4 = 0
        L_0x0034:
            android.util.SparseArray r6 = r3.f2243b
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x004e
            android.util.SparseArray r6 = r3.f2243b
            java.lang.Object r6 = r6.valueAt(r4)
            asi r6 = (p000.asi) r6
            r6.f2239f = r5
            art r6 = r6.f2234a
            r6.mo1281a()
            int r4 = r4 + 1
            goto L_0x0034
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.asj.mo1207a(long, long):void");
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        byte[] bArr = new byte[14];
        aoj.mo1199c(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        aoj.mo1195b(bArr[13] & 7);
        aoj.mo1199c(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
