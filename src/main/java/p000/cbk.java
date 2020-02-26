package p000;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: cbk */
/* compiled from: PG */
final /* synthetic */ class cbk implements dff {
    /* renamed from: a */
    public final Object mo2551a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new cbo(), new cbm((byte) 0));
        scheduledThreadPoolExecutor.setMaximumPoolSize(2);
        return new cbt(new dgo(scheduledThreadPoolExecutor), cbl.f5217a);
    }
}
