package p000;

/* renamed from: col */
/* compiled from: PG */
final /* synthetic */ class col implements Runnable {

    /* renamed from: a */
    private final con f6217a;

    public col(con con) {
        this.f6217a = con;
    }

    public final void run() {
        con con = this.f6217a;
        con.f6782r.mo5306a(con.mo5436d(), "PAYLOAD_FOCUS_CHANGED");
        coo coo = con.f6782r;
        int i = coo.f6789f;
        if (i != -1) {
            coo.mo5306a(i, "PAYLOAD_FOCUS_CHANGED");
            con.f6782r.f6789f = -1;
        }
    }
}
