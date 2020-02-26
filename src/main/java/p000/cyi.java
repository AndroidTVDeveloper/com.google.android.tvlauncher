package p000;

import android.animation.Animator;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyi */
/* compiled from: PG */
public final class cyi implements Animator.AnimatorListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelButtonView f7915a;

    public cyi(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.f7915a = notificationsPanelButtonView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        NotificationsPanelButtonView notificationsPanelButtonView = this.f7915a;
        notificationsPanelButtonView.f6641c.setBackgroundColor(notificationsPanelButtonView.f6643e);
    }
}
