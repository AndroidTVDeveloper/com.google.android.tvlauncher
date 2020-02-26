package p000;

/* renamed from: dnk */
/* compiled from: PG */
public final class dnk extends dje implements dkl {

    /* renamed from: e */
    public static final dnk f8947e;

    /* renamed from: a */
    public int f8948a;

    /* renamed from: b */
    public long f8949b;

    /* renamed from: c */
    public String f8950c = "";

    /* renamed from: d */
    public String f8951d = "";

    static {
        dnk dnk = new dnk();
        f8947e = dnk;
        dje.m6693a(dnk.class, dnk);
    }

    private dnk() {
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
            return m6691a(f8947e, "\u0001\u0003\u0000\u0001\b\n\u0003\u0000\u0000\u0000\b\u0005\u0001\t\b\u0002\n\b\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8947e : new dja((int[][][][]) null);
        } else {
            return new dnk();
        }
    }
}
