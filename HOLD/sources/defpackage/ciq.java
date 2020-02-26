package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ciq  reason: default package */
/* compiled from: PG */
public final class ciq {
    public static ciq b;
    public final SharedPreferences a;

    public ciq(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("installing_launch_items_data", 0);
        this.a = sharedPreferences;
        sharedPreferences.edit().putInt("launcher_version", dcr.b(context, "com.google.android.tvlauncher")).apply();
    }
}
