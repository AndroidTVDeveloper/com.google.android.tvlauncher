package defpackage;

/* renamed from: ayu  reason: default package */
/* compiled from: PG */
public final class ayu extends ayi {
    private static final aop n = new aop();
    private final int o;
    private final long p;
    private final ayo q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public final long d() {
        return this.m + ((long) this.o);
    }

    public final boolean e() {
        return this.t;
    }

    public ayu(bhv bhv, bhy bhy, akh akh, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, ayo ayo) {
        super(bhv, bhy, akh, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = ayo;
    }

    public final void a() {
        this.s = true;
    }

    public final void b() {
        aof aof;
        bhy a = this.e.a(this.r);
        try {
            bjd bjd = this.l;
            aof = new aof(bjd, a.d, bjd.a(a));
            if (this.r == 0) {
                ayk ayk = this.c;
                ayk.a(this.p);
                ayo ayo = this.q;
                long j = this.a;
                long j2 = j != -9223372036854775807L ? j - this.p : -9223372036854775807L;
                long j3 = this.b;
                ayo.a(ayk, j2, j3 != -9223372036854775807L ? j3 - this.p : -9223372036854775807L);
            }
            aoi aoi = this.q.a;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.s) {
                i = aoi.a(aof, n);
            }
            if (i != 1) {
                z = true;
            }
            bks.b(z);
            this.r = aof.c - this.e.d;
            blm.a((bhv) this.l);
            this.t = true;
        } catch (Throwable th) {
            blm.a((bhv) this.l);
            throw th;
        }
    }
}
