package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;

/* renamed from: cgb */
/* compiled from: PG */
public final class cgb {
    /* renamed from: a */
    public static String m4698a(Intent intent) {
        if (intent == null) {
            return null;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            return component.getPackageName();
        }
        return intent.getPackage();
    }

    /* renamed from: a */
    public static void m4699a() {
        Build.TYPE.equals("unknown");
    }
}
