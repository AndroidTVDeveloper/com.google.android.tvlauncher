package defpackage;

import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cyr  reason: default package */
/* compiled from: PG */
public final class cyr implements Runnable {
    private final /* synthetic */ NotificationsSidePanelActivity a;

    public cyr(NotificationsSidePanelActivity notificationsSidePanelActivity) {
        this.a = notificationsSidePanelActivity;
    }

    public final void run() {
        this.a.findViewById(R.id.notifications_panel_view).setVisibility(8);
    }
}
