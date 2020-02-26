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

    /* renamed from: a */
    private static final TimeInterpolator f1171a = new DecelerateInterpolator();

    /* renamed from: e */
    private static final bmp f1172e = new C0338ml();

    /* renamed from: f */
    private static final bmp f1173f = new C0339mm();

    /* renamed from: g */
    private static final bmp f1174g = new C0340mn();

    /* renamed from: h */
    private static final bmp f1175h = new C0341mo();

    /* renamed from: i */
    private static final bmp f1176i = new C0342mp();

    /* renamed from: b */
    private Visibility f1177b;

    /* renamed from: c */
    private float f1178c;

    /* renamed from: d */
    private bmp f1179d;

    /* renamed from: j */
    private final bmp f1180j;

    public FadeAndShortSlide() {
        this(8388611);
    }

    public FadeAndShortSlide(int i) {
        this.f1177b = new Fade();
        this.f1178c = -1.0f;
        this.f1180j = new C0343mq(this);
        m1397a(i);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1177b = new Fade();
        this.f1178c = -1.0f;
        this.f1180j = new C0343mq(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9939i);
        m1397a(obtainStyledAttributes.getInt(3, 8388611));
        obtainStyledAttributes.recycle();
    }

    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.f1177b.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        this.f1177b.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        m1398a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        this.f1177b.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        m1398a(transitionValues);
    }

    /* renamed from: a */
    private static final void m1398a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f1177b = (Visibility) this.f1177b.clone();
        return fadeAndShortSlide;
    }

    /* renamed from: a */
    public final float mo981a(ViewGroup viewGroup) {
        float f = this.f1178c;
        return f < 0.0f ? (float) (viewGroup.getWidth() / 4) : f;
    }

    /* renamed from: b */
    public final float mo983b(ViewGroup viewGroup) {
        float f = this.f1178c;
        return f < 0.0f ? (float) (viewGroup.getHeight() / 4) : f;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        ViewGroup viewGroup3 = view;
        TransitionValues transitionValues3 = transitionValues2;
        if (transitionValues3 == null || viewGroup2 == viewGroup3) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        View view2 = view;
        TransitionValues transitionValues4 = transitionValues2;
        Animator a = bks.m3506a(view2, transitionValues4, i, i2, this.f1179d.mo2154a(this, viewGroup, viewGroup3, iArr), this.f1179d.mo2155b(this, viewGroup, viewGroup3, iArr), translationX, view.getTranslationY(), f1171a, this);
        Animator onAppear = this.f1177b.onAppear(viewGroup, viewGroup3, transitionValues, transitionValues3);
        if (a == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a).with(onAppear);
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
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        float a = this.f1179d.mo2154a(this, viewGroup, viewGroup3, iArr);
        Animator a2 = bks.m3506a(view, transitionValues, i, i2, translationX, view.getTranslationY(), a, this.f1179d.mo2155b(this, viewGroup, viewGroup3, iArr), f1171a, this);
        Animator onDisappear = this.f1177b.onDisappear(viewGroup, viewGroup3, transitionValues3, transitionValues2);
        if (a2 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(onDisappear);
        return animatorSet;
    }

    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f1177b.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f1177b.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    /* renamed from: a */
    private final void m1397a(int i) {
        if (i == 48) {
            this.f1179d = f1176i;
        } else if (i == 80) {
            this.f1179d = f1175h;
        } else if (i == 112) {
            this.f1179d = this.f1180j;
        } else if (i == 8388611) {
            this.f1179d = f1172e;
        } else if (i == 8388613) {
            this.f1179d = f1173f;
        } else if (i == 8388615) {
            this.f1179d = f1174g;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }
}
