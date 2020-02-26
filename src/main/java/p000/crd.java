package p000;

import android.animation.Animator;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crd */
/* compiled from: PG */
public final class crd implements Animator.AnimatorListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowButton f7068a;

    public crd(HomeTopRowButton homeTopRowButton) {
        this.f7068a = homeTopRowButton;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f7068a.f6441g.setVisibility(0);
    }
}
