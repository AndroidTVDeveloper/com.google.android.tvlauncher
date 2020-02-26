package p000;

import android.app.Application;
import android.os.Build;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: caz */
/* compiled from: PG */
final class caz implements cat {

    /* renamed from: e */
    private static final AtomicInteger f5162e = new AtomicInteger();

    /* renamed from: a */
    public final Application f5163a;

    /* renamed from: b */
    public final dff f5164b;

    /* renamed from: c */
    public final AtomicReference f5165c = new AtomicReference();

    /* renamed from: d */
    public final CountDownLatch f5166d = new CountDownLatch(1);

    /* renamed from: f */
    private final AtomicBoolean f5167f = new AtomicBoolean();

    public caz(Application application, dff dff) {
        m4466d();
        this.f5163a = (Application) cev.m4629a(application);
        this.f5164b = (dff) cev.m4629a(dff);
        f5162e.incrementAndGet();
        this.f5165c.set(new car());
    }

    /* renamed from: e */
    private final cat m4467e() {
        return (cat) this.f5165c.get();
    }

    /* renamed from: d */
    static void m4466d() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static Runnable m4465a(Runnable runnable) {
        return new cav(runnable);
    }

    /* renamed from: a */
    public final void mo2576a() {
        ((cat) this.f5165c.getAndSet(new caj())).mo2576a();
        try {
            Application application = this.f5163a;
            synchronized (bze.class) {
                if (bze.f5034a != null) {
                    bzg bzg = bze.f5034a.f5035b;
                    application.unregisterActivityLifecycleCallbacks(bzg.f5046a);
                    application.unregisterComponentCallbacks(bzg.f5046a);
                    bze.f5034a = null;
                }
            }
        } catch (RuntimeException e) {
            bog.m3837c("Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo2578c() {
        if (!this.f5167f.getAndSet(true)) {
            m4467e().mo2578c();
        }
    }

    /* renamed from: b */
    public final void mo2577b() {
        m4467e().mo2577b();
    }
}
