package com.google.android.tvlauncher.notifications;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationsPanelButtonView extends LinearLayout {
    public TextView a;
    public Drawable b;
    public View c;
    public TextView d;
    public final int e;
    public AnimatorSet f;
    public AnimatorSet g;
    public ObjectAnimator h;
    public ObjectAnimator i;
    public ValueAnimator j;
    public ValueAnimator k;
    public ObjectAnimator l;
    public ObjectAnimator m;
    public ObjectAnimator n;
    public final String o;
    public final String p;
    public float q;
    public float r;
    public boolean s;
    private Drawable t;
    private ImageView u;
    private final int v;
    private final int w;
    private int x;
    private int y;
    private final int z;

    public NotificationsPanelButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.v = resources.getColor(R.color.white_60, null);
        this.w = resources.getColor(R.color.notification_panel_icon_focused_color, null);
        this.x = resources.getColor(R.color.notification_panel_icon_unseen_color, null);
        this.e = resources.getColor(R.color.reference_white_100, null);
        this.y = resources.getColor(R.color.notification_panel_icon_text_unfocused_color, null);
        this.z = resources.getInteger(R.integer.top_row_button_animation_duration_ms);
        this.o = resources.getString(R.string.number_format);
        this.p = resources.getString(R.string.greater_than_nine_notifs_text);
        this.q = resources.getDimension(R.dimen.text_size_h4);
        this.r = resources.getDimension(R.dimen.text_size_h5);
        Drawable drawable = resources.getDrawable(R.drawable.hollow_circle_background, null);
        this.b = drawable;
        drawable.setTint(this.v);
        this.t = resources.getDrawable(R.drawable.full_circle_background, null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = findViewById(R.id.button_background);
        ImageView imageView = (ImageView) findViewById(R.id.notification_panel_background_circle);
        this.u = imageView;
        imageView.setImageDrawable(this.b);
        this.a = (TextView) findViewById(R.id.notification_panel_count);
        TextView textView = (TextView) findViewById(R.id.button_title);
        this.d = textView;
        textView.setText((int) R.string.notifications_panel_icon_title);
        this.c.setOutlineProvider(new cyd());
        this.c.setClipToOutline(true);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration((long) this.z);
        this.n.addListener(new cyf(this));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.v), Integer.valueOf(this.w));
        this.j = ofObject;
        ofObject.setDuration((long) this.z);
        this.j.addUpdateListener(new cyg(this));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.w), Integer.valueOf(this.v));
        this.k = ofObject2;
        ofObject2.setDuration((long) this.z);
        this.k.addUpdateListener(new cyh(this));
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(this.t, "tint", this.x, this.w);
        this.l = ofArgb;
        ofArgb.setDuration((long) this.z);
        ObjectAnimator ofArgb2 = ObjectAnimator.ofArgb(this.t, "tint", this.w, this.x);
        this.m = ofArgb2;
        ofArgb2.setDuration((long) this.z);
        ObjectAnimator ofArgb3 = ObjectAnimator.ofArgb(this.a, "textColor", this.y, this.e);
        this.h = ofArgb3;
        ofArgb3.setDuration((long) this.z);
        ObjectAnimator ofArgb4 = ObjectAnimator.ofArgb(this.a, "textColor", this.e, this.y);
        this.i = ofArgb4;
        ofArgb4.setDuration((long) this.z);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.expand_fade_in);
        this.f = animatorSet;
        animatorSet.setTarget(this.c);
        this.f.addListener(new cyi(this));
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.shrink_fade_out);
        this.g = animatorSet2;
        animatorSet2.setTarget(this.c);
        this.g.addListener(new cyj(this));
        setOnFocusChangeListener(new cye(this));
    }

    public final void a(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.s = z2;
        if (z2) {
            Drawable drawable = this.b;
            if (!hasFocus()) {
                i4 = this.v;
            } else {
                i4 = this.w;
            }
            drawable.setTint(i4);
            this.u.setImageDrawable(this.b);
            TextView textView = this.a;
            if (!hasFocus()) {
                i5 = this.v;
            } else {
                i5 = this.w;
            }
            textView.setTextColor(i5);
            return;
        }
        Drawable drawable2 = this.t;
        if (!hasFocus()) {
            i2 = this.x;
        } else {
            i2 = this.w;
        }
        drawable2.setTint(i2);
        this.u.setImageDrawable(this.t);
        TextView textView2 = this.a;
        if (!hasFocus()) {
            i3 = this.y;
        } else {
            i3 = this.e;
        }
        textView2.setTextColor(i3);
    }
}
