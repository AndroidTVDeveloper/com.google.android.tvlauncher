package defpackage;

import com.google.android.tvlauncher.notifications.NotificationsPanelView;

/* renamed from: cyn  reason: default package */
/* compiled from: PG */
public final class cyn implements jr {
    private final /* synthetic */ NotificationsPanelView a;

    public cyn(NotificationsPanelView notificationsPanelView) {
        this.a = notificationsPanelView;
    }

    public final void a() {
        if (!this.a.l()) {
            NotificationsPanelView notificationsPanelView = this.a;
            if (notificationsPanelView.q) {
                notificationsPanelView.suppressLayout(false);
                this.a.requestLayout();
            }
        }
    }
}
