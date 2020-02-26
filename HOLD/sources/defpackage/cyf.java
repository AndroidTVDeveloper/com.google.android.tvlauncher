package defpackage;

import android.animation.Animator;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyf  reason: default package */
/* compiled from: PG */
public final class cyf implements Animator.AnimatorListener {
    private final /* synthetic */ NotificationsPanelButtonView a;

    public cyf(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.a = notificationsPanelButtonView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.a.d.setVisibility(0);
    }
}
