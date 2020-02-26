package p000;

/* renamed from: dob */
/* compiled from: PG */
public final class dob extends dje implements dkl {

    /* renamed from: c */
    public static final dob f9025c;

    /* renamed from: a */
    public int f9026a;

    /* renamed from: b */
    public String f9027b = "";

    static {
        dob dob = new dob();
        f9025c = dob;
        dje.m6693a(dob.class, dob);
    }

    private dob() {
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
            return m6691a(f9025c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f9025c : new dja((byte[][][][][][][]) null);
        } else {
            return new dob();
        }
    }
}
