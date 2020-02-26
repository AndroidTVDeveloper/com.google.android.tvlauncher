package defpackage;

/* renamed from: aro  reason: default package */
/* compiled from: PG */
public final class aro implements aoi {
    private final arp a;
    private final bky b;
    private final bky c;
    private final bkx d;
    private aok e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    public aro() {
        this((byte) 0);
    }

    public aro(byte b2) {
        this.a = new arp();
        this.b = new bky(2048);
        this.g = -1;
        this.c = new bky(10);
        this.d = new bkx(this.c.a);
    }

    public final void a(aok aok) {
        this.e = aok;
        this.a.a(aok, new asw(0, 1));
        aok.S();
    }

    public final int a(aoj aoj, aop aop) {
        int a2 = aoj.a(this.b.a, 0, 2048);
        if (!this.i) {
            ((aok) bks.a(this.e)).a(new aor(-9223372036854775807L));
            this.i = true;
        }
        if (a2 == -1) {
            return -1;
        }
        this.b.c(0);
        this.b.b(a2);
        if (!this.h) {
            this.a.a = this.f;
            this.h = true;
        }
        this.a.a(this.b);
        return 0;
    }

    public final void a(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    public final boolean a(aoj aoj) {
        int i2 = 0;
        while (true) {
            aoj.c(this.c.a, 0, 10);
            this.c.c(0);
            if (this.c.g() != 4801587) {
                break;
            }
            this.c.d(3);
            int m = this.c.m();
            i2 += m + 10;
            aoj.b(m);
        }
        aoj.a();
        aoj.b(i2);
        if (this.g == -1) {
            this.g = (long) i2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            aoj.c(this.c.a, 0, 2);
            this.c.c(0);
            if (!arp.a(this.c.e())) {
                aoj.a();
                i3++;
                if (i3 - i2 >= 8192) {
                    return false;
                }
                aoj.b(i3);
                i4 = 0;
                i5 = 0;
            } else {
                i4++;
                if (i4 >= 4 && i5 > 188) {
                    return true;
                }
                aoj.c(this.c.a, 0, 4);
                this.d.a(14);
                int c2 = this.d.c(13);
                if (c2 <= 6) {
                    return false;
                }
                aoj.b(c2 - 6);
                i5 += c2;
            }
        }
    }
}
