package defpackage;

/* renamed from: csn  reason: default package */
/* compiled from: PG */
final /* synthetic */ class csn implements Runnable {
    private final csq a;

    public csn(csq csq) {
        this.a = csq;
    }

    public final void run() {
        csq csq = this.a;
        csq.r.a(csq.d(), "PAYLOAD_FOCUS_CHANGED");
        cst cst = csq.r;
        int i = cst.e;
        if (i != -1) {
            cst.a(i, "PAYLOAD_FOCUS_CHANGED");
            csq.r.e = -1;
        }
    }
}
