package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: bzr */
/* compiled from: PG */
final class bzr implements dff {

    /* renamed from: a */
    private final /* synthetic */ Application f5068a;

    /* renamed from: b */
    private final /* synthetic */ cbi f5069b;

    public bzr(Application application, cbi cbi) {
        this.f5068a = application;
        this.f5069b = cbi;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2551a() {
        String str;
        int i;
        caf caf = new caf((byte) 0);
        caf.f5114a = this.f5068a;
        if (!this.f5069b.mo2614b().mo4219a()) {
            Context context = caf.f5114a;
            dff dff = caf.f5115b;
            String packageName = ((Context) cev.m4629a(context)).getPackageName();
            String d = ccx.m4551d(context);
            PackageManager packageManager = context.getPackageManager();
            try {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                bog.m3837c("MetricStamper", "Failed to get PackageInfo for: %s", packageName);
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
        cbp cbp = (cbp) this.f5069b.mo2614b().mo4220b();
        throw null;
    }
}
