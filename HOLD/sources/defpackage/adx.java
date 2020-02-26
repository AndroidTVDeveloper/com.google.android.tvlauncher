package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: adx  reason: default package */
/* compiled from: PG */
public final class adx {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return es.b(theme != null ? new ey(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError e) {
            a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return bg.a(context2, i);
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
