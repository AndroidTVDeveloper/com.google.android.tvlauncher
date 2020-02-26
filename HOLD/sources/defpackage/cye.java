package defpackage;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cye  reason: default package */
/* compiled from: PG */
public final class cye implements View.OnFocusChangeListener {
    private final /* synthetic */ NotificationsPanelButtonView a;

    public cye(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.a = notificationsPanelButtonView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.g.cancel();
            NotificationsPanelButtonView notificationsPanelButtonView = this.a;
            if (notificationsPanelButtonView.s) {
                notificationsPanelButtonView.j.start();
            } else {
                notificationsPanelButtonView.l.start();
                this.a.h.start();
            }
            this.a.n.start();
            this.a.f.start();
        } else {
            this.a.f.cancel();
            NotificationsPanelButtonView notificationsPanelButtonView2 = this.a;
            if (notificationsPanelButtonView2.s) {
                notificationsPanelButtonView2.k.start();
            } else {
                notificationsPanelButtonView2.m.start();
                this.a.i.start();
            }
            this.a.g.start();
            this.a.d.setVisibility(8);
        }
        this.a.d.setSelected(z);
    }
}
