package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: bpv  reason: default package */
/* compiled from: PG */
final class bpv implements brm {
    private final /* synthetic */ bpx a;

    public /* synthetic */ bpv(bpx bpx) {
        this.a = bpx;
    }

    public final void a(bno bno) {
        this.a.g.lock();
        try {
            bpx bpx = this.a;
            bpx.d = bno;
            bpx.d();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            bpx bpx = this.a;
            Bundle bundle2 = bpx.c;
            if (bundle2 == null) {
                bpx.c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.a.d = bno.a;
            this.a.d();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i) {
        Lock lock;
        bno bno;
        this.a.g.lock();
        try {
            bpx bpx = this.a;
            if (bpx.f || (bno = bpx.e) == null || !bno.b()) {
                bpx bpx2 = this.a;
                bpx2.f = false;
                bpx2.a(i);
                lock = this.a.g;
            } else {
                bpx bpx3 = this.a;
                bpx3.f = true;
                bpx3.b.a(i);
                lock = this.a.g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.a.g.unlock();
            throw th;
        }
    }
}
