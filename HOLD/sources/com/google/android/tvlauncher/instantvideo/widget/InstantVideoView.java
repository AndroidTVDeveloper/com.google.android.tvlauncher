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
    public ImageView a;
    public float b;
    public Uri c;
    public View d;
    public cwi e;
    public boolean f;
    public ViewPropertyAnimator g;
    private Runnable h;

    public InstantVideoView(Context context) {
        this(context, null, 0);
    }

    public InstantVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstantVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 1.0f;
        this.h = new cxo(this);
        a(true);
        a(0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        cwi cwi;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0 && (cwi = this.e) != null) {
            cwi.a(i, i2);
        }
    }

    public final void a(int i) {
        if (i == 0) {
            ViewPropertyAnimator viewPropertyAnimator = this.g;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                this.g = null;
            }
            ImageView imageView = this.a;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.a.setAlpha(1.0f);
            }
            View view = this.d;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (i == 1) {
            View view2 = this.d;
            if (view2 != null) {
                view2.setVisibility(0);
                this.d.setAlpha(0.0f);
            }
        } else {
            ImageView imageView2 = this.a;
            if (imageView2 != null) {
                ViewPropertyAnimator animate = imageView2.animate();
                this.g = animate;
                animate.alpha(0.0f).setDuration(2000).setInterpolator(new DecelerateInterpolator()).setListener(new cxq(this)).start();
            }
            View view3 = this.d;
            if (view3 != null) {
                view3.setVisibility(0);
                this.d.setAlpha(1.0f);
            }
        }
    }

    public final void a(boolean z) {
        if (!z) {
            if (this.a != null) {
                ViewPropertyAnimator viewPropertyAnimator = this.g;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.g = null;
                }
                removeView(this.a);
                this.a = null;
            }
        } else if (this.a == null) {
            ImageView imageView = new ImageView(getContext());
            this.a = imageView;
            addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    public final void a(float f2) {
        this.b = f2;
        cwi cwi = this.e;
        if (cwi != null && this.f) {
            cwi.a(f2);
        }
    }

    public final void a() {
        if (this.f) {
            this.f = false;
            this.e.a((cwh) null);
            a(0);
            post(this.h);
        }
    }

    public final void b() {
        removeCallbacks(this.h);
        if (this.d != null) {
            this.e.a((cwh) null);
            this.e.d();
            cxg a2 = cxg.a(getContext());
            a2.a.a(this.e);
            this.e = null;
            removeView(this.d);
            this.d = null;
        }
    }
}
