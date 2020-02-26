package defpackage;

/* renamed from: bph  reason: default package */
/* compiled from: PG */
public final class bph extends bpe {
    private final brq b;

    public bph(brq brq, bxe bxe) {
        super(bxe);
        this.b = brq;
    }

    public final /* bridge */ /* synthetic */ void a(bqb bqb, boolean z) {
    }

    public final void d(bre bre) {
        if (((bru) bre.d.remove(this.b)) == null) {
            bxh bxh = this.a.a;
            synchronized (bxh.a) {
                if (!bxh.c) {
                    bxh.c = true;
                    bxh.b.a(bxh);
                    return;
                }
                return;
            }
        }
        throw null;
    }

    public final bnr[] a(bre bre) {
        if (((bru) bre.d.get(this.b)) == null) {
            return null;
        }
        throw null;
    }

    public final void b(bre bre) {
        if (((bru) bre.d.get(this.b)) != null) {
            throw null;
        }
    }
}
