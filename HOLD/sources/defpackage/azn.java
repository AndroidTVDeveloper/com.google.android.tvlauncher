package defpackage;

/* renamed from: azn  reason: default package */
/* compiled from: PG */
final class azn {
    public final boolean a;
    public final long b;
    public final long c;

    private azn(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public static azn a(bah bah, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        bah bah2 = bah;
        long j3 = j;
        int size = bah2.c.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            int i3 = ((bab) bah2.c.get(i2)).b;
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
            bab bab = (bab) bah2.c.get(i4);
            if (!z || bab.b != 3) {
                azr d = ((bam) bab.c.get(i)).d();
                if (d == null) {
                    return new azn(true, 0, j);
                }
                z4 |= d.b();
                int c2 = d.c(j3);
                if (c2 == 0) {
                    z3 = z;
                    j2 = 0;
                    j5 = 0;
                    z5 = true;
                } else if (!z5) {
                    z3 = z;
                    long a2 = d.a();
                    long j6 = j4;
                    long max = Math.max(j5, d.a(a2));
                    if (c2 != -1) {
                        long j7 = (a2 + ((long) c2)) - 1;
                        j2 = Math.min(j6, d.a(j7) + d.b(j7, j3));
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
