package defpackage;

/* renamed from: ata  reason: default package */
/* compiled from: PG */
final class ata implements aos {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public int f = -1;
    public long g = -1;
    private final int h;

    public ata(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public final boolean d() {
        return true;
    }

    public final long b() {
        return (((this.g - ((long) this.f)) / ((long) this.c)) * 1000000) / ((long) this.b);
    }

    public final aoq d(long j) {
        long j2 = this.g - ((long) this.f);
        int i = this.h;
        long j3 = (long) this.c;
        long a2 = blm.a((((((long) i) * j) / 1000000) / j3) * j3, 0, j2 - j3);
        long j4 = ((long) this.f) + a2;
        long b2 = b(j4);
        aot aot = new aot(b2, j4);
        if (b2 < j) {
            long j5 = (long) this.c;
            if (a2 != j2 - j5) {
                long j6 = j4 + j5;
                return new aoq(aot, new aot(b(j6), j6));
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
    public final long b(long j) {
        return (Math.max(0L, j - ((long) this.f)) * 1000000) / ((long) this.h);
    }
}
