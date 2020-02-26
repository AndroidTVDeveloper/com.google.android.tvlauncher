package p000;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: cis */
/* compiled from: PG */
final class cis implements ComponentCallbacks {

    /* renamed from: a */
    private final /* synthetic */ cja f5666a;

    public cis(cja cja) {
        this.f5666a = cja;
    }

    public final void onLowMemory() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        cja cja = this.f5666a;
        LocaleList locales = configuration.getLocales();
        LocaleList localeList = cja.f5694p;
        if (localeList == null || !localeList.equals(locales)) {
            cja.f5682d = true;
            cja.f5694p = locales;
        }
    }
}
