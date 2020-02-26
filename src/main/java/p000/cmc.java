package p000;

/* renamed from: cmc */
/* compiled from: PG */
public final class cmc extends dje implements dkl {

    /* renamed from: f */
    public static final cmc f5966f;

    /* renamed from: a */
    public int f5967a;

    /* renamed from: b */
    public int f5968b = 0;

    /* renamed from: c */
    public Object f5969c;

    /* renamed from: d */
    public long f5970d;

    /* renamed from: e */
    public String f5971e = "";

    /* renamed from: g */
    private byte f5972g = 2;

    static {
        cmc cmc = new cmc();
        f5966f = cmc;
        dje.m6693a(cmc.class, cmc);
    }

    private cmc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f5972g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f5972g = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f5966f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003\u0002\u0002\u0004\b\u0003", new Object[]{"c", "b", "a", cmh.class, cmj.class, "d", "e"});
        } else if (i2 == 3) {
            return new cmc();
        } else {
            if (i2 != 4) {
                return f5966f;
            }
            return new dja((byte) 0);
        }
    }
}
