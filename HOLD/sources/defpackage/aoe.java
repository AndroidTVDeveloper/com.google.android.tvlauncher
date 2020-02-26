package defpackage;

/* renamed from: aoe  reason: default package */
/* compiled from: PG */
public final class aoe implements aos, app {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public final long b() {
        return this.f;
    }

    public final long c() {
        return -1;
    }

    public final aoq d(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            return new aoq(new aot(0, this.b));
        }
        int i = this.e;
        long j3 = (long) this.c;
        long a2 = this.b + blm.a((((((long) i) * j) / 8000000) / j3) * j3, 0, j2 - j3);
        long c2 = c(a2);
        aot aot = new aot(c2, a2);
        if (c2 < j) {
            long j4 = a2 + ((long) this.c);
            if (j4 < this.a) {
                return new aoq(aot, new aot(c(j4), j4));
            }
        }
        return new aoq(aot);
    }

    public final boolean d() {
        return this.d != -1;
    }

    private final long c(long j) {
        return a(j, this.b, this.e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    private static long a(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    public aoe(long j, long j2, aoo aoo) {
        int i = aoo.f;
        int i2 = aoo.c;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1;
            this.f = -9223372036854775807L;
            return;
        }
        this.d = j - j2;
        this.f = a(j, j2, i);
    }

    public final long b(long j) {
        return c(j);
    }
}
