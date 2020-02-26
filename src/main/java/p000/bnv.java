package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: bnv */
/* compiled from: PG */
public class bnv {

    /* renamed from: b */
    public static final int f4495b = bof.f4503a;

    /* renamed from: c */
    public static final bnv f4496c = new bnv();

    /* renamed from: a */
    public final Intent mo2215a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null) {
                buj.m4249b(context);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f4495b);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    bun a = buo.m4260a(context);
                    sb.append(a.f4854a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            return btl.m4169a("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return btl.m4168a("com.google.android.gms");
        }
    }

    /* renamed from: b */
    public final PendingIntent mo2216b(Context context, int i, String str) {
        Intent a = mo2215a(context, i, str);
        if (a != null) {
            return PendingIntent.getActivity(context, 0, a, 134217728);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo2213a(Context context) {
        return mo2214a(context, f4495b);
    }

    /* renamed from: a */
    public final int mo2214a(Context context, int i) {
        int a = bof.m3822a(context, i);
        if (bof.m3826b(context, a)) {
            return 18;
        }
        return a;
    }
}
