package p000;

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

/* renamed from: cyt */
/* compiled from: PG */
public final class cyt extends C0261jp {

    /* renamed from: b */
    private final cfp f7930b;

    /* renamed from: c */
    private Cursor f7931c;

    public cyt(cfp cfp, Cursor cursor) {
        this.f7931c = cursor;
        this.f7930b = cfp;
        mo5308a(true);
    }

    /* renamed from: a */
    public final void mo3985a(Cursor cursor) {
        this.f7931c = cursor;
        mo5303O();
        cft cft = new cft(1, "tray_notification_count");
        Cursor cursor2 = this.f7931c;
        if (!(cursor2 == null || cursor2.getCount() == 0)) {
            dja f = cft.mo2733f();
            int count = this.f7931c.getCount();
            if (f.f8673b) {
                f.mo4505b();
                f.f8673b = false;
            }
            dmv dmv = (dmv) f.f8672a;
            dmv dmv2 = dmv.f8875f;
            dmv.f8876a |= 2;
            dmv.f8878c = count;
        }
        this.f7930b.mo2714a(cft);
    }

    /* renamed from: a */
    public final int mo2794a() {
        Cursor cursor = this.f7931c;
        if (cursor == null || cursor.isClosed()) {
            return 0;
        }
        return this.f7931c.getCount();
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        if (this.f7931c.moveToPosition(i)) {
            return (long) this.f7931c.getString(0).hashCode();
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Can't move cursor to position ");
        sb.append(i);
        Log.wtf("NotifsTrayAdapter", sb.toString());
        return -1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        Bitmap bitmap;
        if (this.f7931c.moveToPosition(i)) {
            cyy a = cyy.m5983a(this.f7931c);
            cfp cfp = this.f7930b;
            NotificationsTrayItemView notificationsTrayItemView = (NotificationsTrayItemView) kmVar.f9783a;
            notificationsTrayItemView.f6678h = a;
            notificationsTrayItemView.f6679i = a.f7937b;
            notificationsTrayItemView.f6680j = cfp;
            AccessibilityManager accessibilityManager = (AccessibilityManager) notificationsTrayItemView.getContext().getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                notificationsTrayItemView.setFocusable(false);
            } else {
                notificationsTrayItemView.setFocusable(true);
            }
            if ("Notification.NowPlaying".equals(a.f7951p) && (bitmap = a.f7948m) != null) {
                notificationsTrayItemView.f6671a.setImageBitmap(bitmap);
                notificationsTrayItemView.f6671a.setVisibility(0);
                notificationsTrayItemView.f6673c.setVisibility(0);
                notificationsTrayItemView.f6672b.setVisibility(8);
            } else if ("com.android.systemui.pip.tv.PipNotification".equals(a.f7951p)) {
                notificationsTrayItemView.f6673c.setVisibility(8);
                Icon icon = a.f7943h;
                icon.setTint(notificationsTrayItemView.getResources().getColor(R.color.notification_icon_tint, null));
                notificationsTrayItemView.f6672b.setImageIcon(icon);
                notificationsTrayItemView.f6672b.setVisibility(0);
                notificationsTrayItemView.f6671a.setVisibility(8);
            } else {
                notificationsTrayItemView.f6673c.setVisibility(8);
                notificationsTrayItemView.f6671a.setVisibility(8);
                notificationsTrayItemView.f6672b.setVisibility(8);
            }
            String str = a.f7939d;
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, notificationsTrayItemView.f6674d.getText())) {
                notificationsTrayItemView.f6674d.setText(str);
            }
            String str2 = a.f7940e;
            if (TextUtils.isEmpty(str2)) {
                notificationsTrayItemView.f6675e.setVisibility(8);
            } else {
                if (!TextUtils.equals(str2, notificationsTrayItemView.f6675e.getText())) {
                    notificationsTrayItemView.f6675e.setText(str2);
                }
                notificationsTrayItemView.f6675e.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                notificationsTrayItemView.setContentDescription(str2);
            } else if (!TextUtils.isEmpty(str2)) {
                notificationsTrayItemView.setContentDescription(String.format(notificationsTrayItemView.getResources().getString(R.string.notification_content_description_format), str, str2));
            } else {
                notificationsTrayItemView.setContentDescription(str);
            }
            if (a.f7947l) {
                notificationsTrayItemView.f6677g.setVisibility(0);
                notificationsTrayItemView.f6677g.setText(a.f7949n);
                notificationsTrayItemView.f6677g.setOnClickListener(new cyv(notificationsTrayItemView));
            } else {
                notificationsTrayItemView.f6677g.setVisibility(8);
            }
            notificationsTrayItemView.f6676f.setText(a.f7950o);
            if (a.f7941f && !a.f7942g) {
                notificationsTrayItemView.f6676f.setOnClickListener(new cyx(notificationsTrayItemView));
            } else {
                notificationsTrayItemView.f6676f.setOnClickListener(new cyw(notificationsTrayItemView));
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
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        return new C0285km(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.notification_tray_item, viewGroup, false), 0);
    }
}
