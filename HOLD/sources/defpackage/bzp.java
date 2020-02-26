package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bzp  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bzp implements dff {
    private final bzs a;
    private final cbi b;
    private final Application c;
    private final dff d;
    private final dfc e;

    public bzp(bzs bzs, cbi cbi, Application application, dff dff, dfc dfc) {
        this.a = bzs;
        this.b = cbi;
        this.c = application;
        this.d = dff;
        this.e = dfc;
    }

    public final Object a() {
        bzs bzs = this.a;
        cbi cbi = this.b;
        Application application = this.c;
        dff dff = this.d;
        if (!cbi.d().a() || !((cci) cbi.d().b()).a) {
            return cak.a;
        }
        if (bzs.g.h().a()) {
            dbk dbk = (dbk) bzs.g.h().b();
        }
        dnj dnj = bzs.d;
        dff dff2 = bzs.e;
        cci cci = (cci) cbi.d().b();
        return (ccn) bzs.a(new ccp(dnj, application, dff2, dff, cda.a(cci.b), cci.c, (ConcurrentHashMap) dgx.a(new ConcurrentHashMap(), "use Optional.orNull() instead of Optional.or(null)")));
    }
}
