package p000;

import android.os.Bundle;
import java.util.Collections;

/* renamed from: bqq */
/* compiled from: PG */
public final class bqq implements bqu {

    /* renamed from: a */
    private final bqx f4614a;

    public bqq(bqx bqx) {
        this.f4614a = bqx;
    }

    /* renamed from: a */
    public final void mo2307a(int i) {
    }

    /* renamed from: a */
    public final void mo2308a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo2309a(bno bno, bok bok, boolean z) {
    }

    /* renamed from: c */
    public final void mo2312c() {
    }

    /* renamed from: a */
    public final void mo2306a() {
        for (boj d : this.f4614a.f4649f.values()) {
            d.mo2228d();
        }
        this.f4614a.f4655l.f4623g = Collections.emptySet();
    }

    /* renamed from: b */
    public final void mo2311b() {
        bqx bqx = this.f4614a;
        bqx.f4644a.lock();
        try {
            bqx.f4653j = new bqp(bqx, bqx.f4651h, bqx.f4652i, bqx.f4647d, bqx.f4657n, bqx.f4644a, bqx.f4646c, (byte) 0, (byte) 0);
            bqx.f4653j.mo2306a();
            bqx.f4645b.signalAll();
        } finally {
            bqx.f4644a.unlock();
        }
    }

    /* renamed from: a */
    public final bpn mo2305a(bpn bpn) {
        this.f4614a.f4655l.f4621e.add(bpn);
        return bpn;
    }

    /* renamed from: b */
    public final bpn mo2310b(bpn bpn) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
