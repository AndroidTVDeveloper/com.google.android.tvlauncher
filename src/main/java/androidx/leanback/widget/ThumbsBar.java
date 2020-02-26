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

    /* renamed from: a */
    private int f1294a;

    /* renamed from: b */
    private int f1295b;

    /* renamed from: c */
    private int f1296c;

    /* renamed from: d */
    private int f1297d;

    /* renamed from: e */
    private int f1298e;

    /* renamed from: f */
    private int f1299f;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1294a = -1;
        new SparseArray();
        this.f1295b = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.f1296c = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.f1298e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.f1297d = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.f1299f = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    /* renamed from: a */
    private final int m1437a() {
        return getChildCount() / 2;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int a = m1437a();
        View childAt = getChildAt(a);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i5 = a - 1; i5 >= 0; i5--) {
            int i6 = width - this.f1299f;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            a++;
            if (a < this.f1294a) {
                int i7 = width2 + this.f1299f;
                View childAt3 = getChildAt(a);
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
        int i3 = this.f1297d;
        int i4 = this.f1295b + this.f1299f;
        int i5 = (((measuredWidth - i3) + i4) - 1) / i4;
        if (i5 < 2) {
            i5 = 2;
        } else if ((i5 & 1) != 0) {
            i5++;
        }
        int i6 = i5 + 1;
        if (this.f1294a != i6) {
            this.f1294a = i6;
            while (getChildCount() > this.f1294a) {
                removeView(getChildAt(getChildCount() - 1));
            }
            while (getChildCount() < this.f1294a) {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(this.f1295b, this.f1296c));
            }
            int a = m1437a();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (a == i7) {
                    layoutParams.width = this.f1297d;
                    layoutParams.height = this.f1298e;
                } else {
                    layoutParams.width = this.f1295b;
                    layoutParams.height = this.f1296c;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
    }
}
