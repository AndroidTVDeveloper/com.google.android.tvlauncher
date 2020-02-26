package p000;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: bpv */
/* compiled from: PG */
final class bpv implements brm {

    /* renamed from: a */
    private final /* synthetic */ bpx f4555a;

    public /* synthetic */ bpv(bpx bpx) {
        this.f4555a = bpx;
    }

    /* renamed from: a */
    public final void mo2293a(bno bno) {
        this.f4555a.f4563g.lock();
        try {
            bpx bpx = this.f4555a;
            bpx.f4560d = bno;
            bpx.mo2301d();
        } finally {
            this.f4555a.f4563g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2292a(Bundle bundle) {
        this.f4555a.f4563g.lock();
        try {
            bpx bpx = this.f4555a;
            Bundle bundle2 = bpx.f4559c;
            if (bundle2 == null) {
                bpx.f4559c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.f4555a.f4560d = bno.f4481a;
            this.f4555a.mo2301d();
        } finally {
            this.f4555a.f4563g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2291a(int i) {
        Lock lock;
        bno bno;
        this.f4555a.f4563g.lock();
        try {
            bpx bpx = this.f4555a;
            if (bpx.f4562f || (bno = bpx.f4561e) == null || !bno.mo2195b()) {
                bpx bpx2 = this.f4555a;
                bpx2.f4562f = false;
                bpx2.mo2296a(i);
                lock = this.f4555a.f4563g;
            } else {
                bpx bpx3 = this.f4555a;
                bpx3.f4562f = true;
                bpx3.f4558b.mo2288a(i);
                lock = this.f4555a.f4563g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f4555a.f4563g.unlock();
            throw th;
        }
    }
}
