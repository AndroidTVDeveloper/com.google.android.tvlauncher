package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: dcw  reason: default package */
/* compiled from: PG */
public class dcw implements View.OnFocusChangeListener {
    public final int a;
    public float b;
    public View c;
    public View.OnFocusChangeListener d;
    public dcv e;
    public int f;
    private final float g;
    private int h;
    private AnimatorSet i;
    private Animator.AnimatorListener j;
    private Runnable k;
    private Runnable l;

    public dcw(int i2, float f2, float f3) {
        this(i2, f2, f3, 0);
    }

    public dcw(int i2, float f2, float f3, int i3) {
        this.h = 0;
        this.k = new dcs(this);
        this.l = new dct(this);
        this.a = i2;
        this.b = f2;
        this.g = f3;
        this.h = i3;
    }

    public dcw(dcw dcw) {
        this(dcw.a, dcw.b, dcw.g, dcw.h);
    }

    public final void a(boolean z) {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.cancel();
            b();
        }
        float pivotX = this.c.getPivotX();
        c();
        dcv dcv = this.e;
        ObjectAnimator objectAnimator = null;
        if (dcv != null && dcv.b()) {
            View view = this.c;
            objectAnimator = ObjectAnimator.ofFloat(view, "pivotX", pivotX, view.getPivotX());
        }
        float f2 = z ? this.b : 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, View.TRANSLATION_Z, z ? this.g : 0.0f);
        ofFloat.setDuration((long) this.a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.c, View.SCALE_X, f2);
        ofFloat2.setDuration((long) this.a);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.c, View.SCALE_Y, f2);
        ofFloat3.setDuration((long) this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.i = animatorSet2;
        if (objectAnimator != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, objectAnimator);
        } else {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
        }
        dcu dcu = new dcu(this);
        this.j = dcu;
        this.i.addListener(dcu);
        this.i.start();
    }

    private final void c() {
        int i2 = this.c.getLayoutParams().width;
        int i3 = this.c.getLayoutParams().height;
        if (i2 <= 0 || i3 <= 0) {
            i2 = this.c.getWidth();
            i3 = this.c.getHeight();
            if (i2 <= 0 || i3 <= 0) {
                return;
            }
        }
        dcv dcv = this.e;
        if (dcv != null) {
            this.h = dcv.a();
        }
        int i4 = this.h;
        if (i4 == 0) {
            i2 /= 2;
        } else if (!(i4 == 1 && this.c.getLayoutDirection() == 1)) {
            i2 = 0;
        }
        this.c.setPivotX((float) i2);
        this.c.setPivotY((float) ((i3 / 2) + this.f));
    }

    public void onFocusChange(View view, boolean z) {
        Runnable runnable;
        view.removeCallbacks(this.k);
        view.removeCallbacks(this.l);
        if (!z) {
            runnable = this.l;
        } else {
            runnable = this.k;
        }
        view.postDelayed(runnable, 60);
        View.OnFocusChangeListener onFocusChangeListener = this.d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    public final void b() {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            Animator.AnimatorListener animatorListener = this.j;
            if (animatorListener != null) {
                animatorSet.removeListener(animatorListener);
            }
            this.i = null;
        }
        this.j = null;
    }

    public final void a() {
        float f2;
        float f3;
        b();
        if (this.c.isFocused()) {
            f2 = this.b;
        } else {
            f2 = 1.0f;
        }
        if (this.c.isFocused()) {
            f3 = this.g;
        } else {
            f3 = 0.0f;
        }
        c();
        this.c.setScaleX(f2);
        this.c.setScaleY(f2);
        this.c.setTranslationZ(f3);
    }

    public final void a(View view) {
        this.c = view;
        view.setOnFocusChangeListener(this);
    }
}
