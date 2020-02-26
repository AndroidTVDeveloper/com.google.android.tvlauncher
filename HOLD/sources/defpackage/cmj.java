package defpackage;

/* renamed from: cmj  reason: default package */
/* compiled from: PG */
public final class cmj extends dje implements dkl {
    public static final cmj e;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    private byte f = 2;

    static {
        cmj cmj = new cmj();
        e = cmj;
        dje.a(cmj.class, cmj);
    }

    private cmj() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return a(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002<\u0000\u0003м\u0000", new Object[]{"c", "b", "a", "d", cmg.class, cmy.class});
        } else if (i2 == 3) {
            return new cmj();
        } else {
            if (i2 != 4) {
                return e;
            }
            return new dja((byte[]) null);
        }
    }
}
