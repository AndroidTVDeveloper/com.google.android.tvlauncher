package defpackage;

/* renamed from: aza  reason: default package */
/* compiled from: PG */
public final class aza extends ayi {
    private final int n;
    private final akh o;
    private long p;
    private boolean q;

    public aza(bhv bhv, bhy bhy, akh akh, int i, Object obj, long j, long j2, long j3, int i2, akh akh2) {
        super(bhv, bhy, akh, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.n = i2;
        this.o = akh2;
    }

    public final void a() {
    }

    public final boolean e() {
        return this.q;
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        try {
            long a = this.l.a(this.e.a(this.p));
            if (a != -1) {
                a += this.p;
            }
            aof aof = new aof(this.l, this.p, a);
            ayk ayk = this.c;
            ayk.a(0L);
            aov a2 = ayk.a(this.n);
            a2.a(this.o);
            for (int i = 0; i != -1; i = a2.a(aof, Integer.MAX_VALUE, true)) {
                this.p += (long) i;
            }
            a2.a(this.j, 1, (int) this.p, 0, null);
            blm.a((bhv) this.l);
            this.q = true;
        } catch (Throwable th) {
            blm.a((bhv) this.l);
            throw th;
        }
    }
}
