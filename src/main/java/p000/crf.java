package p000;

import android.animation.Animator;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crf */
/* compiled from: PG */
public final class crf implements Animator.AnimatorListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowButton f7070a;

    public crf(HomeTopRowButton homeTopRowButton) {
        this.f7070a = homeTopRowButton;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f7070a.f6439e.setBackgroundResource(0);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7070a.f6439e.setBackgroundResource(0);
    }
}
