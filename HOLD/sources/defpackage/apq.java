package defpackage;

/* renamed from: apq  reason: default package */
/* compiled from: PG */
final class apq implements app {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    public apq(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final boolean d() {
        return true;
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
    public final aoq d(long j) {
        int a2 = blm.a(this.a, j, true);
        aot aot = new aot(this.a[a2], this.b[a2]);
        if (aot.b < j) {
            long[] jArr = this.a;
            if (a2 != jArr.length - 1) {
                int i = a2 + 1;
                return new aoq(aot, new aot(jArr[i], this.b[i]));
            }
        }
        return new aoq(aot);
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
        return this.a[blm.a(this.b, j, true)];
    }
}
