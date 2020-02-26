package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* renamed from: bh */
/* compiled from: PG */
public final class C0036bh {

    /* renamed from: a */
    public static final C0044bp f3914a;

    /* renamed from: b */
    public static final C0075cs f3915b = new C0075cs(16);

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3914a = new C0040bl();
        } else if (Build.VERSION.SDK_INT >= 28) {
            f3914a = new C0039bk();
        } else {
            int i = Build.VERSION.SDK_INT;
            f3914a = new C0038bj();
        }
    }

    /* renamed from: a */
    public static Typeface m3214a(Context context, Typeface typeface, int i) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: a */
    public static Typeface m3215a(Context context, C0023av avVar, Resources resources, int i, int i2, C0031bc bcVar) {
        Typeface typeface;
        if (avVar instanceof C0026ay) {
            C0026ay ayVar = (C0026ay) avVar;
            typeface = C0059cd.m4555a(context, ayVar.f2733a, bcVar, ayVar.f2735c == 0, ayVar.f2734b, i2);
        } else {
            typeface = f3914a.mo1962a(context, (C0024aw) avVar, resources, i2);
            if (typeface != null) {
                bcVar.mo1752b(typeface);
            } else {
                C0031bc.m2781a();
            }
        }
        if (typeface != null) {
            f3915b.mo3693a(m3216a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m3213a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f3914a.mo1992a(context, resources, i, str, i2);
        if (a != null) {
            f3915b.mo3693a(m3216a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static String m3216a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
