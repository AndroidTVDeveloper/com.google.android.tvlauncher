package defpackage;

import android.util.Pair;

/* renamed from: apn  reason: default package */
/* compiled from: PG */
final class apn implements app {
    private final long[] a;
    private final long[] b;
    private final long c;

    public apn(long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = aja.b(jArr2[jArr2.length - 1]);
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return -1;
    }

    public final boolean d() {
        return true;
    }

    public final aoq d(long j) {
        Pair a2 = a(aja.a(blm.a(j, 0, this.c)), this.b, this.a);
        long longValue = ((Long) a2.first).longValue();
        return new aoq(new aot(aja.b(longValue), ((Long) a2.second).longValue()));
    }

    public final long b(long j) {
        return aja.b(((Long) a(j, this.a, this.b).second).longValue());
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
    private static Pair a(long j, long[] jArr, long[] jArr2) {
        double d;
        int a2 = blm.a(jArr, j, true);
        long j2 = jArr[a2];
        long j3 = jArr2[a2];
        int i = a2 + 1;
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
