package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: cbk  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cbk implements dff {
    public final Object a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new cbo(), new cbm((byte) 0));
        scheduledThreadPoolExecutor.setMaximumPoolSize(2);
        return new cbt(new dgo(scheduledThreadPoolExecutor), cbl.a);
    }
}
