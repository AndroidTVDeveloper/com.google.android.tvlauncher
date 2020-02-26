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

    /* renamed from: a */
    public TextView f6639a;

    /* renamed from: b */
    public Drawable f6640b;

    /* renamed from: c */
    public View f6641c;

    /* renamed from: d */
    public TextView f6642d;

    /* renamed from: e */
    public final int f6643e;

    /* renamed from: f */
    public AnimatorSet f6644f;

    /* renamed from: g */
    public AnimatorSet f6645g;

    /* renamed from: h */
    public ObjectAnimator f6646h;

    /* renamed from: i */
    public ObjectAnimator f6647i;

    /* renamed from: j */
    public ValueAnimator f6648j;

    /* renamed from: k */
    public ValueAnimator f6649k;

    /* renamed from: l */
    public ObjectAnimator f6650l;

    /* renamed from: m */
    public ObjectAnimator f6651m;

    /* renamed from: n */
    public ObjectAnimator f6652n;

    /* renamed from: o */
    public final String f6653o;

    /* renamed from: p */
    public final String f6654p;

    /* renamed from: q */
    public float f6655q;

    /* renamed from: r */
    public float f6656r;

    /* renamed from: s */
    public boolean f6657s;

    /* renamed from: t */
    private Drawable f6658t;

    /* renamed from: u */
    private ImageView f6659u;

    /* renamed from: v */
    private final int f6660v;

    /* renamed from: w */
    private final int f6661w;

    /* renamed from: x */
    private int f6662x;

    /* renamed from: y */
    private int f6663y;

    /* renamed from: z */
    private final int f6664z;

    public NotificationsPanelButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f6660v = resources.getColor(R.color.white_60, null);
        this.f6661w = resources.getColor(R.color.notification_panel_icon_focused_color, null);
        this.f6662x = resources.getColor(R.color.notification_panel_icon_unseen_color, null);
        this.f6643e = resources.getColor(R.color.reference_white_100, null);
        this.f6663y = resources.getColor(R.color.notification_panel_icon_text_unfocused_color, null);
        this.f6664z = resources.getInteger(R.integer.top_row_button_animation_duration_ms);
        this.f6653o = resources.getString(R.string.number_format);
        this.f6654p = resources.getString(R.string.greater_than_nine_notifs_text);
        this.f6655q = resources.getDimension(R.dimen.text_size_h4);
        this.f6656r = resources.getDimension(R.dimen.text_size_h5);
        Drawable drawable = resources.getDrawable(R.drawable.hollow_circle_background, null);
        this.f6640b = drawable;
        drawable.setTint(this.f6660v);
        this.f6658t = resources.getDrawable(R.drawable.full_circle_background, null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6641c = findViewById(R.id.button_background);
        ImageView imageView = (ImageView) findViewById(R.id.notification_panel_background_circle);
        this.f6659u = imageView;
        imageView.setImageDrawable(this.f6640b);
        this.f6639a = (TextView) findViewById(R.id.notification_panel_count);
        TextView textView = (TextView) findViewById(R.id.button_title);
        this.f6642d = textView;
        textView.setText((int) R.string.notifications_panel_icon_title);
        this.f6641c.setOutlineProvider(new cyd());
        this.f6641c.setClipToOutline(true);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6642d, "alpha", 0.0f, 1.0f);
        this.f6652n = ofFloat;
        ofFloat.setDuration((long) this.f6664z);
        this.f6652n.addListener(new cyf(this));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f6660v), Integer.valueOf(this.f6661w));
        this.f6648j = ofObject;
        ofObject.setDuration((long) this.f6664z);
        this.f6648j.addUpdateListener(new cyg(this));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f6661w), Integer.valueOf(this.f6660v));
        this.f6649k = ofObject2;
        ofObject2.setDuration((long) this.f6664z);
        this.f6649k.addUpdateListener(new cyh(this));
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(this.f6658t, "tint", this.f6662x, this.f6661w);
        this.f6650l = ofArgb;
        ofArgb.setDuration((long) this.f6664z);
        ObjectAnimator ofArgb2 = ObjectAnimator.ofArgb(this.f6658t, "tint", this.f6661w, this.f6662x);
        this.f6651m = ofArgb2;
        ofArgb2.setDuration((long) this.f6664z);
        ObjectAnimator ofArgb3 = ObjectAnimator.ofArgb(this.f6639a, "textColor", this.f6663y, this.f6643e);
        this.f6646h = ofArgb3;
        ofArgb3.setDuration((long) this.f6664z);
        ObjectAnimator ofArgb4 = ObjectAnimator.ofArgb(this.f6639a, "textColor", this.f6643e, this.f6663y);
        this.f6647i = ofArgb4;
        ofArgb4.setDuration((long) this.f6664z);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.expand_fade_in);
        this.f6644f = animatorSet;
        animatorSet.setTarget(this.f6641c);
        this.f6644f.addListener(new cyi(this));
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.shrink_fade_out);
        this.f6645g = animatorSet2;
        animatorSet2.setTarget(this.f6641c);
        this.f6645g.addListener(new cyj(this));
        setOnFocusChangeListener(new cye(this));
    }

    /* renamed from: a */
    public final void mo3443a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f6657s = z;
        if (z) {
            Drawable drawable = this.f6640b;
            if (!hasFocus()) {
                i3 = this.f6660v;
            } else {
                i3 = this.f6661w;
            }
            drawable.setTint(i3);
            this.f6659u.setImageDrawable(this.f6640b);
            TextView textView = this.f6639a;
            if (!hasFocus()) {
                i4 = this.f6660v;
            } else {
                i4 = this.f6661w;
            }
            textView.setTextColor(i4);
            return;
        }
        Drawable drawable2 = this.f6658t;
        if (!hasFocus()) {
            i = this.f6662x;
        } else {
            i = this.f6661w;
        }
        drawable2.setTint(i);
        this.f6659u.setImageDrawable(this.f6658t);
        TextView textView2 = this.f6639a;
        if (!hasFocus()) {
            i2 = this.f6663y;
        } else {
            i2 = this.f6643e;
        }
        textView2.setTextColor(i2);
    }
}
