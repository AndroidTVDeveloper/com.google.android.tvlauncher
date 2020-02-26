package p000;

import android.content.SharedPreferences;

/* renamed from: cei */
/* compiled from: PG */
final /* synthetic */ class cei implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final cej f5368a;

    public cei(cej cej) {
        this.f5368a = cej;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        cej cej = this.f5368a;
        synchronized (cej.f5370a) {
            cej.f5371b = null;
            ceh.m4607a();
        }
        synchronized (cej) {
            for (cdu a : cej.f5372c) {
                a.mo2686a();
            }
        }
    }
}
