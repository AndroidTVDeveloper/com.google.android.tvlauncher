package defpackage;

/* renamed from: dmj  reason: default package */
/* compiled from: PG */
public final class dmj extends dje implements dkl {
    public static final dmj f;
    public int a;
    public String b = "";
    public boolean c;
    public int d;
    public int e;

    static {
        dmj dmj = new dmj();
        f = dmj;
        dje.a(dmj.class, dmj);
    }

    private dmj() {
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
            return a(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\b\u0000\u0003\u0007\u0002\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 != 3) {
            return i2 != 4 ? f : new dja((char[]) null);
        } else {
            return new dmj();
        }
    }
}
