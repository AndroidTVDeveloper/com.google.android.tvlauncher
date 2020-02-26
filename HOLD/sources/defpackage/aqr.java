package defpackage;

/* renamed from: aqr  reason: default package */
/* compiled from: PG */
final class aqr {
    public final aqo a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public aqr(aqo aqo, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        bks.a(length == length2);
        int length3 = jArr.length;
        bks.a(length3 == length2);
        int length4 = iArr2.length;
        bks.a(length4 != length2 ? false : z);
        this.a = aqo;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
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
    public final int a(long j) {
        for (int a2 = blm.a(this.f, j, false); a2 >= 0; a2--) {
            if ((this.g[a2] & 1) != 0) {
                return a2;
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
    public final int b(long j) {
        for (int a2 = blm.a(this.f, j, true, false); a2 < this.f.length; a2++) {
            if ((this.g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}
