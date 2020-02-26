package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: cpm  reason: default package */
/* compiled from: PG */
final class cpm extends AnimatorListenerAdapter {
    private final /* synthetic */ cpn a;

    public cpm(cpn cpn) {
        this.a = cpn;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a.A.getAlpha() == 0.0f) {
            this.a.A.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.a.A.setVisibility(0);
    }
}
