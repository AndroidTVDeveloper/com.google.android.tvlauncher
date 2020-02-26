package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: bnv  reason: default package */
/* compiled from: PG */
public class bnv {
    public static final int b = bof.a;
    public static final bnv c = new bnv();

    public final Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null) {
                buj.b(context);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(b);
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
                    bun a = buo.a(context);
                    sb.append(a.a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            return btl.a("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return btl.a("com.google.android.gms");
        }
    }

    public final PendingIntent b(Context context, int i, String str) {
        Intent a = a(context, i, str);
        if (a != null) {
            return PendingIntent.getActivity(context, 0, a, 134217728);
        }
        return null;
    }

    public final int a(Context context) {
        return a(context, b);
    }

    public final int a(Context context, int i) {
        int a = bof.a(context, i);
        if (bof.b(context, a)) {
            return 18;
        }
        return a;
    }
}
