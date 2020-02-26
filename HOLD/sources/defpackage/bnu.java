package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.tvlauncher.R;

/* renamed from: bnu  reason: default package */
/* compiled from: PG */
public final class bnu extends bnv {
    public static final bnu a = new bnu();
    private static final Object d = new Object();

    public final void a(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            new bnt(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String b = bsw.b(context, i);
            String d2 = bsw.d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            aq aqVar = new aq(context);
            aqVar.i = true;
            aqVar.l.flags |= 16;
            aqVar.d = aq.a(b);
            ar arVar = new ar((byte) 0);
            arVar.b = aq.a(d2);
            aqVar.a(arVar);
            if (buj.a(context)) {
                buh.a(buk.a());
                aqVar.a(context.getApplicationInfo().icon);
                aqVar.g = 2;
                buj.b(context);
                aqVar.f = pendingIntent;
            } else {
                aqVar.a(17301642);
                aqVar.l.tickerText = aq.a(resources.getString(R.string.common_google_play_services_notification_ticker));
                aqVar.l.when = System.currentTimeMillis();
                aqVar.f = pendingIntent;
                aqVar.e = aq.a(d2);
            }
            buk.b();
            buh.a(buk.b());
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String a2 = bsw.a(context);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", a2, 4));
            } else if (!a2.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(a2);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            aqVar.k = "com.google.android.gms.availability";
            as asVar = new as(aqVar);
            ar arVar2 = asVar.b.h;
            if (arVar2 != null) {
                int i3 = Build.VERSION.SDK_INT;
                new Notification.BigTextStyle(asVar.a).setBigContentTitle(null).bigText(arVar2.b);
            }
            int i4 = Build.VERSION.SDK_INT;
            Notification build = asVar.a.build();
            int i5 = Build.VERSION.SDK_INT;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = Build.VERSION.SDK_INT;
            if (arVar2 != null) {
                int i8 = Build.VERSION.SDK_INT;
                Bundle bundle = build.extras;
            }
            if (i == 1 || i == 2 || i == 3) {
                bof.b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
