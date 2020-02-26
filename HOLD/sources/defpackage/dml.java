package defpackage;

/* renamed from: dml  reason: default package */
/* compiled from: PG */
public final class dml extends dje implements dkl {
    public static final dml c;
    public int a;
    public int b;

    static {
        dml dml = new dml();
        c = dml;
        dje.a(dml.class, dml);
    }

    private dml() {
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
            return a(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0004\u0001", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? c : new dja((short[]) null);
        } else {
            return new dml();
        }
    }
}
