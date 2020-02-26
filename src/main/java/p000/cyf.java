package p000;

import android.animation.Animator;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyf */
/* compiled from: PG */
public final class cyf implements Animator.AnimatorListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelButtonView f7912a;

    public cyf(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.f7912a = notificationsPanelButtonView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f7912a.f6642d.setVisibility(0);
    }
}
