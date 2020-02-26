package p000;

import android.content.SharedPreferences;

/* renamed from: ckr */
/* compiled from: PG */
final class ckr implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final /* synthetic */ cla f5828a;

    public ckr(cla cla) {
        this.f5828a = cla;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.startsWith("watch_next_package_key_prefix")) {
            this.f5828a.f5893u = cla.m5027a(sharedPreferences);
            this.f5828a.mo3080n();
        }
    }
}
