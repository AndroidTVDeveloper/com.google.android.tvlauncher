package defpackage;

import android.app.Application;

/* renamed from: cgc  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cgc implements dnj {
    private final Application a;

    public cgc(Application application) {
        this.a = application;
    }

    public final Object a() {
        Application application = this.a;
        if (dcx.a()) {
            return cdh.b;
        }
        cdl cdl = new cdl((byte) 0);
        cdl.a = application.getApplicationContext();
        cdl.b = "TV_LAUNCHER_ANDROID_PRIMES";
        return new cdq(cdl.a, cdl.b, cdl.c);
    }
}
