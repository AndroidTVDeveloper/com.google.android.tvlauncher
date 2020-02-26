package p000;

/* renamed from: dmr */
/* compiled from: PG */
public final class dmr extends dje implements dkl {

    /* renamed from: d */
    public static final dmr f8860d;

    /* renamed from: a */
    public int f8861a;

    /* renamed from: b */
    public dmj f8862b;

    /* renamed from: c */
    public dmi f8863c;

    static {
        dmr dmr = new dmr();
        f8860d = dmr;
        dje.m6693a(dmr.class, dmr);
    }

    private dmr() {
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
            return m6691a(f8860d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8860d : new dja((boolean[][]) null);
        } else {
            return new dmr();
        }
    }
}
