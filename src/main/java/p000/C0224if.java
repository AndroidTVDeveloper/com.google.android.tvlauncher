package p000;

import android.animation.ValueAnimator;

/* renamed from: if */
/* compiled from: PG */
final class C0224if implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0228ij f9566a;

    public C0224if(C0228ij ijVar) {
        this.f9566a = ijVar;
    }

    public final void run() {
        C0228ij ijVar = this.f9566a;
        int i = ijVar.f9592o;
        if (i == 1) {
            ijVar.f9591n.cancel();
        } else if (i != 2) {
            return;
        }
        ijVar.f9592o = 3;
        ValueAnimator valueAnimator = ijVar.f9591n;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        ijVar.f9591n.setDuration(500L);
        ijVar.f9591n.start();
    }
}
