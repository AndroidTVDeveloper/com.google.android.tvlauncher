package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.WeakHashMap;

/* renamed from: es */
/* compiled from: PG */
public final class C0129es {
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    /* renamed from: a */
    public static ColorStateList m7261a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m7262b(Context context, int i) {
        return C0289kq.m7842a().mo5457a(context, i);
    }
}
