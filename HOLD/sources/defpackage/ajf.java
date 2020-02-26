package defpackage;

/* renamed from: ajf  reason: default package */
/* compiled from: PG */
final class ajf implements bkr {
    public final blf a = new blf();
    public final aje b;
    public akx c;
    public bkr d;
    public boolean e = true;
    public boolean f;

    public ajf(aje aje) {
        this.b = aje;
    }

    public final akq Q() {
        bkr bkr = this.d;
        return bkr == null ? this.a.a : bkr.Q();
    }

    public final long b() {
        return this.e ? this.a.b() : this.d.b();
    }

    public final void a(akq akq) {
        bkr bkr = this.d;
        if (bkr != null) {
            bkr.a(akq);
            akq = this.d.Q();
        }
        this.a.a(akq);
    }

    public final void a() {
        this.f = false;
        this.a.d();
    }
}
