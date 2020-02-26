package defpackage;

/* renamed from: dmy  reason: default package */
/* compiled from: PG */
public final class dmy extends dje implements dkl {
    public static final dmy d;
    public int a;
    public long b;
    public int c;

    static {
        dmy dmy = new dmy();
        d = dmy;
        dje.a(dmy.class, dmy);
    }

    private dmy() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u0002\u0002\u0004\u0004\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((boolean[][][]) null);
        } else {
            return new dmy();
        }
    }
}
