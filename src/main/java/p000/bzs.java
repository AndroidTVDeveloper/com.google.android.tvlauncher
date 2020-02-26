package p000;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: bzs */
/* compiled from: PG */
final class bzs {

    /* renamed from: a */
    public volatile cac f5070a;

    /* renamed from: b */
    public final dff f5071b;

    /* renamed from: c */
    public final Application f5072c;

    /* renamed from: d */
    public final dnj f5073d;

    /* renamed from: e */
    public final dff f5074e;

    /* renamed from: f */
    public final dff f5075f;

    /* renamed from: g */
    public final cbi f5076g;

    /* renamed from: h */
    public final SharedPreferences f5077h;

    /* renamed from: i */
    public final cck f5078i;

    /* renamed from: j */
    private volatile bzn f5079j;

    public bzs(Application application, dff dff, cbi cbi, SharedPreferences sharedPreferences, cck cck, dfc dfc) {
        this.f5072c = application;
        this.f5076g = cbi;
        this.f5075f = dff;
        this.f5073d = cbi.mo2613a();
        this.f5077h = sharedPreferences;
        this.f5078i = cck;
        this.f5074e = dgx.m6399a((dff) new bzr(application, cbi));
        this.f5071b = dgx.m6399a((dff) new bzp(this, cbi, application, dff, dfc));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo2589a() {
        return this.f5076g.mo2617e().mo4219a() && ((cbj) this.f5076g.mo2617e().mo4220b()).f5215a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bzn mo2590b() {
        if (this.f5079j == null) {
            synchronized (bzn.class) {
                if (this.f5079j == null) {
                    dnj dnj = this.f5073d;
                    Application application = this.f5072c;
                    this.f5079j = (bzn) mo2588a(new bzn(dnj, ((cbj) this.f5076g.mo2617e().mo4220b()).f5216b, this.f5074e, this.f5075f, application));
                }
            }
        }
        return this.f5079j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ccl mo2588a(ccl ccl) {
        if (!this.f5078i.mo2669a(ccl)) {
            ccl.mo2543a();
        }
        return ccl;
    }
}
