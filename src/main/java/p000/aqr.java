package p000;

/* renamed from: aqr */
/* compiled from: PG */
final class aqr {

    /* renamed from: a */
    public final aqo f1899a;

    /* renamed from: b */
    public final int f1900b;

    /* renamed from: c */
    public final long[] f1901c;

    /* renamed from: d */
    public final int[] f1902d;

    /* renamed from: e */
    public final int f1903e;

    /* renamed from: f */
    public final long[] f1904f;

    /* renamed from: g */
    public final int[] f1905g;

    /* renamed from: h */
    public final long f1906h;

    public aqr(aqo aqo, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        bks.m3510a(length == length2);
        int length3 = jArr.length;
        bks.m3510a(length3 == length2);
        int length4 = iArr2.length;
        bks.m3510a(length4 != length2 ? false : z);
        this.f1899a = aqo;
        this.f1901c = jArr;
        this.f1902d = iArr;
        this.f1903e = i;
        this.f1904f = jArr2;
        this.f1905g = iArr2;
        this.f1906h = j;
        this.f1900b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
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
    public final int mo1264a(long j) {
        for (int a = blm.m3628a(this.f1904f, j, false); a >= 0; a--) {
            if ((this.f1905g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(long[], long, boolean, boolean):int
     arg types: [long[], long, int, int]
     candidates:
      blm.a(long, alb, long, long):long
      blm.a(long[], long, boolean, boolean):int */
    /* renamed from: b */
    public final int mo1265b(long j) {
        for (int a = blm.m3629a(this.f1904f, j, true, false); a < this.f1904f.length; a++) {
            if ((this.f1905g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
