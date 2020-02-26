package p000;

/* renamed from: dnr */
/* compiled from: PG */
public final class dnr extends djc implements dkl {

    /* renamed from: h */
    public static final dnr f8984h;

    /* renamed from: b */
    public int f8985b;

    /* renamed from: c */
    public dnp f8986c;

    /* renamed from: d */
    public doa f8987d;

    /* renamed from: e */
    public int f8988e;

    /* renamed from: f */
    public dno f8989f;

    /* renamed from: g */
    public String f8990g = "";

    /* renamed from: i */
    private byte f8991i = 2;

    static {
        dnr dnr = new dnr();
        f8984h = dnr;
        dje.m6693a(dnr.class, dnr);
    }

    private dnr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f8991i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f8991i = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f8984h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\f\u0002\u0004\t\u0003\u0005\b\u0004", new Object[]{"b", "c", "d", "e", dnq.f8983a, "f", "g"});
        } else if (i2 == 3) {
            return new dnr();
        } else {
            if (i2 != 4) {
                return f8984h;
            }
            return new djb(0);
        }
    }
}
