package p000;

/* renamed from: aij */
/* compiled from: PG */
final class aij implements C0082cz {

    /* renamed from: a */
    private final aii f400a;

    /* renamed from: b */
    private final ail f401b;

    /* renamed from: c */
    private final C0082cz f402c;

    public aij(C0082cz czVar, aii aii, ail ail) {
        this.f402c = czVar;
        this.f400a = aii;
        this.f401b = ail;
    }

    /* renamed from: a */
    public final Object mo317a() {
        Object a = this.f402c.mo317a();
        if (a == null) {
            a = this.f400a.mo316a();
        }
        if (a instanceof aik) {
            ((aik) a).mo319P().f404a = false;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo318a(Object obj) {
        if (obj instanceof aik) {
            ((aik) obj).mo319P().f404a = true;
        }
        this.f401b.mo315a(obj);
        return this.f402c.mo318a(obj);
    }
}
