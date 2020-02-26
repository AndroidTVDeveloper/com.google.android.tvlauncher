package defpackage;

import android.app.Application;
import java.util.concurrent.Executors;

/* renamed from: byp  reason: default package */
/* compiled from: PG */
final /* synthetic */ class byp implements dnj {
    private final Application a;
    private final dnj b;
    private final dff c;
    private final dff d;

    public byp(Application application, dnj dnj, dff dff, dff dff2) {
        this.a = application;
        this.b = dnj;
        this.c = dff;
        this.d = dff2;
    }

    public final Object a() {
        Application application = this.a;
        dnj dnj = this.b;
        dff dff = this.c;
        dff dff2 = this.d;
        caz caz = new caz(application, dgx.a((dff) new cbk()));
        Runnable a2 = caz.a(new cau(caz, Executors.newSingleThreadExecutor(new cbo("Primes-init")), caz.a(new caw(caz, dnj, dff, dff2, new cax(bze.a(caz.a)), new cay(bze.a(caz.a), caz.b)))));
        new byq(application);
        bog.c("PrimesInit", "Primes instant initialization", new Object[0]);
        a2.run();
        return caz;
    }
}
