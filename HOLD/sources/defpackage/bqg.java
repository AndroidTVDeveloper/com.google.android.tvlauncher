package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: bqg  reason: default package */
/* compiled from: PG */
final class bqg implements bsn {
    public final boolean a;
    private final WeakReference b;
    private final bok c;

    public bqg(bqp bqp, bok bok, boolean z) {
        this.b = new WeakReference(bqp);
        this.c = bok;
        this.a = z;
    }

    public final void a(bno bno) {
        bqp bqp = (bqp) this.b.get();
        if (bqp != null) {
            buh.a(Looper.myLooper() == bqp.a.l.d, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            bqp.b.lock();
            try {
                if (bqp.b(0)) {
                    if (!bno.b()) {
                        bqp.b(bno, this.c, this.a);
                    }
                    if (bqp.d()) {
                        bqp.e();
                    }
                }
            } finally {
                bqp.b.unlock();
            }
        }
    }
}
