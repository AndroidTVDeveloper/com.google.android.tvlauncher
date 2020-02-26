package p000;

import java.util.List;

/* renamed from: bao */
/* compiled from: PG */
public final class bao extends ban {

    /* renamed from: d */
    public final List f3021d;

    public bao(baj baj, long j, long j2, long j3, long j4, List list, List list2) {
        super(baj, j, j2, j3, j4, list);
        this.f3021d = list2;
    }

    /* renamed from: a */
    public final boolean mo1696a() {
        return true;
    }

    /* renamed from: b */
    public final int mo1697b(long j) {
        return this.f3021d.size();
    }

    /* renamed from: a */
    public final baj mo1695a(bam bam, long j) {
        return (baj) this.f3021d.get((int) (j - this.f3018a));
    }
}
