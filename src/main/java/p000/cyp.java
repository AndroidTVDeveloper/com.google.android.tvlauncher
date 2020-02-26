package p000;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsPanelView;
import com.google.android.tvlauncher.notifications.NotificationsSidePanelActivity;

/* renamed from: cyp */
/* compiled from: PG */
final class cyp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ cyq f7925a;

    public cyp(cyq cyq) {
        this.f7925a = cyq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void run() {
        this.f7925a.f7926a.addView(LayoutInflater.from(new ContextThemeWrapper(this.f7925a.f7927b, (int) R.style.PreferenceThemeOverlayLeanback)).inflate((int) R.layout.notifications_panel_view, this.f7925a.f7926a, false));
        NotificationsSidePanelActivity notificationsSidePanelActivity = this.f7925a.f7927b;
        notificationsSidePanelActivity.f6670d = notificationsSidePanelActivity.findViewById(R.id.no_notifications_message);
        NotificationsSidePanelActivity notificationsSidePanelActivity2 = this.f7925a.f7927b;
        notificationsSidePanelActivity2.f6669c = (NotificationsPanelView) notificationsSidePanelActivity2.findViewById(R.id.notifications_list);
        NotificationsSidePanelActivity notificationsSidePanelActivity3 = this.f7925a.f7927b;
        cyc cyc = notificationsSidePanelActivity3.f6668a;
        cyc.f7906b = notificationsSidePanelActivity3.f6669c;
        cyc.f7906b.mo832a(new cxx());
        NotificationsSidePanelActivity notificationsSidePanelActivity4 = this.f7925a.f7927b;
        notificationsSidePanelActivity4.f6669c.mo831a(notificationsSidePanelActivity4.f6668a);
        this.f7925a.f7927b.getLoaderManager().initLoader(0, null, this.f7925a.f7927b);
        NotificationsSidePanelActivity notificationsSidePanelActivity5 = this.f7925a.f7927b;
        notificationsSidePanelActivity5.f6669c.f6665O = notificationsSidePanelActivity5.f6668a;
    }
}
