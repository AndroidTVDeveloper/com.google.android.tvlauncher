package defpackage;

import androidx.preference.PreferenceGroup;

/* renamed from: qy  reason: default package */
/* compiled from: PG */
public final class qy implements Runnable {
    private final /* synthetic */ PreferenceGroup a;

    public qy(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
