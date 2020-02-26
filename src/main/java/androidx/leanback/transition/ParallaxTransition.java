package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ParallaxTransition extends Visibility {

    /* renamed from: a */
    private static Interpolator f1181a = new LinearInterpolator();

    public ParallaxTransition() {
    }

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private static final Animator m1401a(View view) {
        if (((C0385oe) view.getTag(R.id.lb_parallax_source)) == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(f1181a);
        ofFloat.addUpdateListener(new C0344mr());
        return ofFloat;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 != null) {
            return m1401a(view);
        }
        return null;
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null) {
            return m1401a(view);
        }
        return null;
    }
}
