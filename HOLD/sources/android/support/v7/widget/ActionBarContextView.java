package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ActionBarContextView extends gd {
    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kz a = kz.a(context, attributeSet, er.d, i);
        dx.a(this, a.a(0));
        a.e(5, 0);
        a.e(4, 0);
        this.a = a.f(3);
        a.e(2, R.layout.abc_action_mode_close_item_material);
        a.a();
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(null);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = ln.a(this);
        if (a) {
            getPaddingRight();
        } else {
            getPaddingLeft();
        }
        getPaddingTop();
        getPaddingTop();
        getPaddingBottom();
        if (a) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.a;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            getPaddingLeft();
            getPaddingRight();
            View.MeasureSpec.makeMeasureSpec(i3 - paddingTop, Integer.MIN_VALUE);
            if (this.a <= 0) {
                int childCount = getChildCount();
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    int measuredHeight = getChildAt(i5).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i4);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public final void a(int i) {
        this.a = i;
    }
}
