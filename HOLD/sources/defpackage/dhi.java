package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dhi  reason: default package */
/* compiled from: PG */
final class dhi extends dha {
    private final Callable d;
    private final /* synthetic */ dhj e;

    public dhi(dhj dhj, Callable callable) {
        this.e = dhj;
        this.d = (Callable) dgx.a(callable);
    }

    public final void a(Object obj, Throwable th) {
        if (th == null) {
            dhj dhj = this.e;
            if (obj == null) {
                obj = dgn.d;
            }
            if (dgn.c.a(dhj, (Object) null, obj)) {
                dgn.a((dgn) dhj);
                return;
            }
            return;
        }
        this.e.a(th);
    }

    public final boolean a() {
        return this.e.isDone();
    }

    public final Object b() {
        return this.d.call();
    }

    public final String c() {
        return this.d.toString();
    }
}
