package p000;

/* renamed from: dmy */
/* compiled from: PG */
public final class dmy extends dje implements dkl {

    /* renamed from: d */
    public static final dmy f8886d;

    /* renamed from: a */
    public int f8887a;

    /* renamed from: b */
    public long f8888b;

    /* renamed from: c */
    public int f8889c;

    static {
        dmy dmy = new dmy();
        f8886d = dmy;
        dje.m6693a(dmy.class, dmy);
    }

    private dmy() {
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
            return m6691a(f8886d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u0002\u0002\u0004\u0004\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8886d : new dja((boolean[][][]) null);
        } else {
            return new dmy();
        }
    }
}
