package defpackage;

/* renamed from: cmc  reason: default package */
/* compiled from: PG */
public final class cmc extends dje implements dkl {
    public static final cmc f;
    public int a;
    public int b = 0;
    public Object c;
    public long d;
    public String e = "";
    private byte g = 2;

    static {
        cmc cmc = new cmc();
        f = cmc;
        dje.a(cmc.class, cmc);
    }

    private cmc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return a(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003\u0002\u0002\u0004\b\u0003", new Object[]{"c", "b", "a", cmh.class, cmj.class, "d", "e"});
        } else if (i2 == 3) {
            return new cmc();
        } else {
            if (i2 != 4) {
                return f;
            }
            return new dja((byte) 0);
        }
    }
}
