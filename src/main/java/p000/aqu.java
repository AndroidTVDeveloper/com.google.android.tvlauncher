package p000;

/* renamed from: aqu */
/* compiled from: PG */
final class aqu implements aqz, aos {

    /* renamed from: a */
    public long[] f1920a;

    /* renamed from: b */
    public long[] f1921b;

    /* renamed from: c */
    public long f1922c = -1;

    /* renamed from: d */
    private long f1923d = -1;

    /* renamed from: e */
    private final /* synthetic */ aqv f1924e;

    public aqu(aqv aqv) {
        this.f1924e = aqv;
    }

    /* renamed from: a */
    public final aos mo1267a() {
        return this;
    }

    /* renamed from: d */
    public final boolean mo1177d() {
        return true;
    }

    /* renamed from: b */
    public final long mo1175b() {
        bko bko = this.f1924e.f1925a;
        return (bko.f4230d * 1000000) / ((long) bko.f4227a);
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
        int a = blm.m3628a(this.f1920a, this.f1924e.mo1276b(j), true);
        long a2 = this.f1924e.mo1275a(this.f1920a[a]);
        aot aot = new aot(a2, this.f1922c + this.f1921b[a]);
        if (a2 < j) {
            long[] jArr = this.f1920a;
            if (a != jArr.length - 1) {
                int i = a + 1;
                return new aoq(aot, new aot(this.f1924e.mo1275a(jArr[i]), this.f1922c + this.f1921b[i]));
            }
        }
        return new aoq(aot);
    }

    /* renamed from: a */
    public final long mo1266a(aoj aoj) {
        long j = this.f1923d;
        if (j < 0) {
            return -1;
        }
        this.f1923d = -1;
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
    /* renamed from: a */
    public final void mo1268a(long j) {
        this.f1923d = this.f1920a[blm.m3628a(this.f1920a, j, true)];
    }
}
