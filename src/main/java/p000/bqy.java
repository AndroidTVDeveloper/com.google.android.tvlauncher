package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bqy */
/* compiled from: PG */
public final class bqy {

    /* renamed from: a */
    public static final ExecutorService f4658a;

    static {
        bvj bvj = bvl.f4905a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bul("GAC_Executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4658a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
