package p000;

/* renamed from: dnw */
/* compiled from: PG */
public final class dnw extends dje implements dkl {

    /* renamed from: e */
    public static final dnw f9000e;

    /* renamed from: a */
    public int f9001a;

    /* renamed from: b */
    public long f9002b;

    /* renamed from: c */
    public int f9003c;

    /* renamed from: d */
    public djk f9004d = dku.f8736b;

    static {
        dnw dnw = new dnw();
        f9000e = dnw;
        dje.m6693a(dnw.class, dnw);
    }

    private dnw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return m6691a(f9000e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0005\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"a", "b", "d", dny.class, "c", dnv.f8999a});
        } else if (i2 != 3) {
            return i2 != 4 ? f9000e : new dja((char[][][][][][]) null);
        } else {
            return new dnw();
        }
    }

    /* renamed from: a */
    public final void mo4679a() {
        if (!this.f9004d.mo4374a()) {
            this.f9004d = dje.m6690a(this.f9004d);
        }
    }
}
