package p000;

/* renamed from: dnf */
/* compiled from: PG */
public final class dnf extends dje implements dkl {

    /* renamed from: c */
    public static final dnf f8927c;

    /* renamed from: a */
    public int f8928a;

    /* renamed from: b */
    public int f8929b;

    static {
        dnf dnf = new dnf();
        f8927c = dnf;
        dje.m6693a(dnf.class, dnf);
    }

    private dnf() {
        dku dku = dku.f8736b;
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
            return m6691a(f8927c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8927c : new dja((char[][][][]) null);
        } else {
            return new dnf();
        }
    }
}
