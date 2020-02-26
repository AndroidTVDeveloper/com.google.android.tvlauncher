package defpackage;

/* renamed from: csm  reason: default package */
/* compiled from: PG */
final class csm extends cle {
    private final /* synthetic */ cst a;

    public csm(cst cst) {
        this.a = cst;
    }

    public final void a() {
        cst cst = this.a;
        cft cft = new cft(1, "watch_next");
        dja j = cft.j();
        int a2 = cst.n ? cst.a() - 1 : cst.a();
        if (j.b) {
            j.b();
            j.b = false;
        }
        dnf dnf = (dnf) j.a;
        dnf dnf2 = dnf.c;
        dnf.a = 1 | dnf.a;
        dnf.b = a2;
        cst.c.a(cft);
        cst cst2 = this.a;
        cst2.e = -1;
        cst2.O();
    }
}
