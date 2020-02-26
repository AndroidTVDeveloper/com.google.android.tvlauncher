package p000;

/* renamed from: aza */
/* compiled from: PG */
public final class aza extends ayi {

    /* renamed from: n */
    private final int f2836n;

    /* renamed from: o */
    private final akh f2837o;

    /* renamed from: p */
    private long f2838p;

    /* renamed from: q */
    private boolean f2839q;

    public aza(bhv bhv, bhy bhy, akh akh, int i, Object obj, long j, long j2, long j3, int i2, akh akh2) {
        super(bhv, bhy, akh, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f2836n = i2;
        this.f2837o = akh2;
    }

    /* renamed from: a */
    public final void mo1538a() {
    }

    /* renamed from: e */
    public final boolean mo1642e() {
        return this.f2839q;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo1540b() {
        try {
            long a = this.f2774l.mo1499a(this.f2767e.mo1955a(this.f2838p));
            if (a != -1) {
                a += this.f2838p;
            }
            aof aof = new aof(this.f2774l, this.f2838p, a);
            ayk ayk = this.f2763c;
            ayk.mo1623a(0L);
            aov a2 = ayk.mo1622a(this.f2836n);
            a2.mo1204a(this.f2837o);
            for (int i = 0; i != -1; i = a2.mo1202a(aof, Integer.MAX_VALUE, true)) {
                this.f2838p += (long) i;
            }
            a2.mo1203a(this.f2772j, 1, (int) this.f2838p, 0, null);
            blm.m3644a((bhv) this.f2774l);
            this.f2839q = true;
        } catch (Throwable th) {
            blm.m3644a((bhv) this.f2774l);
            throw th;
        }
    }
}
