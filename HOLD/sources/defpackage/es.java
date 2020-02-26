package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.WeakHashMap;

/* renamed from: es  reason: default package */
/* compiled from: PG */
public final class es {
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static ColorStateList a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return kq.a().a(context, i);
    }
}
