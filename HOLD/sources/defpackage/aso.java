package defpackage;

/* renamed from: aso  reason: default package */
/* compiled from: PG */
public final class aso implements aob {
    private final blj a;
    private final bky b = new bky();
    private final int c;

    public aso(int i, blj blj) {
        this.c = i;
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
        int a3;
        aoj aoj2 = aoj;
        aof aof = (aof) aoj2;
        long j2 = aof.c;
        int min = (int) Math.min(112800L, aof.b - j2);
        this.b.a(min);
        aoj2.c(this.b.a, 0, min);
        bky bky = this.b;
        int i = bky.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (bky.b() >= 188 && (a3 = (a2 = atc.a(bky.a, bky.b, i)) + 188) <= i) {
            long a4 = atc.a(bky, a2, this.c);
            if (a4 != -9223372036854775807L) {
                long b2 = this.a.b(a4);
                if (b2 <= j) {
                    if (100000 + b2 > j) {
                        return aoa.a(j2 + ((long) a2));
                    }
                    j4 = (long) a2;
                    j5 = b2;
                } else if (j5 != -9223372036854775807L) {
                    return aoa.a(j2 + j4);
                } else {
                    return aoa.a(b2, j2);
                }
            }
            bky.c(a3);
            j3 = (long) a3;
        }
        return j5 != -9223372036854775807L ? aoa.b(j5, j2 + j3) : aoa.a;
    }
}
