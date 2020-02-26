package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ThumbsBar extends LinearLayout {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        new SparseArray();
        this.b = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    private final int a() {
        return getChildCount() / 2;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int a2 = a();
        View childAt = getChildAt(a2);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i5 = a2 - 1; i5 >= 0; i5--) {
            int i6 = width - this.f;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            a2++;
            if (a2 < this.a) {
                int i7 = width2 + this.f;
                View childAt3 = getChildAt(a2);
                childAt3.layout(i7, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + paddingTop);
                width2 = i7 + childAt3.getMeasuredWidth();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d;
        int i4 = this.b + this.f;
        int i5 = (((measuredWidth - i3) + i4) - 1) / i4;
        if (i5 < 2) {
            i5 = 2;
        } else if ((i5 & 1) != 0) {
            i5++;
        }
        int i6 = i5 + 1;
        if (this.a != i6) {
            this.a = i6;
            while (getChildCount() > this.a) {
                removeView(getChildAt(getChildCount() - 1));
            }
            while (getChildCount() < this.a) {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(this.b, this.c));
            }
            int a2 = a();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (a2 == i7) {
                    layoutParams.width = this.d;
                    layoutParams.height = this.e;
                } else {
                    layoutParams.width = this.b;
                    layoutParams.height = this.c;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
    }
}
