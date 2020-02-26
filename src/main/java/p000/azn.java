package p000;

/* renamed from: azn */
/* compiled from: PG */
final class azn {

    /* renamed from: a */
    public final boolean f2883a;

    /* renamed from: b */
    public final long f2884b;

    /* renamed from: c */
    public final long f2885c;

    private azn(boolean z, long j, long j2) {
        this.f2883a = z;
        this.f2884b = j;
        this.f2885c = j2;
    }

    /* renamed from: a */
    public static azn m2545a(bah bah, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        bah bah2 = bah;
        long j3 = j;
        int size = bah2.f2999c.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            int i3 = ((bab) bah2.f2999c.get(i2)).f2966b;
            if (i3 == 1 || i3 == 2) {
                z = true;
            } else {
                i2++;
            }
        }
        long j4 = Long.MAX_VALUE;
        int i4 = 0;
        boolean z4 = false;
        long j5 = 0;
        boolean z5 = false;
        while (i4 < size) {
            bab bab = (bab) bah2.f2999c.get(i4);
            if (!z || bab.f2966b != 3) {
                azr d = ((bam) bab.f2967c.get(i)).mo1692d();
                if (d == null) {
                    return new azn(true, 0, j);
                }
                z4 |= d.mo1662b();
                int c = d.mo1663c(j3);
                if (c == 0) {
                    z3 = z;
                    j2 = 0;
                    j5 = 0;
                    z5 = true;
                } else if (!z5) {
                    z3 = z;
                    long a = d.mo1657a();
                    long j6 = j4;
                    long max = Math.max(j5, d.mo1658a(a));
                    if (c != -1) {
                        long j7 = (a + ((long) c)) - 1;
                        j2 = Math.min(j6, d.mo1658a(j7) + d.mo1660b(j7, j3));
                        j5 = max;
                    } else {
                        j2 = j6;
                        j5 = max;
                    }
                }
                i4++;
                j4 = j2;
                z = z3;
                i = 0;
            }
            z3 = z;
            j2 = j4;
            i4++;
            j4 = j2;
            z = z3;
            i = 0;
        }
        long j8 = j4;
        if (!z4) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new azn(z2, j5, j8);
    }
}
