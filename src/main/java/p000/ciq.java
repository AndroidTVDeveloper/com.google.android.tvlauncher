package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ciq */
/* compiled from: PG */
public final class ciq {

    /* renamed from: b */
    public static ciq f5663b;

    /* renamed from: a */
    public final SharedPreferences f5664a;

    public ciq(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("installing_launch_items_data", 0);
        this.f5664a = sharedPreferences;
        sharedPreferences.edit().putInt("launcher_version", dcr.m6171b(context, "com.google.android.tvlauncher")).apply();
    }
}
