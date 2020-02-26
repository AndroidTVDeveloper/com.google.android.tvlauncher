package p000;

/* renamed from: dmv */
/* compiled from: PG */
public final class dmv extends dje implements dkl {

    /* renamed from: f */
    public static final dmv f8875f;

    /* renamed from: a */
    public int f8876a;

    /* renamed from: b */
    public int f8877b;

    /* renamed from: c */
    public int f8878c;

    /* renamed from: d */
    public boolean f8879d;

    /* renamed from: e */
    public djk f8880e = dku.f8736b;

    static {
        dmv dmv = new dmv();
        f8875f = dmv;
        dje.m6693a(dmv.class, dmv);
    }

    private dmv() {
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
            return m6691a(f8875f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0003\u0007\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", dmu.class});
        } else if (i2 != 3) {
            return i2 != 4 ? f8875f : new dja((byte[][][]) null);
        } else {
            return new dmv();
        }
    }
}
