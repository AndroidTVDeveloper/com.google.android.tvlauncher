package defpackage;

/* renamed from: dod  reason: default package */
/* compiled from: PG */
public final class dod extends dje implements dkl {
    public static final dod g;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public long e;
    public String f = "";

    static {
        dod dod = new dod();
        g = dod;
        dje.a(dod.class, dod);
    }

    private dod() {
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
            return a(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", "d", doc.a, "e", "f"});
        } else if (i2 != 3) {
            return i2 != 4 ? g : new dja((short[][][][][][]) null);
        } else {
            return new dod();
        }
    }
}
