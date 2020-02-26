package defpackage;

import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyv  reason: default package */
/* compiled from: PG */
final class cyv implements View.OnClickListener {
    private final /* synthetic */ NotificationsTrayItemView a;

    public cyv(NotificationsTrayItemView notificationsTrayItemView) {
        this.a = notificationsTrayItemView;
    }

    public final void onClick(View view) {
        this.a.a(10);
        dlk.b(this.a.getContext(), this.a.i);
    }
}
