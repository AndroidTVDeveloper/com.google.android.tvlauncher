package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ih */
/* compiled from: PG */
final class C0226ih extends AnimatorListenerAdapter {

    /* renamed from: a */
    private boolean f9568a = false;

    /* renamed from: b */
    private final /* synthetic */ C0228ij f9569b;

    public C0226ih(C0228ij ijVar) {
        this.f9569b = ijVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9568a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f9568a) {
            this.f9568a = false;
        } else if (((Float) this.f9569b.f9591n.getAnimatedValue()).floatValue() == 0.0f) {
            C0228ij ijVar = this.f9569b;
            ijVar.f9592o = 0;
            ijVar.mo5249a(0);
        } else {
            C0228ij ijVar2 = this.f9569b;
            ijVar2.f9592o = 2;
            ijVar2.mo5248a();
        }
    }
}
