package defpackage;

/* renamed from: dnc  reason: default package */
/* compiled from: PG */
public final class dnc extends dje implements dkl {
    public static final dnc d;
    public int a;
    public dnd b;
    public dmm c;

    static {
        dnc dnc = new dnc();
        d = dnc;
        dje.a(dnc.class, dnc);
    }

    private dnc() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001\t\u0000\u0006\t\u0005", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((float[][][]) null);
        } else {
            return new dnc();
        }
    }
}
