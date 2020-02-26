package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyw  reason: default package */
/* compiled from: PG */
final class cyw implements View.OnClickListener {
    private final /* synthetic */ NotificationsTrayItemView a;

    public cyw(NotificationsTrayItemView notificationsTrayItemView) {
        this.a = notificationsTrayItemView;
    }

    public final void onClick(View view) {
        this.a.a(11);
        Context context = view.getContext();
        String str = this.a.i;
        Intent a2 = dlk.a(context, "com.android.tv.action.NOTIFICATION_HIDE", "android.tvservice.action.NOTIFICATION_HIDE");
        a2.setPackage("com.google.android.tvrecommendations");
        a2.putExtra("sbn_key", str);
        context.sendBroadcast(a2);
    }
}
