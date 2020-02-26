package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;

/* renamed from: cgb  reason: default package */
/* compiled from: PG */
public final class cgb {
    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            return component.getPackageName();
        }
        return intent.getPackage();
    }

    public static void a() {
        Build.TYPE.equals("unknown");
    }
}
