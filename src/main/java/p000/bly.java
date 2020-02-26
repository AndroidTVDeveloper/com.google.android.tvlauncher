package p000;

import android.hardware.display.DisplayManager;

/* renamed from: bly */
/* compiled from: PG */
final class bly implements DisplayManager.DisplayListener {

    /* renamed from: a */
    public final DisplayManager f4370a;

    /* renamed from: b */
    private final /* synthetic */ bma f4371b;

    public bly(bma bma, DisplayManager displayManager) {
        this.f4371b = bma;
        this.f4370a = displayManager;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f4371b.mo2138a();
        }
    }
}
