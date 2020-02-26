package defpackage;

import android.content.SharedPreferences;

/* renamed from: cqm  reason: default package */
/* compiled from: PG */
final class cqm implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final /* synthetic */ cqp a;

    public cqm(cqp cqp) {
        this.a = cqp;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("show_watch_next_row_key".equals(str)) {
            dck.a(this.a.b);
            boolean z = sharedPreferences.getBoolean("show_watch_next_row_key", dck.m());
            cqp cqp = this.a;
            if (cqp.t != z) {
                cqp.t = z;
                if (!z) {
                    cqp.b(false);
                    cqp cqp2 = this.a;
                    cqp2.c.b(cqp2.R);
                    return;
                }
                cqp.f();
            }
        }
    }
}
