package p000;

import android.net.Uri;

/* renamed from: dem */
/* compiled from: PG */
public final class dem {

    /* renamed from: a */
    public static final Uri f8381a = new Uri.Builder().scheme("content").authority("tvlauncher.config").path("configuration").build();

    /* renamed from: b */
    private static final Uri f8382b = new Uri.Builder().scheme("content").authority("tvlauncher.widget").path("widget").build();

    /* renamed from: c */
    private static final Uri f8383c = new Uri.Builder().scheme("content").authority("tvlauncher.apprecs").path("app_recommendations").build();

    /* renamed from: b */
    public static String m6257b(String str) {
        if (str == null) {
            return "tvlauncher.apprecs";
        }
        return String.format("%s.%s", str, "tvlauncher.apprecs");
    }

    /* renamed from: a */
    public static Uri m6256a(String str) {
        return str != null ? new Uri.Builder().scheme("content").authority(m6257b(str)).appendPath("app_recommendations").build() : f8383c;
    }

    /* renamed from: d */
    public static String m6259d(String str) {
        if (str == null) {
            return "tvlauncher.widget";
        }
        return String.format("%s.%s", str, "tvlauncher.widget");
    }

    /* renamed from: c */
    public static Uri m6258c(String str) {
        return str != null ? new Uri.Builder().scheme("content").authority(m6259d(str)).appendPath("widget").build() : f8382b;
    }
}
