package p000;

/* renamed from: dof */
/* compiled from: PG */
public final class dof extends dje implements dkl {

    /* renamed from: i */
    public static final dof f9037i;

    /* renamed from: a */
    public int f9038a;

    /* renamed from: b */
    public boolean f9039b;

    /* renamed from: c */
    public doa f9040c;

    /* renamed from: d */
    public String f9041d = "";

    /* renamed from: e */
    public String f9042e = "";

    /* renamed from: f */
    public int f9043f;

    /* renamed from: g */
    public long f9044g;

    /* renamed from: h */
    public String f9045h = "";

    static {
        dof dof = new dof();
        f9037i = dof;
        dje.m6693a(dof.class, dof);
    }

    private dof() {
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
            return m6691a(f9037i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001\u0003\b\u0002\u0004\b\u0003\u0005\f\u0004\u0006\u0005\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", doe.f9036a, "g", "h"});
        } else if (i2 != 3) {
            return i2 != 4 ? f9037i : new dja((char[][][][][][][]) null);
        } else {
            return new dof();
        }
    }
}
