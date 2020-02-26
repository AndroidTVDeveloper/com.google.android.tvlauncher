package defpackage;

import android.content.SharedPreferences;

/* renamed from: cei  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cei implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final cej a;

    public cei(cej cej) {
        this.a = cej;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        cej cej = this.a;
        synchronized (cej.a) {
            cej.b = null;
            ceh.a();
        }
        synchronized (cej) {
            for (cdu a2 : cej.c) {
                a2.a();
            }
        }
    }
}
