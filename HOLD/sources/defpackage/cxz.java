package defpackage;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxz  reason: default package */
/* compiled from: PG */
final class cxz implements View.OnClickListener {
    private final /* synthetic */ NotificationPanelItemView a;

    public cxz(NotificationPanelItemView notificationPanelItemView) {
        this.a = notificationPanelItemView;
    }

    public final void onClick(View view) {
        dlk.a(this.a.getContext(), this.a.h);
        this.a.a(12);
    }
}
