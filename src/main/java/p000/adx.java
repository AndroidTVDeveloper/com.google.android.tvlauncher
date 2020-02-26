package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: adx */
/* compiled from: PG */
public final class adx {

    /* renamed from: a */
    private static volatile boolean f163a = true;

    /* renamed from: a */
    public static Drawable m223a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f163a) {
                return C0129es.m7262b(theme != null ? new C0135ey(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError e) {
            f163a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0035bg.m3107a(context2, i);
            }
            throw e2;
        } catch (Resources.NotFoundException e3) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        int i2 = Build.VERSION.SDK_INT;
        return resources.getDrawable(i, theme);
    }
}
