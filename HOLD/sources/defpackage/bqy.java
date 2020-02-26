package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bqy  reason: default package */
/* compiled from: PG */
public final class bqy {
    public static final ExecutorService a;

    static {
        bvj bvj = bvl.a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bul("GAC_Executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
