package defpackage;

import android.transition.Transition;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cys  reason: default package */
/* compiled from: PG */
public final class cys implements Transition.TransitionListener {
    private final /* synthetic */ NotificationsSidePanelActivity a;

    public cys(NotificationsSidePanelActivity notificationsSidePanelActivity) {
        this.a = notificationsSidePanelActivity;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        cys.super.finish();
    }

    public final void onTransitionStart(Transition transition) {
        this.a.getWindow().setDimAmount(0.0f);
    }
}
