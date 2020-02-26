package defpackage;

/* renamed from: aoc  reason: default package */
/* compiled from: PG */
public final class aoc {
    public final any a;
    private final aob b;
    private anz c;
    private final int d;

    private aoc(aob aob, long j, long j2, long j3, int i) {
        this.b = aob;
        this.d = i;
        this.a = new any(j, j2, j3);
    }

    public final boolean a() {
        return this.c != null;
    }

    public final int a(aoj aoj, aop aop) {
        aob aob = (aob) bks.a(this.b);
        while (true) {
            anz anz = (anz) bks.a(this.c);
            long j = anz.e;
            long j2 = anz.f;
            long j3 = anz.g;
            if (j2 - j <= ((long) this.d)) {
                b();
                return a(aoj, j, aop);
            } else if (!a(aoj, j3)) {
                return a(aoj, j3, aop);
            } else {
                aoj.a();
                aoa a2 = aob.a(aoj, anz.b);
                aoa aoa = aoa.a;
                int i = a2.b;
                if (i == -3) {
                    b();
                    return a(aoj, j3, aop);
                } else if (i == -2) {
                    long j4 = a2.c;
                    long j5 = a2.d;
                    anz.c = j4;
                    anz.e = j5;
                    anz.a();
                } else if (i != -1) {
                    long j6 = a2.d;
                    b();
                    a(aoj, a2.d);
                    return a(aoj, a2.d, aop);
                } else {
                    long j7 = a2.c;
                    long j8 = a2.d;
                    anz.d = j7;
                    anz.f = j8;
                    anz.a();
                }
            }
        }
    }

    private final void b() {
        this.c = null;
        this.b.a();
    }

    private static final int a(aoj aoj, long j, aop aop) {
        if (j == ((aof) aoj).c) {
            return 0;
        }
        aop.a = j;
        return 1;
    }

    public final void a(long j) {
        anz anz = this.c;
        if (anz == null || anz.a != j) {
            any any = this.a;
            this.c = new anz(j, j, any.a, any.b);
        }
    }

    private static final boolean a(aoj aoj, long j) {
        long j2 = j - ((aof) aoj).c;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        aoj.a((int) j2);
        return true;
    }

    public aoc(blj blj, long j, long j2) {
        this(new asg(blj), j, j + 1, j2, 1000);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public aoc(blj blj, long j, long j2, int i) {
        this(new aso(i, blj), j, j + 1, j2, 940);
    }
}
