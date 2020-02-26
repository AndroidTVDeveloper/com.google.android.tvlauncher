package p000;

/* renamed from: akp */
/* compiled from: PG */
public final class akp {

    /* renamed from: n */
    private static final awt f610n = new awt(new Object());

    /* renamed from: a */
    public final alh f611a;

    /* renamed from: b */
    public final awt f612b;

    /* renamed from: c */
    public final long f613c;

    /* renamed from: d */
    public final long f614d;

    /* renamed from: e */
    public final int f615e;

    /* renamed from: f */
    public final ajh f616f;

    /* renamed from: g */
    public final boolean f617g;

    /* renamed from: h */
    public final aye f618h;

    /* renamed from: i */
    public final bgr f619i;

    /* renamed from: j */
    public final awt f620j;

    /* renamed from: k */
    public volatile long f621k;

    /* renamed from: l */
    public volatile long f622l;

    /* renamed from: m */
    public volatile long f623m;

    public akp(alh alh, awt awt, long j, long j2, int i, ajh ajh, boolean z, aye aye, bgr bgr, awt awt2, long j3, long j4, long j5) {
        this.f611a = alh;
        this.f612b = awt;
        this.f613c = j;
        this.f614d = j2;
        this.f615e = i;
        this.f616f = ajh;
        this.f617g = z;
        this.f618h = aye;
        this.f619i = bgr;
        this.f620j = awt2;
        this.f621k = j3;
        this.f622l = j4;
        this.f623m = j5;
    }

    /* renamed from: a */
    public final akp mo459a(awt awt, long j, long j2, long j3) {
        return new akp(this.f611a, awt, j, !awt.mo1504a() ? -9223372036854775807L : j2, this.f615e, this.f616f, this.f617g, this.f618h, this.f619i, this.f620j, this.f621k, j3, j);
    }

    /* renamed from: a */
    public final akp mo458a(ajh ajh) {
        alh alh = this.f611a;
        return new akp(alh, this.f612b, this.f613c, this.f614d, this.f615e, ajh, this.f617g, this.f618h, this.f619i, this.f620j, this.f621k, this.f622l, this.f623m);
    }

    /* renamed from: a */
    public final akp mo460a(aye aye, bgr bgr) {
        alh alh = this.f611a;
        return new akp(alh, this.f612b, this.f613c, this.f614d, this.f615e, this.f616f, this.f617g, aye, bgr, this.f620j, this.f621k, this.f622l, this.f623m);
    }

    /* renamed from: a */
    public static akp m782a(long j, bgr bgr) {
        bgr bgr2 = bgr;
        return new akp(alh.f685a, f610n, j, -9223372036854775807L, 1, null, false, aye.f2750a, bgr2, f610n, j, 0, j);
    }

    /* renamed from: a */
    public final awt mo461a(alg alg, alf alf) {
        if (this.f611a.mo552c()) {
            return f610n;
        }
        int d = this.f611a.mo553d();
        int i = this.f611a.mo548a(d, alg).f676e;
        int a = this.f611a.mo525a(this.f612b.f2566a);
        long j = -1;
        if (a != -1) {
            this.f611a.mo551a(a, alf);
            if (d == 0) {
                j = this.f612b.f2569d;
            }
        }
        return new awt(this.f611a.mo528a(0), j);
    }
}
