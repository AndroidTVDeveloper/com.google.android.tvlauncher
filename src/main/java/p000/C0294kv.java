package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: kv */
/* compiled from: PG */
final class C0294kv {

    /* renamed from: a */
    public static final int[] f9822a = {-16842910};

    /* renamed from: b */
    public static final int[] f9823b = {16842908};

    /* renamed from: c */
    public static final int[] f9824c = {16842919};

    /* renamed from: d */
    public static final int[] f9825d = {16842912};

    /* renamed from: e */
    public static final int[] f9826e = new int[0];

    /* renamed from: f */
    private static final ThreadLocal f9827f = new ThreadLocal();

    /* renamed from: g */
    private static final int[] f9828g = new int[1];

    /* renamed from: c */
    public static int m7861c(Context context, int i) {
        ColorStateList b = m7860b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f9822a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f9827f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f9827f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = m7859a(context, i);
        return C0032bd.m2864b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    public static int m7859a(Context context, int i) {
        int[] iArr = f9828g;
        iArr[0] = i;
        C0298kz a = C0298kz.m7864a(context, (AttributeSet) null, iArr);
        try {
            return a.f9834b.getColor(0, 0);
        } finally {
            a.mo5513a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m7860b(Context context, int i) {
        int[] iArr = f9828g;
        iArr[0] = i;
        C0298kz a = C0298kz.m7864a(context, (AttributeSet) null, iArr);
        try {
            return a.mo5520d(0);
        } finally {
            a.mo5513a();
        }
    }
}
