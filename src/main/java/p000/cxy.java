package p000;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxy */
/* compiled from: PG */
public final class cxy implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationPanelItemView f7897a;

    public cxy(NotificationPanelItemView notificationPanelItemView) {
        this.f7897a = notificationPanelItemView;
    }

    public final void onClick(View view) {
        NotificationPanelItemView notificationPanelItemView = this.f7897a;
        if (notificationPanelItemView.f6618h != null) {
            dlk.m6970b(notificationPanelItemView.getContext(), this.f7897a.f6618h);
            this.f7897a.mo3436a(10);
        }
    }
}
