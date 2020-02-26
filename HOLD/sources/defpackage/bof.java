package defpackage;

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

/* renamed from: bof  reason: default package */
/* compiled from: PG */
public final class bof {
    @Deprecated
    public static final int a = 19814000;
    public static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean c = new AtomicBoolean();

    @Deprecated
    public static boolean b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static String a(int i) {
        return bno.a(i);
    }

    @Deprecated
    public static int a(Context context, int i) {
        PackageInfo packageInfo;
        boolean z;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !c.get()) {
            synchronized (btw.a) {
                if (!btw.b) {
                    btw.b = true;
                    try {
                        Bundle bundle = buo.a(context).a(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            btw.c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i2 = btw.c;
            if (i2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (i2 != a) {
                int i3 = a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i3);
                sb.append(" but found ");
                sb.append(i2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        buj.b(context);
        if (buj.a == null) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = true;
            } else {
                z = false;
            }
            buj.a = Boolean.valueOf(z);
        }
        boolean z2 = !buj.a.booleanValue();
        buh.b(i >= 0);
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
            buh.a(context);
            synchronized (bog.class) {
                if (bog.a == null) {
                    boc.a(context);
                    bog.a = new bog(context);
                }
            }
            if (!bog.a(packageInfo2)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            } else if (z2 && (!bog.a(packageInfo) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (buk.a(packageInfo2.versionCode) < buk.a(i)) {
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
    public static boolean b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean a(Context context, String str) {
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
