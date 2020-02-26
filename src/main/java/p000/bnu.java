package p000;

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

/* renamed from: bnu */
/* compiled from: PG */
public final class bnu extends bnv {

    /* renamed from: a */
    public static final bnu f4493a = new bnu();

    /* renamed from: d */
    private static final Object f4494d = new Object();

    /* renamed from: a */
    public final void mo2212a(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            new bnt(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String b = bsw.m4145b(context, i);
            String d = bsw.m4147d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0018aq aqVar = new C0018aq(context);
            aqVar.f1765i = true;
            aqVar.f1768l.flags |= 16;
            aqVar.f1760d = C0018aq.m1780a(b);
            C0019ar arVar = new C0019ar((byte) 0);
            arVar.f1943b = C0018aq.m1780a(d);
            aqVar.mo1246a(arVar);
            if (buj.m4248a(context)) {
                buh.m4205a(buk.m4256a());
                aqVar.mo1245a(context.getApplicationInfo().icon);
                aqVar.f1763g = 2;
                buj.m4249b(context);
                aqVar.f1762f = pendingIntent;
            } else {
                aqVar.mo1245a(17301642);
                aqVar.f1768l.tickerText = C0018aq.m1780a(resources.getString(R.string.common_google_play_services_notification_ticker));
                aqVar.f1768l.when = System.currentTimeMillis();
                aqVar.f1762f = pendingIntent;
                aqVar.f1761e = C0018aq.m1780a(d);
            }
            buk.m4258b();
            buh.m4205a(buk.m4258b());
            synchronized (f4494d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String a = bsw.m4140a(context);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", a, 4));
            } else if (!a.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(a);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            aqVar.f1767k = "com.google.android.gms.availability";
            C0020as asVar = new C0020as(aqVar);
            C0019ar arVar2 = asVar.f2154b.f1764h;
            if (arVar2 != null) {
                int i3 = Build.VERSION.SDK_INT;
                new Notification.BigTextStyle(asVar.f2153a).setBigContentTitle(null).bigText(arVar2.f1943b);
            }
            int i4 = Build.VERSION.SDK_INT;
            Notification build = asVar.f2153a.build();
            int i5 = Build.VERSION.SDK_INT;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = Build.VERSION.SDK_INT;
            if (arVar2 != null) {
                int i8 = Build.VERSION.SDK_INT;
                Bundle bundle = build.extras;
            }
            if (i == 1 || i == 2 || i == 3) {
                bof.f4504b.set(false);
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
