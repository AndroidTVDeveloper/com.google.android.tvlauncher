package defpackage;

import android.net.Uri;

/* renamed from: dem  reason: default package */
/* compiled from: PG */
public final class dem {
    public static final Uri a = new Uri.Builder().scheme("content").authority("tvlauncher.config").path("configuration").build();
    private static final Uri b = new Uri.Builder().scheme("content").authority("tvlauncher.widget").path("widget").build();
    private static final Uri c = new Uri.Builder().scheme("content").authority("tvlauncher.apprecs").path("app_recommendations").build();

    public static String b(String str) {
        if (str == null) {
            return "tvlauncher.apprecs";
        }
        return String.format("%s.%s", str, "tvlauncher.apprecs");
    }

    public static Uri a(String str) {
        return str != null ? new Uri.Builder().scheme("content").authority(b(str)).appendPath("app_recommendations").build() : c;
    }

    public static String d(String str) {
        if (str == null) {
            return "tvlauncher.widget";
        }
        return String.format("%s.%s", str, "tvlauncher.widget");
    }

    public static Uri c(String str) {
        return str != null ? new Uri.Builder().scheme("content").authority(d(str)).appendPath("widget").build() : b;
    }
}
