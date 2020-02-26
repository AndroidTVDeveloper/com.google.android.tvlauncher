package p000;

/* renamed from: apr */
/* compiled from: PG */
final class apr implements C0017app {

    /* renamed from: a */
    private final long f1725a;

    /* renamed from: b */
    private final int f1726b;

    /* renamed from: c */
    private final long f1727c;

    /* renamed from: d */
    private final long f1728d;

    /* renamed from: e */
    private final long f1729e;

    /* renamed from: f */
    private final long[] f1730f;

    public apr(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    /* renamed from: a */
    private final long m1757a(int i) {
        return (this.f1727c * ((long) i)) / 100;
    }

    /* renamed from: b */
    public final long mo1175b() {
        return this.f1727c;
    }

    /* renamed from: c */
    public final long mo1188c() {
        return this.f1729e;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return this.f1730f != null;
    }

    public apr(long j, int i, long j2, long j3, long[] jArr) {
        this.f1725a = j;
        this.f1726b = i;
        this.f1727c = j2;
        this.f1730f = jArr;
        this.f1728d = j3;
        this.f1729e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: d */
    public final aoq mo1176d(long j) {
        if (!mo1177d()) {
            return new aoq(new aot(0, this.f1725a + ((long) this.f1726b)));
        }
        long a = blm.m3632a(j, 0, this.f1727c);
        double d = (double) a;
        Double.isNaN(d);
        double d2 = (double) this.f1727c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 < 100.0d) {
                int i = (int) d3;
                long[] jArr = (long[]) bks.m3507a(this.f1730f);
                double d5 = (double) jArr[i];
                double d6 = i != 99 ? (double) jArr[i + 1] : 256.0d;
                double d7 = (double) i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            } else {
                d4 = 256.0d;
            }
        }
        double d8 = (double) this.f1728d;
        Double.isNaN(d8);
        return new aoq(new aot(a, this.f1725a + blm.m3632a(Math.round((d4 / 256.0d) * d8), (long) this.f1726b, this.f1728d - 1)));
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
    /* renamed from: b */
    public final long mo1187b(long j) {
        long j2;
        double d;
        long j3 = j - this.f1725a;
        if (!mo1177d() || j3 <= ((long) this.f1726b)) {
            return 0;
        }
        long[] jArr = (long[]) bks.m3507a(this.f1730f);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) this.f1728d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int a = blm.m3628a(jArr, (long) d4, true);
        long a2 = m1757a(a);
        long j4 = jArr[a];
        int i = a + 1;
        long a3 = m1757a(i);
        if (a != 99) {
            j2 = jArr[i];
        } else {
            j2 = 256;
        }
        if (j4 != j2) {
            double d5 = (double) j4;
            Double.isNaN(d5);
            double d6 = d4 - d5;
            double d7 = (double) (j2 - j4);
            Double.isNaN(d7);
            d = d6 / d7;
        } else {
            d = 0.0d;
        }
        double d8 = (double) (a3 - a2);
        Double.isNaN(d8);
        return a2 + Math.round(d * d8);
    }
}
