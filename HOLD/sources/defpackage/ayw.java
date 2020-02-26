package defpackage;

/* renamed from: ayw  reason: default package */
/* compiled from: PG */
public final class ayw extends ayl {
    private static final aop a = new aop();
    private final ayo b;
    private long c;
    private volatile boolean d;

    public ayw(bhv bhv, bhy bhy, akh akh, int i, Object obj, ayo ayo) {
        super(bhv, bhy, 2, akh, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.b = ayo;
    }

    public final void a() {
        this.d = true;
    }

    public final void b() {
        aof aof;
        bhy a2 = this.e.a(this.c);
        try {
            bjd bjd = this.l;
            aof = new aof(bjd, a2.d, bjd.a(a2));
            if (this.c == 0) {
                this.b.a(null, -9223372036854775807L, -9223372036854775807L);
            }
            aoi aoi = this.b.a;
            int i = 0;
            while (i == 0 && !this.d) {
                i = aoi.a(aof, a);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            bks.b(z);
            this.c = aof.c - this.e.d;
            blm.a((bhv) this.l);
        } catch (Throwable th) {
            blm.a((bhv) this.l);
            throw th;
        }
    }
}
