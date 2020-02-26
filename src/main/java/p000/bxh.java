package p000;

/* renamed from: bxh */
/* compiled from: PG */
public final class bxh extends bxb {

    /* renamed from: a */
    public final Object f4977a = new Object();

    /* renamed from: b */
    public final bxd f4978b = new bxd();

    /* renamed from: c */
    public boolean f4979c;

    /* renamed from: d */
    public volatile boolean f4980d;

    /* renamed from: e */
    public Exception f4981e;

    /* renamed from: a */
    public final bxb mo2511a(bwx bwx) {
        this.f4978b.mo2514a(new bww(bxg.f4976a, bwx));
        m4335b();
        return this;
    }

    /* renamed from: a */
    public final void mo2512a(bxa bxa) {
        this.f4978b.mo2514a(new bwz(bxg.f4976a));
        m4335b();
    }

    /* renamed from: a */
    public final void mo2517a() {
        buh.m4206a(!this.f4979c, "Task is already complete");
    }

    /* renamed from: b */
    private final void m4335b() {
        synchronized (this.f4977a) {
            if (this.f4979c) {
                this.f4978b.mo2513a(this);
            }
        }
    }
}
