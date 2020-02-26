package defpackage;

import android.util.SparseArray;

/* renamed from: asj  reason: default package */
/* compiled from: PG */
public final class asj implements aoi {
    private final blj a = new blj(0);
    private final SparseArray b = new SparseArray();
    private final bky c = new bky(4096);
    private final ash d = new ash();
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private aok i;
    private boolean j;
    private aoc k;

    public final void a(aok aok) {
        this.i = aok;
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
        int i2;
        long j2;
        art art;
        aoj aoj2 = aoj;
        aop aop2 = aop;
        aof aof = (aof) aoj2;
        long j3 = aof.b;
        long j4 = -9223372036854775807L;
        if (j3 != -1) {
            ash ash = this.d;
            if (!ash.c) {
                if (!ash.e) {
                    int min = (int) Math.min(20000L, j3);
                    long j5 = j3 - ((long) min);
                    if (aof.c == j5) {
                        ash.b.a(min);
                        aoj.a();
                        aoj2.c(ash.b.a, 0, min);
                        bky bky = ash.b;
                        int i3 = bky.b;
                        int i4 = bky.c - 4;
                        while (true) {
                            if (i4 < i3) {
                                break;
                            }
                            if (ash.a(bky.a, i4) == 442) {
                                bky.c(i4 + 4);
                                long a2 = ash.a(bky);
                                if (a2 != -9223372036854775807L) {
                                    j4 = a2;
                                    break;
                                }
                            }
                            i4--;
                        }
                        ash.g = j4;
                        ash.e = true;
                        return 0;
                    }
                    aop2.a = j5;
                    return 1;
                } else if (ash.g == -9223372036854775807L) {
                    return ash.a(aoj2);
                } else {
                    if (!ash.d) {
                        int min2 = (int) Math.min(20000L, j3);
                        if (aof.c == 0) {
                            ash.b.a(min2);
                            aoj.a();
                            aoj2.c(ash.b.a, 0, min2);
                            bky bky2 = ash.b;
                            int i5 = bky2.b;
                            int i6 = bky2.c;
                            while (true) {
                                if (i5 >= i6 - 3) {
                                    break;
                                }
                                if (ash.a(bky2.a, i5) == 442) {
                                    bky2.c(i5 + 4);
                                    long a3 = ash.a(bky2);
                                    if (a3 != -9223372036854775807L) {
                                        j4 = a3;
                                        break;
                                    }
                                }
                                i5++;
                            }
                            ash.f = j4;
                            ash.d = true;
                            return 0;
                        }
                        aop2.a = 0;
                        return 1;
                    }
                    long j6 = ash.f;
                    if (j6 == -9223372036854775807L) {
                        return ash.a(aoj2);
                    }
                    ash.h = ash.a.b(ash.g) - ash.a.b(j6);
                    return ash.a(aoj2);
                }
            }
        }
        if (!this.j) {
            this.j = true;
            ash ash2 = this.d;
            long j7 = ash2.h;
            if (j7 != -9223372036854775807L) {
                aoc aoc = r4;
                aoc aoc2 = new aoc(ash2.a, j7, j3);
                this.k = aoc;
                this.i.a(aoc.a);
                i2 = 0;
                z = true;
            } else {
                i2 = 0;
                z = true;
                this.i.a(new aor(j7));
            }
        } else {
            i2 = 0;
            z = true;
        }
        aoc aoc3 = this.k;
        if (aoc3 != null && aoc3.a()) {
            return this.k.a(aoj2, aop2);
        }
        aoj.a();
        if (j3 != -1) {
            j2 = j3 - aoj.b();
        } else {
            j2 = -1;
        }
        if ((j2 == -1 || j2 >= 4) && aoj2.b(this.c.a, i2, 4, z)) {
            this.c.c(i2);
            int j8 = this.c.j();
            if (j8 != 441) {
                if (j8 == 442) {
                    aoj2.c(this.c.a, i2, 10);
                    this.c.c(9);
                    aoj2.a((this.c.d() & 7) + 14);
                    return i2;
                } else if (j8 == 443) {
                    aoj2.c(this.c.a, i2, 2);
                    this.c.c(i2);
                    aoj2.a(this.c.e() + 6);
                    return i2;
                } else if ((j8 >> 8) == z) {
                    int i7 = j8 & 255;
                    asi asi = (asi) this.b.get(i7);
                    if (!this.e) {
                        if (asi == null) {
                            if (i7 == 189) {
                                art = new arl();
                                this.f = z;
                                this.h = aof.c;
                            } else if ((i7 & 224) == 192) {
                                art = new asd();
                                this.f = z;
                                this.h = aof.c;
                            } else if ((i7 & 240) == 224) {
                                art = new arv();
                                this.g = z;
                                this.h = aof.c;
                            } else {
                                art = null;
                            }
                            if (art != null) {
                                art.a(this.i, new asw(i7, 256));
                                asi = new asi(art, this.a);
                                this.b.put(i7, asi);
                            }
                        }
                        long j9 = 1048576;
                        if (this.f && this.g) {
                            j9 = this.h + 8192;
                        }
                        if (aof.c > j9) {
                            this.e = z;
                            this.i.S();
                        }
                    }
                    aoj2.c(this.c.a, i2, 2);
                    this.c.c(i2);
                    int e2 = this.c.e() + 6;
                    if (asi != null) {
                        this.c.a(e2);
                        aoj2.b(this.c.a, i2, e2);
                        this.c.c(6);
                        bky bky3 = this.c;
                        bky3.a(asi.c.a, i2, 3);
                        asi.c.a(i2);
                        asi.c.b(8);
                        asi.d = asi.c.e();
                        asi.e = asi.c.e();
                        asi.c.b(6);
                        int c2 = asi.c.c(8);
                        asi.g = c2;
                        bky3.a(asi.c.a, i2, c2);
                        asi.c.a(i2);
                        long j10 = 0;
                        asi.h = 0;
                        if (asi.d) {
                            asi.c.b(4);
                            int c3 = asi.c.c(3);
                            asi.c.b(z);
                            int c4 = asi.c.c(15);
                            asi.c.b(z);
                            long c5 = (((long) c3) << 30) | ((long) (c4 << 15)) | ((long) asi.c.c(15));
                            asi.c.b(z);
                            if (!asi.f && asi.e) {
                                asi.c.b(4);
                                int c6 = asi.c.c(3);
                                asi.c.b(z);
                                int c7 = asi.c.c(15);
                                asi.c.b(z);
                                int c8 = asi.c.c(15);
                                asi.c.b(z);
                                asi.b.b((((long) c6) << 30) | ((long) (c7 << 15)) | ((long) c8));
                                asi.f = z;
                            }
                            j10 = asi.b.b(c5);
                            asi.h = j10;
                        }
                        asi.a.a(j10, 4);
                        asi.a.a(bky3);
                        asi.a.b();
                        bky bky4 = this.c;
                        bky4.b(bky4.c());
                    } else {
                        aoj2.a(e2);
                    }
                    return i2;
                } else {
                    aoj2.a(z ? 1 : 0);
                    return i2;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r4, long r6) {
        /*
            r3 = this;
            blj r4 = r3.a
            long r4 = r4.a()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
            blj r4 = r3.a
            long r4 = r4.a
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
        L_0x001e:
            blj r4 = r3.a
            r4.b()
            blj r4 = r3.a
            r4.a(r6)
        L_0x0028:
            aoc r4 = r3.k
            r5 = 0
            if (r4 == 0) goto L_0x0031
            r4.a(r6)
            goto L_0x0033
        L_0x0031:
        L_0x0033:
            r4 = 0
        L_0x0034:
            android.util.SparseArray r6 = r3.b
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x004e
            android.util.SparseArray r6 = r3.b
            java.lang.Object r6 = r6.valueAt(r4)
            asi r6 = (defpackage.asi) r6
            r6.f = r5
            art r6 = r6.a
            r6.a()
            int r4 = r4 + 1
            goto L_0x0034
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asj.a(long, long):void");
    }

    public final boolean a(aoj aoj) {
        byte[] bArr = new byte[14];
        aoj.c(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        aoj.b(bArr[13] & 7);
        aoj.c(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
