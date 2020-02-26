package defpackage;

/* renamed from: csr  reason: default package */
/* compiled from: PG */
final /* synthetic */ class csr implements Runnable {
    private final css a;

    public csr(css css) {
        this.a = css;
    }

    public final void run() {
        css css = this.a;
        css.q.a(css.d(), "PAYLOAD_FOCUS_CHANGED");
        cst cst = css.q;
        int i = cst.e;
        if (i != -1) {
            cst.a(i, "PAYLOAD_FOCUS_CHANGED");
            css.q.e = -1;
        }
    }
}
