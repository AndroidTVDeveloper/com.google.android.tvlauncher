package defpackage;

import android.content.SharedPreferences;

/* renamed from: ckr  reason: default package */
/* compiled from: PG */
final class ckr implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final /* synthetic */ cla a;

    public ckr(cla cla) {
        this.a = cla;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.startsWith("watch_next_package_key_prefix")) {
            this.a.u = cla.a(sharedPreferences);
            this.a.n();
        }
    }
}
