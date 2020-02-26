package p000;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: cbm */
/* compiled from: PG */
final class cbm implements RejectedExecutionHandler {
    private cbm() {
    }

    public /* synthetic */ cbm(byte b) {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String valueOf = String.valueOf(runnable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Service rejected execution of ");
        sb.append(valueOf);
        bog.m3832a("PrimesExecutors", sb.toString(), new Object[0]);
    }
}
