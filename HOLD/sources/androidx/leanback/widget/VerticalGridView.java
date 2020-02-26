package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* compiled from: PG */
public class VerticalGridView extends nf {
    public VerticalGridView(Context context) {
        this(context, null);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L.f(1);
        a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.j);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, ly.j, attributeSet, obtainStyledAttributes, 0, 0);
        }
        if (obtainStyledAttributes.peekValue(0) != null) {
            m(obtainStyledAttributes.getLayoutDimension(0, 0));
        }
        l(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    public final void m(int i) {
        this.L.h(i);
        requestLayout();
    }

    public final void l(int i) {
        this.L.g(i);
        requestLayout();
    }
}
