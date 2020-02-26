package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: ln */
/* compiled from: PG */
public final class C0313ln {

    /* renamed from: a */
    public static Method f9862a;

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f9862a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f9862a.setAccessible(true);
            }
        } catch (NoSuchMethodException e) {
        }
    }

    /* renamed from: a */
    public static boolean m7906a(View view) {
        return C0107dx.m7209f(view) == 1;
    }
}
