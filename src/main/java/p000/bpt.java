package p000;

import android.os.Bundle;

/* renamed from: bpt */
/* compiled from: PG */
public final class bpt implements boq, bor {

    /* renamed from: a */
    public final bok f4552a;

    /* renamed from: b */
    public bpu f4553b;

    /* renamed from: c */
    private final boolean f4554c;

    public bpt(bok bok, boolean z) {
        this.f4552a = bok;
        this.f4554c = z;
    }

    /* renamed from: a */
    private final void m3914a() {
        buh.m4200a(this.f4553b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void mo2289a(Bundle bundle) {
        m3914a();
        this.f4553b.mo2289a(bundle);
    }

    /* renamed from: a */
    public final void mo2290a(bno bno) {
        m3914a();
        bpu bpu = this.f4553b;
        bok bok = this.f4552a;
        boolean z = this.f4554c;
        bqx bqx = (bqx) bpu;
        bqx.f4644a.lock();
        try {
            ((bqx) bpu).f4653j.mo2309a(bno, bok, z);
        } finally {
            bqx.f4644a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2288a(int i) {
        m3914a();
        this.f4553b.mo2288a(i);
    }
}
