package p000;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: bjz */
/* compiled from: PG */
public final class bjz implements Comparator, bjq {

    /* renamed from: a */
    private final long f4184a = 104857600;

    /* renamed from: b */
    private final TreeSet f4185b = new TreeSet(this);

    /* renamed from: c */
    private long f4186c;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bjr bjr = (bjr) obj;
        bjr bjr2 = (bjr) obj2;
        long j = bjr.f4165f;
        long j2 = bjr2.f4165f;
        if (j - j2 == 0) {
            return bjr.compareTo(bjr2);
        }
        return j >= j2 ? 1 : -1;
    }

    /* renamed from: a */
    public final void mo2022a(bjk bjk, long j) {
        while (this.f4186c + j > this.f4184a && !this.f4185b.isEmpty()) {
            try {
                bjk.mo2004b((bjr) this.f4185b.first());
            } catch (bji e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo1995a(bjk bjk, bjr bjr) {
        this.f4185b.add(bjr);
        this.f4186c += bjr.f4162c;
        mo2022a(bjk, 0);
    }

    /* renamed from: a */
    public final void mo1997a(bjr bjr) {
        this.f4185b.remove(bjr);
        this.f4186c -= bjr.f4162c;
    }

    /* renamed from: a */
    public final void mo1996a(bjk bjk, bjr bjr, bjr bjr2) {
        mo1997a(bjr);
        mo1995a(bjk, bjr2);
    }
}
