package p000;

/* renamed from: dbc */
/* compiled from: PG */
public final class dbc {

    /* renamed from: f */
    private static final Object f8127f = new Object();

    /* renamed from: g */
    private static dbc f8128g;

    /* renamed from: h */
    private static int f8129h = 0;

    /* renamed from: a */
    public long f8130a;

    /* renamed from: b */
    public long f8131b;

    /* renamed from: c */
    public long f8132c;

    /* renamed from: d */
    public dbb f8133d;

    /* renamed from: e */
    public boolean f8134e;

    /* renamed from: i */
    private dbc f8135i;

    /* renamed from: j */
    private final dba f8136j = new dba(this);

    /* renamed from: a */
    public static dbc m6076a() {
        synchronized (f8127f) {
            if (f8128g == null) {
                return new dbc();
            }
            dbc dbc = f8128g;
            f8128g = dbc.f8135i;
            dbc.f8135i = null;
            f8129h--;
            return dbc;
        }
    }

    /* renamed from: b */
    public final void mo4062b() {
        synchronized (f8127f) {
            if (f8129h < 10 && f8128g != this && this.f8135i == null) {
                mo4064d();
                this.f8130a = 0;
                this.f8131b = 0;
                this.f8132c = 0;
                this.f8133d = null;
                this.f8134e = false;
                this.f8135i = f8128g;
                f8128g = this;
                f8129h++;
            }
        }
    }

    /* renamed from: a */
    public final void mo4061a(dbb dbb) {
        this.f8133d = dbb;
        if (dbb == null) {
            mo4064d();
        }
    }

    /* renamed from: c */
    public final void mo4063c() {
        long j = this.f8131b;
        if (j > 0) {
            long j2 = this.f8132c;
            if (j2 > 0) {
                if (j2 <= j) {
                    throw new IllegalArgumentException("Maximum timeout must be larger than timeout");
                } else if (this.f8133d == null) {
                    throw new IllegalArgumentException("Listener must not be null");
                } else if (!this.f8134e) {
                    this.f8134e = true;
                    this.f8136j.sendEmptyMessageDelayed(1, j);
                    this.f8136j.sendEmptyMessageDelayed(2, this.f8132c);
                    return;
                } else {
                    this.f8136j.removeMessages(1);
                    this.f8136j.sendEmptyMessageDelayed(1, this.f8131b);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Both timeout and maximum timeout must be provided");
    }

    /* renamed from: d */
    public final void mo4064d() {
        if (this.f8134e) {
            this.f8136j.removeMessages(1);
            this.f8136j.removeMessages(2);
            this.f8134e = false;
        }
    }
}
