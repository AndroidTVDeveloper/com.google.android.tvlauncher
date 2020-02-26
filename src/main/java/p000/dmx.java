package p000;

/* renamed from: dmx */
/* compiled from: PG */
public final class dmx extends dje implements dkl {

    /* renamed from: d */
    public static final dmx f8882d;

    /* renamed from: a */
    public int f8883a;

    /* renamed from: b */
    public int f8884b = 1;

    /* renamed from: c */
    public long f8885c;

    static {
        dmx dmx = new dmx();
        f8882d = dmx;
        dje.m6693a(dmx.class, dmx);
    }

    private dmx() {
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
            return m6691a(f8882d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{"a", "b", dmw.f8881a, "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8882d : new dja((char[][][]) null);
        } else {
            return new dmx();
        }
    }
}
