package p000;

/* renamed from: ayu */
/* compiled from: PG */
public final class ayu extends ayi {

    /* renamed from: n */
    private static final aop f2819n = new aop();

    /* renamed from: o */
    private final int f2820o;

    /* renamed from: p */
    private final long f2821p;

    /* renamed from: q */
    private final ayo f2822q;

    /* renamed from: r */
    private long f2823r;

    /* renamed from: s */
    private volatile boolean f2824s;

    /* renamed from: t */
    private boolean f2825t;

    /* renamed from: d */
    public final long mo1641d() {
        return this.f2832m + ((long) this.f2820o);
    }

    /* renamed from: e */
    public final boolean mo1642e() {
        return this.f2825t;
    }

    public ayu(bhv bhv, bhy bhy, akh akh, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, ayo ayo) {
        super(bhv, bhy, akh, i, obj, j, j2, j3, j4, j5);
        this.f2820o = i2;
        this.f2821p = j6;
        this.f2822q = ayo;
    }

    /* renamed from: a */
    public final void mo1538a() {
        this.f2824s = true;
    }

    /* renamed from: b */
    public final void mo1540b() {
        aof aof;
        bhy a = this.f2767e.mo1955a(this.f2823r);
        try {
            bjd bjd = this.f2774l;
            aof = new aof(bjd, a.f4001d, bjd.mo1499a(a));
            if (this.f2823r == 0) {
                ayk ayk = this.f2763c;
                ayk.mo1623a(this.f2821p);
                ayo ayo = this.f2822q;
                long j = this.f2761a;
                long j2 = j != -9223372036854775807L ? j - this.f2821p : -9223372036854775807L;
                long j3 = this.f2762b;
                ayo.mo1626a(ayk, j2, j3 != -9223372036854775807L ? j3 - this.f2821p : -9223372036854775807L);
            }
            aoi aoi = this.f2822q.f2781a;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.f2824s) {
                i = aoi.mo1206a(aof, f2819n);
            }
            if (i != 1) {
                z = true;
            }
            bks.m3512b(z);
            this.f2823r = aof.f1490c - this.f2767e.f4001d;
            blm.m3644a((bhv) this.f2774l);
            this.f2825t = true;
        } catch (Throwable th) {
            blm.m3644a((bhv) this.f2774l);
            throw th;
        }
    }
}
