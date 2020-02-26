package defpackage;

/* renamed from: dob  reason: default package */
/* compiled from: PG */
public final class dob extends dje implements dkl {
    public static final dob c;
    public int a;
    public String b = "";

    static {
        dob dob = new dob();
        c = dob;
        dje.a(dob.class, dob);
    }

    private dob() {
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
            return a(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? c : new dja((byte[][][][][][][]) null);
        } else {
            return new dob();
        }
    }
}
