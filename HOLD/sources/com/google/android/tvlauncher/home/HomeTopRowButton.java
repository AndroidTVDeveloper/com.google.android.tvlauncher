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
    public final int a;
    public final int b;
    public final AnimatorSet c;
    public final AnimatorSet d;
    public View e;
    public ImageView f;
    public TextView g;
    private final int h;
    private final int i;
    private View.OnFocusChangeListener j;

    public HomeTopRowButton(Context context) {
        this(context, null);
    }

    public HomeTopRowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new cra(this);
        Resources resources = getResources();
        this.a = resources.getColor(R.color.reference_white_100, null);
        this.h = resources.getColor(R.color.reference_white_60, null);
        this.b = -16777216;
        this.i = resources.getInteger(R.integer.top_row_button_animation_duration_ms);
        this.c = new AnimatorSet();
        this.d = new AnimatorSet();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ImageView) findViewById(R.id.button_icon);
        this.g = (TextView) findViewById(R.id.button_title);
        View findViewById = findViewById(R.id.button_background);
        this.e = findViewById;
        findViewById.setOutlineProvider(new crg());
        this.e.setClipToOutline(true);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.b), Integer.valueOf(this.h));
        ofObject.setDuration((long) this.i);
        ofObject.addUpdateListener(new crb(this));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.h), Integer.valueOf(this.b));
        ofObject2.setDuration((long) this.i);
        ofObject2.addUpdateListener(new crc(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration((long) this.i);
        ofFloat.addListener(new crd(this));
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.expand_fade_in);
        animatorSet.setTarget(this.e);
        this.c.playTogether(animatorSet, ofObject2, ofFloat);
        this.c.addListener(new cre(this));
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.shrink_fade_out);
        animatorSet2.setTarget(this.e);
        this.d.playTogether(animatorSet2, ofObject);
        this.d.addListener(new crf(this));
        setOnFocusChangeListener(this.j);
    }

    public final void a(int i2) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageResource(i2);
            if (hasFocus()) {
                this.f.getDrawable().setTint(this.b);
            }
        }
    }

    public final void b(int i2) {
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(i2);
        }
    }

    public final void a(String str) {
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
