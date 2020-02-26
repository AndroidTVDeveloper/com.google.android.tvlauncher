package p000;

/* renamed from: dmi */
/* compiled from: PG */
public final class dmi extends dje implements dkl {

    /* renamed from: e */
    public static final dmi f8827e;

    /* renamed from: a */
    public int f8828a;

    /* renamed from: b */
    public String f8829b = "";

    /* renamed from: c */
    public String f8830c = "";

    /* renamed from: d */
    public boolean f8831d;

    static {
        dmi dmi = new dmi();
        f8827e = dmi;
        dje.m6693a(dmi.class, dmi);
    }

    private dmi() {
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
            return m6691a(f8827e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8827e : new dja(0);
        } else {
            return new dmi();
        }
    }
}
