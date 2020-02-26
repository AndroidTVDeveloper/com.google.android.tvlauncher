package p000;

import android.transition.Transition;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cys */
/* compiled from: PG */
public final class cys implements Transition.TransitionListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsSidePanelActivity f7929a;

    public cys(NotificationsSidePanelActivity notificationsSidePanelActivity) {
        this.f7929a = notificationsSidePanelActivity;
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
        this.f7929a.getWindow().setDimAmount(0.0f);
    }
}
