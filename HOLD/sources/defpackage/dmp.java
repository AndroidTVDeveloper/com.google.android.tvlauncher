package defpackage;

/* renamed from: dmp  reason: default package */
/* compiled from: PG */
public final class dmp extends dje implements dkl {
    public static final dmp d;
    public int a;
    public int b = 1;
    public String c = "";

    static {
        dmp dmp = new dmp();
        d = dmp;
        dje.a(dmp.class, dmp);
    }

    private dmp() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001", new Object[]{"a", "b", dmo.a, "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((int[]) null);
        } else {
            return new dmp();
        }
    }
}
