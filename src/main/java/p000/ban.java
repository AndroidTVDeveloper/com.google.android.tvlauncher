package p000;

import java.util.List;

/* renamed from: ban */
/* compiled from: PG */
public abstract class ban extends bas {

    /* renamed from: a */
    public final long f3018a;

    /* renamed from: b */
    public final long f3019b;

    /* renamed from: c */
    public final List f3020c;

    public ban(baj baj, long j, long j2, long j3, long j4, List list) {
        super(baj, j, j2);
        this.f3018a = j3;
        this.f3019b = j4;
        this.f3020c = list;
    }

    /* renamed from: a */
    public abstract baj mo1695a(bam bam, long j);

    /* renamed from: a */
    public boolean mo1696a() {
        return this.f3020c != null;
    }

    /* renamed from: b */
    public abstract int mo1697b(long j);

    /* renamed from: a */
    public final long mo1694a(long j) {
        long j2;
        List list = this.f3020c;
        if (list != null) {
            j2 = ((baq) list.get((int) (j - this.f3018a))).f3025a - this.f3031h;
        } else {
            j2 = (j - this.f3018a) * this.f3019b;
        }
        return blm.m3663b(j2, 1000000, this.f3030g);
    }
}
