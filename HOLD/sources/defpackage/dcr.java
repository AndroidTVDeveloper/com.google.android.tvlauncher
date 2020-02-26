package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* renamed from: dcr  reason: default package */
/* compiled from: PG */
public final class dcr {
    public static void a(StringBuilder sb, String str, List list, cms cms) {
        sb.append("\"");
        sb.append(str);
        sb.append("\"=[\n");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) cms.a(list.get(i)));
        }
        if (!list.isEmpty()) {
            sb.substring(0, sb.length() - 2);
        }
        sb.append("],\n");
        sb.toString();
    }

    public static void a(StringBuilder sb, String str, Object obj) {
        sb.append("\t\"");
        sb.append(str);
        sb.append("\"=");
        sb.append(obj);
        sb.append(",\n");
    }

    public static String a(cmc cmc) {
        cmd cmd;
        if (cmc == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\"AdConfig.AdAsset\"={\n");
        a(sb, "trackingId", cmc.e);
        a(sb, "typeCase", cmb.a(cmc.b));
        a(sb, "expiration", Long.valueOf(cmc.d));
        if (cmc.b == 1) {
            cmh cmh = (cmh) cmc.c;
            sb.append("\"DirectAdConfig\"={\n");
            a(sb, "packageName", cmh.b);
            a(sb, "dataUrl", cmh.c);
            sb.append("},\n");
        }
        if (cmc.b == 2) {
            cmj cmj = (cmj) cmc.c;
            sb.append("\"DoubleClickAdConfig\"={\n");
            a(sb, "adUnitId", cmj.d);
            a(sb, "formatCase", cmi.a(cmj.b));
            if (cmj.b == 2) {
                cmg cmg = (cmg) cmj.c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\"CustomCreative\"={\n");
                if (cmg.b == 5) {
                    cmd = (cmd) cmg.c;
                } else {
                    cmd = cmd.e;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\"AppInstallCreativeInfo\"={\n");
                a(sb3, "deeplinkUrl", cmd.d);
                a(sb3, "marketUrl", cmd.c);
                a(sb3, "packageName", cmd.b);
                sb3.append("}");
                a(sb2, "appInstallCreativeInfo", sb3.toString());
                a(sb2, "clickTrackingUrl", cmg.g);
                a(sb2, "displayBannerImpressionTrackingUrl", cmg.f);
                a(sb2, "formatInfoCase", cmf.a(cmg.b));
                a(sb2, "imageUri", cmg.d);
                a(sb2, "videoUri", cmg.e);
                sb2.append("}");
                a(sb, "customCreative", sb2.toString());
            }
            if (cmj.b == 3) {
                cmy cmy = (cmy) cmj.c;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\"VastXml\"={\n");
                a(sb4, "id", cmy.s);
                a(sb4, "adId", cmy.t);
                a(sb4, "clickTracking", cmy.i, cmk.a);
                a(sb4, "companion", cmy.f, cml.a);
                a(sb4, "customParameters", cmy.g);
                a(sb4, "customSkipEventExists", Boolean.valueOf(cmy.v));
                a(sb4, "destinationUrl", cmy.b);
                a(sb4, "duration", Integer.valueOf(cmy.c));
                a(sb4, "eventTracking", cmy.h, cmm.a);
                a(sb4, "fallbackIndex", Integer.valueOf(cmy.n));
                a(sb4, "impression", cmy.r, cmn.a);
                a(sb4, "media", cmy.e, cmo.a);
                a(sb4, "nonLinearAsset", cmy.k, cmp.a);
                a(sb4, "nonLinearEventTracking", cmy.l, cmq.a);
                a(sb4, "redirectUrl", cmy.m);
                a(sb4, "sequence", Integer.valueOf(cmy.w));
                a(sb4, "streamingMedia", Boolean.valueOf(cmy.o));
                a(sb4, "survey", cmy.d);
                a(sb4, "vastSchemaValidationErrors", cmy.q);
                a(sb4, "vastVersion", Integer.valueOf(cmy.u));
                cmx cmx = cmy.x;
                if (cmx == null) {
                    cmx = cmx.d;
                }
                a(sb4, "videoViewableImpression", a(cmx));
                sb4.append("}");
                a(sb, "vast", sb4.toString());
            }
            sb.append("}\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public static String a(cmx cmx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastTracking\"={\n");
        a(sb, "eventName", cmx.b);
        a(sb, "eventUrl", cmx.c);
        sb.append("},\n");
        return sb.toString();
    }

    public static void d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf((Object) null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("No package was specified in the original intent: ");
            sb.append(valueOf);
            Log.e("LeanbackLauncherIntentLauncher", sb.toString());
            return;
        }
        Intent leanbackLaunchIntentForPackage = context.getPackageManager().getLeanbackLaunchIntentForPackage(str);
        if (leanbackLaunchIntentForPackage == null) {
            String valueOf2 = String.valueOf(str);
            Log.e("LeanbackLauncherIntentLauncher", valueOf2.length() == 0 ? new String("Could not find a Leanback intent for package: ") : "Could not find a Leanback intent for package: ".concat(valueOf2));
            return;
        }
        leanbackLaunchIntentForPackage.addFlags(268435456);
        try {
            context.startActivity(leanbackLaunchIntentForPackage);
        } catch (ActivityNotFoundException e) {
        }
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("PackageUtils", "Could not retrieve application version code", e);
            return 0;
        }
    }

    public static String a(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo.versionName != null) {
                return packageInfo.versionName;
            }
            return "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("PackageUtils", "Could not retrieve application version name", e);
            return "unknown";
        }
    }

    public static boolean c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
