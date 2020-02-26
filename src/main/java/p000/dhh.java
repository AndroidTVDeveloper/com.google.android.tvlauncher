package p000;

/* renamed from: dhh */
/* compiled from: PG */
final class dhh extends dha {

    /* renamed from: d */
    private final dgp f8527d;

    /* renamed from: e */
    private final /* synthetic */ dhj f8528e;

    public dhh(dhj dhj, dgp dgp) {
        this.f8528e = dhj;
        this.f8527d = (dgp) dgx.m6401a(dgp);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4348a(Object obj, Throwable th) {
        dhj dhj;
        dgg dgg;
        dgd dgd;
        dhb dhb = (dhb) obj;
        if (th == null) {
            dhj = this.f8528e;
            dgx.m6401a(dhb);
            Object obj2 = dhj.value;
            if (obj2 == null) {
                if (dhb.isDone()) {
                    if (dgn.f8509c.mo4297a(dhj, (Object) null, dgn.m6368a(dhb))) {
                        dgn.m6372a((dgn) dhj);
                        return;
                    }
                    return;
                }
                dgg = new dgg(dhj, dhb);
                if (!dgn.f8509c.mo4297a(dhj, (Object) null, dgg)) {
                    obj2 = dhj.value;
                } else {
                    try {
                        dhb.mo4303a(dgg, dgq.INSTANCE);
                        return;
                    } catch (Throwable th2) {
                        dgd = dgd.f8488a;
                    }
                }
            }
            if (obj2 instanceof dgb) {
                dhb.cancel(((dgb) obj2).f8486c);
                return;
            }
            return;
        }
        this.f8528e.mo4304a(th);
        return;
        dgn.f8509c.mo4297a(dhj, dgg, dgd);
    }

    /* renamed from: a */
    public final boolean mo4349a() {
        return this.f8528e.isDone();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4350b() {
        dhb a = this.f8527d.mo2596a();
        dgp dgp = this.f8527d;
        if (a != null) {
            return a;
        }
        throw new NullPointerException(dgx.m6405a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dgp));
    }

    /* renamed from: c */
    public final String mo4351c() {
        return this.f8527d.toString();
    }
}
