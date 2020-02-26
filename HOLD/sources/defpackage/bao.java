package defpackage;

import java.util.List;

/* renamed from: bao  reason: default package */
/* compiled from: PG */
public final class bao extends ban {
    public final List d;

    public bao(baj baj, long j, long j2, long j3, long j4, List list, List list2) {
        super(baj, j, j2, j3, j4, list);
        this.d = list2;
    }

    public final boolean a() {
        return true;
    }

    public final int b(long j) {
        return this.d.size();
    }

    public final baj a(bam bam, long j) {
        return (baj) this.d.get((int) (j - this.a));
    }
}
