package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: ri  reason: default package */
/* compiled from: PG */
public final class ri {
    public final Context a;
    public PreferenceScreen b;
    public rh c;
    public rf d;
    public rg e;
    private long f = 0;
    private SharedPreferences g;
    private final String h;

    public ri(Context context) {
        this.a = context;
        this.h = context.getPackageName() + "_preferences";
        this.g = null;
    }

    public final PreferenceScreen a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.a(this);
        return preferenceScreen;
    }

    public final Preference a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen != null) {
            return preferenceScreen.c(charSequence);
        }
        return null;
    }

    public final SharedPreferences.Editor c() {
        return b().edit();
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.f;
            this.f = 1 + j;
        }
        return j;
    }

    public final SharedPreferences b() {
        if (this.g == null) {
            this.g = this.a.getSharedPreferences(this.h, 0);
        }
        return this.g;
    }
}
