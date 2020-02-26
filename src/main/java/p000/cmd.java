package p000;

/* renamed from: cmd */
/* compiled from: PG */
public final class cmd extends dje implements dkl {

    /* renamed from: e */
    public static final cmd f5973e;

    /* renamed from: a */
    public int f5974a;

    /* renamed from: b */
    public String f5975b = "";

    /* renamed from: c */
    public String f5976c = "";

    /* renamed from: d */
    public String f5977d = "";

    static {
        cmd cmd = new cmd();
        f5973e = cmd;
        dje.m6693a(cmd.class, cmd);
    }

    private cmd() {
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
            return m6691a(f5973e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? f5973e : new dja(0);
        } else {
            return new cmd();
        }
    }
}
