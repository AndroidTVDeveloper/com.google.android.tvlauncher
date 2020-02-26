package defpackage;

import android.animation.Animator;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyi  reason: default package */
/* compiled from: PG */
public final class cyi implements Animator.AnimatorListener {
    private final /* synthetic */ NotificationsPanelButtonView a;

    public cyi(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.a = notificationsPanelButtonView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        NotificationsPanelButtonView notificationsPanelButtonView = this.a;
        notificationsPanelButtonView.c.setBackgroundColor(notificationsPanelButtonView.e);
    }
}
