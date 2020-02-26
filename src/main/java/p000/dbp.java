package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;

/* renamed from: dbp */
/* compiled from: PG */
public final class dbp {

    /* renamed from: a */
    public static final String[] f8156a = {"package_name"};

    /* renamed from: b */
    public final Context f8157b;

    /* renamed from: c */
    public boolean f8158c;

    /* renamed from: d */
    public String f8159d;

    /* renamed from: e */
    public String f8160e;

    /* renamed from: f */
    public boolean f8161f;

    /* renamed from: g */
    public boolean f8162g;

    /* renamed from: h */
    public boolean f8163h;

    /* renamed from: i */
    public boolean f8164i;

    public dbp(Context context) {
        this.f8157b = context;
    }

    /* renamed from: b */
    public final int mo4074b() {
        return Settings.Global.getInt(this.f8157b.getContentResolver(), "boot_count", 0);
    }

    /* renamed from: a */
    public final boolean mo4072a() {
        boolean z = this.f8158c;
        if (!z) {
            z = PreferenceManager.getDefaultSharedPreferences(this.f8157b).getInt("launch_boot_count", -1) >= mo4074b();
            this.f8158c = z;
        }
        return !z;
    }

    /* renamed from: a */
    public final boolean mo4073a(String str) {
        Intent intent = new Intent("com.android.tv.action.FORCE_LAUNCH_ON_BOOT");
        intent.setPackage(str);
        intent.addFlags(270532608);
        try {
            this.f8157b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            String valueOf = String.valueOf(intent);
            String valueOf2 = String.valueOf(e);
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
