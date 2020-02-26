package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AlertDialogLayout extends is {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i8 = this.f;
        int i9 = 8388615 & i8;
        int i10 = i8 & 112;
        if (i10 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i10 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable drawable = this.g;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                ir irVar = (ir) childAt.getLayoutParams();
                int i12 = irVar.h;
                if (i12 < 0) {
                    i12 = i9;
                }
                int a = el.a(i12, dx.f(this)) & 7;
                if (a == 1) {
                    i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + irVar.leftMargin) - irVar.rightMargin;
                } else if (a != 5) {
                    i6 = irVar.leftMargin + paddingLeft;
                } else {
                    i6 = (paddingRight - measuredWidth) - irVar.rightMargin;
                }
                if (a(i11)) {
                    i5 += intrinsicHeight;
                }
                int i13 = i5 + irVar.topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, i13 + measuredHeight2);
                i5 = i13 + measuredHeight2 + irVar.bottomMargin;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i7, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            i5 = a(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 == null) {
            i6 = 0;
        } else {
            view3.measure(i7, mode != 0 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode) : 0);
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i9 = size - paddingTop;
        if (view2 != null) {
            int i10 = paddingTop - i5;
            int min = Math.min(i9, i4);
            if (min > 0) {
                i9 -= min;
                i5 += min;
            }
            view2.measure(i7, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingTop = i10 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i7, View.MeasureSpec.makeMeasureSpec(i9 + i6, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11 + getPaddingLeft() + getPaddingRight(), i7, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    ir irVar = (ir) childAt3.getLayoutParams();
                    if (irVar.width == -1) {
                        int i14 = irVar.height;
                        irVar.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        irVar.height = i14;
                    }
                }
            }
        }
    }

    private static int a(View view) {
        int h = dx.h(view);
        if (h > 0) {
            return h;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
}
