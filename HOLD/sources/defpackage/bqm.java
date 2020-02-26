package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bqm  reason: default package */
/* compiled from: PG */
final class bqm extends bwm {
    private final WeakReference a;

    public bqm(bqp bqp) {
        this.a = new WeakReference(bqp);
    }

    public final void a(bwt bwt) {
        bqp bqp = (bqp) this.a.get();
        if (bqp != null) {
            bqp.a.a(new bql(bqp, bqp, bwt));
        }
    }
}
