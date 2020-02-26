package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: cpm */
/* compiled from: PG */
final class cpm extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ cpn f6888a;

    public cpm(cpn cpn) {
        this.f6888a = cpn;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f6888a.f6889A.getAlpha() == 0.0f) {
            this.f6888a.f6889A.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f6888a.f6889A.setVisibility(0);
    }
}
