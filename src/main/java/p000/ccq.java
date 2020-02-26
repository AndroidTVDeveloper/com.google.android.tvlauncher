package p000;

import android.app.Application;

/* renamed from: ccq */
/* compiled from: PG */
final class ccq extends byo {
    private ccq(dnj dnj, Application application, dff dff, dff dff2) {
        super(dnj, application, dff, dff2, 2);
    }

    /* renamed from: d */
    public final void mo2549d() {
    }

    /* renamed from: a */
    static synchronized ccq m4538a(dnj dnj, Application application, dff dff, dff dff2) {
        ccq ccq;
        synchronized (ccq.class) {
            ccq = new ccq(dnj, application, dff, dff2);
        }
        return ccq;
    }
}
