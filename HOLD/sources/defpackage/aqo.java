package defpackage;

/* renamed from: aqo  reason: default package */
/* compiled from: PG */
public final class aqo {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final akh f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final aqp[] k;

    public aqo(int i2, int i3, long j2, long j3, long j4, akh akh, int i4, aqp[] aqpArr, int i5, long[] jArr, long[] jArr2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = akh;
        this.g = i4;
        this.k = aqpArr;
        this.j = i5;
        this.h = jArr;
        this.i = jArr2;
    }

    public final aqp a(int i2) {
        aqp[] aqpArr = this.k;
        if (aqpArr != null) {
            return aqpArr[i2];
        }
        return null;
    }
}
