package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: ln  reason: default package */
/* compiled from: PG */
public final class ln {
    public static Method a;

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                a.setAccessible(true);
            }
        } catch (NoSuchMethodException e) {
        }
    }

    public static boolean a(View view) {
        return dx.f(view) == 1;
    }
}
