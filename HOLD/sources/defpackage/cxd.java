package defpackage;

/* renamed from: cxd  reason: default package */
/* compiled from: PG */
final class cxd implements Runnable {
    private final /* synthetic */ cxe a;

    public cxd(cxe cxe) {
        this.a = cxe;
    }

    public final void run() {
        this.a.d();
        cwh cwh = this.a.i;
        if (cwh != null) {
            cwh.b();
        }
    }
}
