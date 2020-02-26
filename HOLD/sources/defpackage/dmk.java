package defpackage;

/* renamed from: dmk  reason: default package */
/* compiled from: PG */
public final class dmk extends dje implements dkl {
    public static final dmk f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public boolean e;

    static {
        dmk dmk = new dmk();
        f = dmk;
        dje.a(dmk.class, dmk);
    }

    private dmk() {
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
            return a(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0006\u0007\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 != 3) {
            return i2 != 4 ? f : new dja((boolean[]) null);
        } else {
            return new dmk();
        }
    }
}
