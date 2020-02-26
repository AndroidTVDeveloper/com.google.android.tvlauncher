package p000;

/* renamed from: aoe */
/* compiled from: PG */
public final class aoe implements aos, C0017app {

    /* renamed from: a */
    private final long f1482a;

    /* renamed from: b */
    private final long f1483b;

    /* renamed from: c */
    private final int f1484c;

    /* renamed from: d */
    private final long f1485d;

    /* renamed from: e */
    private final int f1486e;

    /* renamed from: f */
    private final long f1487f;

    /* renamed from: b */
    public final long mo1175b() {
        return this.f1487f;
    }

    /* renamed from: c */
    public final long mo1188c() {
        return -1;
    }

    /* renamed from: d */
    public final aoq mo1176d(long j) {
        long j2 = this.f1485d;
        if (j2 == -1) {
            return new aoq(new aot(0, this.f1483b));
        }
        int i = this.f1486e;
        long j3 = (long) this.f1484c;
        long a = this.f1483b + blm.m3632a((((((long) i) * j) / 8000000) / j3) * j3, 0, j2 - j3);
        long c = m1625c(a);
        aot aot = new aot(c, a);
        if (c < j) {
            long j4 = a + ((long) this.f1484c);
            if (j4 < this.f1482a) {
                return new aoq(aot, new aot(m1625c(j4), j4));
            }
        }
        return new aoq(aot);
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return this.f1485d != -1;
    }

    /* renamed from: c */
    private final long m1625c(long j) {
        return m1624a(j, this.f1483b, this.f1486e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private static long m1624a(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    public aoe(long j, long j2, aoo aoo) {
        int i = aoo.f1512f;
        int i2 = aoo.f1509c;
        this.f1482a = j;
        this.f1483b = j2;
        this.f1484c = i2 == -1 ? 1 : i2;
        this.f1486e = i;
        if (j == -1) {
            this.f1485d = -1;
            this.f1487f = -9223372036854775807L;
            return;
        }
        this.f1485d = j - j2;
        this.f1487f = m1624a(j, j2, i);
    }

    /* renamed from: b */
    public final long mo1187b(long j) {
        return m1625c(j);
    }
}
