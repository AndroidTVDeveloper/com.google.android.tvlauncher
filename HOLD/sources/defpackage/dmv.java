package defpackage;

/* renamed from: dmv  reason: default package */
/* compiled from: PG */
public final class dmv extends dje implements dkl {
    public static final dmv f;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public djk e = dku.b;

    static {
        dmv dmv = new dmv();
        f = dmv;
        dje.a(dmv.class, dmv);
    }

    private dmv() {
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
            return a(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0003\u0007\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", dmu.class});
        } else if (i2 != 3) {
            return i2 != 4 ? f : new dja((byte[][][]) null);
        } else {
            return new dmv();
        }
    }
}
