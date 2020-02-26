package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bpm */
/* compiled from: PG */
public final class bpm implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    public static final bpm f4544a = new bpm();

    /* renamed from: b */
    public final AtomicBoolean f4545b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f4546c = new AtomicBoolean();

    /* renamed from: d */
    public final ArrayList f4547d = new ArrayList();

    /* renamed from: e */
    public boolean f4548e = false;

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    private bpm() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4545b.compareAndSet(true, false);
        this.f4546c.set(true);
        if (compareAndSet) {
            m3906a(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4545b.compareAndSet(true, false);
        this.f4546c.set(true);
        if (compareAndSet) {
            m3906a(false);
        }
    }

    /* renamed from: a */
    private final void m3906a(boolean z) {
        synchronized (f4544a) {
            Iterator it = this.f4547d.iterator();
            while (it.hasNext()) {
                ((bpl) it.next()).mo2269a(z);
            }
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f4545b.compareAndSet(false, true)) {
            this.f4546c.set(true);
            m3906a(true);
        }
    }
}
