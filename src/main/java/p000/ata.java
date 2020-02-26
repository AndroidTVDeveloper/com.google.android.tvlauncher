package p000;

/* renamed from: ata */
/* compiled from: PG */
final class ata implements aos {

    /* renamed from: a */
    public final int f2318a;

    /* renamed from: b */
    public final int f2319b;

    /* renamed from: c */
    public final int f2320c;

    /* renamed from: d */
    public final int f2321d;

    /* renamed from: e */
    public final int f2322e;

    /* renamed from: f */
    public int f2323f = -1;

    /* renamed from: g */
    public long f2324g = -1;

    /* renamed from: h */
    private final int f2325h;

    public ata(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2318a = i;
        this.f2319b = i2;
        this.f2325h = i3;
        this.f2320c = i4;
        this.f2321d = i5;
        this.f2322e = i6;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return true;
    }

    /* renamed from: b */
    public final long mo1175b() {
        return (((this.f2324g - ((long) this.f2323f)) / ((long) this.f2320c)) * 1000000) / ((long) this.f2319b);
    }

    /* renamed from: d */
    public final aoq mo1176d(long j) {
        long j2 = this.f2324g - ((long) this.f2323f);
        int i = this.f2325h;
        long j3 = (long) this.f2320c;
        long a = blm.m3632a((((((long) i) * j) / 1000000) / j3) * j3, 0, j2 - j3);
        long j4 = ((long) this.f2323f) + a;
        long b = mo1314b(j4);
        aot aot = new aot(b, j4);
        if (b < j) {
            long j5 = (long) this.f2320c;
            if (a != j2 - j5) {
                long j6 = j4 + j5;
                return new aoq(aot, new aot(mo1314b(j6), j6));
            }
        }
        return new aoq(aot);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: b */
    public final long mo1314b(long j) {
        return (Math.max(0L, j - ((long) this.f2323f)) * 1000000) / ((long) this.f2325h);
    }
}
