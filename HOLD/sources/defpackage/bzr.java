package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: bzr  reason: default package */
/* compiled from: PG */
final class bzr implements dff {
    private final /* synthetic */ Application a;
    private final /* synthetic */ cbi b;

    public bzr(Application application, cbi cbi) {
        this.a = application;
        this.b = cbi;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        int i;
        caf caf = new caf((byte) 0);
        caf.a = this.a;
        if (!this.b.b().a()) {
            Context context = caf.a;
            dff dff = caf.b;
            String packageName = ((Context) cev.a(context)).getPackageName();
            String d = ccx.d(context);
            PackageManager packageManager = context.getPackageManager();
            try {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                bog.c("MetricStamper", "Failed to get PackageInfo for: %s", packageName);
                str = null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
                int i3 = Build.VERSION.SDK_INT;
                if (!packageManager.hasSystemFeature("android.software.leanback")) {
                    i = 2;
                } else {
                    i = 4;
                }
            } else {
                i = 3;
            }
            int i4 = Build.VERSION.SDK_INT;
            return new cag(packageName, d, str, packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i, 278652681L, new byn(context));
        }
        cbp cbp = (cbp) this.b.b().b();
        throw null;
    }
}
