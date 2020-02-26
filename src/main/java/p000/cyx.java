package p000;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyx */
/* compiled from: PG */
final class cyx implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsTrayItemView f7935a;

    public cyx(NotificationsTrayItemView notificationsTrayItemView) {
        this.f7935a = notificationsTrayItemView;
    }

    public final void onClick(View view) {
        this.f7935a.mo3451a(12);
        dlk.m6966a(view.getContext(), this.f7935a.f6679i);
    }
}
