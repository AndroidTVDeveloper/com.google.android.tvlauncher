package p000;

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

/* renamed from: dbj */
/* compiled from: PG */
public final class dbj {

    /* renamed from: a */
    public final Context f8150a;

    /* renamed from: b */
    private Intent f8151b;

    /* renamed from: c */
    private View f8152c;

    public dbj(Context context) {
        this.f8150a = context;
    }

    /* renamed from: a */
    public final boolean mo4068a(String str, String str2, boolean z, View view) {
        Intent b = m6083b(str2, z);
        this.f8151b = b;
        if (str != null) {
            b.setPackage(str);
        }
        this.f8152c = view;
        boolean z2 = true;
        if (!m6082a()) {
            Context context = this.f8150a;
            Intent intent = this.f8151b;
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
            Toast.makeText(this.f8150a, (int) R.string.failed_launch, 0).show();
        }
        return z2;
    }

    /* renamed from: a */
    private final boolean m6082a() {
        if (this.f8151b != null) {
            List<ResolveInfo> queryIntentActivities = this.f8150a.getPackageManager().queryIntentActivities(this.f8151b, 0);
            this.f8151b.addFlags(268435456);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                try {
                    View view = this.f8152c;
                    if (view == null) {
                        this.f8150a.startActivity(this.f8151b);
                        return true;
                    }
                    dbq.m6096a(this.f8151b, view);
                    return true;
                } catch (ActivityNotFoundException | SecurityException e) {
                    String valueOf = String.valueOf(this.f8151b);
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

    /* renamed from: a */
    public final boolean mo4069a(String str, boolean z) {
        this.f8151b = m6083b(str, z);
        this.f8152c = null;
        return m6082a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.b(java.lang.String, boolean):android.content.Intent
     arg types: [java.lang.String, int]
     candidates:
      dbj.b(java.lang.String, java.lang.String):boolean
      dbj.b(java.lang.String, boolean):android.content.Intent */
    /* renamed from: b */
    public final boolean mo4070b(String str, String str2) {
        Intent b = m6083b(str2, true);
        this.f8151b = b;
        if (str != null) {
            b.setPackage(str);
        }
        this.f8152c = null;
        return m6082a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      dbj.a(java.lang.String, java.lang.String):java.lang.String
      dbj.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final String mo4067a(String str, String str2) {
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
            } else if (mo4069a(str2, true)) {
                return str2;
            } else {
                return null;
            }
        } else if (!dcr.m6172c(this.f8150a, str)) {
            dcx.m6182a(this.f8150a, str);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            dcr.m6173d(this.f8150a, str);
            return null;
        } else if (mo4070b(str, str2)) {
            return str2;
        } else {
            dcr.m6173d(this.f8150a, str);
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
    /* renamed from: b */
    private static final Intent m6083b(String str, boolean z) {
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
