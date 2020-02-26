package p000;

/* renamed from: dmq */
/* compiled from: PG */
public final class dmq extends dje implements dkl {

    /* renamed from: b */
    public static final dmq f8858b;

    /* renamed from: a */
    public djk f8859a = dku.f8736b;

    static {
        dmq dmq = new dmq();
        f8858b = dmq;
        dje.m6693a(dmq.class, dmq);
    }

    private dmq() {
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
            return m6691a(f8858b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dmp.class});
        } else if (i2 != 3) {
            return i2 != 4 ? f8858b : new dja((char[][]) null);
        } else {
            return new dmq();
        }
    }
}
