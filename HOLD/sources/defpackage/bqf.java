package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: bqf  reason: default package */
/* compiled from: PG */
final class bqf implements Runnable {
    private final /* synthetic */ bqp a;

    public bqf(bqp bqp) {
        this.a = bqp;
    }

    public final void run() {
        Context context = this.a.c;
        if (!bof.b.getAndSet(true)) {
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
