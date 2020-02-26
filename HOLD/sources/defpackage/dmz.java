package defpackage;

/* renamed from: dmz  reason: default package */
/* compiled from: PG */
public final class dmz extends dje implements dkl {
    public static final dmz f;
    public int a;
    public float b;
    public float c;
    public long d;
    public long e;

    static {
        dmz dmz = new dmz();
        f = dmz;
        dje.a(dmz.class, dmz);
    }

    private dmz() {
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
            return a(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0003\u0002\u0004\u0003\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 != 3) {
            return i2 != 4 ? f : new dja((short[][][]) null);
        } else {
            return new dmz();
        }
    }
}
