package p000;

/* renamed from: dmu */
/* compiled from: PG */
public final class dmu extends dje implements dkl {

    /* renamed from: e */
    public static final dmu f8870e;

    /* renamed from: a */
    public int f8871a;

    /* renamed from: b */
    public String f8872b = "";

    /* renamed from: c */
    public String f8873c = "";

    /* renamed from: d */
    public int f8874d = 1;

    static {
        dmu dmu = new dmu();
        f8870e = dmu;
        dje.m6693a(dmu.class, dmu);
    }

    private dmu() {
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
            return m6691a(f8870e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", "d", dmt.f8869a});
        } else if (i2 != 3) {
            return i2 != 4 ? f8870e : new dja((float[][]) null);
        } else {
            return new dmu();
        }
    }
}
