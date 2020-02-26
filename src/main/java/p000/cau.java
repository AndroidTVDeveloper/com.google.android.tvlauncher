package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: cau */
/* compiled from: PG */
final class cau implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ExecutorService f5144a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f5145b;

    /* renamed from: c */
    private final /* synthetic */ caz f5146c;

    public cau(caz caz, ExecutorService executorService, Runnable runnable) {
        this.f5146c = caz;
        this.f5144a = executorService;
        this.f5145b = runnable;
    }

    public final void run() {
        ExecutorService executorService = this.f5144a;
        caz caz = this.f5146c;
        try {
            executorService.submit(this.f5145b);
        } catch (RuntimeException e) {
            bog.m3834b("Primes", "Primes failed to initialize", e, new Object[0]);
            caz.mo2576a();
        }
        this.f5144a.shutdown();
    }
}
