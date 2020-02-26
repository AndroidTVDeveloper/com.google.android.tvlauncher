package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ii  reason: default package */
/* compiled from: PG */
final class ii implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ ij a;

    public ii(ij ijVar) {
        this.a = ijVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.a();
    }
}
