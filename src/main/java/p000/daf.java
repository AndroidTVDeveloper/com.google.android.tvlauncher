package p000;

import android.content.Context;
import android.preference.PreferenceManager;
import android.provider.Settings;

/* renamed from: daf */
/* compiled from: PG */
public final class daf {

    /* renamed from: a */
    public final Context f8040a;

    /* renamed from: b */
    private boolean f8041b;

    public daf(Context context) {
        this.f8040a = context;
    }

    /* renamed from: c */
    private final int m6050c() {
        return Settings.Global.getInt(this.f8040a.getContentResolver(), "boot_count", 0);
    }

    /* renamed from: a */
    public final boolean mo4032a() {
        boolean z = true;
        if (!this.f8041b) {
            if (PreferenceManager.getDefaultSharedPreferences(this.f8040a).getInt("boot.completed.boot.count", -1) < m6050c()) {
                z = false;
            }
            this.f8041b = z;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo4033b() {
        PreferenceManager.getDefaultSharedPreferences(this.f8040a).edit().putInt("boot.completed.boot.count", m6050c()).apply();
        this.f8041b = true;
    }
}
