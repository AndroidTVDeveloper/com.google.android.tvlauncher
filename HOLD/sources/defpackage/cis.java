package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: cis  reason: default package */
/* compiled from: PG */
final class cis implements ComponentCallbacks {
    private final /* synthetic */ cja a;

    public cis(cja cja) {
        this.a = cja;
    }

    public final void onLowMemory() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        cja cja = this.a;
        LocaleList locales = configuration.getLocales();
        LocaleList localeList = cja.p;
        if (localeList == null || !localeList.equals(locales)) {
            cja.d = true;
            cja.p = locales;
        }
    }
}
