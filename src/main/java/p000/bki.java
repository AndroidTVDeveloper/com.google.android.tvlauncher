package p000;

/* renamed from: bki */
/* compiled from: PG */
public final class bki {

    /* renamed from: a */
    private boolean f4214a;

    /* renamed from: c */
    public final synchronized boolean mo2035c() {
        return this.f4214a;
    }

    /* renamed from: b */
    public final synchronized void mo2034b() {
        while (!this.f4214a) {
            wait();
        }
    }

    /* renamed from: d */
    public final synchronized void mo2036d() {
        this.f4214a = false;
    }

    /* renamed from: a */
    public final synchronized boolean mo2033a() {
        boolean z;
        if (!this.f4214a) {
            z = true;
            this.f4214a = true;
            notifyAll();
        } else {
            z = false;
        }
        return z;
    }
}
