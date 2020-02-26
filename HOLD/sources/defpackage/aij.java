package defpackage;

/* renamed from: aij  reason: default package */
/* compiled from: PG */
final class aij implements cz {
    private final aii a;
    private final ail b;
    private final cz c;

    public aij(cz czVar, aii aii, ail ail) {
        this.c = czVar;
        this.a = aii;
        this.b = ail;
    }

    public final Object a() {
        Object a2 = this.c.a();
        if (a2 == null) {
            a2 = this.a.a();
        }
        if (a2 instanceof aik) {
            ((aik) a2).P().a = false;
        }
        return a2;
    }

    public final boolean a(Object obj) {
        if (obj instanceof aik) {
            ((aik) obj).P().a = true;
        }
        this.b.a(obj);
        return this.c.a(obj);
    }
}
