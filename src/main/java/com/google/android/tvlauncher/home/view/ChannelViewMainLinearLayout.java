package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ChannelViewMainLinearLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f6550a = false;

    /* renamed from: b */
    public int f6551b;

    /* renamed from: c */
    private View f6552c;

    /* renamed from: d */
    private View f6553d;

    public ChannelViewMainLinearLayout(Context context) {
        super(context);
    }

    public ChannelViewMainLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChannelViewMainLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6553d = findViewById(R.id.channel_logo);
        this.f6552c = findViewById(R.id.logo_title_zoomed_out);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f6550a) {
            int top = (((this.f6553d.getTop() + (this.f6553d.getHeight() / 2)) - (this.f6552c.getHeight() / 2)) - this.f6551b) + ((ViewGroup.MarginLayoutParams) this.f6552c.getLayoutParams()).topMargin;
            View view = this.f6552c;
            view.layout(view.getLeft(), top, this.f6552c.getRight(), this.f6552c.getHeight() + top);
        }
    }
}
