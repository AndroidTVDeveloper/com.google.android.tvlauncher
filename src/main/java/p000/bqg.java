package p000;

import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: bqg */
/* compiled from: PG */
final class bqg implements bsn {

    /* renamed from: a */
    public final boolean f4578a;

    /* renamed from: b */
    private final WeakReference f4579b;

    /* renamed from: c */
    private final bok f4580c;

    public bqg(bqp bqp, bok bok, boolean z) {
        this.f4579b = new WeakReference(bqp);
        this.f4580c = bok;
        this.f4578a = z;
    }

    /* renamed from: a */
    public final void mo2314a(bno bno) {
        bqp bqp = (bqp) this.f4579b.get();
        if (bqp != null) {
            buh.m4206a(Looper.myLooper() == bqp.f4593a.f4655l.f4620d, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            bqp.f4594b.lock();
            try {
                if (bqp.mo2321b(0)) {
                    if (!bno.mo2195b()) {
                        bqp.mo2320b(bno, this.f4580c, this.f4578a);
                    }
                    if (bqp.mo2322d()) {
                        bqp.mo2323e();
                    }
                }
            } finally {
                bqp.f4594b.unlock();
            }
        }
    }
}
