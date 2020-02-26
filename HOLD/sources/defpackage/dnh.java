package defpackage;

/* renamed from: dnh  reason: default package */
/* compiled from: PG */
public final class dnh extends dje implements dkl {
    public static final dnh f;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public long e;

    static {
        dnh dnh = new dnh();
        f = dnh;
        dje.a(dnh.class, dnh);
    }

    private dnh() {
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
            return a(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 != 3) {
            return i2 != 4 ? f : new dja((float[][][][]) null);
        } else {
            return new dnh();
        }
    }
}
