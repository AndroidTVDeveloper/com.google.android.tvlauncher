package defpackage;

/* renamed from: cpj  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpj implements Runnable {
    private final cpn a;

    public cpj(cpn cpn) {
        this.a = cpn;
    }

    public final void run() {
        cpn cpn = this.a;
        cpn.C.a(cpn.d(), "PAYLOAD_FOCUS_CHANGED");
        cpo cpo = cpn.C;
        int i = cpo.d;
        if (i != -1) {
            cpo.a(i, "PAYLOAD_FOCUS_CHANGED");
            cpn.C.d = -1;
        }
    }
}
