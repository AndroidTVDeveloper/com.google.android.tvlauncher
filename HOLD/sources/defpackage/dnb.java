package defpackage;

/* renamed from: dnb  reason: default package */
/* compiled from: PG */
public final class dnb extends dje implements dkl {
    public static final dnb j;
    public int a;
    public String b = "";
    public int c = 1;
    public dmz d;
    public dmy e;
    public dmx f;
    public String g = "";
    public boolean h;
    public boolean i;

    static {
        dnb dnb = new dnb();
        j = dnb;
        dje.a(dnb.class, dnb);
    }

    private dnb() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return a(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\b\u0000\u0003\f\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\b\u0006\t\u0007\b\n\u0007\t", new Object[]{"a", "b", "c", dna.a, "d", "e", "f", "g", "h", "i"});
        } else if (i3 != 3) {
            return i3 != 4 ? j : new dja((int[][]) null);
        } else {
            return new dnb();
        }
    }
}
