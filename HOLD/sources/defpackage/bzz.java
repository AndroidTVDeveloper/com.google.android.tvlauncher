package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bzz  reason: default package */
/* compiled from: PG */
final class bzz {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final bzy b;
    public ScheduledFuture c;
    public ScheduledFuture d;
    public final dff e;
    public final bze f;
    public final bza g = new bzv(this);
    public final bzb h = new bzx(this);

    public bzz(bzy bzy, Application application, dff dff) {
        bze a2 = bze.a(application);
        this.b = bzy;
        this.e = dff;
        this.f = a2;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.c = null;
        }
        ScheduledFuture scheduledFuture2 = this.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.d = null;
        }
    }
}
