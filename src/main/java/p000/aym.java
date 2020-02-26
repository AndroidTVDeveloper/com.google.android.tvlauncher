package p000;

/* renamed from: aym */
/* compiled from: PG */
final class aym implements aov {

    /* renamed from: a */
    public akh f2775a;

    /* renamed from: b */
    private final int f2776b;

    /* renamed from: c */
    private final akh f2777c;

    /* renamed from: d */
    private final aoh f2778d = new aoh();

    /* renamed from: e */
    private aov f2779e;

    /* renamed from: f */
    private long f2780f;

    public aym(int i, akh akh) {
        this.f2776b = i;
        this.f2777c = akh;
    }

    /* renamed from: a */
    public final void mo1625a(ayn ayn, long j) {
        if (ayn != null) {
            this.f2780f = j;
            aov a = ayn.mo1622a(this.f2776b);
            this.f2779e = a;
            akh akh = this.f2775a;
            if (akh != null) {
                a.mo1204a(akh);
                return;
            }
            return;
        }
        this.f2779e = this.f2778d;
    }

    /* renamed from: a */
    public final void mo1204a(akh akh) {
        akh akh2 = this.f2777c;
        if (akh2 != null) {
            akh = akh.mo422a(akh2);
        }
        this.f2775a = akh;
        this.f2779e.mo1204a(akh);
    }

    /* renamed from: a */
    public final int mo1202a(aoj aoj, int i, boolean z) {
        return this.f2779e.mo1202a(aoj, i, z);
    }

    /* renamed from: a */
    public final void mo1205a(bky bky, int i) {
        this.f2779e.mo1205a(bky, i);
    }

    /* renamed from: a */
    public final void mo1203a(long j, int i, int i2, int i3, aou aou) {
        long j2 = this.f2780f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f2779e = this.f2778d;
        }
        this.f2779e.mo1203a(j, i, i2, i3, aou);
    }
}
