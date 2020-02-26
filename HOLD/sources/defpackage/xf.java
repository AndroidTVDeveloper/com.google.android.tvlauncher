package defpackage;

import java.util.Queue;

/* renamed from: xf  reason: default package */
/* compiled from: PG */
abstract class xf {
    private final Queue a = aie.a(20);

    public abstract xr b();

    /* access modifiers changed from: package-private */
    public final xr a() {
        xr xrVar = (xr) this.a.poll();
        return xrVar == null ? b() : xrVar;
    }

    public final void a(xr xrVar) {
        if (this.a.size() < 20) {
            this.a.offer(xrVar);
        }
    }
}
