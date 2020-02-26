package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ChannelViewMainContent extends FrameLayout {

    /* renamed from: a */
    public boolean f6542a;

    /* renamed from: b */
    public boolean f6543b = true;

    /* renamed from: c */
    public int f6544c;

    /* renamed from: d */
    private View f6545d;

    /* renamed from: e */
    private View f6546e;

    /* renamed from: f */
    private View f6547f;

    /* renamed from: g */
    private View f6548g;

    /* renamed from: h */
    private View f6549h;

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
        this.f6546e = findViewById(R.id.channel_logo);
        this.f6545d = findViewById(R.id.logo_title);
        this.f6547f = findViewById(R.id.actions_hint);
        this.f6548g = findViewById(R.id.sponsored_channel_background);
        this.f6549h = findViewById(R.id.main_linear_layout);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6545d.getLayoutParams();
        if (!this.f6542a) {
            int bottom = this.f6546e.getBottom() + marginLayoutParams.topMargin;
            View view = this.f6545d;
            view.layout(view.getLeft(), bottom, this.f6545d.getRight(), this.f6545d.getMeasuredHeight() + bottom);
        } else {
            int top = (int) (((((float) this.f6546e.getTop()) + (((float) this.f6546e.getHeight()) / 2.0f)) - (((float) this.f6548g.getHeight()) / 2.0f)) - ((float) this.f6544c));
            View view2 = this.f6548g;
            view2.layout(view2.getLeft(), top, this.f6548g.getRight(), this.f6548g.getHeight() + top);
            if (this.f6543b) {
                int left = ((this.f6549h.getLeft() + this.f6546e.getLeft()) + (this.f6546e.getMeasuredWidth() / 2)) - (this.f6545d.getMeasuredWidth() / 2);
                int top2 = (this.f6546e.getTop() - marginLayoutParams.bottomMargin) - this.f6545d.getMeasuredHeight();
                View view3 = this.f6545d;
                view3.layout(left, top2, view3.getMeasuredWidth() + left, this.f6545d.getMeasuredHeight() + top2);
            } else {
                int top3 = (int) (((((float) this.f6546e.getTop()) + (((float) this.f6546e.getMeasuredHeight()) / 2.0f)) - (((float) this.f6545d.getHeight()) / 2.0f)) - ((float) this.f6544c));
                View view4 = this.f6545d;
                view4.layout(view4.getLeft(), top3, this.f6545d.getRight(), this.f6545d.getMeasuredHeight() + top3);
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6547f.getLayoutParams();
        int top4 = (((this.f6546e.getTop() + (this.f6546e.getHeight() / 2)) - (this.f6547f.getHeight() / 2)) - this.f6544c) + marginLayoutParams2.topMargin;
        int right = getLayoutDirection() == 1 ? this.f6546e.getRight() + marginLayoutParams2.getMarginEnd() : ((this.f6549h.getLeft() + this.f6546e.getLeft()) - this.f6547f.getWidth()) - marginLayoutParams2.getMarginEnd();
        View view5 = this.f6547f;
        view5.layout(right, top4, view5.getWidth() + right, this.f6547f.getHeight() + top4);
    }
}
