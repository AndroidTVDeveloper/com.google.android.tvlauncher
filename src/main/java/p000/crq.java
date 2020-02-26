package p000;

import android.animation.ValueAnimator;

/* renamed from: crq */
/* compiled from: PG */
final class crq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ crz f7075a;

    public crq(crz crz) {
        this.f7075a = crz;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7075a.mo3674a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
