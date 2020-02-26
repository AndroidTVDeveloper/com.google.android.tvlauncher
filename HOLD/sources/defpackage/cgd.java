package defpackage;

import android.app.Application;

/* renamed from: cgd  reason: default package */
/* compiled from: PG */
public final class cgd implements dnj {
    private final /* synthetic */ Application a;
    private final /* synthetic */ cge b;

    public cgd(Application application, cge cge) {
        this.a = application;
        this.b = cge;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        cbf cbf = new cbf((byte) 0);
        cbf.a = new cgc(this.a);
        cbf.f = dfc.b(new cbw(cge.a(this.b.a, "tvlauncher:primes_package_stats_metric_enabled")));
        new cbu((byte) 0);
        cbf.c = dfc.b(new cbv(cge.a(this.b.a, "tvlauncher:primes_memory_metric_enabled")));
        new cev();
        cbf.e = dfc.b(new cbj(cge.a(this.b.a, "tvlauncher:primes_crash_metric_enabled")));
        cbf.d = dfc.b(new cci(cge.a(this.b.a, "tvlauncher:primes_timer_metric_enabled"), new cch((byte) 0).a, (byte) 0));
        return cbi.a(new cbg(cbf.a, cbf.b, cbf.c, cbf.d, cbf.e, cbf.f, cbf.g, cbf.h, cbf.i, cbf.j));
    }
}
