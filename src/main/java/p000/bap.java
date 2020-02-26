package p000;

import java.util.List;

/* renamed from: bap */
/* compiled from: PG */
public final class bap extends ban {

    /* renamed from: d */
    public final bau f3022d;

    /* renamed from: e */
    public final bau f3023e;

    /* renamed from: i */
    private final long f3024i;

    public bap(baj baj, long j, long j2, long j3, long j4, long j5, List list, bau bau, bau bau2) {
        super(baj, j, j2, j3, j5, list);
        this.f3022d = bau;
        this.f3023e = bau2;
        this.f3024i = j4;
    }

    /* renamed from: a */
    public final baj mo1698a(bam bam) {
        bau bau = this.f3022d;
        if (bau == null) {
            return this.f3029f;
        }
        akh akh = bam.f3013a;
        return new baj(bau.mo1701a(akh.f548a, 0, akh.f552e, 0), 0, -1);
    }

    /* renamed from: b */
    public final int mo1697b(long j) {
        List list = this.f3020c;
        if (list != null) {
            return list.size();
        }
        long j2 = this.f3024i;
        if (j2 != -1) {
            return (int) ((j2 - this.f3018a) + 1);
        }
        if (j != -9223372036854775807L) {
            return (int) blm.m3631a(j, (this.f3019b * 1000000) / this.f3030g);
        }
        return -1;
    }

    /* renamed from: a */
    public final baj mo1695a(bam bam, long j) {
        long j2;
        List list = this.f3020c;
        if (list != null) {
            j2 = ((baq) list.get((int) (j - this.f3018a))).f3025a;
        } else {
            j2 = (j - this.f3018a) * this.f3019b;
        }
        bau bau = this.f3023e;
        akh akh = bam.f3013a;
        return new baj(bau.mo1701a(akh.f548a, j, akh.f552e, j2), 0, -1);
    }
}
