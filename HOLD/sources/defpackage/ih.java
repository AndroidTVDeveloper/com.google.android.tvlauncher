package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ih  reason: default package */
/* compiled from: PG */
final class ih extends AnimatorListenerAdapter {
    private boolean a = false;
    private final /* synthetic */ ij b;

    public ih(ij ijVar) {
        this.b = ijVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
        } else if (((Float) this.b.n.getAnimatedValue()).floatValue() == 0.0f) {
            ij ijVar = this.b;
            ijVar.o = 0;
            ijVar.a(0);
        } else {
            ij ijVar2 = this.b;
            ijVar2.o = 2;
            ijVar2.a();
        }
    }
}
