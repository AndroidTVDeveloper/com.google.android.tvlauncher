package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: cau  reason: default package */
/* compiled from: PG */
final class cau implements Runnable {
    private final /* synthetic */ ExecutorService a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ caz c;

    public cau(caz caz, ExecutorService executorService, Runnable runnable) {
        this.c = caz;
        this.a = executorService;
        this.b = runnable;
    }

    public final void run() {
        ExecutorService executorService = this.a;
        caz caz = this.c;
        try {
            executorService.submit(this.b);
        } catch (RuntimeException e) {
            bog.b("Primes", "Primes failed to initialize", e, new Object[0]);
            caz.a();
        }
        this.a.shutdown();
    }
}
