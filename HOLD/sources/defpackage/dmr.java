package defpackage;

/* renamed from: dmr  reason: default package */
/* compiled from: PG */
public final class dmr extends dje implements dkl {
    public static final dmr d;
    public int a;
    public dmj b;
    public dmi c;

    static {
        dmr dmr = new dmr();
        d = dmr;
        dje.a(dmr.class, dmr);
    }

    private dmr() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((boolean[][]) null);
        } else {
            return new dmr();
        }
    }
}
