package defpackage;

/* renamed from: aym  reason: default package */
/* compiled from: PG */
final class aym implements aov {
    public akh a;
    private final int b;
    private final akh c;
    private final aoh d = new aoh();
    private aov e;
    private long f;

    public aym(int i, akh akh) {
        this.b = i;
        this.c = akh;
    }

    public final void a(ayn ayn, long j) {
        if (ayn != null) {
            this.f = j;
            aov a2 = ayn.a(this.b);
            this.e = a2;
            akh akh = this.a;
            if (akh != null) {
                a2.a(akh);
                return;
            }
            return;
        }
        this.e = this.d;
    }

    public final void a(akh akh) {
        akh akh2 = this.c;
        if (akh2 != null) {
            akh = akh.a(akh2);
        }
        this.a = akh;
        this.e.a(akh);
    }

    public final int a(aoj aoj, int i, boolean z) {
        return this.e.a(aoj, i, z);
    }

    public final void a(bky bky, int i) {
        this.e.a(bky, i);
    }

    public final void a(long j, int i, int i2, int i3, aou aou) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.d;
        }
        this.e.a(j, i, i2, i3, aou);
    }
}
