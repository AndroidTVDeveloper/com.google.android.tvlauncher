package defpackage;

/* renamed from: asg  reason: default package */
/* compiled from: PG */
public final class asg implements aob {
    private final blj a;
    private final bky b = new bky();

    public /* synthetic */ asg(blj blj) {
        this.a = blj;
    }

    public final void a() {
        this.b.a(blm.f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final aoa a(aoj aoj, long j) {
        int a2;
        aoj aoj2 = aoj;
        aof aof = (aof) aoj2;
        long j2 = aof.c;
        int min = (int) Math.min(20000L, aof.b - j2);
        this.b.a(min);
        aoj2.c(this.b.a, 0, min);
        bky bky = this.b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (bky.b() >= 4) {
            if (aoc.a(bky.a, bky.b) != 442) {
                bky.d(1);
            } else {
                bky.d(4);
                long a3 = ash.a(bky);
                if (a3 != -9223372036854775807L) {
                    long b2 = this.a.b(a3);
                    if (b2 <= j) {
                        if (100000 + b2 > j) {
                            return aoa.a(j2 + ((long) bky.b));
                        }
                        i2 = bky.b;
                        j3 = b2;
                    } else if (j3 != -9223372036854775807L) {
                        return aoa.a(j2 + ((long) i2));
                    } else {
                        return aoa.a(b2, j2);
                    }
                }
                int i3 = bky.c;
                if (bky.b() < 10) {
                    bky.c(i3);
                } else {
                    bky.d(9);
                    int d = bky.d() & 7;
                    if (bky.b() < d) {
                        bky.c(i3);
                    } else {
                        bky.d(d);
                        if (bky.b() >= 4) {
                            if (aoc.a(bky.a, bky.b) == 443) {
                                bky.d(4);
                                int e = bky.e();
                                if (bky.b() < e) {
                                    bky.c(i3);
                                } else {
                                    bky.d(e);
                                }
                            }
                            while (true) {
                                if (bky.b() < 4 || (a2 = aoc.a(bky.a, bky.b)) == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                bky.d(4);
                                if (bky.b() < 2) {
                                    bky.c(i3);
                                    break;
                                }
                                bky.c(Math.min(bky.c, bky.b + bky.e()));
                            }
                        } else {
                            bky.c(i3);
                        }
                    }
                }
                i = bky.b;
            }
        }
        if (j3 != -9223372036854775807L) {
            return aoa.b(j3, j2 + ((long) i));
        }
        return aoa.a;
    }
}
