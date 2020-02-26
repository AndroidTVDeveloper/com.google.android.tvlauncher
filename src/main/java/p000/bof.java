package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bof */
/* compiled from: PG */
public final class bof {
    @Deprecated

    /* renamed from: a */
    public static final int f4503a = 19814000;

    /* renamed from: b */
    public static final AtomicBoolean f4504b = new AtomicBoolean();

    /* renamed from: c */
    private static final AtomicBoolean f4505c = new AtomicBoolean();

    @Deprecated
    /* renamed from: b */
    public static boolean m3825b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    /* renamed from: a */
    public static String m3823a(int i) {
        return bno.m3793a(i);
    }

    @Deprecated
    /* renamed from: a */
    public static int m3822a(Context context, int i) {
        PackageInfo packageInfo;
        boolean z;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f4505c.get()) {
            synchronized (btw.f4829a) {
                if (!btw.f4830b) {
                    btw.f4830b = true;
                    try {
                        Bundle bundle = buo.m4260a(context).mo2453a(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            btw.f4831c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i2 = btw.f4831c;
            if (i2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (i2 != f4503a) {
                int i3 = f4503a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i3);
                sb.append(" but found ");
                sb.append(i2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        buj.m4249b(context);
        if (buj.f4847a == null) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = true;
            } else {
                z = false;
            }
            buj.f4847a = Boolean.valueOf(z);
        }
        boolean z2 = !buj.f4847a.booleanValue();
        buh.m4212b(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        if (z2) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            buh.m4199a(context);
            synchronized (bog.class) {
                if (bog.f4506a == null) {
                    boc.m3818a(context);
                    bog.f4506a = new bog(context);
                }
            }
            if (!bog.m3833a(packageInfo2)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            } else if (z2 && (!bog.m3833a(packageInfo) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (buk.m4253a(packageInfo2.versionCode) < buk.m4253a(i)) {
                int i4 = packageInfo2.versionCode;
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("Google Play services out of date.  Requires ");
                sb2.append(i);
                sb2.append(" but found ");
                sb2.append(i4);
                Log.w("GooglePlayServicesUtil", sb2.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e3) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e3);
                        return 1;
                    }
                }
                return applicationInfo.enabled ? 0 : 3;
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m3826b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m3824a(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3824a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        int i = Build.VERSION.SDK_INT;
        try {
            for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
                if (equals) {
                    return applicationInfo.enabled;
                }
                if (applicationInfo.enabled) {
                    int i2 = Build.VERSION.SDK_INT;
                    Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                    if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }
}
