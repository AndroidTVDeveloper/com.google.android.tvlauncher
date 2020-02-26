package defpackage;

/* renamed from: akp  reason: default package */
/* compiled from: PG */
public final class akp {
    private static final awt n = new awt(new Object());
    public final alh a;
    public final awt b;
    public final long c;
    public final long d;
    public final int e;
    public final ajh f;
    public final boolean g;
    public final aye h;
    public final bgr i;
    public final awt j;
    public volatile long k;
    public volatile long l;
    public volatile long m;

    public akp(alh alh, awt awt, long j2, long j3, int i2, ajh ajh, boolean z, aye aye, bgr bgr, awt awt2, long j4, long j5, long j6) {
        this.a = alh;
        this.b = awt;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = ajh;
        this.g = z;
        this.h = aye;
        this.i = bgr;
        this.j = awt2;
        this.k = j4;
        this.l = j5;
        this.m = j6;
    }

    public final akp a(awt awt, long j2, long j3, long j4) {
        return new akp(this.a, awt, j2, !awt.a() ? -9223372036854775807L : j3, this.e, this.f, this.g, this.h, this.i, this.j, this.k, j4, j2);
    }

    public final akp a(ajh ajh) {
        alh alh = this.a;
        return new akp(alh, this.b, this.c, this.d, this.e, ajh, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final akp a(aye aye, bgr bgr) {
        alh alh = this.a;
        return new akp(alh, this.b, this.c, this.d, this.e, this.f, this.g, aye, bgr, this.j, this.k, this.l, this.m);
    }

    public static akp a(long j2, bgr bgr) {
        bgr bgr2 = bgr;
        return new akp(alh.a, n, j2, -9223372036854775807L, 1, null, false, aye.a, bgr2, n, j2, 0, j2);
    }

    public final awt a(alg alg, alf alf) {
        if (this.a.c()) {
            return n;
        }
        int d2 = this.a.d();
        int i2 = this.a.a(d2, alg).e;
        int a2 = this.a.a(this.b.a);
        long j2 = -1;
        if (a2 != -1) {
            this.a.a(a2, alf);
            if (d2 == 0) {
                j2 = this.b.d;
            }
        }
        return new awt(this.a.a(0), j2);
    }
}
