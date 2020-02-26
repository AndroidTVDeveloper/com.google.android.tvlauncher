package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
public class ContentFrameLayout extends FrameLayout {
    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i2);
        super.onMeasure(i, i2);
        View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    }
}
