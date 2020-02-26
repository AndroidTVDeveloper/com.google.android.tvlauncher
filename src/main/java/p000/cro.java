package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: cro */
/* compiled from: PG */
public final class cro extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ crz f7072a;

    public cro(crz crz) {
        this.f7072a = crz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7072a.f7133b.f6566b.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        this.f7072a.f7134c.setVisibility(0);
    }
}
