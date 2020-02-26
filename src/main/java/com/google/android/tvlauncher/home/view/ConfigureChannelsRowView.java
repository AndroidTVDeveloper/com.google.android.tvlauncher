package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ConfigureChannelsRowView extends LinearLayout {

    /* renamed from: a */
    public TextView f6554a;

    /* renamed from: b */
    public TextView f6555b;

    /* renamed from: c */
    public int f6556c;

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
        this.f6554a = (TextView) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.description_text);
        this.f6555b = textView;
        this.f6556c = textView.getVisibility();
        this.f6554a.setOutlineProvider(new cur(getResources().getDimensionPixelSize(R.dimen.home_configure_channels_button_corner_radius)));
        this.f6554a.setClipToOutline(true);
        cga.m4692a().mo2745a(this);
    }
}
