package defpackage;

import java.util.List;

/* renamed from: bcz  reason: default package */
/* compiled from: PG */
public final class bcz {
    public final int a;
    public final long b;
    public final akh[] c;
    public final int d;
    public final String e;
    public final String f;
    public final List g;
    private final long[] h;
    private final long i;

    public bcz(String str, String str2, int i2, long j, akh[] akhArr, List list, long j2) {
        long j3 = j;
        List list2 = list;
        long[] a2 = blm.a(list2, j3);
        long b2 = blm.b(j2, 1000000, j);
        this.e = str;
        this.f = str2;
        this.a = i2;
        this.b = j3;
        this.c = akhArr;
        this.g = list2;
        this.h = a2;
        this.i = b2;
        this.d = list.size();
    }

    public final long b(int i2) {
        if (i2 == this.d - 1) {
            return this.i;
        }
        long[] jArr = this.h;
        return jArr[i2 + 1] - jArr[i2];
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
        return blm.a(this.h, j, true);
    }

    public final long a(int i2) {
        return this.h[i2];
    }
}
