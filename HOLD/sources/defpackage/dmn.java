package defpackage;

/* renamed from: dmn  reason: default package */
/* compiled from: PG */
public final class dmn extends dje implements dkl {
    public static final dmn c;
    public int a;
    public int b;

    static {
        dmn dmn = new dmn();
        c = dmn;
        dje.a(dmn.class, dmn);
    }

    private dmn() {
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
            return i2 != 4 ? c : new dja((byte[][]) null);
        } else {
            return new dmn();
        }
    }
}
