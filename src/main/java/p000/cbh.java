package p000;

/* renamed from: cbh */
/* compiled from: PG */
final class cbh extends cbi {

    /* renamed from: a */
    private volatile dnj f5203a;

    /* renamed from: b */
    private volatile dfc f5204b;

    /* renamed from: c */
    private volatile dfc f5205c;

    /* renamed from: d */
    private volatile dfc f5206d;

    /* renamed from: e */
    private volatile dfc f5207e;

    /* renamed from: f */
    private volatile dfc f5208f;

    /* renamed from: g */
    private volatile dfc f5209g;

    /* renamed from: h */
    private volatile dfc f5210h;

    /* renamed from: i */
    private volatile dfc f5211i;

    /* renamed from: j */
    private volatile dfc f5212j;

    /* renamed from: k */
    private final Object f5213k = new Object();

    /* renamed from: l */
    private final cbi f5214l;

    public cbh(cbi cbi) {
        this.f5214l = cbi;
    }

    /* renamed from: i */
    public final dfc mo2621i() {
        if (this.f5211i == null) {
            synchronized (this.f5213k) {
                if (this.f5211i == null) {
                    this.f5211i = this.f5214l.mo2621i();
                }
            }
        }
        return this.f5211i;
    }

    /* renamed from: e */
    public final dfc mo2617e() {
        if (this.f5207e == null) {
            synchronized (this.f5213k) {
                if (this.f5207e == null) {
                    this.f5207e = this.f5214l.mo2617e();
                }
            }
        }
        return this.f5207e;
    }

    /* renamed from: j */
    public final dfc mo2622j() {
        if (this.f5212j == null) {
            synchronized (this.f5213k) {
                if (this.f5212j == null) {
                    this.f5212j = this.f5214l.mo2622j();
                }
            }
        }
        return this.f5212j;
    }

    /* renamed from: a */
    public final dnj mo2613a() {
        if (this.f5203a == null) {
            synchronized (this.f5213k) {
                if (this.f5203a == null) {
                    this.f5203a = (dnj) dgx.m6401a(this.f5214l.mo2613a());
                }
            }
        }
        return this.f5203a;
    }

    /* renamed from: b */
    public final dfc mo2614b() {
        if (this.f5204b == null) {
            synchronized (this.f5213k) {
                if (this.f5204b == null) {
                    this.f5204b = this.f5214l.mo2614b();
                }
            }
        }
        return this.f5204b;
    }

    /* renamed from: g */
    public final dfc mo2619g() {
        if (this.f5209g == null) {
            synchronized (this.f5213k) {
                if (this.f5209g == null) {
                    this.f5209g = this.f5214l.mo2619g();
                }
            }
        }
        return this.f5209g;
    }

    /* renamed from: c */
    public final dfc mo2615c() {
        if (this.f5205c == null) {
            synchronized (this.f5213k) {
                if (this.f5205c == null) {
                    this.f5205c = this.f5214l.mo2615c();
                }
            }
        }
        return this.f5205c;
    }

    /* renamed from: f */
    public final dfc mo2618f() {
        if (this.f5208f == null) {
            synchronized (this.f5213k) {
                if (this.f5208f == null) {
                    this.f5208f = this.f5214l.mo2618f();
                }
            }
        }
        return this.f5208f;
    }

    /* renamed from: h */
    public final dfc mo2620h() {
        if (this.f5210h == null) {
            synchronized (this.f5213k) {
                if (this.f5210h == null) {
                    this.f5210h = this.f5214l.mo2620h();
                }
            }
        }
        return this.f5210h;
    }

    /* renamed from: d */
    public final dfc mo2616d() {
        if (this.f5206d == null) {
            synchronized (this.f5213k) {
                if (this.f5206d == null) {
                    dfc d = this.f5214l.mo2616d();
                    if (!d.mo4219a() || ((cci) d.mo4220b()).f5271c <= 0) {
                        d = dez.f8438a;
                    }
                    this.f5206d = d;
                }
            }
        }
        return this.f5206d;
    }
}
