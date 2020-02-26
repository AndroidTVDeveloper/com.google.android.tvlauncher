package defpackage;

/* renamed from: cmg  reason: default package */
/* compiled from: PG */
public final class cmg extends dje implements dkl {
    public static final cmg h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        cmg cmg = new cmg();
        h = cmg;
        dje.a(cmg.class, cmg);
    }

    private cmg() {
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
            return a(h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", cmd.class, cme.class});
        } else if (i2 != 3) {
            return i2 != 4 ? h : new dja((short) 0);
        } else {
            return new cmg();
        }
    }
}
