package p000;

/* renamed from: dmj */
/* compiled from: PG */
public final class dmj extends dje implements dkl {

    /* renamed from: f */
    public static final dmj f8832f;

    /* renamed from: a */
    public int f8833a;

    /* renamed from: b */
    public String f8834b = "";

    /* renamed from: c */
    public boolean f8835c;

    /* renamed from: d */
    public int f8836d;

    /* renamed from: e */
    public int f8837e;

    static {
        dmj dmj = new dmj();
        f8832f = dmj;
        dje.m6693a(dmj.class, dmj);
    }

    private dmj() {
        dku dku = dku.f8736b;
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
            return m6691a(f8832f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\b\u0000\u0003\u0007\u0002\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8832f : new dja((char[]) null);
        } else {
            return new dmj();
        }
    }
}
