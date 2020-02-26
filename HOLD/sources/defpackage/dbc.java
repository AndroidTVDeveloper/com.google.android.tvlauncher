package defpackage;

/* renamed from: dbc  reason: default package */
/* compiled from: PG */
public final class dbc {
    private static final Object f = new Object();
    private static dbc g;
    private static int h = 0;
    public long a;
    public long b;
    public long c;
    public dbb d;
    public boolean e;
    private dbc i;
    private final dba j = new dba(this);

    public static dbc a() {
        synchronized (f) {
            if (g == null) {
                return new dbc();
            }
            dbc dbc = g;
            g = dbc.i;
            dbc.i = null;
            h--;
            return dbc;
        }
    }

    public final void b() {
        synchronized (f) {
            if (h < 10 && g != this && this.i == null) {
                d();
                this.a = 0;
                this.b = 0;
                this.c = 0;
                this.d = null;
                this.e = false;
                this.i = g;
                g = this;
                h++;
            }
        }
    }

    public final void a(dbb dbb) {
        this.d = dbb;
        if (dbb == null) {
            d();
        }
    }

    public final void c() {
        long j2 = this.b;
        if (j2 > 0) {
            long j3 = this.c;
            if (j3 > 0) {
                if (j3 <= j2) {
                    throw new IllegalArgumentException("Maximum timeout must be larger than timeout");
                } else if (this.d == null) {
                    throw new IllegalArgumentException("Listener must not be null");
                } else if (!this.e) {
                    this.e = true;
                    this.j.sendEmptyMessageDelayed(1, j2);
                    this.j.sendEmptyMessageDelayed(2, this.c);
                    return;
                } else {
                    this.j.removeMessages(1);
                    this.j.sendEmptyMessageDelayed(1, this.b);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Both timeout and maximum timeout must be provided");
    }

    public final void d() {
        if (this.e) {
            this.j.removeMessages(1);
            this.j.removeMessages(2);
            this.e = false;
        }
    }
}
