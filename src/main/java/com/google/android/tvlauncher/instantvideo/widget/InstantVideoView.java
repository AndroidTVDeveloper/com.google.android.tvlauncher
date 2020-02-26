package com.google.android.tvlauncher.instantvideo.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: PG */
public class InstantVideoView extends FrameLayout {

    /* renamed from: a */
    public ImageView f6599a;

    /* renamed from: b */
    public float f6600b;

    /* renamed from: c */
    public Uri f6601c;

    /* renamed from: d */
    public View f6602d;

    /* renamed from: e */
    public cwi f6603e;

    /* renamed from: f */
    public boolean f6604f;

    /* renamed from: g */
    public ViewPropertyAnimator f6605g;

    /* renamed from: h */
    private Runnable f6606h;

    public InstantVideoView(Context context) {
        this(context, null, 0);
    }

    public InstantVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstantVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6600b = 1.0f;
        this.f6606h = new cxo(this);
        mo3431a(true);
        mo3430a(0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3428a();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        cwi cwi;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0 && (cwi = this.f6603e) != null) {
            cwi.mo3883a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo3430a(int i) {
        if (i == 0) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6605g;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                this.f6605g = null;
            }
            ImageView imageView = this.f6599a;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.f6599a.setAlpha(1.0f);
            }
            View view = this.f6602d;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (i == 1) {
            View view2 = this.f6602d;
            if (view2 != null) {
                view2.setVisibility(0);
                this.f6602d.setAlpha(0.0f);
            }
        } else {
            ImageView imageView2 = this.f6599a;
            if (imageView2 != null) {
                ViewPropertyAnimator animate = imageView2.animate();
                this.f6605g = animate;
                animate.alpha(0.0f).setDuration(2000).setInterpolator(new DecelerateInterpolator()).setListener(new cxq(this)).start();
            }
            View view3 = this.f6602d;
            if (view3 != null) {
                view3.setVisibility(0);
                this.f6602d.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo3431a(boolean z) {
        if (!z) {
            if (this.f6599a != null) {
                ViewPropertyAnimator viewPropertyAnimator = this.f6605g;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f6605g = null;
                }
                removeView(this.f6599a);
                this.f6599a = null;
            }
        } else if (this.f6599a == null) {
            ImageView imageView = new ImageView(getContext());
            this.f6599a = imageView;
            addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    /* renamed from: a */
    public final void mo3429a(float f) {
        this.f6600b = f;
        cwi cwi = this.f6603e;
        if (cwi != null && this.f6604f) {
            cwi.mo3882a(f);
        }
    }

    /* renamed from: a */
    public final void mo3428a() {
        if (this.f6604f) {
            this.f6604f = false;
            this.f6603e.mo3884a((cwh) null);
            mo3430a(0);
            post(this.f6606h);
        }
    }

    /* renamed from: b */
    public final void mo3432b() {
        removeCallbacks(this.f6606h);
        if (this.f6602d != null) {
            this.f6603e.mo3884a((cwh) null);
            this.f6603e.mo3888d();
            cxg a = cxg.m5888a(getContext());
            a.f7834a.mo3933a(this.f6603e);
            this.f6603e = null;
            removeView(this.f6602d);
            this.f6602d = null;
        }
    }
}
