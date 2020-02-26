package p000;

import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bzz */
/* compiled from: PG */
final class bzz {

    /* renamed from: a */
    public final AtomicBoolean f5087a = new AtomicBoolean(false);

    /* renamed from: b */
    public final bzy f5088b;

    /* renamed from: c */
    public ScheduledFuture f5089c;

    /* renamed from: d */
    public ScheduledFuture f5090d;

    /* renamed from: e */
    public final dff f5091e;

    /* renamed from: f */
    public final bze f5092f;

    /* renamed from: g */
    public final bza f5093g = new bzv(this);

    /* renamed from: h */
    public final bzb f5094h = new bzx(this);

    public bzz(bzy bzy, Application application, dff dff) {
        bze a = bze.m4405a(application);
        this.f5088b = bzy;
        this.f5091e = dff;
        this.f5092f = a;
    }

    /* renamed from: a */
    public final void mo2594a() {
        ScheduledFuture scheduledFuture = this.f5089c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f5089c = null;
        }
        ScheduledFuture scheduledFuture2 = this.f5090d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f5090d = null;
        }
    }
}
