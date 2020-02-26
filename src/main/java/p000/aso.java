package p000;

/* renamed from: aso */
/* compiled from: PG */
public final class aso implements aob {

    /* renamed from: a */
    private final blj f2264a;

    /* renamed from: b */
    private final bky f2265b = new bky();

    /* renamed from: c */
    private final int f2266c;

    public aso(int i, blj blj) {
        this.f2266c = i;
        this.f2264a = blj;
    }

    /* renamed from: a */
    public final void mo1181a() {
        this.f2265b.mo2067a(blm.f4298f);
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
        int a2;
        aoj aoj2 = aoj;
        aof aof = (aof) aoj2;
        long j2 = aof.f1490c;
        int min = (int) Math.min(112800L, aof.f1489b - j2);
        this.f2265b.mo2065a(min);
        aoj2.mo1199c(this.f2265b.f4258a, 0, min);
        bky bky = this.f2265b;
        int i = bky.f4260c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (bky.mo2070b() >= 188 && (a2 = (a = atc.m2043a(bky.f4258a, bky.f4259b, i)) + 188) <= i) {
            long a3 = atc.m2044a(bky, a, this.f2266c);
            if (a3 != -9223372036854775807L) {
                long b = this.f2264a.mo2115b(a3);
                if (b <= j) {
                    if (100000 + b > j) {
                        return aoa.m1608a(j2 + ((long) a));
                    }
                    j4 = (long) a;
                    j5 = b;
                } else if (j5 != -9223372036854775807L) {
                    return aoa.m1608a(j2 + j4);
                } else {
                    return aoa.m1609a(b, j2);
                }
            }
            bky.mo2073c(a2);
            j3 = (long) a2;
        }
        return j5 != -9223372036854775807L ? aoa.m1610b(j5, j2 + j3) : aoa.f1468a;
    }
}
