package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
public class ScaleFrameLayout extends FrameLayout {
    private float a;
    private float b;
    private float c;

    public ScaleFrameLayout(Context context) {
        this(context, null);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
        this.b = 1.0f;
        this.c = 1.0f;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setScaleX(this.c);
        view.setScaleY(this.c);
    }

    /* access modifiers changed from: protected */
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean addViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        if (addViewInLayout) {
            view.setScaleX(this.c);
            view.setScaleY(this.c);
        }
        return addViewInLayout;
    }

    private static int a(int i, float f) {
        return f != 1.0f ? View.MeasureSpec.makeMeasureSpec((int) ((((float) View.MeasureSpec.getSize(i)) / f) + 0.5f), View.MeasureSpec.getMode(i)) : i;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ScaleFrameLayout scaleFrameLayout = this;
        int childCount = getChildCount();
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 1) {
            f = ((float) getWidth()) - getPivotX();
        } else {
            f = getPivotX();
        }
        if (scaleFrameLayout.a != 1.0f) {
            int paddingLeft = getPaddingLeft();
            float f2 = scaleFrameLayout.a;
            i6 = paddingLeft + ((int) ((f - (f / f2)) + 0.5f));
            i5 = ((int) ((((((float) (i3 - i)) - f) / f2) + f) + 0.5f)) - getPaddingRight();
        } else {
            i6 = getPaddingLeft();
            i5 = (i3 - i) - getPaddingRight();
        }
        float pivotY = getPivotY();
        if (scaleFrameLayout.b != 1.0f) {
            int paddingTop = getPaddingTop();
            float f3 = scaleFrameLayout.b;
            i8 = paddingTop + ((int) ((pivotY - (pivotY / f3)) + 0.5f));
            i7 = ((int) ((((((float) (i4 - i2)) - pivotY) / f3) + pivotY) + 0.5f)) - getPaddingBottom();
        } else {
            i8 = getPaddingTop();
            i7 = (i4 - i2) - getPaddingBottom();
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = scaleFrameLayout.getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 8388659;
                }
                int i13 = i12 & 112;
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                if (absoluteGravity == 1) {
                    i9 = (((((i5 - i6) - measuredWidth) / 2) + i6) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (absoluteGravity != 5) {
                    i9 = layoutParams.leftMargin + i6;
                } else {
                    i9 = (i5 - measuredWidth) - layoutParams.rightMargin;
                }
                if (i13 != 16) {
                    i10 = i13 != 48 ? i13 != 80 ? layoutParams.topMargin + i8 : (i7 - measuredHeight) - layoutParams.bottomMargin : layoutParams.topMargin + i8;
                } else {
                    i10 = (((((i7 - i8) - measuredHeight) / 2) + i8) + layoutParams.topMargin) - layoutParams.bottomMargin;
                }
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
                childAt.setPivotX(f - ((float) i9));
                childAt.setPivotY(pivotY - ((float) i10));
            }
            i11++;
            scaleFrameLayout = this;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float f = this.a;
        if (f == 1.0f && this.b == 1.0f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(a(i, f), a(i2, this.b));
        setMeasuredDimension((int) ((((float) getMeasuredWidth()) * this.a) + 0.5f), (int) ((((float) getMeasuredHeight()) * this.b) + 0.5f));
    }

    public final void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }
}
