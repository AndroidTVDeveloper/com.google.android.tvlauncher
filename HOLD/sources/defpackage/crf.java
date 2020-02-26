package defpackage;

import android.animation.Animator;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crf  reason: default package */
/* compiled from: PG */
public final class crf implements Animator.AnimatorListener {
    private final /* synthetic */ HomeTopRowButton a;

    public crf(HomeTopRowButton homeTopRowButton) {
        this.a = homeTopRowButton;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.e.setBackgroundResource(0);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.e.setBackgroundResource(0);
    }
}
