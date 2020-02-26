package p000;

import androidx.preference.PreferenceGroup;

/* renamed from: qy */
/* compiled from: PG */
public final class C0459qy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ PreferenceGroup f10232a;

    public C0459qy(PreferenceGroup preferenceGroup) {
        this.f10232a = preferenceGroup;
    }

    public final void run() {
        synchronized (this) {
            this.f10232a.f1373a.clear();
        }
    }
}
