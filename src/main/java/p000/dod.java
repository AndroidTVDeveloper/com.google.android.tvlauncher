package p000;

/* renamed from: dod */
/* compiled from: PG */
public final class dod extends dje implements dkl {

    /* renamed from: g */
    public static final dod f9029g;

    /* renamed from: a */
    public int f9030a;

    /* renamed from: b */
    public String f9031b = "";

    /* renamed from: c */
    public String f9032c = "";

    /* renamed from: d */
    public int f9033d;

    /* renamed from: e */
    public long f9034e;

    /* renamed from: f */
    public String f9035f = "";

    static {
        dod dod = new dod();
        f9029g = dod;
        dje.m6693a(dod.class, dod);
    }

    private dod() {
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
            return m6691a(f9029g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", "d", doc.f9028a, "e", "f"});
        } else if (i2 != 3) {
            return i2 != 4 ? f9029g : new dja((short[][][][][][]) null);
        } else {
            return new dod();
        }
    }
}
