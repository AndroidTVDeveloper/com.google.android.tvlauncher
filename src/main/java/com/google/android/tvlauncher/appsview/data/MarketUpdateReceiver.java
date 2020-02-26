package com.google.android.tvlauncher.appsview.data;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: PG */
public class MarketUpdateReceiver extends BroadcastReceiver {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(chn, boolean):void
     arg types: [chn, int]
     candidates:
      cja.a(chn, dby):chn
      cja.a(java.lang.String, java.util.ArrayList):void
      cja.a(android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(chn, boolean):void */
    public final void onReceive(Context context, Intent intent) {
        chn chn;
        chn chn2;
        boolean z;
        String str;
        int i;
        Intent intent2 = intent;
        Uri data = intent.getData();
        if (data != null) {
            cja a = dbq.m6093a(context);
            String schemeSpecificPart = data.getSchemeSpecificPart();
            if (!TextUtils.isEmpty(schemeSpecificPart)) {
                String action = intent.getAction();
                Iterator it = a.f5688j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        chn = null;
                        break;
                    }
                    chn = (chn) it.next();
                    if (chn.f5563c.equalsIgnoreCase(schemeSpecificPart)) {
                        break;
                    }
                }
                boolean z2 = false;
                if (chn != null || intent2.getBooleanExtra("user_initiated", false)) {
                    PackageManager packageManager = context.getPackageManager();
                    try {
                        packageManager.getPackageInfo(schemeSpecificPart, 1);
                        if (packageManager.getLeanbackLaunchIntentForPackage(schemeSpecificPart) == null) {
                            if (chn != null && "com.android.launcher.action.ACTION_PACKAGE_DEQUEUED".equals(action) && !intent2.getBooleanExtra("com.android.launcher.action.INSTALL_COMPLETED", false)) {
                                chn.f5573m = 1;
                                chn.f5571k = -1;
                                a.mo2885a(chn, false);
                                return;
                            }
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                    if (chn != null) {
                        chn2 = chn;
                        z = false;
                    } else if (!"com.android.launcher.action.ACTION_PACKAGE_DEQUEUED".equals(action)) {
                        String stringExtra = intent2.getStringExtra("app_name");
                        String stringExtra2 = intent2.getStringExtra("app_icon");
                        String stringExtra3 = intent2.getStringExtra("app_banner");
                        boolean booleanExtra = intent2.getBooleanExtra("app_is_game", false);
                        chn2 = new chn();
                        chn2.f5562b = stringExtra;
                        chn2.f5563c = schemeSpecificPart;
                        chn2.f5567g = booleanExtra;
                        chn2.f5561a = new Intent("android.intent.action.VIEW").setData(new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", schemeSpecificPart).build()).putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority(context.getPackageName()).build());
                        chn2.f5564d = stringExtra2;
                        chn2.f5565e = stringExtra3;
                        chn2.mo2814c();
                        z = true;
                    } else {
                        return;
                    }
                    if ("com.android.launcher.action.ACTION_PACKAGE_ENQUEUED".equals(action)) {
                        chn2.f5571k = -1;
                        if (intent2.hasExtra("reason")) {
                            str = intent2.getStringExtra("reason");
                        } else {
                            str = "install";
                        }
                        if ("install".equals(str)) {
                            i = 2;
                        } else if (!"update".equals(str)) {
                            if ("restore".equals(str)) {
                                chn2.f5573m = 4;
                            } else {
                                chn2.f5573m = 1;
                            }
                            intent2.getBooleanExtra("user_initiated", false);
                        } else {
                            i = 3;
                        }
                        chn2.f5573m = i;
                        intent2.getBooleanExtra("user_initiated", false);
                    } else if ("com.android.launcher.action.ACTION_PACKAGE_DOWNLOADING".equals(action)) {
                        chn2.f5571k = intent2.getIntExtra("progress", 0);
                        chn2.f5573m = 5;
                    } else if ("com.android.launcher.action.ACTION_PACKAGE_INSTALLING".equals(action)) {
                        chn2.f5571k = -1;
                        chn2.f5573m = 6;
                    } else if ("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED".equals(action)) {
                        chn2.f5571k = -1;
                        chn2.f5573m = 1;
                        z2 = intent2.getBooleanExtra("com.android.launcher.action.INSTALL_COMPLETED", false);
                    } else {
                        chn2.f5571k = -1;
                        chn2.f5573m = 1;
                    }
                    if ("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED".equals(action)) {
                        a.mo2885a(chn2, z2);
                    } else if (z) {
                        a.mo2896d(chn2);
                        ciq ciq = a.f5692n;
                        ciq.f5664a.edit().putBoolean(chn2.f5563c, chn2.f5567g).apply();
                    } else {
                        a.mo2896d(chn2);
                    }
                }
            }
        }
    }
}
