package defpackage;

/* renamed from: dnt  reason: default package */
/* compiled from: PG */
public final class dnt extends dje implements dkl {
    public static final dnt b;
    public djk a = dku.b;

    static {
        dnt dnt = new dnt();
        b = dnt;
        dje.a(dnt.class, dnt);
    }

    private dnt() {
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
            return a(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dns.class});
        } else if (i2 != 3) {
            return i2 != 4 ? b : new dja((short[][][][][]) null);
        } else {
            return new dnt();
        }
    }
}
