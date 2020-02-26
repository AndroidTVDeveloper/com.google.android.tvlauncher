package p000;

/* renamed from: asg */
/* compiled from: PG */
public final class asg implements aob {

    /* renamed from: a */
    private final blj f2224a;

    /* renamed from: b */
    private final bky f2225b = new bky();

    public /* synthetic */ asg(blj blj) {
        this.f2224a = blj;
    }

    /* renamed from: a */
    public final void mo1181a() {
        this.f2225b.mo2067a(blm.f4298f);
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
    public final aoa mo1180a(aoj aoj, long j) {
        int a;
        aoj aoj2 = aoj;
        aof aof = (aof) aoj2;
        long j2 = aof.f1490c;
        int min = (int) Math.min(20000L, aof.f1489b - j2);
        this.f2225b.mo2065a(min);
        aoj2.mo1199c(this.f2225b.f4258a, 0, min);
        bky bky = this.f2225b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (bky.mo2070b() >= 4) {
            if (aoc.m1614a(bky.f4258a, bky.f4259b) != 442) {
                bky.mo2075d(1);
            } else {
                bky.mo2075d(4);
                long a2 = ash.m1996a(bky);
                if (a2 != -9223372036854775807L) {
                    long b = this.f2224a.mo2115b(a2);
                    if (b <= j) {
                        if (100000 + b > j) {
                            return aoa.m1608a(j2 + ((long) bky.f4259b));
                        }
                        i2 = bky.f4259b;
                        j3 = b;
                    } else if (j3 != -9223372036854775807L) {
                        return aoa.m1608a(j2 + ((long) i2));
                    } else {
                        return aoa.m1609a(b, j2);
                    }
                }
                int i3 = bky.f4260c;
                if (bky.mo2070b() < 10) {
                    bky.mo2073c(i3);
                } else {
                    bky.mo2075d(9);
                    int d = bky.mo2074d() & 7;
                    if (bky.mo2070b() < d) {
                        bky.mo2073c(i3);
                    } else {
                        bky.mo2075d(d);
                        if (bky.mo2070b() >= 4) {
                            if (aoc.m1614a(bky.f4258a, bky.f4259b) == 443) {
                                bky.mo2075d(4);
                                int e = bky.mo2076e();
                                if (bky.mo2070b() < e) {
                                    bky.mo2073c(i3);
                                } else {
                                    bky.mo2075d(e);
                                }
                            }
                            while (true) {
                                if (bky.mo2070b() < 4 || (a = aoc.m1614a(bky.f4258a, bky.f4259b)) == 442 || a == 441 || (a >>> 8) != 1) {
                                    break;
                                }
                                bky.mo2075d(4);
                                if (bky.mo2070b() < 2) {
                                    bky.mo2073c(i3);
                                    break;
                                }
                                bky.mo2073c(Math.min(bky.f4260c, bky.f4259b + bky.mo2076e()));
                            }
                        } else {
                            bky.mo2073c(i3);
                        }
                    }
                }
                i = bky.f4259b;
            }
        }
        if (j3 != -9223372036854775807L) {
            return aoa.m1610b(j3, j2 + ((long) i));
        }
        return aoa.f1468a;
    }
}
