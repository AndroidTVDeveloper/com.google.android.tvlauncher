package defpackage;

/* renamed from: dmu  reason: default package */
/* compiled from: PG */
public final class dmu extends dje implements dkl {
    public static final dmu e;
    public int a;
    public String b = "";
    public String c = "";
    public int d = 1;

    static {
        dmu dmu = new dmu();
        e = dmu;
        dje.a(dmu.class, dmu);
    }

    private dmu() {
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
            return a(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", "d", dmt.a});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja((float[][]) null);
        } else {
            return new dmu();
        }
    }
}
