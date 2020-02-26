package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* renamed from: bh  reason: default package */
/* compiled from: PG */
public final class bh {
    public static final bp a;
    public static final cs b = new cs(16);

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new bl();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new bk();
        } else {
            int i = Build.VERSION.SDK_INT;
            a = new bj();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, av avVar, Resources resources, int i, int i2, bc bcVar) {
        Typeface typeface;
        if (avVar instanceof ay) {
            ay ayVar = (ay) avVar;
            typeface = cd.a(context, ayVar.a, bcVar, ayVar.c == 0, ayVar.b, i2);
        } else {
            typeface = a.a(context, (aw) avVar, resources, i2);
            if (typeface != null) {
                bcVar.b(typeface);
            } else {
                bc.a();
            }
        }
        if (typeface != null) {
            b.a(a(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
