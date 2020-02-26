package p000;

/* renamed from: dnd */
/* compiled from: PG */
public final class dnd extends dje implements dkl {

    /* renamed from: d */
    public static final dnd f8911d;

    /* renamed from: a */
    public int f8912a;

    /* renamed from: b */
    public dfy f8913b;

    /* renamed from: c */
    public dne f8914c;

    static {
        dnd dnd = new dnd();
        f8911d = dnd;
        dje.m6693a(dnd.class, dnd);
    }

    private dnd() {
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
            return m6691a(f8911d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8911d : new dja((byte[][][][]) null);
        } else {
            return new dnd();
        }
    }
}
