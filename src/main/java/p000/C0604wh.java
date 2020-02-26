package p000;

/* renamed from: wh */
/* compiled from: PG */
final class C0604wh implements Runnable {

    /* renamed from: a */
    private final agr f10678a;

    /* renamed from: b */
    private final /* synthetic */ C0607wk f10679b;

    public C0604wh(C0607wk wkVar, agr agr) {
        this.f10679b = wkVar;
        this.f10678a = agr;
    }

    public final void run() {
        synchronized (this.f10678a.mo244h()) {
            synchronized (this.f10679b) {
                if (this.f10679b.f10683a.mo6061a(this.f10678a)) {
                    this.f10679b.f10694l.mo6073e();
                    C0607wk wkVar = this.f10679b;
                    try {
                        this.f10678a.mo243a(wkVar.f10694l, wkVar.f10696n);
                        this.f10679b.mo6067a(this.f10678a);
                    } catch (Throwable th) {
                        throw new C0576vg(th);
                    }
                }
                this.f10679b.mo6065a();
            }
        }
    }
}
