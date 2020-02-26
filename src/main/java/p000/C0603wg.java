package p000;

/* renamed from: wg */
/* compiled from: PG */
final class C0603wg implements Runnable {

    /* renamed from: a */
    private final agr f10676a;

    /* renamed from: b */
    private final /* synthetic */ C0607wk f10677b;

    public C0603wg(C0607wk wkVar, agr agr) {
        this.f10677b = wkVar;
        this.f10676a = agr;
    }

    public final void run() {
        synchronized (this.f10676a.mo244h()) {
            synchronized (this.f10677b) {
                if (this.f10677b.f10683a.mo6061a(this.f10676a)) {
                    C0607wk wkVar = this.f10677b;
                    try {
                        this.f10676a.mo242a(wkVar.f10692j);
                    } catch (Throwable th) {
                        throw new C0576vg(th);
                    }
                }
                this.f10677b.mo6065a();
            }
        }
    }
}
