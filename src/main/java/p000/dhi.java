package p000;

import java.util.concurrent.Callable;

/* renamed from: dhi */
/* compiled from: PG */
final class dhi extends dha {

    /* renamed from: d */
    private final Callable f8529d;

    /* renamed from: e */
    private final /* synthetic */ dhj f8530e;

    public dhi(dhj dhj, Callable callable) {
        this.f8530e = dhj;
        this.f8529d = (Callable) dgx.m6401a(callable);
    }

    /* renamed from: a */
    public final void mo4348a(Object obj, Throwable th) {
        if (th == null) {
            dhj dhj = this.f8530e;
            if (obj == null) {
                obj = dgn.f8510d;
            }
            if (dgn.f8509c.mo4297a(dhj, (Object) null, obj)) {
                dgn.m6372a((dgn) dhj);
                return;
            }
            return;
        }
        this.f8530e.mo4304a(th);
    }

    /* renamed from: a */
    public final boolean mo4349a() {
        return this.f8530e.isDone();
    }

    /* renamed from: b */
    public final Object mo4350b() {
        return this.f8529d.call();
    }

    /* renamed from: c */
    public final String mo4351c() {
        return this.f8529d.toString();
    }
}
