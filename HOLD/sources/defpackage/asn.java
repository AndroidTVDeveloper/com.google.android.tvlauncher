package defpackage;

/* renamed from: asn  reason: default package */
/* compiled from: PG */
public final class asn implements ask {
    private blj a;
    private aov b;
    private boolean c;

    public final void a(bky bky) {
        long j;
        long j2;
        if (!this.c) {
            if (this.a.a() != -9223372036854775807L) {
                this.b.a(akh.a(null, "application/x-scte35", this.a.a()));
                this.c = true;
            } else {
                return;
            }
        }
        int b2 = bky.b();
        this.b.a(bky, b2);
        aov aov = this.b;
        blj blj = this.a;
        if (blj.c != -9223372036854775807L) {
            j2 = blj.c + blj.b;
        } else {
            j = blj.a;
            if (j == Long.MAX_VALUE) {
                j2 = -9223372036854775807L;
            }
            aov.a(j, 1, b2, 0, null);
        }
        j = j2;
        aov.a(j, 1, b2, 0, null);
    }

    public final void a(blj blj, aok aok, asw asw) {
        this.a = blj;
        asw.a();
        aov a2 = aok.a(asw.b(), 4);
        this.b = a2;
        a2.a(akh.a(asw.c(), "application/x-scte35"));
    }
}
