package defpackage;

/* renamed from: doa  reason: default package */
/* compiled from: PG */
public final class doa extends dje implements dkl {
    public static final doa c;
    public int a;
    public dnz b;

    static {
        doa doa = new doa();
        c = doa;
        dje.a(doa.class, doa);
    }

    private doa() {
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
            return a(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? c : new dja((int[][][][][][]) null);
        } else {
            return new doa();
        }
    }
}
