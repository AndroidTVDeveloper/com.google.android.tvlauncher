package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: bzs  reason: default package */
/* compiled from: PG */
final class bzs {
    public volatile cac a;
    public final dff b;
    public final Application c;
    public final dnj d;
    public final dff e;
    public final dff f;
    public final cbi g;
    public final SharedPreferences h;
    public final cck i;
    private volatile bzn j;

    public bzs(Application application, dff dff, cbi cbi, SharedPreferences sharedPreferences, cck cck, dfc dfc) {
        this.c = application;
        this.g = cbi;
        this.f = dff;
        this.d = cbi.a();
        this.h = sharedPreferences;
        this.i = cck;
        this.e = dgx.a((dff) new bzr(application, cbi));
        this.b = dgx.a((dff) new bzp(this, cbi, application, dff, dfc));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.g.e().a() && ((cbj) this.g.e().b()).a;
    }

    /* access modifiers changed from: package-private */
    public final bzn b() {
        if (this.j == null) {
            synchronized (bzn.class) {
                if (this.j == null) {
                    dnj dnj = this.d;
                    Application application = this.c;
                    this.j = (bzn) a(new bzn(dnj, ((cbj) this.g.e().b()).b, this.e, this.f, application));
                }
            }
        }
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final ccl a(ccl ccl) {
        if (!this.i.a(ccl)) {
            ccl.a();
        }
        return ccl;
    }
}
