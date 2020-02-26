package defpackage;

/* renamed from: dns  reason: default package */
/* compiled from: PG */
public final class dns extends dje implements dkl {
    public static final dns d;
    public int a;
    public String b = "";
    public djj c = djy.b;

    static {
        dns dns = new dns();
        d = dns;
        dje.a(dns.class, dns);
    }

    private dns() {
        dku dku = dku.b;
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
            return a(d, "\u0001\u0002\u0000\u0001\u0011\u0015\u0002\u0000\u0001\u0000\u0011\b\u0012\u0015(", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? d : new dja((byte[][][][][][]) null);
        } else {
            return new dns();
        }
    }
}
