package defpackage;

/* renamed from: cbh  reason: default package */
/* compiled from: PG */
final class cbh extends cbi {
    private volatile dnj a;
    private volatile dfc b;
    private volatile dfc c;
    private volatile dfc d;
    private volatile dfc e;
    private volatile dfc f;
    private volatile dfc g;
    private volatile dfc h;
    private volatile dfc i;
    private volatile dfc j;
    private final Object k = new Object();
    private final cbi l;

    public cbh(cbi cbi) {
        this.l = cbi;
    }

    public final dfc i() {
        if (this.i == null) {
            synchronized (this.k) {
                if (this.i == null) {
                    this.i = this.l.i();
                }
            }
        }
        return this.i;
    }

    public final dfc e() {
        if (this.e == null) {
            synchronized (this.k) {
                if (this.e == null) {
                    this.e = this.l.e();
                }
            }
        }
        return this.e;
    }

    public final dfc j() {
        if (this.j == null) {
            synchronized (this.k) {
                if (this.j == null) {
                    this.j = this.l.j();
                }
            }
        }
        return this.j;
    }

    public final dnj a() {
        if (this.a == null) {
            synchronized (this.k) {
                if (this.a == null) {
                    this.a = (dnj) dgx.a(this.l.a());
                }
            }
        }
        return this.a;
    }

    public final dfc b() {
        if (this.b == null) {
            synchronized (this.k) {
                if (this.b == null) {
                    this.b = this.l.b();
                }
            }
        }
        return this.b;
    }

    public final dfc g() {
        if (this.g == null) {
            synchronized (this.k) {
                if (this.g == null) {
                    this.g = this.l.g();
                }
            }
        }
        return this.g;
    }

    public final dfc c() {
        if (this.c == null) {
            synchronized (this.k) {
                if (this.c == null) {
                    this.c = this.l.c();
                }
            }
        }
        return this.c;
    }

    public final dfc f() {
        if (this.f == null) {
            synchronized (this.k) {
                if (this.f == null) {
                    this.f = this.l.f();
                }
            }
        }
        return this.f;
    }

    public final dfc h() {
        if (this.h == null) {
            synchronized (this.k) {
                if (this.h == null) {
                    this.h = this.l.h();
                }
            }
        }
        return this.h;
    }

    public final dfc d() {
        if (this.d == null) {
            synchronized (this.k) {
                if (this.d == null) {
                    dfc d2 = this.l.d();
                    if (!d2.a() || ((cci) d2.b()).c <= 0) {
                        d2 = dez.a;
                    }
                    this.d = d2;
                }
            }
        }
        return this.d;
    }
}
