package defpackage;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxy  reason: default package */
/* compiled from: PG */
public final class cxy implements View.OnClickListener {
    private final /* synthetic */ NotificationPanelItemView a;

    public cxy(NotificationPanelItemView notificationPanelItemView) {
        this.a = notificationPanelItemView;
    }

    public final void onClick(View view) {
        NotificationPanelItemView notificationPanelItemView = this.a;
        if (notificationPanelItemView.h != null) {
            dlk.b(notificationPanelItemView.getContext(), this.a.h);
            this.a.a(10);
        }
    }
}
