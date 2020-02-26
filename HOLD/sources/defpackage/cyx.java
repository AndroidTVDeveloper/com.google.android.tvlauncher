package defpackage;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyx  reason: default package */
/* compiled from: PG */
final class cyx implements View.OnClickListener {
    private final /* synthetic */ NotificationsTrayItemView a;

    public cyx(NotificationsTrayItemView notificationsTrayItemView) {
        this.a = notificationsTrayItemView;
    }

    public final void onClick(View view) {
        this.a.a(12);
        dlk.a(view.getContext(), this.a.i);
    }
}
