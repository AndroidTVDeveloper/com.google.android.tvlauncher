package p000;

/* renamed from: ard */
/* compiled from: PG */
abstract class ard {

    /* renamed from: b */
    public final aqx f1948b = new aqx();

    /* renamed from: c */
    public aov f1949c;

    /* renamed from: d */
    public aok f1950d;

    /* renamed from: e */
    public aqz f1951e;

    /* renamed from: f */
    public long f1952f;

    /* renamed from: g */
    public long f1953g;

    /* renamed from: h */
    public long f1954h;

    /* renamed from: i */
    public int f1955i;

    /* renamed from: j */
    public int f1956j;

    /* renamed from: k */
    public arb f1957k;

    /* renamed from: l */
    public long f1958l;

    /* renamed from: m */
    public boolean f1959m;

    /* renamed from: n */
    public boolean f1960n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo1269a(bky bky);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo1271a(bky bky, long j, arb arb);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo1276b(long j) {
        return (((long) this.f1956j) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo1275a(long j) {
        return (j * 1000000) / ((long) this.f1956j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1277c(long j) {
        this.f1954h = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1270a(boolean z) {
        if (z) {
            this.f1957k = new arb();
            this.f1953g = 0;
            this.f1955i = 0;
        } else {
            this.f1955i = 1;
        }
        this.f1952f = -1;
        this.f1954h = 0;
    }
}
