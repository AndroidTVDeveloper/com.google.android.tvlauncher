package defpackage;

import android.animation.ValueAnimator;

/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
/* compiled from: PG */
final class C0001if implements Runnable {
    private final /* synthetic */ ij a;

    public C0001if(ij ijVar) {
        this.a = ijVar;
    }

    public final void run() {
        ij ijVar = this.a;
        int i = ijVar.o;
        if (i == 1) {
            ijVar.n.cancel();
        } else if (i != 2) {
            return;
        }
        ijVar.o = 3;
        ValueAnimator valueAnimator = ijVar.n;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        ijVar.n.setDuration(500L);
        ijVar.n.start();
    }
}
