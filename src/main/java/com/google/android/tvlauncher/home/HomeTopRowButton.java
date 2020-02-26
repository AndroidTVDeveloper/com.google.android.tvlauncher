package com.google.android.tvlauncher.home;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class HomeTopRowButton extends LinearLayout {

    /* renamed from: a */
    public final int f6435a;

    /* renamed from: b */
    public final int f6436b;

    /* renamed from: c */
    public final AnimatorSet f6437c;

    /* renamed from: d */
    public final AnimatorSet f6438d;

    /* renamed from: e */
    public View f6439e;

    /* renamed from: f */
    public ImageView f6440f;

    /* renamed from: g */
    public TextView f6441g;

    /* renamed from: h */
    private final int f6442h;

    /* renamed from: i */
    private final int f6443i;

    /* renamed from: j */
    private View.OnFocusChangeListener f6444j;

    public HomeTopRowButton(Context context) {
        this(context, null);
    }

    public HomeTopRowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6444j = new cra(this);
        Resources resources = getResources();
        this.f6435a = resources.getColor(R.color.reference_white_100, null);
        this.f6442h = resources.getColor(R.color.reference_white_60, null);
        this.f6436b = -16777216;
        this.f6443i = resources.getInteger(R.integer.top_row_button_animation_duration_ms);
        this.f6437c = new AnimatorSet();
        this.f6438d = new AnimatorSet();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6440f = (ImageView) findViewById(R.id.button_icon);
        this.f6441g = (TextView) findViewById(R.id.button_title);
        View findViewById = findViewById(R.id.button_background);
        this.f6439e = findViewById;
        findViewById.setOutlineProvider(new crg());
        this.f6439e.setClipToOutline(true);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f6436b), Integer.valueOf(this.f6442h));
        ofObject.setDuration((long) this.f6443i);
        ofObject.addUpdateListener(new crb(this));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f6442h), Integer.valueOf(this.f6436b));
        ofObject2.setDuration((long) this.f6443i);
        ofObject2.addUpdateListener(new crc(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6441g, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration((long) this.f6443i);
        ofFloat.addListener(new crd(this));
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.expand_fade_in);
        animatorSet.setTarget(this.f6439e);
        this.f6437c.playTogether(animatorSet, ofObject2, ofFloat);
        this.f6437c.addListener(new cre(this));
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.shrink_fade_out);
        animatorSet2.setTarget(this.f6439e);
        this.f6438d.playTogether(animatorSet2, ofObject);
        this.f6438d.addListener(new crf(this));
        setOnFocusChangeListener(this.f6444j);
    }

    /* renamed from: a */
    public final void mo3368a(int i) {
        ImageView imageView = this.f6440f;
        if (imageView != null) {
            imageView.setImageResource(i);
            if (hasFocus()) {
                this.f6440f.getDrawable().setTint(this.f6436b);
            }
        }
    }

    /* renamed from: b */
    public final void mo3370b(int i) {
        TextView textView = this.f6441g;
        if (textView != null) {
            textView.setText(i);
        }
    }

    /* renamed from: a */
    public final void mo3369a(String str) {
        TextView textView = this.f6441g;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
