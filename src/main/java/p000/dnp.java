package p000;

/* renamed from: dnp */
/* compiled from: PG */
public final class dnp extends dje implements dkl {

    /* renamed from: c */
    public static final dnp f8980c;

    /* renamed from: a */
    public int f8981a;

    /* renamed from: b */
    public dnn f8982b;

    static {
        dnp dnp = new dnp();
        f8980c = dnp;
        dje.m6693a(dnp.class, dnp);
    }

    private dnp() {
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
            return m6691a(f8980c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8980c : new dja((int[][][][][]) null);
        } else {
            return new dnp();
        }
    }
}
