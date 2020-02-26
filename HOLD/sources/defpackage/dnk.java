package defpackage;

/* renamed from: dnk  reason: default package */
/* compiled from: PG */
public final class dnk extends dje implements dkl {
    public static final dnk e;
    public int a;
    public long b;
    public String c = "";
    public String d = "";

    static {
        dnk dnk = new dnk();
        e = dnk;
        dje.a(dnk.class, dnk);
    }

    private dnk() {
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
            return a(e, "\u0001\u0003\u0000\u0001\b\n\u0003\u0000\u0000\u0000\b\u0005\u0001\t\b\u0002\n\b\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja((int[][][][]) null);
        } else {
            return new dnk();
        }
    }
}
