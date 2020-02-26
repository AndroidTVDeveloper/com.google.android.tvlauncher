package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

/* renamed from: ccc  reason: default package */
/* compiled from: PG */
public final class ccc implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final /* synthetic */ cce b;

    public ccc(cce cce, Application application) {
        this.b = cce;
        this.a = application;
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b.e == 0) {
            this.b.e = elapsedRealtime;
            this.b.i.c = true;
        }
        cbz cbz = new cbz();
        cbz.a = activity.getClass().getSimpleName();
        cbz.b = elapsedRealtime;
        cce cce = this.b;
        synchronized (cce.j) {
            if (cce.j.size() == 3) {
                cce.j.set(2, cbz);
            } else {
                cce.j.add(cbz);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b.g == 0) {
            this.b.g = SystemClock.elapsedRealtime();
            this.b.i.e = true;
        }
        try {
            View findViewById = activity.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new ccb(this, findViewById));
        } catch (RuntimeException e) {
            bog.a("PrimesStartupMeasure", "Error handling PrimesStartupMeasure's onActivityResume", e, new Object[0]);
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.b.f == 0) {
            this.b.f = SystemClock.elapsedRealtime();
            this.b.i.d = true;
        }
    }
}
