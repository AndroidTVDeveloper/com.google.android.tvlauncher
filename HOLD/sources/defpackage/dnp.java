package defpackage;

/* renamed from: dnp  reason: default package */
/* compiled from: PG */
public final class dnp extends dje implements dkl {
    public static final dnp c;
    public int a;
    public dnn b;

    static {
        dnp dnp = new dnp();
        c = dnp;
        dje.a(dnp.class, dnp);
    }

    private dnp() {
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
            return a(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? c : new dja((int[][][][][]) null);
        } else {
            return new dnp();
        }
    }
}
