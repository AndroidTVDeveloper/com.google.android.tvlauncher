package defpackage;

/* renamed from: dmq  reason: default package */
/* compiled from: PG */
public final class dmq extends dje implements dkl {
    public static final dmq b;
    public djk a = dku.b;

    static {
        dmq dmq = new dmq();
        b = dmq;
        dje.a(dmq.class, dmq);
    }

    private dmq() {
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
            return a(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dmp.class});
        } else if (i2 != 3) {
            return i2 != 4 ? b : new dja((char[][]) null);
        } else {
            return new dmq();
        }
    }
}
