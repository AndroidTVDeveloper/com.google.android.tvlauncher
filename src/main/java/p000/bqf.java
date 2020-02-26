package p000;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: bqf */
/* compiled from: PG */
final class bqf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bqp f4577a;

    public bqf(bqp bqp) {
        this.f4577a = bqp;
    }

    public final void run() {
        Context context = this.f4577a.f4595c;
        if (!bof.f4504b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }
}
