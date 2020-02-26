package p000;

/* renamed from: eh */
/* compiled from: PG */
final class C0118eh {

    /* renamed from: a */
    public int f9125a;

    /* renamed from: b */
    public int f9126b;

    /* renamed from: c */
    public float f9127c;

    /* renamed from: d */
    public float f9128d;

    /* renamed from: e */
    public long f9129e = Long.MIN_VALUE;

    /* renamed from: f */
    public long f9130f = 0;

    /* renamed from: g */
    public int f9131g = 0;

    /* renamed from: h */
    public int f9132h = 0;

    /* renamed from: i */
    public long f9133i = -1;

    /* renamed from: j */
    public float f9134j;

    /* renamed from: k */
    public int f9135k;

    /* renamed from: a */
    public final float mo4708a(long j) {
        long j2 = this.f9129e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f9133i;
        if (j3 < 0 || j < j3) {
            return C0120ej.m7239a(((float) (j - j2)) / ((float) this.f9125a), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f9134j;
        return (1.0f - f) + (f * C0120ej.m7239a(((float) (j - j3)) / ((float) this.f9135k), 0.0f, 1.0f));
    }
}
