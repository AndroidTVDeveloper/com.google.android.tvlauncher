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

    /* renamed from: a */
    private static final TimeInterpolator f1182a = new DecelerateInterpolator();

    /* renamed from: b */
    private static final TimeInterpolator f1183b = new AccelerateInterpolator();

    /* renamed from: d */
    private static final C0351my f1184d = new C0345ms();

    /* renamed from: e */
    private static final C0351my f1185e = new C0346mt();

    /* renamed from: f */
    private static final C0351my f1186f = new C0347mu();

    /* renamed from: g */
    private static final C0351my f1187g = new C0348mv();

    /* renamed from: h */
    private static final C0351my f1188h = new C0349mw();

    /* renamed from: i */
    private static final C0351my f1189i = new C0350mx();

    /* renamed from: c */
    private C0351my f1190c;

    public SlideKitkat() {
        m1403a(80);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9939i);
        m1403a(obtainStyledAttributes.getInt(3, 80));
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

    /* renamed from: a */
    private static final Animator m1402a(View view, Property property, float f, float f2, float f3, TimeInterpolator timeInterpolator, int i) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f, f2);
        C0355nb nbVar = new C0355nb(view, property, f3, f2, i);
        ofFloat.addListener(nbVar);
        ofFloat.addPauseListener(nbVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b = this.f1190c.mo5594b(view);
        return m1402a(view, this.f1190c.mo5593a(), this.f1190c.mo5592a(view), b, b, f1182a, 0);
    }

    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b = this.f1190c.mo5594b(view);
        return m1402a(view, this.f1190c.mo5593a(), b, this.f1190c.mo5592a(view), b, f1183b, 4);
    }

    /* renamed from: a */
    private final void m1403a(int i) {
        if (i == 3) {
            this.f1190c = f1184d;
        } else if (i == 5) {
            this.f1190c = f1186f;
        } else if (i == 48) {
            this.f1190c = f1185e;
        } else if (i == 80) {
            this.f1190c = f1187g;
        } else if (i == 8388611) {
            this.f1190c = f1188h;
        } else if (i == 8388613) {
            this.f1190c = f1189i;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }
}
