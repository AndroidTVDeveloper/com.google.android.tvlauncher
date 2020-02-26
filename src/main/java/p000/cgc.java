package p000;

import android.app.Application;

/* renamed from: cgc */
/* compiled from: PG */
final /* synthetic */ class cgc implements dnj {

    /* renamed from: a */
    private final Application f5454a;

    public cgc(Application application) {
        this.f5454a = application;
    }

    /* renamed from: a */
    public final Object mo2550a() {
        Application application = this.f5454a;
        if (dcx.m6183a()) {
            return cdh.f5318b;
        }
        cdl cdl = new cdl((byte) 0);
        cdl.f5322a = application.getApplicationContext();
        cdl.f5323b = "TV_LAUNCHER_ANDROID_PRIMES";
        return new cdq(cdl.f5322a, cdl.f5323b, cdl.f5324c);
    }
}
