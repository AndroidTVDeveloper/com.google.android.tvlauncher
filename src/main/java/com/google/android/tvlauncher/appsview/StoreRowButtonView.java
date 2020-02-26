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

    /* renamed from: a */
    public ImageView f6419a;

    /* renamed from: b */
    public final int f6420b;

    /* renamed from: c */
    public cek f6421c;

    /* renamed from: d */
    private TextView f6422d;

    /* renamed from: e */
    private chn f6423e;

    /* renamed from: f */
    private chr f6424f;

    /* renamed from: g */
    private final float f6425g;

    /* renamed from: h */
    private final int f6426h;

    /* renamed from: i */
    private final int f6427i;

    /* renamed from: j */
    private final int f6428j;

    /* renamed from: k */
    private final int f6429k;

    public StoreRowButtonView(Context context) {
        this(context, null);
    }

    public StoreRowButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoreRowButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public StoreRowButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6426h = C0035bg.m3116b(getContext(), R.color.store_button_focused_fill);
        this.f6427i = C0035bg.m3116b(getContext(), R.color.store_button_unfocused_fill);
        Resources resources = getResources();
        this.f6425g = resources.getFraction(R.fraction.store_button_focused_scale, 1, 1);
        this.f6428j = resources.getInteger(R.integer.banner_scale_anim_duration);
        this.f6420b = resources.getDimensionPixelSize(R.dimen.store_button_rounded_corner_radius);
        this.f6429k = resources.getDimensionPixelSize(R.dimen.store_button_z);
        setOutlineProvider(new cik(this));
        setOnClickListener(this);
        setClipToOutline(true);
        setOnFocusChangeListener(this);
    }

    public final void onClick(View view) {
        this.f6424f.mo2764a(this.f6423e.f5561a, this.f6421c, view);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6419a = (ImageView) findViewById(R.id.store_icon);
        this.f6422d = (TextView) findViewById(R.id.store_title);
    }

    public final void onFocusChange(View view, boolean z) {
        float f = z ? this.f6425g : 1.0f;
        int i = z ? this.f6427i : this.f6426h;
        int i2 = z ? this.f6426h : this.f6427i;
        int i3 = z ? this.f6429k : 0;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration((long) this.f6428j);
        ofObject.addUpdateListener(new cil(this));
        ofObject.start();
        view.animate().scaleX(f).scaleY(f).translationZ((float) i3).setDuration((long) this.f6428j);
        this.f6422d.setSelected(z);
    }

    /* renamed from: a */
    public final void mo3244a(chn chn, chr chr) {
        this.f6423e = chn;
        this.f6424f = chr;
    }

    /* renamed from: a */
    public final void mo3245a(String str) {
        if (!TextUtils.equals(str, this.f6422d.getText())) {
            this.f6422d.setText(str);
        }
    }
}
