package p000;

/* renamed from: dml */
/* compiled from: PG */
public final class dml extends dje implements dkl {

    /* renamed from: c */
    public static final dml f8844c;

    /* renamed from: a */
    public int f8845a;

    /* renamed from: b */
    public int f8846b;

    static {
        dml dml = new dml();
        f8844c = dml;
        dje.m6693a(dml.class, dml);
    }

    private dml() {
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
            return m6691a(f8844c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0004\u0001", new Object[]{"a", "b"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8844c : new dja((short[]) null);
        } else {
            return new dml();
        }
    }
}
