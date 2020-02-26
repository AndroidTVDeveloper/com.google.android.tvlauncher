package defpackage;

import android.animation.Animator;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyj  reason: default package */
/* compiled from: PG */
public final class cyj implements Animator.AnimatorListener {
    private final /* synthetic */ NotificationsPanelButtonView a;

    public cyj(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.a = notificationsPanelButtonView;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.c.setBackgroundResource(0);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c.setBackgroundResource(0);
    }
}
