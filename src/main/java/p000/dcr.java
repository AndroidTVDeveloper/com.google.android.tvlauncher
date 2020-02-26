package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* renamed from: dcr */
/* compiled from: PG */
public final class dcr {
    /* renamed from: a */
    public static void m6170a(StringBuilder sb, String str, List list, cms cms) {
        sb.append("\"");
        sb.append(str);
        sb.append("\"=[\n");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) cms.mo3115a(list.get(i)));
        }
        if (!list.isEmpty()) {
            sb.substring(0, sb.length() - 2);
        }
        sb.append("],\n");
        sb.toString();
    }

    /* renamed from: a */
    public static void m6169a(StringBuilder sb, String str, Object obj) {
        sb.append("\t\"");
        sb.append(str);
        sb.append("\"=");
        sb.append(obj);
        sb.append(",\n");
    }

    /* renamed from: a */
    public static String m6167a(cmc cmc) {
        cmd cmd;
        if (cmc == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\"AdConfig.AdAsset\"={\n");
        m6169a(sb, "trackingId", cmc.f5971e);
        m6169a(sb, "typeCase", cmb.m5106a(cmc.f5968b));
        m6169a(sb, "expiration", Long.valueOf(cmc.f5970d));
        if (cmc.f5968b == 1) {
            cmh cmh = (cmh) cmc.f5969c;
            sb.append("\"DirectAdConfig\"={\n");
            m6169a(sb, "packageName", cmh.f5993b);
            m6169a(sb, "dataUrl", cmh.f5994c);
            sb.append("},\n");
        }
        if (cmc.f5968b == 2) {
            cmj cmj = (cmj) cmc.f5969c;
            sb.append("\"DoubleClickAdConfig\"={\n");
            m6169a(sb, "adUnitId", cmj.f6003d);
            m6169a(sb, "formatCase", cmi.m5113a(cmj.f6001b));
            if (cmj.f6001b == 2) {
                cmg cmg = (cmg) cmj.f6002c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\"CustomCreative\"={\n");
                if (cmg.f5985b == 5) {
                    cmd = (cmd) cmg.f5986c;
                } else {
                    cmd = cmd.f5973e;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\"AppInstallCreativeInfo\"={\n");
                m6169a(sb3, "deeplinkUrl", cmd.f5977d);
                m6169a(sb3, "marketUrl", cmd.f5976c);
                m6169a(sb3, "packageName", cmd.f5975b);
                sb3.append("}");
                m6169a(sb2, "appInstallCreativeInfo", sb3.toString());
                m6169a(sb2, "clickTrackingUrl", cmg.f5990g);
                m6169a(sb2, "displayBannerImpressionTrackingUrl", cmg.f5989f);
                m6169a(sb2, "formatInfoCase", cmf.m5110a(cmg.f5985b));
                m6169a(sb2, "imageUri", cmg.f5987d);
                m6169a(sb2, "videoUri", cmg.f5988e);
                sb2.append("}");
                m6169a(sb, "customCreative", sb2.toString());
            }
            if (cmj.f6001b == 3) {
                cmy cmy = (cmy) cmj.f6002c;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\"VastXml\"={\n");
                m6169a(sb4, "id", cmy.f6084s);
                m6169a(sb4, "adId", cmy.f6085t);
                m6170a(sb4, "clickTracking", cmy.f6074i, cmk.f6005a);
                m6170a(sb4, "companion", cmy.f6071f, cml.f6006a);
                m6169a(sb4, "customParameters", cmy.f6072g);
                m6169a(sb4, "customSkipEventExists", Boolean.valueOf(cmy.f6087v));
                m6169a(sb4, "destinationUrl", cmy.f6067b);
                m6169a(sb4, "duration", Integer.valueOf(cmy.f6068c));
                m6170a(sb4, "eventTracking", cmy.f6073h, cmm.f6007a);
                m6169a(sb4, "fallbackIndex", Integer.valueOf(cmy.f6079n));
                m6170a(sb4, "impression", cmy.f6083r, cmn.f6008a);
                m6170a(sb4, "media", cmy.f6070e, cmo.f6009a);
                m6170a(sb4, "nonLinearAsset", cmy.f6076k, cmp.f6010a);
                m6170a(sb4, "nonLinearEventTracking", cmy.f6077l, cmq.f6011a);
                m6169a(sb4, "redirectUrl", cmy.f6078m);
                m6169a(sb4, "sequence", Integer.valueOf(cmy.f6088w));
                m6169a(sb4, "streamingMedia", Boolean.valueOf(cmy.f6080o));
                m6169a(sb4, "survey", cmy.f6069d);
                m6169a(sb4, "vastSchemaValidationErrors", cmy.f6082q);
                m6169a(sb4, "vastVersion", Integer.valueOf(cmy.f6086u));
                cmx cmx = cmy.f6089x;
                if (cmx == null) {
                    cmx = cmx.f6059d;
                }
                m6169a(sb4, "videoViewableImpression", m6168a(cmx));
                sb4.append("}");
                m6169a(sb, "vast", sb4.toString());
            }
            sb.append("}\n");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m6168a(cmx cmx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastTracking\"={\n");
        m6169a(sb, "eventName", cmx.f6061b);
        m6169a(sb, "eventUrl", cmx.f6062c);
        sb.append("},\n");
        return sb.toString();
    }

    /* renamed from: d */
    public static void m6173d(Context context, String str) {
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

    /* renamed from: b */
    public static int m6171b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("PackageUtils", "Could not retrieve application version code", e);
            return 0;
        }
    }

    /* renamed from: a */
    public static String m6166a(Context context, String str) {
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

    /* renamed from: c */
    public static boolean m6172c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
