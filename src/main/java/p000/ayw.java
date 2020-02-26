package p000;

/* renamed from: ayw */
/* compiled from: PG */
public final class ayw extends ayl {

    /* renamed from: a */
    private static final aop f2828a = new aop();

    /* renamed from: b */
    private final ayo f2829b;

    /* renamed from: c */
    private long f2830c;

    /* renamed from: d */
    private volatile boolean f2831d;

    public ayw(bhv bhv, bhy bhy, akh akh, int i, Object obj, ayo ayo) {
        super(bhv, bhy, 2, akh, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f2829b = ayo;
    }

    /* renamed from: a */
    public final void mo1538a() {
        this.f2831d = true;
    }

    /* renamed from: b */
    public final void mo1540b() {
        aof aof;
        bhy a = this.f2767e.mo1955a(this.f2830c);
        try {
            bjd bjd = this.f2774l;
            aof = new aof(bjd, a.f4001d, bjd.mo1499a(a));
            if (this.f2830c == 0) {
                this.f2829b.mo1626a(null, -9223372036854775807L, -9223372036854775807L);
            }
            aoi aoi = this.f2829b.f2781a;
            int i = 0;
            while (i == 0 && !this.f2831d) {
                i = aoi.mo1206a(aof, f2828a);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            bks.m3512b(z);
            this.f2830c = aof.f1490c - this.f2767e.f4001d;
            blm.m3644a((bhv) this.f2774l);
        } catch (Throwable th) {
            blm.m3644a((bhv) this.f2774l);
            throw th;
        }
    }
}
