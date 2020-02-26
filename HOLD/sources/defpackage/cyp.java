package defpackage;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsPanelView;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cyp  reason: default package */
/* compiled from: PG */
final class cyp implements Runnable {
    private final /* synthetic */ cyq a;

    public cyp(cyq cyq) {
        this.a = cyq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void run() {
        this.a.a.addView(LayoutInflater.from(new ContextThemeWrapper(this.a.b, (int) R.style.PreferenceThemeOverlayLeanback)).inflate((int) R.layout.notifications_panel_view, this.a.a, false));
        NotificationsSidePanelActivity notificationsSidePanelActivity = this.a.b;
        notificationsSidePanelActivity.d = notificationsSidePanelActivity.findViewById(R.id.no_notifications_message);
        NotificationsSidePanelActivity notificationsSidePanelActivity2 = this.a.b;
        notificationsSidePanelActivity2.c = (NotificationsPanelView) notificationsSidePanelActivity2.findViewById(R.id.notifications_list);
        NotificationsSidePanelActivity notificationsSidePanelActivity3 = this.a.b;
        cyc cyc = notificationsSidePanelActivity3.a;
        cyc.b = notificationsSidePanelActivity3.c;
        cyc.b.a(new cxx());
        NotificationsSidePanelActivity notificationsSidePanelActivity4 = this.a.b;
        notificationsSidePanelActivity4.c.a(notificationsSidePanelActivity4.a);
        this.a.b.getLoaderManager().initLoader(0, null, this.a.b);
        NotificationsSidePanelActivity notificationsSidePanelActivity5 = this.a.b;
        notificationsSidePanelActivity5.c.O = notificationsSidePanelActivity5.a;
    }
}
