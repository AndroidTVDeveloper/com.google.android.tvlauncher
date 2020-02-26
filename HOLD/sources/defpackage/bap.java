package defpackage;

import java.util.List;

/* renamed from: bap  reason: default package */
/* compiled from: PG */
public final class bap extends ban {
    public final bau d;
    public final bau e;
    private final long i;

    public bap(baj baj, long j, long j2, long j3, long j4, long j5, List list, bau bau, bau bau2) {
        super(baj, j, j2, j3, j5, list);
        this.d = bau;
        this.e = bau2;
        this.i = j4;
    }

    public final baj a(bam bam) {
        bau bau = this.d;
        if (bau == null) {
            return this.f;
        }
        akh akh = bam.a;
        return new baj(bau.a(akh.a, 0, akh.e, 0), 0, -1);
    }

    public final int b(long j) {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        long j2 = this.i;
        if (j2 != -1) {
            return (int) ((j2 - this.a) + 1);
        }
        if (j != -9223372036854775807L) {
            return (int) blm.a(j, (this.b * 1000000) / this.g);
        }
        return -1;
    }

    public final baj a(bam bam, long j) {
        long j2;
        List list = this.c;
        if (list != null) {
            j2 = ((baq) list.get((int) (j - this.a))).a;
        } else {
            j2 = (j - this.a) * this.b;
        }
        bau bau = this.e;
        akh akh = bam.a;
        return new baj(bau.a(akh.a, j, akh.e, j2), 0, -1);
    }
}
