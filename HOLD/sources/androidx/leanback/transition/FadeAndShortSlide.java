package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* compiled from: PG */
public class FadeAndShortSlide extends Visibility {
    private static final TimeInterpolator a = new DecelerateInterpolator();
    private static final bmp e = new ml();
    private static final bmp f = new mm();
    private static final bmp g = new mn();
    private static final bmp h = new mo();
    private static final bmp i = new mp();
    private Visibility b;
    private float c;
    private bmp d;
    private final bmp j;

    public FadeAndShortSlide() {
        this(8388611);
    }

    public FadeAndShortSlide(int i2) {
        this.b = new Fade();
        this.c = -1.0f;
        this.j = new mq(this);
        a(i2);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Fade();
        this.c = -1.0f;
        this.j = new mq(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.i);
        a(obtainStyledAttributes.getInt(3, 8388611));
        obtainStyledAttributes.recycle();
    }

    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.b.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        this.b.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        this.b.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        a(transitionValues);
    }

    private static final void a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.b = (Visibility) this.b.clone();
        return fadeAndShortSlide;
    }

    public final float a(ViewGroup viewGroup) {
        float f2 = this.c;
        return f2 < 0.0f ? (float) (viewGroup.getWidth() / 4) : f2;
    }

    public final float b(ViewGroup viewGroup) {
        float f2 = this.c;
        return f2 < 0.0f ? (float) (viewGroup.getHeight() / 4) : f2;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues2;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i2 = iArr[0];
        int i3 = iArr[1];
        float translationX = view.getTranslationX();
        View view2 = view;
        TransitionValues transitionValues4 = transitionValues2;
        Animator a2 = bks.a(view2, transitionValues4, i2, i3, this.d.a(this, viewGroup, viewGroup3, iArr), this.d.b(this, viewGroup, viewGroup3, iArr), translationX, view.getTranslationY(), a, this);
        Animator onAppear = this.b.onAppear(viewGroup, viewGroup3, transitionValues, transitionValues3);
        if (a2 == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(onAppear);
        return animatorSet;
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i2 = iArr[0];
        int i3 = iArr[1];
        float translationX = view.getTranslationX();
        float a2 = this.d.a(this, viewGroup, viewGroup3, iArr);
        Animator a3 = bks.a(view, transitionValues, i2, i3, translationX, view.getTranslationY(), a2, this.d.b(this, viewGroup, viewGroup3, iArr), a, this);
        Animator onDisappear = this.b.onDisappear(viewGroup, viewGroup3, transitionValues3, transitionValues2);
        if (a3 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a3;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a3).with(onDisappear);
        return animatorSet;
    }

    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.b.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.b.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    private final void a(int i2) {
        if (i2 == 48) {
            this.d = i;
        } else if (i2 == 80) {
            this.d = h;
        } else if (i2 == 112) {
            this.d = this.j;
        } else if (i2 == 8388611) {
            this.d = e;
        } else if (i2 == 8388613) {
            this.d = f;
        } else if (i2 == 8388615) {
            this.d = g;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }
}
