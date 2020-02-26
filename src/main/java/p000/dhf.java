package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: dhf */
/* compiled from: PG */
final class dhf extends dgt implements dhc {

    /* renamed from: b */
    private final ScheduledFuture f8525b;

    public dhf(dhb dhb, ScheduledFuture scheduledFuture) {
        super(dhb);
        this.f8525b = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = this.f8515a.cancel(z);
        if (cancel) {
            this.f8525b.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8525b.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f8525b.getDelay(timeUnit);
    }
}
