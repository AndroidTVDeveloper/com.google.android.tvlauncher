package defpackage;

/* renamed from: dms  reason: default package */
/* compiled from: PG */
public final class dms extends dje implements dkl {
    public static final dms e;
    public int a;
    public int b;
    public int c;
    public djk d = dku.b;

    static {
        dms dms = new dms();
        e = dms;
        dje.a(dms.class, dms);
    }

    private dms() {
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
            return a(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dmr.class});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja((short[][]) null);
        } else {
            return new dms();
        }
    }
}
