package defpackage;

/* renamed from: azi  reason: default package */
/* compiled from: PG */
final class azi extends alh {
    private final long b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final bac h;

    public azi(long j, long j2, int i, long j3, long j4, long j5, bac bac) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = bac;
    }

    public final int a() {
        return 1;
    }

    public final int a(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.d) < 0 || intValue >= b()) {
            return -1;
        }
        return intValue;
    }

    public final alf a(int i, alf alf, boolean z) {
        bks.a(i, b());
        Integer num = null;
        String str = z ? this.h.a(i).a : null;
        if (z) {
            num = Integer.valueOf(this.d + i);
        }
        alf.a(str, num, this.h.b(i), aja.b(this.h.a(i).b - this.h.a(0).b) - this.e);
        return alf;
    }

    public final int b() {
        return this.h.a();
    }

    public final Object a(int i) {
        bks.a(i, b());
        return Integer.valueOf(this.d + i);
    }

    public final alg a(int i, alg alg, long j) {
        azr d2;
        bks.a(i, 1);
        long j2 = this.g;
        if (a(this.h)) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f) {
                    j2 = -9223372036854775807L;
                }
            }
            long j3 = this.e + j2;
            long b2 = this.h.b(0);
            int i2 = 0;
            while (i2 < this.h.a() - 1 && j3 >= b2) {
                j3 -= b2;
                i2++;
                b2 = this.h.b(i2);
            }
            bah a = this.h.a(i2);
            int size = a.c.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((bab) a.c.get(i3)).b == 2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (!(i3 == -1 || (d2 = ((bam) ((bab) a.c.get(i3)).c.get(0)).d()) == null || d2.c(b2) == 0)) {
                j2 = (j2 + d2.a(d2.a(j3, b2))) - j3;
            }
        }
        long j4 = j2;
        Object obj = alg.a;
        bac bac = this.h;
        alg.a(obj, bac, this.b, this.c, true, a(bac), this.h.c, j4, this.f, b() - 1, this.e);
        return alg;
    }

    private static boolean a(bac bac) {
        return bac.c && bac.d != -9223372036854775807L && bac.b == -9223372036854775807L;
    }
}
