package p000;

import android.app.Application;
import java.util.concurrent.Executors;

/* renamed from: byp */
/* compiled from: PG */
final /* synthetic */ class byp implements dnj {

    /* renamed from: a */
    private final Application f5029a;

    /* renamed from: b */
    private final dnj f5030b;

    /* renamed from: c */
    private final dff f5031c;

    /* renamed from: d */
    private final dff f5032d;

    public byp(Application application, dnj dnj, dff dff, dff dff2) {
        this.f5029a = application;
        this.f5030b = dnj;
        this.f5031c = dff;
        this.f5032d = dff2;
    }

    /* renamed from: a */
    public final Object mo2550a() {
        Application application = this.f5029a;
        dnj dnj = this.f5030b;
        dff dff = this.f5031c;
        dff dff2 = this.f5032d;
        caz caz = new caz(application, dgx.m6399a((dff) new cbk()));
        Runnable a = caz.m4465a(new cau(caz, Executors.newSingleThreadExecutor(new cbo("Primes-init")), caz.m4465a(new caw(caz, dnj, dff, dff2, new cax(bze.m4405a(caz.f5163a)), new cay(bze.m4405a(caz.f5163a), caz.f5164b)))));
        new byq(application);
        bog.m3837c("PrimesInit", "Primes instant initialization", new Object[0]);
        a.run();
        return caz;
    }
}
