package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: bpw  reason: default package */
/* compiled from: PG */
final class bpw implements brm {
    private final /* synthetic */ bpx a;

    public /* synthetic */ bpw(bpx bpx) {
        this.a = bpx;
    }

    public final void a(bno bno) {
        this.a.g.lock();
        try {
            bpx bpx = this.a;
            bpx.e = bno;
            bpx.d();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = bno.a;
            this.a.d();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i) {
        Lock lock;
        this.a.g.lock();
        try {
            bpx bpx = this.a;
            if (!bpx.f) {
                bpx.f = true;
                bpx.a.a(i);
                lock = this.a.g;
            } else {
                bpx.f = false;
                bpx.a(i);
                lock = this.a.g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.a.g.unlock();
            throw th;
        }
    }
}
