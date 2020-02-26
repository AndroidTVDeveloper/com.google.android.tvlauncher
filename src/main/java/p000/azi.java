package p000;

/* renamed from: azi */
/* compiled from: PG */
final class azi extends alh {

    /* renamed from: b */
    private final long f2872b;

    /* renamed from: c */
    private final long f2873c;

    /* renamed from: d */
    private final int f2874d;

    /* renamed from: e */
    private final long f2875e;

    /* renamed from: f */
    private final long f2876f;

    /* renamed from: g */
    private final long f2877g;

    /* renamed from: h */
    private final bac f2878h;

    public azi(long j, long j2, int i, long j3, long j4, long j5, bac bac) {
        this.f2872b = j;
        this.f2873c = j2;
        this.f2874d = i;
        this.f2875e = j3;
        this.f2876f = j4;
        this.f2877g = j5;
        this.f2878h = bac;
    }

    /* renamed from: a */
    public final int mo524a() {
        return 1;
    }

    /* renamed from: a */
    public final int mo525a(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f2874d) < 0 || intValue >= mo529b()) {
            return -1;
        }
        return intValue;
    }

    /* renamed from: a */
    public final alf mo526a(int i, alf alf, boolean z) {
        bks.m3509a(i, mo529b());
        Integer num = null;
        String str = z ? this.f2878h.mo1679a(i).f2997a : null;
        if (z) {
            num = Integer.valueOf(this.f2874d + i);
        }
        alf.mo533a(str, num, this.f2878h.mo1680b(i), aja.m633b(this.f2878h.mo1679a(i).f2998b - this.f2878h.mo1679a(0).f2998b) - this.f2875e);
        return alf;
    }

    /* renamed from: b */
    public final int mo529b() {
        return this.f2878h.mo1678a();
    }

    /* renamed from: a */
    public final Object mo528a(int i) {
        bks.m3509a(i, mo529b());
        return Integer.valueOf(this.f2874d + i);
    }

    /* renamed from: a */
    public final alg mo527a(int i, alg alg, long j) {
        azr d;
        bks.m3509a(i, 1);
        long j2 = this.f2877g;
        if (m2532a(this.f2878h)) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f2876f) {
                    j2 = -9223372036854775807L;
                }
            }
            long j3 = this.f2875e + j2;
            long b = this.f2878h.mo1680b(0);
            int i2 = 0;
            while (i2 < this.f2878h.mo1678a() - 1 && j3 >= b) {
                j3 -= b;
                i2++;
                b = this.f2878h.mo1680b(i2);
            }
            bah a = this.f2878h.mo1679a(i2);
            int size = a.f2999c.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((bab) a.f2999c.get(i3)).f2966b == 2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (!(i3 == -1 || (d = ((bam) ((bab) a.f2999c.get(i3)).f2967c.get(0)).mo1692d()) == null || d.mo1663c(b) == 0)) {
                j2 = (j2 + d.mo1658a(d.mo1659a(j3, b))) - j3;
            }
        }
        long j4 = j2;
        Object obj = alg.f672a;
        bac bac = this.f2878h;
        alg.mo541a(obj, bac, this.f2872b, this.f2873c, true, m2532a(bac), this.f2878h.f2972c, j4, this.f2876f, mo529b() - 1, this.f2875e);
        return alg;
    }

    /* renamed from: a */
    private static boolean m2532a(bac bac) {
        return bac.f2972c && bac.f2973d != -9223372036854775807L && bac.f2971b == -9223372036854775807L;
    }
}
