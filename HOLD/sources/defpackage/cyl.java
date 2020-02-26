package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyl  reason: default package */
/* compiled from: PG */
public final class cyl {
    public final Context a;
    public final cfp b;
    public NotificationsPanelButtonView c;
    public int d = 0;
    public boolean e;

    public cyl(Context context, cfp cfp) {
        this.b = cfp;
        this.a = context;
        this.e = context.getSharedPreferences("notif_panel_seen_state", 0).getBoolean("notifs_seen", true);
    }

    public final void a(Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            cursor.moveToFirst();
            int i = this.d;
            int i2 = cursor.getInt(cursor.getColumnIndex("count"));
            this.d = i2;
            boolean z = this.e;
            boolean z2 = i >= i2;
            this.e = z2;
            if (z != z2) {
                this.a.getSharedPreferences("notif_panel_seen_state", 0).edit().putBoolean("notifs_seen", this.e).apply();
            }
            cft cft = new cft(1, "notification_indicator_total");
            dja f = cft.f();
            int i3 = this.d;
            if (f.b) {
                f.b();
                f.b = false;
            }
            dmv dmv = (dmv) f.a;
            dmv dmv2 = dmv.f;
            int i4 = dmv.a | 1;
            dmv.a = i4;
            dmv.b = i3;
            boolean z3 = this.e;
            dmv.a = i4 | 4;
            dmv.d = !z3;
            this.b.a(cft);
        }
        a();
    }

    public final void a() {
        NotificationsPanelButtonView notificationsPanelButtonView = this.c;
        if (notificationsPanelButtonView == null) {
            return;
        }
        if (this.d != 0) {
            notificationsPanelButtonView.setVisibility(0);
            NotificationsPanelButtonView notificationsPanelButtonView2 = this.c;
            int i = this.d;
            if (i > 9) {
                notificationsPanelButtonView2.a.setTextSize(0, notificationsPanelButtonView2.r);
                notificationsPanelButtonView2.a.setText(notificationsPanelButtonView2.p);
            } else {
                notificationsPanelButtonView2.a.setTextSize(0, notificationsPanelButtonView2.q);
                notificationsPanelButtonView2.a.setText(String.format(notificationsPanelButtonView2.o, Integer.valueOf(i)));
            }
            notificationsPanelButtonView2.setContentDescription(notificationsPanelButtonView2.getResources().getQuantityString(R.plurals.notification_panel_icon_accessibility_description, i, Integer.valueOf(i)));
            this.c.a(this.e);
            return;
        }
        notificationsPanelButtonView.setVisibility(8);
    }
}
