package p000;

/* renamed from: bph */
/* compiled from: PG */
public final class bph extends bpe {

    /* renamed from: b */
    private final brq f4541b;

    public bph(brq brq, bxe bxe) {
        super(bxe);
        this.f4541b = brq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2262a(bqb bqb, boolean z) {
    }

    /* renamed from: d */
    public final void mo2266d(bre bre) {
        if (((bru) bre.f4667d.remove(this.f4541b)) == null) {
            bxh bxh = this.f4537a.f4974a;
            synchronized (bxh.f4977a) {
                if (!bxh.f4979c) {
                    bxh.f4979c = true;
                    bxh.f4978b.mo2513a(bxh);
                    return;
                }
                return;
            }
        }
        throw null;
    }

    /* renamed from: a */
    public final bnr[] mo2260a(bre bre) {
        if (((bru) bre.f4667d.get(this.f4541b)) == null) {
            return null;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo2261b(bre bre) {
        if (((bru) bre.f4667d.get(this.f4541b)) != null) {
            throw null;
        }
    }
}
