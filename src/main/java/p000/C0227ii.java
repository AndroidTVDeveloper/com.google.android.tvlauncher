package p000;

import android.animation.ValueAnimator;

/* renamed from: ii */
/* compiled from: PG */
final class C0227ii implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ C0228ij f9570a;

    public C0227ii(C0228ij ijVar) {
        this.f9570a = ijVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f9570a.f9579b.setAlpha(floatValue);
        this.f9570a.f9580c.setAlpha(floatValue);
        this.f9570a.mo5248a();
    }
}
