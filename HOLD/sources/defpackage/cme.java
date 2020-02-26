package defpackage;

/* renamed from: cme  reason: default package */
/* compiled from: PG */
public final class cme extends dje implements dkl {
    public static final cme a;

    static {
        cme cme = new cme();
        a = cme;
        dje.a(cme.class, cme);
    }

    private cme() {
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
            return a(a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 != 3) {
            return i2 != 4 ? a : new dja(false);
        }
        return new cme();
    }
}
