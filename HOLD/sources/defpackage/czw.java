package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import java.util.List;

/* renamed from: czw  reason: default package */
/* compiled from: PG */
public final class czw {
    private static czw a;
    private final Context b;
    private final UserManager c;

    private czw(Context context) {
        this.b = context.getApplicationContext();
        this.c = (UserManager) context.getSystemService("user");
    }

    public static czw a(Context context) {
        if (a == null) {
            a = new czw(context);
        }
        return a;
    }

    public final ResolveInfo b() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LEANBACK_SETTINGS");
        List<ResolveInfo> queryIntentActivities = this.b.getPackageManager().queryIntentActivities(intent, 129);
        if (queryIntentActivities == null) {
            return null;
        }
        for (ResolveInfo next : queryIntentActivities) {
            int i = next.activityInfo.applicationInfo.flags & 1;
            if (next.activityInfo != null && i != 0 && "com.android.tv.settings.users.RestrictedProfileActivityLauncherEntry".equals(next.activityInfo.name)) {
                return next;
            }
        }
        return null;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.c.isRestrictedProfile();
        }
        try {
            return ((Boolean) this.c.getClass().getMethod("isLinkedUser", new Class[0]).invoke(this.c, new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.e("ProfilesManager", "Fail to check restricted profile", e);
            return false;
        }
    }
}
