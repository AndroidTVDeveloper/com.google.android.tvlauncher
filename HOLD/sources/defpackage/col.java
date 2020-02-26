package defpackage;

/* renamed from: col  reason: default package */
/* compiled from: PG */
final /* synthetic */ class col implements Runnable {
    private final con a;

    public col(con con) {
        this.a = con;
    }

    public final void run() {
        con con = this.a;
        con.r.a(con.d(), "PAYLOAD_FOCUS_CHANGED");
        coo coo = con.r;
        int i = coo.f;
        if (i != -1) {
            coo.a(i, "PAYLOAD_FOCUS_CHANGED");
            con.r.f = -1;
        }
    }
}
