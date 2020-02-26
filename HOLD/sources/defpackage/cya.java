package defpackage;

import android.net.Uri;

/* renamed from: cya  reason: default package */
/* compiled from: PG */
public final class cya {
    public static final Uri a = Uri.parse("content://com.google.android.tvrecommendations.NotificationContentProvider/notifications");
    public static final Uri b = Uri.parse("content://com.google.android.tvrecommendations.NotificationContentProvider/notifications/tray");
    public static final Uri c = Uri.parse("content://com.google.android.tvrecommendations.NotificationContentProvider/notifications/count");

    static {
        Uri.parse("content://com.google.android.tvrecommendations.NotificationContentProvider/notifications/panel");
        Uri.parse("content://com.google.android.tvrecommendations.NotificationContentProvider/notifications/panel_count");
        Uri.parse("content://com.google.android.tvrecommendations.NotificationContentProvider/notifications/tray_count");
    }
}
