package p000;

/* renamed from: anz */
/* compiled from: PG */
public final class anz {

    /* renamed from: a */
    public final long f1459a;

    /* renamed from: b */
    public final long f1460b;

    /* renamed from: c */
    public long f1461c = 0;

    /* renamed from: d */
    public long f1462d;

    /* renamed from: e */
    public long f1463e;

    /* renamed from: f */
    public long f1464f;

    /* renamed from: g */
    public long f1465g;

    protected anz(long j, long j2, long j3, long j4) {
        this.f1459a = j;
        long j5 = j2;
        this.f1460b = j5;
        long j6 = j3;
        this.f1462d = j6;
        this.f1463e = 0;
        long j7 = j4;
        this.f1464f = j7;
        this.f1465g = m1604a(j5, 0, j6, 0, j7);
    }

    /* renamed from: a */
    protected static long m1604a(long j, long j2, long j3, long j4, long j5) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j6 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return blm.m3632a(((j4 + j6) - 188) - (j6 / 20), j4, j5 - 1);
    }

    /* renamed from: a */
    public final void mo1178a() {
        this.f1465g = m1604a(this.f1460b, this.f1461c, this.f1462d, this.f1463e, this.f1464f);
    }
}
