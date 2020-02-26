package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: cfn  reason: default package */
/* compiled from: PG */
public final class cfn {
    public final SharedPreferences a;
    public boolean b;
    private final bmy c;

    public cfn(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.a = defaultSharedPreferences;
        this.b = defaultSharedPreferences.getBoolean("logging_enabled_by_user", false);
        this.c = new bmy(context, "TV_LAUNCHER");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, dnc dnc) {
        if (this.b) {
            b(i, dnc);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i, dnc dnc) {
        bmw a2 = this.c.a(dnc.j());
        if (i != 0) {
            djb djb = a2.g;
            if (djb.b) {
                djb.b();
                djb.b = false;
            }
            dng dng = (dng) djb.a;
            dng dng2 = dng.i;
            dng.b |= 16;
            dng.e = i;
        }
        a2.a();
    }
}
