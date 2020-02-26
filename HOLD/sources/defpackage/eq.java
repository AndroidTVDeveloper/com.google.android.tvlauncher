package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: eq  reason: default package */
/* compiled from: PG */
public class eq extends ViewGroup.MarginLayoutParams {
    public int a = 8388627;

    public eq() {
        super(-2, -2);
    }

    public eq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, er.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public eq(eq eqVar) {
        super((ViewGroup.MarginLayoutParams) eqVar);
        this.a = eqVar.a;
    }

    public eq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
