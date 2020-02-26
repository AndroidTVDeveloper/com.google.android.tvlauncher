package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bzf */
/* compiled from: PG */
final class bzf implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    public final List f5036a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final AtomicInteger f5037b = new AtomicInteger();

    /* renamed from: c */
    private final AtomicInteger f5038c = new AtomicInteger();

    /* renamed from: d */
    private final AtomicInteger f5039d = new AtomicInteger();

    /* renamed from: e */
    private final AtomicInteger f5040e = new AtomicInteger();

    /* renamed from: f */
    private final AtomicInteger f5041f = new AtomicInteger();

    /* renamed from: g */
    private final AtomicInteger f5042g = new AtomicInteger();

    /* renamed from: h */
    private Boolean f5043h;

    /* renamed from: i */
    private volatile String f5044i;

    /* renamed from: j */
    private volatile Activity f5045j;

    private bzf() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public /* synthetic */ bzf(byte b) {
    }

    /* renamed from: a */
    private final void m4408a(Activity activity) {
        m4409a(Boolean.valueOf(ccx.m4549b(activity.getApplicationContext())), activity);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f5037b.incrementAndGet();
        this.f5045j = null;
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byt) {
                ((byt) bzd).mo2553b();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f5042g.incrementAndGet();
        this.f5045j = null;
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byu) {
                ((byu) bzd).mo2554a();
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f5040e.incrementAndGet();
        this.f5044i = null;
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byv) {
                ((byv) bzd).mo2555a();
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f5039d.incrementAndGet();
        this.f5045j = null;
        this.f5044i = activity.getClass().getSimpleName();
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byw) {
                ((byw) bzd).mo2556a();
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byx) {
                ((byx) bzd).mo2557a();
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f5038c.incrementAndGet();
        this.f5045j = null;
        m4408a(activity);
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byy) {
                ((byy) bzd).mo2558a(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        this.f5041f.incrementAndGet();
        this.f5045j = activity;
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof byz) {
                ((byz) bzd).mo2559a();
            }
        }
        m4408a(activity);
    }

    public final void onTrimMemory(int i) {
        for (bzd bzd : this.f5036a) {
            if (bzd instanceof bzc) {
                ((bzc) bzd).mo2563a();
            }
        }
        if (i >= 20 && this.f5045j != null) {
            m4409a(false, this.f5045j);
        }
        this.f5045j = null;
    }

    /* renamed from: a */
    private final void m4409a(Boolean bool, Activity activity) {
        if (bool.equals(this.f5043h)) {
            bog.m3835b("AppLifecycleTracker", "App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.f5043h = bool;
        if (bool.booleanValue()) {
            bog.m3835b("AppLifecycleTracker", "App transition to foreground", new Object[0]);
            for (bzd bzd : this.f5036a) {
                if (bzd instanceof bzb) {
                    ((bzb) bzd).mo2562a(activity);
                }
            }
            return;
        }
        bog.m3835b("AppLifecycleTracker", "App transition to background", new Object[0]);
        for (bzd bzd2 : this.f5036a) {
            if (bzd2 instanceof bza) {
                ((bza) bzd2).mo2561b(activity);
            }
        }
    }
}
