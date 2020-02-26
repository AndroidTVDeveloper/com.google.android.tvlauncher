package p000;

import android.util.Pair;

/* renamed from: apn */
/* compiled from: PG */
final class apn implements C0017app {

    /* renamed from: a */
    private final long[] f1703a;

    /* renamed from: b */
    private final long[] f1704b;

    /* renamed from: c */
    private final long f1705c;

    public apn(long[] jArr, long[] jArr2) {
        this.f1703a = jArr;
        this.f1704b = jArr2;
        this.f1705c = aja.m633b(jArr2[jArr2.length - 1]);
    }

    /* renamed from: b */
    public final long mo1175b() {
        return this.f1705c;
    }

    /* renamed from: c */
    public final long mo1188c() {
        return -1;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return true;
    }

    /* renamed from: d */
    public final aoq mo1176d(long j) {
        Pair a = m1736a(aja.m632a(blm.m3632a(j, 0, this.f1705c)), this.f1704b, this.f1703a);
        long longValue = ((Long) a.first).longValue();
        return new aoq(new aot(aja.m633b(longValue), ((Long) a.second).longValue()));
    }

    /* renamed from: b */
    public final long mo1187b(long j) {
        return aja.m633b(((Long) m1736a(j, this.f1703a, this.f1704b).second).longValue());
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
    /* renamed from: a */
    private static Pair m1736a(long j, long[] jArr, long[] jArr2) {
        double d;
        int a = blm.m3628a(jArr, j, true);
        long j2 = jArr[a];
        long j3 = jArr2[a];
        int i = a + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 != j2) {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = (double) (j4 - j2);
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        } else {
            d = 0.0d;
        }
        Long valueOf = Long.valueOf(j);
        double d5 = (double) (j5 - j3);
        Double.isNaN(d5);
        return Pair.create(valueOf, Long.valueOf(((long) (d * d5)) + j3));
    }
}
