package p000;

/* renamed from: dmn */
/* compiled from: PG */
public final class dmn extends dje implements dkl {

    /* renamed from: c */
    public static final dmn f8850c;

    /* renamed from: a */
    public int f8851a;

    /* renamed from: b */
    public int f8852b;

    static {
        dmn dmn = new dmn();
        f8850c = dmn;
        dje.m6693a(dmn.class, dmn);
    }

    private dmn() {
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
            return m6691a(f8850c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8850c : new dja((byte[][]) null);
        } else {
            return new dmn();
        }
    }
}
