package p000;

/* renamed from: aoc */
/* compiled from: PG */
public final class aoc {

    /* renamed from: a */
    public final any f1472a;

    /* renamed from: b */
    private final aob f1473b;

    /* renamed from: c */
    private anz f1474c;

    /* renamed from: d */
    private final int f1475d;

    private aoc(aob aob, long j, long j2, long j3, int i) {
        this.f1473b = aob;
        this.f1475d = i;
        this.f1472a = new any(j, j2, j3);
    }

    /* renamed from: a */
    public final boolean mo1184a() {
        return this.f1474c != null;
    }

    /* renamed from: a */
    public final int mo1182a(aoj aoj, aop aop) {
        aob aob = (aob) bks.m3507a(this.f1473b);
        while (true) {
            anz anz = (anz) bks.m3507a(this.f1474c);
            long j = anz.f1463e;
            long j2 = anz.f1464f;
            long j3 = anz.f1465g;
            if (j2 - j <= ((long) this.f1475d)) {
                m1616b();
                return m1613a(aoj, j, aop);
            } else if (!m1615a(aoj, j3)) {
                return m1613a(aoj, j3, aop);
            } else {
                aoj.mo1191a();
                aoa a = aob.mo1180a(aoj, anz.f1460b);
                aoa aoa = aoa.f1468a;
                int i = a.f1469b;
                if (i == -3) {
                    m1616b();
                    return m1613a(aoj, j3, aop);
                } else if (i == -2) {
                    long j4 = a.f1470c;
                    long j5 = a.f1471d;
                    anz.f1461c = j4;
                    anz.f1463e = j5;
                    anz.mo1178a();
                } else if (i != -1) {
                    long j6 = a.f1471d;
                    m1616b();
                    m1615a(aoj, a.f1471d);
                    return m1613a(aoj, a.f1471d, aop);
                } else {
                    long j7 = a.f1470c;
                    long j8 = a.f1471d;
                    anz.f1462d = j7;
                    anz.f1464f = j8;
                    anz.mo1178a();
                }
            }
        }
    }

    /* renamed from: b */
    private final void m1616b() {
        this.f1474c = null;
        this.f1473b.mo1181a();
    }

    /* renamed from: a */
    private static final int m1613a(aoj aoj, long j, aop aop) {
        if (j == ((aof) aoj).f1490c) {
            return 0;
        }
        aop.f1514a = j;
        return 1;
    }

    /* renamed from: a */
    public final void mo1183a(long j) {
        anz anz = this.f1474c;
        if (anz == null || anz.f1459a != j) {
            any any = this.f1472a;
            this.f1474c = new anz(j, j, any.f1456a, any.f1457b);
        }
    }

    /* renamed from: a */
    private static final boolean m1615a(aoj aoj, long j) {
        long j2 = j - ((aof) aoj).f1490c;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        aoj.mo1192a((int) j2);
        return true;
    }

    public aoc(blj blj, long j, long j2) {
        this(new asg(blj), j, j + 1, j2, 1000);
    }

    /* renamed from: a */
    public static int m1614a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public aoc(blj blj, long j, long j2, int i) {
        this(new aso(i, blj), j, j + 1, j2, 940);
    }
}
