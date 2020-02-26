package p000;

import android.content.SharedPreferences;

/* renamed from: cqm */
/* compiled from: PG */
final class cqm implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final /* synthetic */ cqp f6970a;

    public cqm(cqp cqp) {
        this.f6970a = cqp;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("show_watch_next_row_key".equals(str)) {
            dck.m6123a(this.f6970a.f7010b);
            boolean z = sharedPreferences.getBoolean("show_watch_next_row_key", dck.m6124m());
            cqp cqp = this.f6970a;
            if (cqp.f7028t != z) {
                cqp.f7028t = z;
                if (!z) {
                    cqp.mo3595b(false);
                    cqp cqp2 = this.f6970a;
                    cqp2.f7011c.mo3063b(cqp2.f6992R);
                    return;
                }
                cqp.mo3599f();
            }
        }
    }
}
