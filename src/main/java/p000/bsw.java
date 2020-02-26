package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.tvlauncher.R;

/* renamed from: bsw */
/* compiled from: PG */
public final class bsw {

    /* renamed from: a */
    private static final C0087dd f4776a = new C0087dd();

    /* renamed from: b */
    private static String m4144b(Context context) {
        String packageName = context.getPackageName();
        try {
            bun a = buo.m4260a(context);
            return a.f4854a.getPackageManager().getApplicationLabel(a.f4854a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    public static String m4140a(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    /* renamed from: e */
    public static String m4148e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }

    /* renamed from: c */
    public static String m4146c(Context context, int i) {
        Resources resources = context.getResources();
        String b = m4144b(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, b);
        } else if (i == 2) {
            buj.m4249b(context);
            return resources.getString(R.string.common_google_play_services_update_text, b);
        } else if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, b);
        } else if (i == 5) {
            return m4143a(context, "common_google_play_services_invalid_account_text", b);
        } else {
            if (i == 7) {
                return m4143a(context, "common_google_play_services_network_error_text", b);
            }
            if (i == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, b);
            } else if (i == 20) {
                return m4143a(context, "common_google_play_services_restricted_profile_text", b);
            } else {
                switch (i) {
                    case 16:
                        return m4143a(context, "common_google_play_services_api_unavailable_text", b);
                    case 17:
                        return m4143a(context, "common_google_play_services_sign_in_failed_text", b);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, b);
                    default:
                        return resources.getString(R.string.common_google_play_services_unknown_issue, b);
                }
            }
        }
    }

    /* renamed from: d */
    public static String m4147d(Context context, int i) {
        if (i == 6 || i == 19) {
            return m4143a(context, "common_google_play_services_resolution_required_text", m4144b(context));
        }
        return m4146c(context, i);
    }

    /* renamed from: b */
    public static String m4145b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m4142a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m4141a(context, i);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: a */
    public static String m4141a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m4142a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m4142a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m4142a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m4142a(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: a */
    private static String m4143a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m4142a(context, str);
        if (a == null) {
            a = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, str2);
    }

    /* renamed from: a */
    private static String m4142a(Context context, String str) {
        Resources resources;
        synchronized (f4776a) {
            String str2 = (String) f4776a.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = bof.f4503a;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier != 0) {
                String string = resources.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    f4776a.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", str.length() == 0 ? new String("Got empty resource: ") : "Got empty resource: ".concat(str));
                return null;
            }
            Log.w("GoogleApiAvailability", str.length() == 0 ? new String("Missing resource: ") : "Missing resource: ".concat(str));
            return null;
        }
    }
}
