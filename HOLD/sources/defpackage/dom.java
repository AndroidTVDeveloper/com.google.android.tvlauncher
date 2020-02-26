package defpackage;

/* renamed from: dom  reason: default package */
/* compiled from: PG */
public final class dom extends dje implements dkl {
    public static final dom q;
    public int a;
    public dnr b;
    public long c;
    public String d = "";
    public don e;
    public dod f;
    public dnt g;
    public dof h;
    public dol i;
    public doi j;
    public dnl k;
    public dnm l;
    public dnw m;
    public String n = "";
    public dob o;
    public dog p;
    private byte r = 2;

    static {
        dom dom = new dom();
        q = dom;
        dje.a(dom.class, dom);
    }

    private dom() {
        dku dku = dku.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.r);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.r = b2;
            return null;
        } else if (i3 == 2) {
            return a(q, "\u0001\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0005\u0001\u0003\b\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u0010\t\u000f\u0011\b\u0010\u0015\t\u0014\u0017\t\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new dom();
        } else {
            if (i3 != 4) {
                return q;
            }
            return new dja((short[][][][][][][]) null);
        }
    }
}
