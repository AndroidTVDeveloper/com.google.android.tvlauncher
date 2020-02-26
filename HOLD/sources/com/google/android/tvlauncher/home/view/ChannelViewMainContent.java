package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ChannelViewMainContent extends FrameLayout {
    public boolean a;
    public boolean b = true;
    public int c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;

    public ChannelViewMainContent(Context context) {
        super(context);
    }

    public ChannelViewMainContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChannelViewMainContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.channel_logo);
        this.d = findViewById(R.id.logo_title);
        this.f = findViewById(R.id.actions_hint);
        this.g = findViewById(R.id.sponsored_channel_background);
        this.h = findViewById(R.id.main_linear_layout);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (!this.a) {
            int bottom = this.e.getBottom() + marginLayoutParams.topMargin;
            View view = this.d;
            view.layout(view.getLeft(), bottom, this.d.getRight(), this.d.getMeasuredHeight() + bottom);
        } else {
            int top = (int) (((((float) this.e.getTop()) + (((float) this.e.getHeight()) / 2.0f)) - (((float) this.g.getHeight()) / 2.0f)) - ((float) this.c));
            View view2 = this.g;
            view2.layout(view2.getLeft(), top, this.g.getRight(), this.g.getHeight() + top);
            if (this.b) {
                int left = ((this.h.getLeft() + this.e.getLeft()) + (this.e.getMeasuredWidth() / 2)) - (this.d.getMeasuredWidth() / 2);
                int top2 = (this.e.getTop() - marginLayoutParams.bottomMargin) - this.d.getMeasuredHeight();
                View view3 = this.d;
                view3.layout(left, top2, view3.getMeasuredWidth() + left, this.d.getMeasuredHeight() + top2);
            } else {
                int top3 = (int) (((((float) this.e.getTop()) + (((float) this.e.getMeasuredHeight()) / 2.0f)) - (((float) this.d.getHeight()) / 2.0f)) - ((float) this.c));
                View view4 = this.d;
                view4.layout(view4.getLeft(), top3, this.d.getRight(), this.d.getMeasuredHeight() + top3);
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
        int top4 = (((this.e.getTop() + (this.e.getHeight() / 2)) - (this.f.getHeight() / 2)) - this.c) + marginLayoutParams2.topMargin;
        int right = getLayoutDirection() == 1 ? this.e.getRight() + marginLayoutParams2.getMarginEnd() : ((this.h.getLeft() + this.e.getLeft()) - this.f.getWidth()) - marginLayoutParams2.getMarginEnd();
        View view5 = this.f;
        view5.layout(right, top4, view5.getWidth() + right, this.f.getHeight() + top4);
    }
}
