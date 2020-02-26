package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: dbj  reason: default package */
/* compiled from: PG */
public final class dbj {
    public final Context a;
    private Intent b;
    private View c;

    public dbj(Context context) {
        this.a = context;
    }

    public final boolean a(String str, String str2, boolean z, View view) {
        Intent b2 = b(str2, z);
        this.b = b2;
        if (str != null) {
            b2.setPackage(str);
        }
        this.c = view;
        boolean z2 = true;
        if (!a()) {
            Context context = this.a;
            Intent intent = this.b;
            if (intent != null) {
                intent.setPackage("com.google.android.tvrecommendations");
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    String valueOf = String.valueOf(intent);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("Activity not found for intent: ");
                    sb.append(valueOf);
                    Log.e("TvRecommendationsIntentLauncher", sb.toString());
                    z2 = false;
                } else {
                    context.sendBroadcast(intent);
                }
            } else {
                z2 = false;
            }
        }
        if (!z2) {
            Toast.makeText(this.a, (int) R.string.failed_launch, 0).show();
        }
        return z2;
    }

    private final boolean a() {
        if (this.b != null) {
            List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(this.b, 0);
            this.b.addFlags(268435456);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                try {
                    View view = this.c;
                    if (view == null) {
                        this.a.startActivity(this.b);
                        return true;
                    }
                    dbq.a(this.b, view);
                    return true;
                } catch (ActivityNotFoundException | SecurityException e) {
                    String valueOf = String.valueOf(this.b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    sb.append("Failed to launch ");
                    sb.append(valueOf);
                    Log.e("IntentLaunchDispatcher", sb.toString(), e);
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean a(String str, boolean z) {
        this.b = b(str, z);
        this.c = null;
        return a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.b(java.lang.String, boolean):android.content.Intent
     arg types: [java.lang.String, int]
     candidates:
      dbj.b(java.lang.String, java.lang.String):boolean
      dbj.b(java.lang.String, boolean):android.content.Intent */
    public final boolean b(String str, String str2) {
        Intent b2 = b(str2, true);
        this.b = b2;
        if (str != null) {
            b2.setPackage(str);
        }
        this.c = null;
        return a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      dbj.a(java.lang.String, java.lang.String):java.lang.String
      dbj.a(java.lang.String, boolean):boolean */
    public final String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            try {
                str = Intent.parseUri(str2, 1).getPackage();
            } catch (URISyntaxException e) {
                String valueOf = String.valueOf(str2);
                Log.e("IntentLaunchDispatcher", valueOf.length() == 0 ? new String("Bad URI syntax: ") : "Bad URI syntax: ".concat(valueOf));
                return null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                Log.e("IntentLaunchDispatcher", "Failed to launch. Both packageName and dataUrl are empty.");
                return null;
            } else if (a(str2, true)) {
                return str2;
            } else {
                return null;
            }
        } else if (!dcr.c(this.a, str)) {
            dcx.a(this.a, str);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            dcr.d(this.a, str);
            return null;
        } else if (b(str, str2)) {
            return str2;
        } else {
            dcr.d(this.a, str);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    private static final Intent b(String str, boolean z) {
        if (str == null) {
            Log.e("IntentLaunchDispatcher", "No URI provided");
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (z) {
                parseUri.putExtra("android.intent.extra.START_PLAYBACK", true);
            }
            return parseUri;
        } catch (URISyntaxException e) {
            Log.e("IntentLaunchDispatcher", str.length() == 0 ? new String("Bad URI syntax: ") : "Bad URI syntax: ".concat(str));
            return null;
        }
    }
}
