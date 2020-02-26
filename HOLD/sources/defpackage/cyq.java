package defpackage;

import android.transition.Scene;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cyq  reason: default package */
/* compiled from: PG */
public final class cyq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ NotificationsSidePanelActivity b;

    public cyq(NotificationsSidePanelActivity notificationsSidePanelActivity, ViewGroup viewGroup) {
        this.b = notificationsSidePanelActivity;
        this.a = viewGroup;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Scene scene = new Scene(this.a);
        scene.setEnterAction(new cyp(this));
        TransitionManager.go(scene, new Slide(8388613));
        return false;
    }
}
