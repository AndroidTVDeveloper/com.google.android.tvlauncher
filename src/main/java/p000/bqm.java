package p000;

import java.lang.ref.WeakReference;

/* renamed from: bqm */
/* compiled from: PG */
final class bqm extends bwm {

    /* renamed from: a */
    private final WeakReference f4590a;

    public bqm(bqp bqp) {
        this.f4590a = new WeakReference(bqp);
    }

    /* renamed from: a */
    public final void mo2316a(bwt bwt) {
        bqp bqp = (bqp) this.f4590a.get();
        if (bqp != null) {
            bqp.f4593a.mo2332a(new bql(bqp, bqp, bwt));
        }
    }
}
