package defpackage;

/* renamed from: cab  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cab implements dgp {
    private final cac a;
    private final String b;
    private final int c;

    public cab(cac cac, int i, String str) {
        this.a = cac;
        this.c = i;
        this.b = str;
    }

    public final dhb a() {
        cac cac = this.a;
        int i = this.c;
        String str = this.b;
        dja l = dom.q.l();
        dnr a2 = ccv.a(i, cac.a, str);
        if (l.b) {
            l.b();
            l.b = false;
        }
        dom dom = (dom) l.a;
        a2.getClass();
        dom.b = a2;
        dom.a |= 1;
        cac.a(null, false, (dom) l.g(), null);
        return dgy.a;
    }
}
