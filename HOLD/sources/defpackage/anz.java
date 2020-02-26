package defpackage;

/* renamed from: anz  reason: default package */
/* compiled from: PG */
public final class anz {
    public final long a;
    public final long b;
    public long c = 0;
    public long d;
    public long e;
    public long f;
    public long g;

    protected anz(long j, long j2, long j3, long j4) {
        this.a = j;
        long j5 = j2;
        this.b = j5;
        long j6 = j3;
        this.d = j6;
        this.e = 0;
        long j7 = j4;
        this.f = j7;
        this.g = a(j5, 0, j6, 0, j7);
    }

    protected static long a(long j, long j2, long j3, long j4, long j5) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j6 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return blm.a(((j4 + j6) - 188) - (j6 / 20), j4, j5 - 1);
    }

    public final void a() {
        this.g = a(this.b, this.c, this.d, this.e, this.f);
    }
}
