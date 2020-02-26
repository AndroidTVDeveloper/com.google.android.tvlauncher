package defpackage;

/* renamed from: dmx  reason: default package */
/* compiled from: PG */
public final class dmx extends dje implements dkl {
    public static final dmx d;
    public int a;
    public int b = 1;
    public long c;

    static {
        dmx dmx = new dmx();
        d = dmx;
        dje.a(dmx.class, dmx);
    }

    private dmx() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{"a", "b", dmw.a, "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((char[][][]) null);
        } else {
            return new dmx();
        }
    }
}
