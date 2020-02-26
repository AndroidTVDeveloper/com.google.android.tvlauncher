package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;

/* renamed from: dbp  reason: default package */
/* compiled from: PG */
public final class dbp {
    public static final String[] a = {"package_name"};
    public final Context b;
    public boolean c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public dbp(Context context) {
        this.b = context;
    }

    public final int b() {
        return Settings.Global.getInt(this.b.getContentResolver(), "boot_count", 0);
    }

    public final boolean a() {
        boolean z = this.c;
        if (!z) {
            z = PreferenceManager.getDefaultSharedPreferences(this.b).getInt("launch_boot_count", -1) >= b();
            this.c = z;
        }
        return !z;
    }

    public final boolean a(String str) {
        Intent intent = new Intent("com.android.tv.action.FORCE_LAUNCH_ON_BOOT");
        intent.setPackage(str);
        intent.addFlags(270532608);
        try {
            this.b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            String valueOf = String.valueOf(intent);
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
            sb.append("Activity for intent : ");
            sb.append(valueOf);
            sb.append(", was not found : ");
            sb.append(valueOf2);
            Log.e("LaunchOnBootCompletedHelper", sb.toString());
            return false;
        }
    }
}
