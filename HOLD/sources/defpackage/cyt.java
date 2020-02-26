package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyt  reason: default package */
/* compiled from: PG */
public final class cyt extends jp {
    private final cfp b;
    private Cursor c;

    public cyt(cfp cfp, Cursor cursor) {
        this.c = cursor;
        this.b = cfp;
        a(true);
    }

    public final void a(Cursor cursor) {
        this.c = cursor;
        O();
        cft cft = new cft(1, "tray_notification_count");
        Cursor cursor2 = this.c;
        if (!(cursor2 == null || cursor2.getCount() == 0)) {
            dja f = cft.f();
            int count = this.c.getCount();
            if (f.b) {
                f.b();
                f.b = false;
            }
            dmv dmv = (dmv) f.a;
            dmv dmv2 = dmv.f;
            dmv.a |= 2;
            dmv.c = count;
        }
        this.b.a(cft);
    }

    public final int a() {
        Cursor cursor = this.c;
        if (cursor == null || cursor.isClosed()) {
            return 0;
        }
        return this.c.getCount();
    }

    public final long b(int i) {
        if (this.c.moveToPosition(i)) {
            return (long) this.c.getString(0).hashCode();
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Can't move cursor to position ");
        sb.append(i);
        Log.wtf("NotifsTrayAdapter", sb.toString());
        return -1;
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        Bitmap bitmap;
        if (this.c.moveToPosition(i)) {
            cyy a = cyy.a(this.c);
            cfp cfp = this.b;
            NotificationsTrayItemView notificationsTrayItemView = (NotificationsTrayItemView) kmVar.a;
            notificationsTrayItemView.h = a;
            notificationsTrayItemView.i = a.b;
            notificationsTrayItemView.j = cfp;
            AccessibilityManager accessibilityManager = (AccessibilityManager) notificationsTrayItemView.getContext().getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                notificationsTrayItemView.setFocusable(false);
            } else {
                notificationsTrayItemView.setFocusable(true);
            }
            if ("Notification.NowPlaying".equals(a.p) && (bitmap = a.m) != null) {
                notificationsTrayItemView.a.setImageBitmap(bitmap);
                notificationsTrayItemView.a.setVisibility(0);
                notificationsTrayItemView.c.setVisibility(0);
                notificationsTrayItemView.b.setVisibility(8);
            } else if ("com.android.systemui.pip.tv.PipNotification".equals(a.p)) {
                notificationsTrayItemView.c.setVisibility(8);
                Icon icon = a.h;
                icon.setTint(notificationsTrayItemView.getResources().getColor(R.color.notification_icon_tint, null));
                notificationsTrayItemView.b.setImageIcon(icon);
                notificationsTrayItemView.b.setVisibility(0);
                notificationsTrayItemView.a.setVisibility(8);
            } else {
                notificationsTrayItemView.c.setVisibility(8);
                notificationsTrayItemView.a.setVisibility(8);
                notificationsTrayItemView.b.setVisibility(8);
            }
            String str = a.d;
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, notificationsTrayItemView.d.getText())) {
                notificationsTrayItemView.d.setText(str);
            }
            String str2 = a.e;
            if (TextUtils.isEmpty(str2)) {
                notificationsTrayItemView.e.setVisibility(8);
            } else {
                if (!TextUtils.equals(str2, notificationsTrayItemView.e.getText())) {
                    notificationsTrayItemView.e.setText(str2);
                }
                notificationsTrayItemView.e.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                notificationsTrayItemView.setContentDescription(str2);
            } else if (!TextUtils.isEmpty(str2)) {
                notificationsTrayItemView.setContentDescription(String.format(notificationsTrayItemView.getResources().getString(R.string.notification_content_description_format), str, str2));
            } else {
                notificationsTrayItemView.setContentDescription(str);
            }
            if (a.l) {
                notificationsTrayItemView.g.setVisibility(0);
                notificationsTrayItemView.g.setText(a.n);
                notificationsTrayItemView.g.setOnClickListener(new cyv(notificationsTrayItemView));
            } else {
                notificationsTrayItemView.g.setVisibility(8);
            }
            notificationsTrayItemView.f.setText(a.o);
            if (a.f && !a.g) {
                notificationsTrayItemView.f.setOnClickListener(new cyx(notificationsTrayItemView));
            } else {
                notificationsTrayItemView.f.setOnClickListener(new cyw(notificationsTrayItemView));
            }
        } else {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Index out of bounds for cursor: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.<init>(android.view.View, char):void
     arg types: [android.view.View, int]
     candidates:
      km.<init>(android.view.View, byte):void
      km.<init>(android.view.View, char):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        return new km(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.notification_tray_item, viewGroup, false), 0);
    }
}
