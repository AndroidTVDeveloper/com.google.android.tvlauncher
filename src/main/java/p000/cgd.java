package p000;

import android.app.Application;

/* renamed from: cgd */
/* compiled from: PG */
public final class cgd implements dnj {

    /* renamed from: a */
    private final /* synthetic */ Application f5455a;

    /* renamed from: b */
    private final /* synthetic */ cge f5456b;

    public cgd(Application application, cge cge) {
        this.f5455a = application;
        this.f5456b = cge;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2550a() {
        cbf cbf = new cbf((byte) 0);
        cbf.f5183a = new cgc(this.f5455a);
        cbf.f5188f = dfc.m6292b(new cbw(cge.m4702a(this.f5456b.f5457a, "tvlauncher:primes_package_stats_metric_enabled")));
        new cbu((byte) 0);
        cbf.f5185c = dfc.m6292b(new cbv(cge.m4702a(this.f5456b.f5457a, "tvlauncher:primes_memory_metric_enabled")));
        new cev();
        cbf.f5187e = dfc.m6292b(new cbj(cge.m4702a(this.f5456b.f5457a, "tvlauncher:primes_crash_metric_enabled")));
        cbf.f5186d = dfc.m6292b(new cci(cge.m4702a(this.f5456b.f5457a, "tvlauncher:primes_timer_metric_enabled"), new cch((byte) 0).f5268a, (byte) 0));
        return cbi.m4495a(new cbg(cbf.f5183a, cbf.f5184b, cbf.f5185c, cbf.f5186d, cbf.f5187e, cbf.f5188f, cbf.f5189g, cbf.f5190h, cbf.f5191i, cbf.f5192j));
    }
}
