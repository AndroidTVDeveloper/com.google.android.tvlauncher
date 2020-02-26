package p000;

import android.animation.Animator;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: cre */
/* compiled from: PG */
public final class cre implements Animator.AnimatorListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowButton f7069a;

    public cre(HomeTopRowButton homeTopRowButton) {
        this.f7069a = homeTopRowButton;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        HomeTopRowButton homeTopRowButton = this.f7069a;
        homeTopRowButton.f6439e.setBackgroundColor(homeTopRowButton.f6435a);
    }
}
