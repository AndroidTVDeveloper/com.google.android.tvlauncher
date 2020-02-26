package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: ir  reason: default package */
/* compiled from: PG */
public class ir extends ViewGroup.MarginLayoutParams {
    public float g;
    public int h;

    public ir(int i) {
        super(i, -2);
        this.h = -1;
        this.g = 0.0f;
    }

    public ir(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, er.j);
        this.g = obtainStyledAttributes.getFloat(3, 0.0f);
        this.h = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public ir(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
