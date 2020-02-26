package p000;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cye */
/* compiled from: PG */
public final class cye implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelButtonView f7911a;

    public cye(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.f7911a = notificationsPanelButtonView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f7911a.f6645g.cancel();
            NotificationsPanelButtonView notificationsPanelButtonView = this.f7911a;
            if (notificationsPanelButtonView.f6657s) {
                notificationsPanelButtonView.f6648j.start();
            } else {
                notificationsPanelButtonView.f6650l.start();
                this.f7911a.f6646h.start();
            }
            this.f7911a.f6652n.start();
            this.f7911a.f6644f.start();
        } else {
            this.f7911a.f6644f.cancel();
            NotificationsPanelButtonView notificationsPanelButtonView2 = this.f7911a;
            if (notificationsPanelButtonView2.f6657s) {
                notificationsPanelButtonView2.f6649k.start();
            } else {
                notificationsPanelButtonView2.f6651m.start();
                this.f7911a.f6647i.start();
            }
            this.f7911a.f6645g.start();
            this.f7911a.f6642d.setVisibility(8);
        }
        this.f7911a.f6642d.setSelected(z);
    }
}
