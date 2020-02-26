package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: chv  reason: default package */
/* compiled from: PG */
public final class chv extends BroadcastReceiver {
    private final chu a;

    public chv(chu chu) {
        this.a = chu;
    }

    public static IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                this.a.a(str);
            } else if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                this.a.b(str);
            } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
                this.a.c(str);
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                if (!intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    this.a.d(str);
                }
            } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
                this.a.e(str);
            }
        }
    }
}
