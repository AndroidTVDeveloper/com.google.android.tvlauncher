package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import java.util.List;

/* renamed from: czw */
/* compiled from: PG */
public final class czw {

    /* renamed from: a */
    private static czw f8006a;

    /* renamed from: b */
    private final Context f8007b;

    /* renamed from: c */
    private final UserManager f8008c;

    private czw(Context context) {
        this.f8007b = context.getApplicationContext();
        this.f8008c = (UserManager) context.getSystemService("user");
    }

    /* renamed from: a */
    public static czw m6037a(Context context) {
        if (f8006a == null) {
            f8006a = new czw(context);
        }
        return f8006a;
    }

    /* renamed from: b */
    public final ResolveInfo mo4021b() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LEANBACK_SETTINGS");
        List<ResolveInfo> queryIntentActivities = this.f8007b.getPackageManager().queryIntentActivities(intent, 129);
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

    /* renamed from: a */
    public final boolean mo4020a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f8008c.isRestrictedProfile();
        }
        try {
            return ((Boolean) this.f8008c.getClass().getMethod("isLinkedUser", new Class[0]).invoke(this.f8008c, new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.e("ProfilesManager", "Fail to check restricted profile", e);
            return false;
        }
    }
}
