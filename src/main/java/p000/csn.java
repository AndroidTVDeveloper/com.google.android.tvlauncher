package p000;

/* renamed from: csn */
/* compiled from: PG */
final /* synthetic */ class csn implements Runnable {

    /* renamed from: a */
    private final csq f7264a;

    public csn(csq csq) {
        this.f7264a = csq;
    }

    public final void run() {
        csq csq = this.f7264a;
        csq.f7269r.mo5306a(csq.mo5436d(), "PAYLOAD_FOCUS_CHANGED");
        cst cst = csq.f7269r;
        int i = cst.f7282e;
        if (i != -1) {
            cst.mo5306a(i, "PAYLOAD_FOCUS_CHANGED");
            csq.f7269r.f7282e = -1;
        }
    }
}
