package p000;

/* renamed from: dns */
/* compiled from: PG */
public final class dns extends dje implements dkl {

    /* renamed from: d */
    public static final dns f8992d;

    /* renamed from: a */
    public int f8993a;

    /* renamed from: b */
    public String f8994b = "";

    /* renamed from: c */
    public djj f8995c = djy.f8703b;

    static {
        dns dns = new dns();
        f8992d = dns;
        dje.m6693a(dns.class, dns);
    }

    private dns() {
        dku dku = dku.f8736b;
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
            return m6691a(f8992d, "\u0001\u0002\u0000\u0001\u0011\u0015\u0002\u0000\u0001\u0000\u0011\b\u0012\u0015(", new Object[]{"a", "b", "c"});
        } else if (i2 != 3) {
            return i2 != 4 ? f8992d : new dja((byte[][][][][][]) null);
        } else {
            return new dns();
        }
    }
}
