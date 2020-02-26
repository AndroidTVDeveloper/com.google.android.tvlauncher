package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: dy  reason: default package */
/* compiled from: PG */
public final class dy {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    public static float a(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float b(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean a(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
