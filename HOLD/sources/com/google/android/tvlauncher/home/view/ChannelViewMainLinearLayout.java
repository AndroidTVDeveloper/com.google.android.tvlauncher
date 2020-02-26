package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ChannelViewMainLinearLayout extends LinearLayout {
    public boolean a = false;
    public int b;
    private View c;
    private View d;

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
        this.d = findViewById(R.id.channel_logo);
        this.c = findViewById(R.id.logo_title_zoomed_out);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.a) {
            int top = (((this.d.getTop() + (this.d.getHeight() / 2)) - (this.c.getHeight() / 2)) - this.b) + ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin;
            View view = this.c;
            view.layout(view.getLeft(), top, this.c.getRight(), this.c.getHeight() + top);
        }
    }
}
