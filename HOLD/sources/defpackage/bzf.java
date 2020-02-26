package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bzf  reason: default package */
/* compiled from: PG */
final class bzf implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private Boolean h;
    private volatile String i;
    private volatile Activity j;

    private bzf() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public /* synthetic */ bzf(byte b2) {
    }

    private final void a(Activity activity) {
        a(Boolean.valueOf(ccx.b(activity.getApplicationContext())), activity);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b.incrementAndGet();
        this.j = null;
        for (bzd bzd : this.a) {
            if (bzd instanceof byt) {
                ((byt) bzd).b();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.g.incrementAndGet();
        this.j = null;
        for (bzd bzd : this.a) {
            if (bzd instanceof byu) {
                ((byu) bzd).a();
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.e.incrementAndGet();
        this.i = null;
        for (bzd bzd : this.a) {
            if (bzd instanceof byv) {
                ((byv) bzd).a();
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.d.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (bzd bzd : this.a) {
            if (bzd instanceof byw) {
                ((byw) bzd).a();
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (bzd bzd : this.a) {
            if (bzd instanceof byx) {
                ((byx) bzd).a();
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.c.incrementAndGet();
        this.j = null;
        a(activity);
        for (bzd bzd : this.a) {
            if (bzd instanceof byy) {
                ((byy) bzd).a(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        this.f.incrementAndGet();
        this.j = activity;
        for (bzd bzd : this.a) {
            if (bzd instanceof byz) {
                ((byz) bzd).a();
            }
        }
        a(activity);
    }

    public final void onTrimMemory(int i2) {
        for (bzd bzd : this.a) {
            if (bzd instanceof bzc) {
                ((bzc) bzd).a();
            }
        }
        if (i2 >= 20 && this.j != null) {
            a(false, this.j);
        }
        this.j = null;
    }

    private final void a(Boolean bool, Activity activity) {
        if (bool.equals(this.h)) {
            bog.b("AppLifecycleTracker", "App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.h = bool;
        if (bool.booleanValue()) {
            bog.b("AppLifecycleTracker", "App transition to foreground", new Object[0]);
            for (bzd bzd : this.a) {
                if (bzd instanceof bzb) {
                    ((bzb) bzd).a(activity);
                }
            }
            return;
        }
        bog.b("AppLifecycleTracker", "App transition to background", new Object[0]);
        for (bzd bzd2 : this.a) {
            if (bzd2 instanceof bza) {
                ((bza) bzd2).b(activity);
            }
        }
    }
}
