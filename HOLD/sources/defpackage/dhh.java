package defpackage;

/* renamed from: dhh  reason: default package */
/* compiled from: PG */
final class dhh extends dha {
    private final dgp d;
    private final /* synthetic */ dhj e;

    public dhh(dhj dhj, dgp dgp) {
        this.e = dhj;
        this.d = (dgp) dgx.a(dgp);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        dhj dhj;
        dgg dgg;
        dgd dgd;
        dhb dhb = (dhb) obj;
        if (th == null) {
            dhj = this.e;
            dgx.a(dhb);
            Object obj2 = dhj.value;
            if (obj2 == null) {
                if (dhb.isDone()) {
                    if (dgn.c.a(dhj, (Object) null, dgn.a(dhb))) {
                        dgn.a((dgn) dhj);
                        return;
                    }
                    return;
                }
                dgg = new dgg(dhj, dhb);
                if (!dgn.c.a(dhj, (Object) null, dgg)) {
                    obj2 = dhj.value;
                } else {
                    try {
                        dhb.a(dgg, dgq.INSTANCE);
                        return;
                    } catch (Throwable th2) {
                        dgd = dgd.a;
                    }
                }
            }
            if (obj2 instanceof dgb) {
                dhb.cancel(((dgb) obj2).c);
                return;
            }
            return;
        }
        this.e.a(th);
        return;
        dgn.c.a(dhj, dgg, dgd);
    }

    public final boolean a() {
        return this.e.isDone();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        dhb a = this.d.a();
        dgp dgp = this.d;
        if (a != null) {
            return a;
        }
        throw new NullPointerException(dgx.a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dgp));
    }

    public final String c() {
        return this.d.toString();
    }
}
