package defpackage;

/* renamed from: dnz  reason: default package */
/* compiled from: PG */
public final class dnz extends dje implements dkl {
    public static final dnz e;
    public int a;
    public long b;
    public boolean c;
    public int d;

    static {
        dnz dnz = new dnz();
        e = dnz;
        dje.a(dnz.class, dnz);
    }

    private dnz() {
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
            return a(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0003\u0004\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja((boolean[][][][][][]) null);
        } else {
            return new dnz();
        }
    }
}
