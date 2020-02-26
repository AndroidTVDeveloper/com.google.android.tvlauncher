package defpackage;

import android.animation.ValueAnimator;

/* renamed from: crq  reason: default package */
/* compiled from: PG */
final class crq implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ crz a;

    public crq(crz crz) {
        this.a = crz;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
