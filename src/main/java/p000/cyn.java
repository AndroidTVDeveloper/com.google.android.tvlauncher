package p000;

import com.google.android.tvlauncher.notifications.NotificationsPanelView;

/* renamed from: cyn */
/* compiled from: PG */
public final class cyn implements C0263jr {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelView f7924a;

    public cyn(NotificationsPanelView notificationsPanelView) {
        this.f7924a = notificationsPanelView;
    }

    /* renamed from: a */
    public final void mo3747a() {
        if (!this.f7924a.mo892l()) {
            NotificationsPanelView notificationsPanelView = this.f7924a;
            if (notificationsPanelView.f1077q) {
                notificationsPanelView.suppressLayout(false);
                this.f7924a.requestLayout();
            }
        }
    }
}
