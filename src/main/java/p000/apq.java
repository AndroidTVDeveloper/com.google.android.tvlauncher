package p000;

/* renamed from: apq */
/* compiled from: PG */
final class apq implements C0017app {

    /* renamed from: a */
    private final long[] f1721a;

    /* renamed from: b */
    private final long[] f1722b;

    /* renamed from: c */
    private final long f1723c;

    /* renamed from: d */
    private final long f1724d;

    public apq(long[] jArr, long[] jArr2, long j, long j2) {
        this.f1721a = jArr;
        this.f1722b = jArr2;
        this.f1723c = j;
        this.f1724d = j2;
    }

    /* renamed from: b */
    public final long mo1175b() {
        return this.f1723c;
    }

    /* renamed from: c */
    public final long mo1188c() {
        return this.f1724d;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
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
    /* renamed from: d */
    public final aoq mo1176d(long j) {
        int a = blm.m3628a(this.f1721a, j, true);
        aot aot = new aot(this.f1721a[a], this.f1722b[a]);
        if (aot.f1520b < j) {
            long[] jArr = this.f1721a;
            if (a != jArr.length - 1) {
                int i = a + 1;
                return new aoq(aot, new aot(jArr[i], this.f1722b[i]));
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
    /* renamed from: b */
    public final long mo1187b(long j) {
        return this.f1721a[blm.m3628a(this.f1722b, j, true)];
    }
}
