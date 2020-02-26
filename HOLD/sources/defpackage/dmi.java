package defpackage;

/* renamed from: dmi  reason: default package */
/* compiled from: PG */
public final class dmi extends dje implements dkl {
    public static final dmi e;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        dmi dmi = new dmi();
        e = dmi;
        dje.a(dmi.class, dmi);
    }

    private dmi() {
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
            return a(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja(0);
        } else {
            return new dmi();
        }
    }
}
