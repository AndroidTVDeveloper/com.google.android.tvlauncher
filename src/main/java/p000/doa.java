package p000;

/* renamed from: doa */
/* compiled from: PG */
public final class doa extends dje implements dkl {

    /* renamed from: c */
    public static final doa f9022c;

    /* renamed from: a */
    public int f9023a;

    /* renamed from: b */
    public dnz f9024b;

    static {
        doa doa = new doa();
        f9022c = doa;
        dje.m6693a(doa.class, doa);
    }

    private doa() {
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
            return m6691a(f9022c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f9022c : new dja((int[][][][][][]) null);
        } else {
            return new doa();
        }
    }
}
