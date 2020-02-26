package defpackage;

/* renamed from: dno  reason: default package */
/* compiled from: PG */
public final class dno extends dje implements dkl {
    public static final dno c;
    public int a;
    public boolean b;

    static {
        dno dno = new dno();
        c = dno;
        dje.a(dno.class, dno);
    }

    private dno() {
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
            return a(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? c : new dja((boolean[][][][][]) null);
        } else {
            return new dno();
        }
    }
}
