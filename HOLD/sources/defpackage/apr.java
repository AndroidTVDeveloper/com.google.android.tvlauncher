package defpackage;

/* renamed from: apr  reason: default package */
/* compiled from: PG */
final class apr implements app {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public apr(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    private final long a(int i) {
        return (this.c * ((long) i)) / 100;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.e;
    }

    public final boolean d() {
        return this.f != null;
    }

    public apr(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1;
    }

    public final aoq d(long j) {
        if (!d()) {
            return new aoq(new aot(0, this.a + ((long) this.b)));
        }
        long a2 = blm.a(j, 0, this.c);
        double d2 = (double) a2;
        Double.isNaN(d2);
        double d3 = (double) this.c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 < 100.0d) {
                int i = (int) d4;
                long[] jArr = (long[]) bks.a(this.f);
                double d6 = (double) jArr[i];
                double d7 = i != 99 ? (double) jArr[i + 1] : 256.0d;
                double d8 = (double) i;
                Double.isNaN(d8);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d8) * (d7 - d6));
            } else {
                d5 = 256.0d;
            }
        }
        double d9 = (double) this.d;
        Double.isNaN(d9);
        return new aoq(new aot(a2, this.a + blm.a(Math.round((d5 / 256.0d) * d9), (long) this.b, this.d - 1)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean):int
     arg types: [long[], long, int]
     candidates:
      blm.a(float, float, float):float
      blm.a(int, int, int):int
      blm.a(java.util.List, java.lang.Comparable, boolean):int
      blm.a(long, long, long):long
      blm.a(java.lang.StringBuilder, java.util.Formatter, long):java.lang.String
      blm.a(byte[], int, int):java.lang.String
      blm.a(java.util.List, int, int):void
      blm.a(bky, bky, java.util.zip.Inflater):boolean
      blm.a(long[], long, boolean):int */
    public final long b(long j) {
        long j2;
        double d2;
        long j3 = j - this.a;
        if (!d() || j3 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = (long[]) bks.a(this.f);
        double d3 = (double) j3;
        Double.isNaN(d3);
        double d4 = (double) this.d;
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int a2 = blm.a(jArr, (long) d5, true);
        long a3 = a(a2);
        long j4 = jArr[a2];
        int i = a2 + 1;
        long a4 = a(i);
        if (a2 != 99) {
            j2 = jArr[i];
        } else {
            j2 = 256;
        }
        if (j4 != j2) {
            double d6 = (double) j4;
            Double.isNaN(d6);
            double d7 = d5 - d6;
            double d8 = (double) (j2 - j4);
            Double.isNaN(d8);
            d2 = d7 / d8;
        } else {
            d2 = 0.0d;
        }
        double d9 = (double) (a4 - a3);
        Double.isNaN(d9);
        return a3 + Math.round(d2 * d9);
    }
}
