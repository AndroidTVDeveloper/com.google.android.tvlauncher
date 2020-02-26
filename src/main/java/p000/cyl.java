package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyl */
/* compiled from: PG */
public final class cyl {

    /* renamed from: a */
    public final Context f7918a;

    /* renamed from: b */
    public final cfp f7919b;

    /* renamed from: c */
    public NotificationsPanelButtonView f7920c;

    /* renamed from: d */
    public int f7921d = 0;

    /* renamed from: e */
    public boolean f7922e;

    public cyl(Context context, cfp cfp) {
        this.f7919b = cfp;
        this.f7918a = context;
        this.f7922e = context.getSharedPreferences("notif_panel_seen_state", 0).getBoolean("notifs_seen", true);
    }

    /* renamed from: a */
    public final void mo3975a(Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            cursor.moveToFirst();
            int i = this.f7921d;
            int i2 = cursor.getInt(cursor.getColumnIndex("count"));
            this.f7921d = i2;
            boolean z = this.f7922e;
            boolean z2 = i >= i2;
            this.f7922e = z2;
            if (z != z2) {
                this.f7918a.getSharedPreferences("notif_panel_seen_state", 0).edit().putBoolean("notifs_seen", this.f7922e).apply();
            }
            cft cft = new cft(1, "notification_indicator_total");
            dja f = cft.mo2733f();
            int i3 = this.f7921d;
            if (f.f8673b) {
                f.mo4505b();
                f.f8673b = false;
            }
            dmv dmv = (dmv) f.f8672a;
            dmv dmv2 = dmv.f8875f;
            int i4 = dmv.f8876a | 1;
            dmv.f8876a = i4;
            dmv.f8877b = i3;
            boolean z3 = this.f7922e;
            dmv.f8876a = i4 | 4;
            dmv.f8879d = !z3;
            this.f7919b.mo2714a(cft);
        }
        mo3974a();
    }

    /* renamed from: a */
    public final void mo3974a() {
        NotificationsPanelButtonView notificationsPanelButtonView = this.f7920c;
        if (notificationsPanelButtonView == null) {
            return;
        }
        if (this.f7921d != 0) {
            notificationsPanelButtonView.setVisibility(0);
            NotificationsPanelButtonView notificationsPanelButtonView2 = this.f7920c;
            int i = this.f7921d;
            if (i > 9) {
                notificationsPanelButtonView2.f6639a.setTextSize(0, notificationsPanelButtonView2.f6656r);
                notificationsPanelButtonView2.f6639a.setText(notificationsPanelButtonView2.f6654p);
            } else {
                notificationsPanelButtonView2.f6639a.setTextSize(0, notificationsPanelButtonView2.f6655q);
                notificationsPanelButtonView2.f6639a.setText(String.format(notificationsPanelButtonView2.f6653o, Integer.valueOf(i)));
            }
            notificationsPanelButtonView2.setContentDescription(notificationsPanelButtonView2.getResources().getQuantityString(R.plurals.notification_panel_icon_accessibility_description, i, Integer.valueOf(i)));
            this.f7920c.mo3443a(this.f7922e);
            return;
        }
        notificationsPanelButtonView.setVisibility(8);
    }
}
