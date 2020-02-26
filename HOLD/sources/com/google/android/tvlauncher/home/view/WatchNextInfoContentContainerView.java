package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class WatchNextInfoContentContainerView extends ViewGroup {
    private View a;
    private View b;
    private int c;
    private int d;

    public WatchNextInfoContentContainerView(Context context) {
        super(context);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public WatchNextInfoContentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WatchNextInfoContentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WatchNextInfoContentContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final CharSequence getAccessibilityClassName() {
        return WatchNextInfoContentContainerView.class.getName();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.watch_next_info_icon_title_container);
        this.b = findViewById(R.id.watch_next_info_message);
        Resources resources = getContext().getResources();
        this.c = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_message_width);
        this.d = resources.getDimensionPixelSize(R.dimen.program_default_height);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = this.a.getMeasuredHeight();
        View view = this.a;
        view.layout(0, 0, view.getMeasuredWidth(), measuredHeight);
        int measuredWidth = getMeasuredWidth();
        int i5 = measuredHeight + ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin;
        int measuredWidth2 = this.b.getMeasuredWidth();
        int measuredHeight2 = this.b.getMeasuredHeight();
        if (getLayoutDirection() == 1) {
            this.b.layout(measuredWidth - measuredWidth2, i5, measuredWidth, measuredHeight2 + i5);
        } else {
            this.b.layout(0, i5, measuredWidth2, measuredHeight2 + i5);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, i2);
        int measuredHeight = this.a.getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        int i3 = ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin;
        this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((this.d - measuredHeight) - i3, Integer.MIN_VALUE));
        int measuredHeight2 = this.b.getMeasuredHeight();
        float scaleX = this.b.getScaleX();
        int combineMeasuredStates = combineMeasuredStates(combineMeasuredStates(0, this.a.getMeasuredState()), this.b.getMeasuredState());
        setMeasuredDimension(resolveSizeAndState(this.a.getMeasuredWidth(), i, combineMeasuredStates), resolveSizeAndState(measuredHeight + i3 + ((int) (((float) measuredHeight2) * scaleX)), i2, combineMeasuredStates << 16));
    }
}
