package defpackage;

import android.app.Application;

/* renamed from: ccq  reason: default package */
/* compiled from: PG */
final class ccq extends byo {
    private ccq(dnj dnj, Application application, dff dff, dff dff2) {
        super(dnj, application, dff, dff2, 2);
    }

    public final void d() {
    }

    static synchronized ccq a(dnj dnj, Application application, dff dff, dff dff2) {
        ccq ccq;
        synchronized (ccq.class) {
            ccq = new ccq(dnj, application, dff, dff2);
        }
        return ccq;
    }
}
