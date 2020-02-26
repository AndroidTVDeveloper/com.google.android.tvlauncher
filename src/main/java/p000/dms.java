package p000;

/* renamed from: dms */
/* compiled from: PG */
public final class dms extends dje implements dkl {

    /* renamed from: e */
    public static final dms f8864e;

    /* renamed from: a */
    public int f8865a;

    /* renamed from: b */
    public int f8866b;

    /* renamed from: c */
    public int f8867c;

    /* renamed from: d */
    public djk f8868d = dku.f8736b;

    static {
        dms dms = new dms();
        f8864e = dms;
        dje.m6693a(dms.class, dms);
    }

    private dms() {
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
            return m6691a(f8864e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dmr.class});
        } else if (i2 != 3) {
            return i2 != 4 ? f8864e : new dja((short[][]) null);
        } else {
            return new dms();
        }
    }
}
