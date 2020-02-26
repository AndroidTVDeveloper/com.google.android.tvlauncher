package p000;

/* renamed from: csr */
/* compiled from: PG */
final /* synthetic */ class csr implements Runnable {

    /* renamed from: a */
    private final css f7274a;

    public csr(css css) {
        this.f7274a = css;
    }

    public final void run() {
        css css = this.f7274a;
        css.f7276q.mo5306a(css.mo5436d(), "PAYLOAD_FOCUS_CHANGED");
        cst cst = css.f7276q;
        int i = cst.f7282e;
        if (i != -1) {
            cst.mo5306a(i, "PAYLOAD_FOCUS_CHANGED");
            css.f7276q.f7282e = -1;
        }
    }
}
