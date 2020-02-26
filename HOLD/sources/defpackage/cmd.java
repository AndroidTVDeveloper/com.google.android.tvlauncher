package defpackage;

/* renamed from: cmd  reason: default package */
/* compiled from: PG */
public final class cmd extends dje implements dkl {
    public static final cmd e;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        cmd cmd = new cmd();
        e = cmd;
        dje.a(cmd.class, cmd);
    }

    private cmd() {
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
            return a(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja(0);
        } else {
            return new cmd();
        }
    }
}
