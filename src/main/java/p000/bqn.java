package p000;

import android.os.Bundle;

/* renamed from: bqn */
/* compiled from: PG */
final class bqn implements boq, bor {

    /* renamed from: a */
    private final /* synthetic */ bqp f4591a;

    public /* synthetic */ bqn(bqp bqp) {
        this.f4591a = bqp;
    }

    /* renamed from: a */
    public final void mo2288a(int i) {
    }

    /* renamed from: a */
    public final void mo2289a(Bundle bundle) {
        bqp bqp = this.f4591a;
        bqp.f4597e.mo2490a(new bqm(bqp));
    }

    /* renamed from: a */
    public final void mo2290a(bno bno) {
        this.f4591a.f4594b.lock();
        try {
            if (!this.f4591a.mo2318a(bno)) {
                this.f4591a.mo2319b(bno);
            } else {
                this.f4591a.mo2324f();
                this.f4591a.mo2323e();
            }
        } finally {
            this.f4591a.f4594b.unlock();
        }
    }
}
