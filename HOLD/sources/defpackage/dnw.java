package defpackage;

/* renamed from: dnw  reason: default package */
/* compiled from: PG */
public final class dnw extends dje implements dkl {
    public static final dnw e;
    public int a;
    public long b;
    public int c;
    public djk d = dku.b;

    static {
        dnw dnw = new dnw();
        e = dnw;
        dje.a(dnw.class, dnw);
    }

    private dnw() {
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
            return a(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0005\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"a", "b", "d", dny.class, "c", dnv.a});
        } else if (i2 != 3) {
            return i2 != 4 ? e : new dja((char[][][][][][]) null);
        } else {
            return new dnw();
        }
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = dje.a(this.d);
        }
    }
}
