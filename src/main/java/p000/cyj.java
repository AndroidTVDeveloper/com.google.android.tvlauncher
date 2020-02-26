package p000;

import android.animation.Animator;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyj */
/* compiled from: PG */
public final class cyj implements Animator.AnimatorListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelButtonView f7916a;

    public cyj(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.f7916a = notificationsPanelButtonView;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f7916a.f6641c.setBackgroundResource(0);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7916a.f6641c.setBackgroundResource(0);
    }
}
