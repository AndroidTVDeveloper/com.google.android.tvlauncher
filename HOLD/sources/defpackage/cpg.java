package defpackage;

/* renamed from: cpg  reason: default package */
/* compiled from: PG */
final class cpg implements Runnable {
    private final /* synthetic */ cpi a;

    public cpg(cpi cpi) {
        this.a = cpi;
    }

    public final void run() {
        cpi cpi = this.a;
        cpi.w.a(cpi.t, "PAYLOAD_UPDATE_PIVOT");
        cpi cpi2 = this.a;
        cpi2.w.a(cpi2.u, "PAYLOAD_UPDATE_PIVOT");
    }
}
