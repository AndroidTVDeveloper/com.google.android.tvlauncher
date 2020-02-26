package p000;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bzp */
/* compiled from: PG */
final /* synthetic */ class bzp implements dff {

    /* renamed from: a */
    private final bzs f5062a;

    /* renamed from: b */
    private final cbi f5063b;

    /* renamed from: c */
    private final Application f5064c;

    /* renamed from: d */
    private final dff f5065d;

    /* renamed from: e */
    private final dfc f5066e;

    public bzp(bzs bzs, cbi cbi, Application application, dff dff, dfc dfc) {
        this.f5062a = bzs;
        this.f5063b = cbi;
        this.f5064c = application;
        this.f5065d = dff;
        this.f5066e = dfc;
    }

    /* renamed from: a */
    public final Object mo2551a() {
        bzs bzs = this.f5062a;
        cbi cbi = this.f5063b;
        Application application = this.f5064c;
        dff dff = this.f5065d;
        if (!cbi.mo2616d().mo4219a() || !((cci) cbi.mo2616d().mo4220b()).f5269a) {
            return cak.f5125a;
        }
        if (bzs.f5076g.mo2620h().mo4219a()) {
            dbk dbk = (dbk) bzs.f5076g.mo2620h().mo4220b();
        }
        dnj dnj = bzs.f5073d;
        dff dff2 = bzs.f5074e;
        cci cci = (cci) cbi.mo2616d().mo4220b();
        return (ccn) bzs.mo2588a(new ccp(dnj, application, dff2, dff, cda.m4558a(cci.f5270b), cci.f5271c, (ConcurrentHashMap) dgx.m6403a(new ConcurrentHashMap(), "use Optional.orNull() instead of Optional.or(null)")));
    }
}
