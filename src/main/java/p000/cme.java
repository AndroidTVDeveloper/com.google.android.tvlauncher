package p000;

/* renamed from: cme */
/* compiled from: PG */
public final class cme extends dje implements dkl {

    /* renamed from: a */
    public static final cme f5978a;

    static {
        cme cme = new cme();
        f5978a = cme;
        dje.m6693a(cme.class, cme);
    }

    private cme() {
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
            return m6691a(f5978a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 != 3) {
            return i2 != 4 ? f5978a : new dja(false);
        }
        return new cme();
    }
}
