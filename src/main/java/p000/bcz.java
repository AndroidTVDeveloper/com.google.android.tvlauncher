package p000;

import java.util.List;

/* renamed from: bcz */
/* compiled from: PG */
public final class bcz {

    /* renamed from: a */
    public final int f3360a;

    /* renamed from: b */
    public final long f3361b;

    /* renamed from: c */
    public final akh[] f3362c;

    /* renamed from: d */
    public final int f3363d;

    /* renamed from: e */
    public final String f3364e;

    /* renamed from: f */
    public final String f3365f;

    /* renamed from: g */
    public final List f3366g;

    /* renamed from: h */
    private final long[] f3367h;

    /* renamed from: i */
    private final long f3368i;

    public bcz(String str, String str2, int i, long j, akh[] akhArr, List list, long j2) {
        long j3 = j;
        List list2 = list;
        long[] a = blm.m3655a(list2, j3);
        long b = blm.m3663b(j2, 1000000, j);
        this.f3364e = str;
        this.f3365f = str2;
        this.f3360a = i;
        this.f3361b = j3;
        this.f3362c = akhArr;
        this.f3366g = list2;
        this.f3367h = a;
        this.f3368i = b;
        this.f3363d = list.size();
    }

    /* renamed from: b */
    public final long mo1770b(int i) {
        if (i == this.f3363d - 1) {
            return this.f3368i;
        }
        long[] jArr = this.f3367h;
        return jArr[i + 1] - jArr[i];
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
    public final int mo1768a(long j) {
        return blm.m3628a(this.f3367h, j, true);
    }

    /* renamed from: a */
    public final long mo1769a(int i) {
        return this.f3367h[i];
    }
}
