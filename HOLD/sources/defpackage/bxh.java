package defpackage;

/* renamed from: bxh  reason: default package */
/* compiled from: PG */
public final class bxh extends bxb {
    public final Object a = new Object();
    public final bxd b = new bxd();
    public boolean c;
    public volatile boolean d;
    public Exception e;

    public final bxb a(bwx bwx) {
        this.b.a(new bww(bxg.a, bwx));
        b();
        return this;
    }

    public final void a(bxa bxa) {
        this.b.a(new bwz(bxg.a));
        b();
    }

    public final void a() {
        buh.a(!this.c, "Task is already complete");
    }

    private final void b() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }
}
