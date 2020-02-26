package p000;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyv */
/* compiled from: PG */
final class cyv implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsTrayItemView f7933a;

    public cyv(NotificationsTrayItemView notificationsTrayItemView) {
        this.f7933a = notificationsTrayItemView;
    }

    public final void onClick(View view) {
        this.f7933a.mo3451a(10);
        dlk.m6970b(this.f7933a.getContext(), this.f7933a.f6679i);
    }
}
