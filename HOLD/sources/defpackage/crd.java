package defpackage;

import android.animation.Animator;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crd  reason: default package */
/* compiled from: PG */
public final class crd implements Animator.AnimatorListener {
    private final /* synthetic */ HomeTopRowButton a;

    public crd(HomeTopRowButton homeTopRowButton) {
        this.a = homeTopRowButton;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.a.g.setVisibility(0);
    }
}
