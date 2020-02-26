package p000;

/* renamed from: asn */
/* compiled from: PG */
public final class asn implements ask {

    /* renamed from: a */
    private blj f2261a;

    /* renamed from: b */
    private aov f2262b;

    /* renamed from: c */
    private boolean f2263c;

    /* renamed from: a */
    public final void mo1303a(bky bky) {
        long j;
        long j2;
        if (!this.f2263c) {
            if (this.f2261a.mo2113a() != -9223372036854775807L) {
                this.f2262b.mo1204a(akh.m735a(null, "application/x-scte35", this.f2261a.mo2113a()));
                this.f2263c = true;
            } else {
                return;
            }
        }
        int b = bky.mo2070b();
        this.f2262b.mo1205a(bky, b);
        aov aov = this.f2262b;
        blj blj = this.f2261a;
        if (blj.f4291c != -9223372036854775807L) {
            j2 = blj.f4291c + blj.f4290b;
        } else {
            j = blj.f4289a;
            if (j == Long.MAX_VALUE) {
                j2 = -9223372036854775807L;
            }
            aov.mo1203a(j, 1, b, 0, null);
        }
        j = j2;
        aov.mo1203a(j, 1, b, 0, null);
    }

    /* renamed from: a */
    public final void mo1304a(blj blj, aok aok, asw asw) {
        this.f2261a = blj;
        asw.mo1308a();
        aov a = aok.mo1211a(asw.mo1309b(), 4);
        this.f2262b = a;
        a.mo1204a(akh.m728a(asw.mo1310c(), "application/x-scte35"));
    }
}
