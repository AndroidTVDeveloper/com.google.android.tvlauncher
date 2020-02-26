package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: dhf  reason: default package */
/* compiled from: PG */
final class dhf extends dgt implements dhc {
    private final ScheduledFuture b;

    public dhf(dhb dhb, ScheduledFuture scheduledFuture) {
        super(dhb);
        this.b = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = this.a.cancel(z);
        if (cancel) {
            this.b.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }
}
