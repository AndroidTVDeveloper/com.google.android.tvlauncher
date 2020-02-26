package p000;

/* renamed from: cmh */
/* compiled from: PG */
public final class cmh extends dje implements dkl {

    /* renamed from: d */
    public static final cmh f5991d;

    /* renamed from: a */
    public int f5992a;

    /* renamed from: b */
    public String f5993b = "";

    /* renamed from: c */
    public String f5994c = "";

    static {
        cmh cmh = new cmh();
        f5991d = cmh;
        dje.m6693a(cmh.class, cmh);
    }

    private cmh() {
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
            return m6691a(f5991d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f5991d : new dja(0.0f);
        } else {
            return new cmh();
        }
    }
}
