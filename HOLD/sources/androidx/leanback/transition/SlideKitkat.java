package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
class SlideKitkat extends Visibility {
    private static final TimeInterpolator a = new DecelerateInterpolator();
    private static final TimeInterpolator b = new AccelerateInterpolator();
    private static final my d = new ms();
    private static final my e = new mt();
    private static final my f = new mu();
    private static final my g = new mv();
    private static final my h = new mw();
    private static final my i = new mx();
    private my c;

    public SlideKitkat() {
        a(80);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.i);
        a(obtainStyledAttributes.getInt(3, 80));
        long j = (long) obtainStyledAttributes.getInt(1, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = (long) obtainStyledAttributes.getInt(2, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    private static final Animator a(View view, Property property, float f2, float f3, float f4, TimeInterpolator timeInterpolator, int i2) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f2 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f2, f3);
        nb nbVar = new nb(view, property, f4, f3, i2);
        ofFloat.addListener(nbVar);
        ofFloat.addPauseListener(nbVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b2 = this.c.b(view);
        return a(view, this.c.a(), this.c.a(view), b2, b2, a, 0);
    }

    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b2 = this.c.b(view);
        return a(view, this.c.a(), b2, this.c.a(view), b2, b, 4);
    }

    private final void a(int i2) {
        if (i2 == 3) {
            this.c = d;
        } else if (i2 == 5) {
            this.c = f;
        } else if (i2 == 48) {
            this.c = e;
        } else if (i2 == 80) {
            this.c = g;
        } else if (i2 == 8388611) {
            this.c = h;
        } else if (i2 == 8388613) {
            this.c = i;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }
}
