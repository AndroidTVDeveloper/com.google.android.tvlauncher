package defpackage;

import android.animation.Animator;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: cre  reason: default package */
/* compiled from: PG */
public final class cre implements Animator.AnimatorListener {
    private final /* synthetic */ HomeTopRowButton a;

    public cre(HomeTopRowButton homeTopRowButton) {
        this.a = homeTopRowButton;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        HomeTopRowButton homeTopRowButton = this.a;
        homeTopRowButton.e.setBackgroundColor(homeTopRowButton.a);
    }
}
