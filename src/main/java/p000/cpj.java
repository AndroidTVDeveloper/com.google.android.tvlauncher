package p000;

/* renamed from: cpj */
/* compiled from: PG */
final /* synthetic */ class cpj implements Runnable {

    /* renamed from: a */
    private final cpn f6884a;

    public cpj(cpn cpn) {
        this.f6884a = cpn;
    }

    public final void run() {
        cpn cpn = this.f6884a;
        cpn.f6891C.mo5306a(cpn.mo5436d(), "PAYLOAD_FOCUS_CHANGED");
        cpo cpo = cpn.f6891C;
        int i = cpo.f6898d;
        if (i != -1) {
            cpo.mo5306a(i, "PAYLOAD_FOCUS_CHANGED");
            cpn.f6891C.f6898d = -1;
        }
    }
}
