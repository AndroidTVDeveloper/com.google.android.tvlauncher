package defpackage;

/* renamed from: bcg  reason: default package */
/* compiled from: PG */
public final class bcg implements Comparable {
    public final String a;
    public final bcg b;
    public final long c;
    public final int d;
    public final long e;
    public final anq f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public bcg(String str, long j2, long j3, String str2, String str3) {
        this(str, null, 0, -1, -9223372036854775807L, null, str2, str3, j2, j3, false);
    }

    public bcg(String str, bcg bcg, long j2, int i2, long j3, anq anq, String str2, String str3, long j4, long j5, boolean z) {
        this.a = str;
        this.b = bcg;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.f = anq;
        this.g = str2;
        this.h = str3;
        this.i = j4;
        this.j = j5;
        this.k = z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.e <= l.longValue()) {
            return this.e >= l.longValue() ? 0 : -1;
        }
        return 1;
    }
}
