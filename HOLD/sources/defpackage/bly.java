package defpackage;

import android.hardware.display.DisplayManager;

/* renamed from: bly  reason: default package */
/* compiled from: PG */
final class bly implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    private final /* synthetic */ bma b;

    public bly(bma bma, DisplayManager displayManager) {
        this.b = bma;
        this.a = displayManager;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.a();
        }
    }
}
