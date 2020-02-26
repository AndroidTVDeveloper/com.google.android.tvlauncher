package p000;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: bpw */
/* compiled from: PG */
final class bpw implements brm {

    /* renamed from: a */
    private final /* synthetic */ bpx f4556a;

    public /* synthetic */ bpw(bpx bpx) {
        this.f4556a = bpx;
    }

    /* renamed from: a */
    public final void mo2293a(bno bno) {
        this.f4556a.f4563g.lock();
        try {
            bpx bpx = this.f4556a;
            bpx.f4561e = bno;
            bpx.mo2301d();
        } finally {
            this.f4556a.f4563g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2292a(Bundle bundle) {
        this.f4556a.f4563g.lock();
        try {
            this.f4556a.f4561e = bno.f4481a;
            this.f4556a.mo2301d();
        } finally {
            this.f4556a.f4563g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2291a(int i) {
        Lock lock;
        this.f4556a.f4563g.lock();
        try {
            bpx bpx = this.f4556a;
            if (!bpx.f4562f) {
                bpx.f4562f = true;
                bpx.f4557a.mo2288a(i);
                lock = this.f4556a.f4563g;
            } else {
                bpx.f4562f = false;
                bpx.mo2296a(i);
                lock = this.f4556a.f4563g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f4556a.f4563g.unlock();
            throw th;
        }
    }
}
