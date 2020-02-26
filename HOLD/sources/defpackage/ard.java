package defpackage;

/* renamed from: ard  reason: default package */
/* compiled from: PG */
abstract class ard {
    public final aqx b = new aqx();
    public aov c;
    public aok d;
    public aqz e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public arb k;
    public long l;
    public boolean m;
    public boolean n;

    /* access modifiers changed from: protected */
    public abstract long a(bky bky);

    /* access modifiers changed from: protected */
    public abstract boolean a(bky bky, long j2, arb arb);

    /* access modifiers changed from: protected */
    public final long b(long j2) {
        return (((long) this.j) * j2) / 1000000;
    }

    /* access modifiers changed from: protected */
    public final long a(long j2) {
        return (j2 * 1000000) / ((long) this.j);
    }

    /* access modifiers changed from: protected */
    public void c(long j2) {
        this.h = j2;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        if (z) {
            this.k = new arb();
            this.g = 0;
            this.i = 0;
        } else {
            this.i = 1;
        }
        this.f = -1;
        this.h = 0;
    }
}
