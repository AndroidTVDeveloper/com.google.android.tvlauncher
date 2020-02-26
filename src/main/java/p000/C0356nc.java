package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import com.google.android.tvlauncher.R;

/* renamed from: nc */
/* compiled from: PG */
public final class C0356nc extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* renamed from: a */
    private final View f9976a;

    /* renamed from: b */
    private final View f9977b;

    /* renamed from: c */
    private final int f9978c;

    /* renamed from: d */
    private final int f9979d;

    /* renamed from: e */
    private int[] f9980e;

    /* renamed from: f */
    private float f9981f;

    /* renamed from: g */
    private float f9982g;

    /* renamed from: h */
    private final float f9983h;

    /* renamed from: i */
    private final float f9984i;

    public C0356nc(View view, View view2, int i, int i2, float f, float f2) {
        this.f9977b = view;
        this.f9976a = view2;
        this.f9978c = i - Math.round(view.getTranslationX());
        this.f9979d = i2 - Math.round(this.f9977b.getTranslationY());
        this.f9983h = f;
        this.f9984i = f2;
        int[] iArr = (int[]) this.f9976a.getTag(R.id.transitionPosition);
        this.f9980e = iArr;
        if (iArr != null) {
            this.f9976a.setTag(R.id.transitionPosition, null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f9980e == null) {
            this.f9980e = new int[2];
        }
        this.f9980e[0] = Math.round(((float) this.f9978c) + this.f9977b.getTranslationX());
        this.f9980e[1] = Math.round(((float) this.f9979d) + this.f9977b.getTranslationY());
        this.f9976a.setTag(R.id.transitionPosition, this.f9980e);
    }

    public final void onAnimationPause(Animator animator) {
        this.f9981f = this.f9977b.getTranslationX();
        this.f9982g = this.f9977b.getTranslationY();
        this.f9977b.setTranslationX(this.f9983h);
        this.f9977b.setTranslationY(this.f9984i);
    }

    public final void onAnimationResume(Animator animator) {
        this.f9977b.setTranslationX(this.f9981f);
        this.f9977b.setTranslationY(this.f9982g);
    }

    public final void onTransitionEnd(Transition transition) {
        this.f9977b.setTranslationX(this.f9983h);
        this.f9977b.setTranslationY(this.f9984i);
    }
}
