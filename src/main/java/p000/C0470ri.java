package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: ri */
/* compiled from: PG */
public final class C0470ri {

    /* renamed from: a */
    public final Context f10247a;

    /* renamed from: b */
    public PreferenceScreen f10248b;

    /* renamed from: c */
    public C0469rh f10249c;

    /* renamed from: d */
    public C0467rf f10250d;

    /* renamed from: e */
    public C0468rg f10251e;

    /* renamed from: f */
    private long f10252f = 0;

    /* renamed from: g */
    private SharedPreferences f10253g;

    /* renamed from: h */
    private final String f10254h;

    public C0470ri(Context context) {
        this.f10247a = context;
        this.f10254h = context.getPackageName() + "_preferences";
        this.f10253g = null;
    }

    /* renamed from: a */
    public final PreferenceScreen mo5809a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.mo1089a(this);
        return preferenceScreen;
    }

    /* renamed from: a */
    public final Preference mo5808a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f10248b;
        if (preferenceScreen != null) {
            return preferenceScreen.mo1119c(charSequence);
        }
        return null;
    }

    /* renamed from: c */
    public final SharedPreferences.Editor mo5811c() {
        return mo5810b().edit();
    }

    /* renamed from: a */
    public final long mo5807a() {
        long j;
        synchronized (this) {
            j = this.f10252f;
            this.f10252f = 1 + j;
        }
        return j;
    }

    /* renamed from: b */
    public final SharedPreferences mo5810b() {
        if (this.f10253g == null) {
            this.f10253g = this.f10247a.getSharedPreferences(this.f10254h, 0);
        }
        return this.f10253g;
    }
}
