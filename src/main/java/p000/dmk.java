package p000;

/* renamed from: dmk */
/* compiled from: PG */
public final class dmk extends dje implements dkl {

    /* renamed from: f */
    public static final dmk f8838f;

    /* renamed from: a */
    public int f8839a;

    /* renamed from: b */
    public String f8840b = "";

    /* renamed from: c */
    public String f8841c = "";

    /* renamed from: d */
    public int f8842d;

    /* renamed from: e */
    public boolean f8843e;

    static {
        dmk dmk = new dmk();
        f8838f = dmk;
        dje.m6693a(dmk.class, dmk);
    }

    private dmk() {
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
            return m6691a(f8838f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0006\u0007\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8838f : new dja((boolean[]) null);
        } else {
            return new dmk();
        }
    }
}
