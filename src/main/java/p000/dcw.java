package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: dcw */
/* compiled from: PG */
public class dcw implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final int f8304a;

    /* renamed from: b */
    public float f8305b;

    /* renamed from: c */
    public View f8306c;

    /* renamed from: d */
    public View.OnFocusChangeListener f8307d;

    /* renamed from: e */
    public dcv f8308e;

    /* renamed from: f */
    public int f8309f;

    /* renamed from: g */
    private final float f8310g;

    /* renamed from: h */
    private int f8311h;

    /* renamed from: i */
    private AnimatorSet f8312i;

    /* renamed from: j */
    private Animator.AnimatorListener f8313j;

    /* renamed from: k */
    private Runnable f8314k;

    /* renamed from: l */
    private Runnable f8315l;

    public dcw(int i, float f, float f2) {
        this(i, f, f2, 0);
    }

    public dcw(int i, float f, float f2, int i2) {
        this.f8311h = 0;
        this.f8314k = new dcs(this);
        this.f8315l = new dct(this);
        this.f8304a = i;
        this.f8305b = f;
        this.f8310g = f2;
        this.f8311h = i2;
    }

    public dcw(dcw dcw) {
        this(dcw.f8304a, dcw.f8305b, dcw.f8310g, dcw.f8311h);
    }

    /* renamed from: a */
    public final void mo4133a(boolean z) {
        AnimatorSet animatorSet = this.f8312i;
        if (animatorSet != null) {
            animatorSet.cancel();
            mo4134b();
        }
        float pivotX = this.f8306c.getPivotX();
        m6176c();
        dcv dcv = this.f8308e;
        ObjectAnimator objectAnimator = null;
        if (dcv != null && dcv.mo3545b()) {
            View view = this.f8306c;
            objectAnimator = ObjectAnimator.ofFloat(view, "pivotX", pivotX, view.getPivotX());
        }
        float f = z ? this.f8305b : 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8306c, View.TRANSLATION_Z, z ? this.f8310g : 0.0f);
        ofFloat.setDuration((long) this.f8304a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8306c, View.SCALE_X, f);
        ofFloat2.setDuration((long) this.f8304a);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f8306c, View.SCALE_Y, f);
        ofFloat3.setDuration((long) this.f8304a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f8312i = animatorSet2;
        if (objectAnimator != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, objectAnimator);
        } else {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
        }
        dcu dcu = new dcu(this);
        this.f8313j = dcu;
        this.f8312i.addListener(dcu);
        this.f8312i.start();
    }

    /* renamed from: c */
    private final void m6176c() {
        int i = this.f8306c.getLayoutParams().width;
        int i2 = this.f8306c.getLayoutParams().height;
        if (i <= 0 || i2 <= 0) {
            i = this.f8306c.getWidth();
            i2 = this.f8306c.getHeight();
            if (i <= 0 || i2 <= 0) {
                return;
            }
        }
        dcv dcv = this.f8308e;
        if (dcv != null) {
            this.f8311h = dcv.mo3544a();
        }
        int i3 = this.f8311h;
        if (i3 == 0) {
            i /= 2;
        } else if (!(i3 == 1 && this.f8306c.getLayoutDirection() == 1)) {
            i = 0;
        }
        this.f8306c.setPivotX((float) i);
        this.f8306c.setPivotY((float) ((i2 / 2) + this.f8309f));
    }

    public void onFocusChange(View view, boolean z) {
        Runnable runnable;
        view.removeCallbacks(this.f8314k);
        view.removeCallbacks(this.f8315l);
        if (!z) {
            runnable = this.f8315l;
        } else {
            runnable = this.f8314k;
        }
        view.postDelayed(runnable, 60);
        View.OnFocusChangeListener onFocusChangeListener = this.f8307d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    /* renamed from: b */
    public final void mo4134b() {
        AnimatorSet animatorSet = this.f8312i;
        if (animatorSet != null) {
            Animator.AnimatorListener animatorListener = this.f8313j;
            if (animatorListener != null) {
                animatorSet.removeListener(animatorListener);
            }
            this.f8312i = null;
        }
        this.f8313j = null;
    }

    /* renamed from: a */
    public final void mo4131a() {
        float f;
        float f2;
        mo4134b();
        if (this.f8306c.isFocused()) {
            f = this.f8305b;
        } else {
            f = 1.0f;
        }
        if (this.f8306c.isFocused()) {
            f2 = this.f8310g;
        } else {
            f2 = 0.0f;
        }
        m6176c();
        this.f8306c.setScaleX(f);
        this.f8306c.setScaleY(f);
        this.f8306c.setTranslationZ(f2);
    }

    /* renamed from: a */
    public final void mo4132a(View view) {
        this.f8306c = view;
        view.setOnFocusChangeListener(this);
    }
}
