package p000;

/* renamed from: dmp */
/* compiled from: PG */
public final class dmp extends dje implements dkl {

    /* renamed from: d */
    public static final dmp f8854d;

    /* renamed from: a */
    public int f8855a;

    /* renamed from: b */
    public int f8856b = 1;

    /* renamed from: c */
    public String f8857c = "";

    static {
        dmp dmp = new dmp();
        f8854d = dmp;
        dje.m6693a(dmp.class, dmp);
    }

    private dmp() {
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
            return m6691a(f8854d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001", new Object[]{"a", "b", dmo.f8853a, "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8854d : new dja((int[]) null);
        } else {
            return new dmp();
        }
    }
}
