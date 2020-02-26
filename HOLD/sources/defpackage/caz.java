package defpackage;

import android.app.Application;
import android.os.Build;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: caz  reason: default package */
/* compiled from: PG */
final class caz implements cat {
    private static final AtomicInteger e = new AtomicInteger();
    public final Application a;
    public final dff b;
    public final AtomicReference c = new AtomicReference();
    public final CountDownLatch d = new CountDownLatch(1);
    private final AtomicBoolean f = new AtomicBoolean();

    public caz(Application application, dff dff) {
        d();
        this.a = (Application) cev.a(application);
        this.b = (dff) cev.a(dff);
        e.incrementAndGet();
        this.c.set(new car());
    }

    private final cat e() {
        return (cat) this.c.get();
    }

    static void d() {
        int i = Build.VERSION.SDK_INT;
    }

    public static Runnable a(Runnable runnable) {
        return new cav(runnable);
    }

    public final void a() {
        ((cat) this.c.getAndSet(new caj())).a();
        try {
            Application application = this.a;
            synchronized (bze.class) {
                if (bze.a != null) {
                    bzg bzg = bze.a.b;
                    application.unregisterActivityLifecycleCallbacks(bzg.a);
                    application.unregisterComponentCallbacks(bzg.a);
                    bze.a = null;
                }
            }
        } catch (RuntimeException e2) {
            bog.c("Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
        }
    }

    public final void c() {
        if (!this.f.getAndSet(true)) {
            e().c();
        }
    }

    public final void b() {
        e().b();
    }
}
