package defpackage;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: bjz  reason: default package */
/* compiled from: PG */
public final class bjz implements Comparator, bjq {
    private final long a = 104857600;
    private final TreeSet b = new TreeSet(this);
    private long c;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bjr bjr = (bjr) obj;
        bjr bjr2 = (bjr) obj2;
        long j = bjr.f;
        long j2 = bjr2.f;
        if (j - j2 == 0) {
            return bjr.compareTo(bjr2);
        }
        return j >= j2 ? 1 : -1;
    }

    public final void a(bjk bjk, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                bjk.b((bjr) this.b.first());
            } catch (bji e) {
            }
        }
    }

    public final void a(bjk bjk, bjr bjr) {
        this.b.add(bjr);
        this.c += bjr.c;
        a(bjk, 0);
    }

    public final void a(bjr bjr) {
        this.b.remove(bjr);
        this.c -= bjr.c;
    }

    public final void a(bjk bjk, bjr bjr, bjr bjr2) {
        a(bjr);
        a(bjk, bjr2);
    }
}
