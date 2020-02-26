package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyw */
/* compiled from: PG */
final class cyw implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsTrayItemView f7934a;

    public cyw(NotificationsTrayItemView notificationsTrayItemView) {
        this.f7934a = notificationsTrayItemView;
    }

    public final void onClick(View view) {
        this.f7934a.mo3451a(11);
        Context context = view.getContext();
        String str = this.f7934a.f6679i;
        Intent a = dlk.m6963a(context, "com.android.tv.action.NOTIFICATION_HIDE", "android.tvservice.action.NOTIFICATION_HIDE");
        a.setPackage("com.google.android.tvrecommendations");
        a.putExtra("sbn_key", str);
        context.sendBroadcast(a);
    }
}
