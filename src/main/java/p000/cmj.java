package p000;

/* renamed from: cmj */
/* compiled from: PG */
public final class cmj extends dje implements dkl {

    /* renamed from: e */
    public static final cmj f5999e;

    /* renamed from: a */
    public int f6000a;

    /* renamed from: b */
    public int f6001b = 0;

    /* renamed from: c */
    public Object f6002c;

    /* renamed from: d */
    public String f6003d = "";

    /* renamed from: f */
    private byte f6004f = 2;

    static {
        cmj cmj = new cmj();
        f5999e = cmj;
        dje.m6693a(cmj.class, cmj);
    }

    private cmj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f6004f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f6004f = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f5999e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002<\u0000\u0003м\u0000", new Object[]{"c", "b", "a", "d", cmg.class, cmy.class});
        } else if (i2 == 3) {
            return new cmj();
        } else {
            if (i2 != 4) {
                return f5999e;
            }
            return new dja((byte[]) null);
        }
    }
}
