package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AddFavoriteAppCardView extends LinearLayout implements cus {
    public TextView a;
    public int b;
    private ImageView c;
    private cux d;

    public AddFavoriteAppCardView(Context context) {
        this(context, null);
    }

    public final ImageView a() {
        return this.c;
    }

    public final float b() {
        return this.d.a;
    }

    public final TextView d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public AddFavoriteAppCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddFavoriteAppCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AddFavoriteAppCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.app_title);
        this.a = textView;
        this.b = textView.getVisibility();
        this.c = (ImageView) findViewById(R.id.banner_image);
        this.d = new cux(this.c, dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1), dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor2));
    }

    public final void a(int i) {
        this.d.a(i);
    }
}
