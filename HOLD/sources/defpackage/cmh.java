package defpackage;

/* renamed from: cmh  reason: default package */
/* compiled from: PG */
public final class cmh extends dje implements dkl {
    public static final cmh d;
    public int a;
    public String b = "";
    public String c = "";

    static {
        cmh cmh = new cmh();
        d = cmh;
        dje.a(cmh.class, cmh);
    }

    private cmh() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja(0.0f);
        } else {
            return new cmh();
        }
    }
}
