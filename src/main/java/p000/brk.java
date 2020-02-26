package p000;

import java.lang.ref.WeakReference;

/* renamed from: brk */
/* compiled from: PG */
public final class brk {

    /* renamed from: a */
    private final WeakReference f4702a;

    public brk(bqt bqt) {
        this.f4702a = new WeakReference(bqt);
    }

    /* renamed from: a */
    public final void mo2357a() {
        bqt bqt = (bqt) this.f4702a.get();
        if (bqt != null) {
            bqt.mo2328e();
        }
    }

    public brk() {
    }
}
