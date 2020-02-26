package defpackage;

/* renamed from: dnd  reason: default package */
/* compiled from: PG */
public final class dnd extends dje implements dkl {
    public static final dnd d;
    public int a;
    public dfy b;
    public dne c;

    static {
        dnd dnd = new dnd();
        d = dnd;
        dje.a(dnd.class, dnd);
    }

    private dnd() {
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
            return a(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((byte[][][][]) null);
        } else {
            return new dnd();
        }
    }
}
