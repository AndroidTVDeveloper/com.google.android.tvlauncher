package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import android.provider.Settings;

/* renamed from: daf  reason: default package */
/* compiled from: PG */
public final class daf {
    public final Context a;
    private boolean b;

    public daf(Context context) {
        this.a = context;
    }

    private final int c() {
        return Settings.Global.getInt(this.a.getContentResolver(), "boot_count", 0);
    }

    public final boolean a() {
        boolean z = true;
        if (!this.b) {
            if (PreferenceManager.getDefaultSharedPreferences(this.a).getInt("boot.completed.boot.count", -1) < c()) {
                z = false;
            }
            this.b = z;
        }
        return z;
    }

    public final void b() {
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putInt("boot.completed.boot.count", c()).apply();
        this.b = true;
    }
}
