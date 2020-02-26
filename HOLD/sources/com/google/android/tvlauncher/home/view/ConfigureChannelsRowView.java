package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ConfigureChannelsRowView extends LinearLayout {
    public TextView a;
    public TextView b;
    public int c;

    public ConfigureChannelsRowView(Context context) {
        super(context);
    }

    public ConfigureChannelsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConfigureChannelsRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.description_text);
        this.b = textView;
        this.c = textView.getVisibility();
        this.a.setOutlineProvider(new cur(getResources().getDimensionPixelSize(R.dimen.home_configure_channels_button_corner_radius)));
        this.a.setClipToOutline(true);
        cga.a().a(this);
    }
}
