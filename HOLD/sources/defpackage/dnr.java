package defpackage;

/* renamed from: dnr  reason: default package */
/* compiled from: PG */
public final class dnr extends djc implements dkl {
    public static final dnr h;
    public int b;
    public dnp c;
    public doa d;
    public int e;
    public dno f;
    public String g = "";
    private byte i = 2;

    static {
        dnr dnr = new dnr();
        h = dnr;
        dje.a(dnr.class, dnr);
    }

    private dnr() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return a(h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\f\u0002\u0004\t\u0003\u0005\b\u0004", new Object[]{"b", "c", "d", "e", dnq.a, "f", "g"});
        } else if (i3 == 3) {
            return new dnr();
        } else {
            if (i3 != 4) {
                return h;
            }
            return new djb(0);
        }
    }
}
