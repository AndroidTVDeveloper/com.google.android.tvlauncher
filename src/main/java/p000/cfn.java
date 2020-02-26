package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: cfn */
/* compiled from: PG */
public final class cfn {

    /* renamed from: a */
    public final SharedPreferences f5412a;

    /* renamed from: b */
    public boolean f5413b;

    /* renamed from: c */
    private final bmy f5414c;

    public cfn(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f5412a = defaultSharedPreferences;
        this.f5413b = defaultSharedPreferences.getBoolean("logging_enabled_by_user", false);
        this.f5414c = new bmy(context, "TV_LAUNCHER");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2720a(int i, dnc dnc) {
        if (this.f5413b) {
            mo2721b(i, dnc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2721b(int i, dnc dnc) {
        bmw a = this.f5414c.mo2165a(dnc.mo4371j());
        if (i != 0) {
            djb djb = a.f4433g;
            if (djb.f8673b) {
                djb.mo4505b();
                djb.f8673b = false;
            }
            dng dng = (dng) djb.f8672a;
            dng dng2 = dng.f8930i;
            dng.f8931b |= 16;
            dng.f8934e = i;
        }
        a.mo2163a();
    }
}
