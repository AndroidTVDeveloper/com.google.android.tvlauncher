package p000;

import java.util.Queue;

/* renamed from: xf */
/* compiled from: PG */
abstract class C0629xf {

    /* renamed from: a */
    private final Queue f10767a = aie.m558a(20);

    /* renamed from: b */
    public abstract C0641xr mo6105b();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0641xr mo6103a() {
        C0641xr xrVar = (C0641xr) this.f10767a.poll();
        return xrVar == null ? mo6105b() : xrVar;
    }

    /* renamed from: a */
    public final void mo6104a(C0641xr xrVar) {
        if (this.f10767a.size() < 20) {
            this.f10767a.offer(xrVar);
        }
    }
}
