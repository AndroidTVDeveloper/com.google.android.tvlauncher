package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AddFavoriteAppCardView extends LinearLayout implements cus {

    /* renamed from: a */
    public TextView f6445a;

    /* renamed from: b */
    public int f6446b;

    /* renamed from: c */
    private ImageView f6447c;

    /* renamed from: d */
    private cux f6448d;

    public AddFavoriteAppCardView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final ImageView mo3223a() {
        return this.f6447c;
    }

    /* renamed from: b */
    public final float mo3227b() {
        return this.f6448d.f7612a;
    }

    /* renamed from: d */
    public final TextView mo3230d() {
        return this.f6445a;
    }

    /* renamed from: e */
    public final int mo3231e() {
        return this.f6446b;
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
        this.f6445a = textView;
        this.f6446b = textView.getVisibility();
        this.f6447c = (ImageView) findViewById(R.id.banner_image);
        this.f6448d = new cux(this.f6447c, dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1), dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor2));
    }

    /* renamed from: a */
    public final void mo3224a(int i) {
        this.f6448d.mo3780a(i);
    }
}
