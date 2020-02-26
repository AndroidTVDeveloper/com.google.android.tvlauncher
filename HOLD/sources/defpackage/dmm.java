package defpackage;

/* renamed from: dmm  reason: default package */
/* compiled from: PG */
public final class dmm extends dje implements dkl {
    public static final dmm c;
    public int a;
    public dmn b;

    static {
        dmm dmm = new dmm();
        c = dmm;
        dje.a(dmm.class, dmm);
    }

    private dmm() {
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
            return i2 != 4 ? c : new dja((float[]) null);
        } else {
            return new dmm();
        }
    }
}
