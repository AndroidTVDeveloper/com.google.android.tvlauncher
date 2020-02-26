package defpackage;

/* renamed from: bzh  reason: default package */
/* compiled from: PG */
final class bzh implements cat {
    public final bzs a;

    public bzh(bzs bzs) {
        this.a = bzs;
    }

    public final void a() {
        this.a.i.a();
    }

    public final void c() {
        if (this.a.a()) {
            bzn b = this.a.b();
            if (b.d.compareAndSet(false, true)) {
                Thread.setDefaultUncaughtExceptionHandler(b.a(Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
    }

    public final void b() {
        bzs bzs = this.a;
        if (bzs.g.c().a() && ((cbv) bzs.g.c().b()).a) {
            bzs bzs2 = this.a;
            if (bzs2.a == null) {
                synchronized (cac.class) {
                    if (bzs2.a == null) {
                        bzs2.a = (cac) bzs2.a(new cac(bzs2.d, bzs2.c, bzs2.e, bzs2.f, ((cbv) bzs2.g.c().b()).b));
                    }
                }
            }
            bzs2.a.e();
        }
    }
}
