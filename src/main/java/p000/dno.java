package p000;

/* renamed from: dno */
/* compiled from: PG */
public final class dno extends dje implements dkl {

    /* renamed from: c */
    public static final dno f8977c;

    /* renamed from: a */
    public int f8978a;

    /* renamed from: b */
    public boolean f8979b;

    static {
        dno dno = new dno();
        f8977c = dno;
        dje.m6693a(dno.class, dno);
    }

    private dno() {
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
            return m6691a(f8977c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8977c : new dja((boolean[][][][][]) null);
        } else {
            return new dno();
        }
    }
}
