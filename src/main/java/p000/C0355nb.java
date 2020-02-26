package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import com.google.android.tvlauncher.R;

/* renamed from: nb */
/* compiled from: PG */
public final class C0355nb extends AnimatorListenerAdapter {

    /* renamed from: a */
    private boolean f9969a = false;

    /* renamed from: b */
    private float f9970b;

    /* renamed from: c */
    private final View f9971c;

    /* renamed from: d */
    private final float f9972d;

    /* renamed from: e */
    private final float f9973e;

    /* renamed from: f */
    private final int f9974f;

    /* renamed from: g */
    private final Property f9975g;

    public C0355nb(View view, Property property, float f, float f2, int i) {
        this.f9975g = property;
        this.f9971c = view;
        this.f9973e = f;
        this.f9972d = f2;
        this.f9974f = i;
        view.setVisibility(0);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9971c.setTag(R.id.lb_slide_transition_value, new float[]{this.f9971c.getTranslationX(), this.f9971c.getTranslationY()});
        this.f9975g.set(this.f9971c, Float.valueOf(this.f9973e));
        this.f9969a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f9969a) {
            this.f9975g.set(this.f9971c, Float.valueOf(this.f9973e));
        }
        this.f9971c.setVisibility(this.f9974f);
    }

    public final void onAnimationPause(Animator animator) {
        this.f9970b = ((Float) this.f9975g.get(this.f9971c)).floatValue();
        this.f9975g.set(this.f9971c, Float.valueOf(this.f9972d));
        this.f9971c.setVisibility(this.f9974f);
    }

    public final void onAnimationResume(Animator animator) {
        this.f9975g.set(this.f9971c, Float.valueOf(this.f9970b));
        this.f9971c.setVisibility(0);
    }
}
