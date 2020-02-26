package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

/* renamed from: ccc */
/* compiled from: PG */
public final class ccc implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f5239a;

    /* renamed from: b */
    public final /* synthetic */ cce f5240b;

    public ccc(cce cce, Application application) {
        this.f5240b = cce;
        this.f5239a = application;
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
        if (this.f5240b.f5253e == 0) {
            this.f5240b.f5253e = elapsedRealtime;
            this.f5240b.f5257i.f5243c = true;
        }
        cbz cbz = new cbz();
        cbz.f5232a = activity.getClass().getSimpleName();
        cbz.f5233b = elapsedRealtime;
        cce cce = this.f5240b;
        synchronized (cce.f5258j) {
            if (cce.f5258j.size() == 3) {
                cce.f5258j.set(2, cbz);
            } else {
                cce.f5258j.add(cbz);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.f5240b.f5255g == 0) {
            this.f5240b.f5255g = SystemClock.elapsedRealtime();
            this.f5240b.f5257i.f5245e = true;
        }
        try {
            View findViewById = activity.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new ccb(this, findViewById));
        } catch (RuntimeException e) {
            bog.m3831a("PrimesStartupMeasure", "Error handling PrimesStartupMeasure's onActivityResume", e, new Object[0]);
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f5240b.f5254f == 0) {
            this.f5240b.f5254f = SystemClock.elapsedRealtime();
            this.f5240b.f5257i.f5244d = true;
        }
    }
}
