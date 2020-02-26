package defpackage;

/* renamed from: aqu  reason: default package */
/* compiled from: PG */
final class aqu implements aqz, aos {
    public long[] a;
    public long[] b;
    public long c = -1;
    private long d = -1;
    private final /* synthetic */ aqv e;

    public aqu(aqv aqv) {
        this.e = aqv;
    }

    public final aos a() {
        return this;
    }

    public final boolean d() {
        return true;
    }

    public final long b() {
        bko bko = this.e.a;
        return (bko.d * 1000000) / ((long) bko.a);
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
        int a2 = blm.a(this.a, this.e.b(j), true);
        long a3 = this.e.a(this.a[a2]);
        aot aot = new aot(a3, this.c + this.b[a2]);
        if (a3 < j) {
            long[] jArr = this.a;
            if (a2 != jArr.length - 1) {
                int i = a2 + 1;
                return new aoq(aot, new aot(this.e.a(jArr[i]), this.c + this.b[i]));
            }
        }
        return new aoq(aot);
    }

    public final long a(aoj aoj) {
        long j = this.d;
        if (j < 0) {
            return -1;
        }
        this.d = -1;
        return -(j + 2);
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
    public final void a(long j) {
        this.d = this.a[blm.a(this.a, j, true)];
    }
}
