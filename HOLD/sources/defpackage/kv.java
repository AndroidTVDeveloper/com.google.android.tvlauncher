package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: kv  reason: default package */
/* compiled from: PG */
final class kv {
    public static final int[] a = {-16842910};
    public static final int[] b = {16842908};
    public static final int[] c = {16842919};
    public static final int[] d = {16842912};
    public static final int[] e = new int[0];
    private static final ThreadLocal f = new ThreadLocal();
    private static final int[] g = new int[1];

    public static int c(Context context, int i) {
        ColorStateList b2 = b(context, i);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(a, b2.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int a2 = a(context, i);
        return bd.b(a2, Math.round(((float) Color.alpha(a2)) * f2));
    }

    public static int a(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        kz a2 = kz.a(context, (AttributeSet) null, iArr);
        try {
            return a2.b.getColor(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        kz a2 = kz.a(context, (AttributeSet) null, iArr);
        try {
            return a2.d(0);
        } finally {
            a2.a();
        }
    }
}
