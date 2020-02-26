package p000;

import android.transition.Scene;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cyq */
/* compiled from: PG */
public final class cyq implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f7926a;

    /* renamed from: b */
    public final /* synthetic */ NotificationsSidePanelActivity f7927b;

    public cyq(NotificationsSidePanelActivity notificationsSidePanelActivity, ViewGroup viewGroup) {
        this.f7927b = notificationsSidePanelActivity;
        this.f7926a = viewGroup;
    }

    public final boolean onPreDraw() {
        this.f7926a.getViewTreeObserver().removeOnPreDrawListener(this);
        Scene scene = new Scene(this.f7926a);
        scene.setEnterAction(new cyp(this));
        TransitionManager.go(scene, new Slide(8388613));
        return false;
    }
}
