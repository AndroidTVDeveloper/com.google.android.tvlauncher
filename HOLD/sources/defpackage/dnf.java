package defpackage;

/* renamed from: dnf  reason: default package */
/* compiled from: PG */
public final class dnf extends dje implements dkl {
    public static final dnf c;
    public int a;
    public int b;

    static {
        dnf dnf = new dnf();
        c = dnf;
        dje.a(dnf.class, dnf);
    }

    private dnf() {
        dku dku = dku.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return a(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? c : new dja((char[][][][]) null);
        } else {
            return new dnf();
        }
    }
}
