package com.google.android.tvlauncher.appsview;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class StoreRowButtonView extends LinearLayout implements View.OnClickListener, View.OnFocusChangeListener {
    public ImageView a;
    public final int b;
    public cek c;
    private TextView d;
    private chn e;
    private chr f;
    private final float g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public StoreRowButtonView(Context context) {
        this(context, null);
    }

    public StoreRowButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoreRowButtonView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public StoreRowButtonView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.h = bg.b(getContext(), R.color.store_button_focused_fill);
        this.i = bg.b(getContext(), R.color.store_button_unfocused_fill);
        Resources resources = getResources();
        this.g = resources.getFraction(R.fraction.store_button_focused_scale, 1, 1);
        this.j = resources.getInteger(R.integer.banner_scale_anim_duration);
        this.b = resources.getDimensionPixelSize(R.dimen.store_button_rounded_corner_radius);
        this.k = resources.getDimensionPixelSize(R.dimen.store_button_z);
        setOutlineProvider(new cik(this));
        setOnClickListener(this);
        setClipToOutline(true);
        setOnFocusChangeListener(this);
    }

    public final void onClick(View view) {
        this.f.a(this.e.a, this.c, view);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.store_icon);
        this.d = (TextView) findViewById(R.id.store_title);
    }

    public final void onFocusChange(View view, boolean z) {
        float f2 = z ? this.g : 1.0f;
        int i2 = z ? this.i : this.h;
        int i3 = z ? this.h : this.i;
        int i4 = z ? this.k : 0;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i3));
        ofObject.setDuration((long) this.j);
        ofObject.addUpdateListener(new cil(this));
        ofObject.start();
        view.animate().scaleX(f2).scaleY(f2).translationZ((float) i4).setDuration((long) this.j);
        this.d.setSelected(z);
    }

    public final void a(chn chn, chr chr) {
        this.e = chn;
        this.f = chr;
    }

    public final void a(String str) {
        if (!TextUtils.equals(str, this.d.getText())) {
            this.d.setText(str);
        }
    }
}
