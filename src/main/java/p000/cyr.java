package p000;

import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cyr */
/* compiled from: PG */
public final class cyr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ NotificationsSidePanelActivity f7928a;

    public cyr(NotificationsSidePanelActivity notificationsSidePanelActivity) {
        this.f7928a = notificationsSidePanelActivity;
    }

    public final void run() {
        this.f7928a.findViewById(R.id.notifications_panel_view).setVisibility(8);
    }
}
