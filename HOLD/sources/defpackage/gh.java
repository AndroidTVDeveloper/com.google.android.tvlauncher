package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: gh  reason: default package */
/* compiled from: PG */
public final class gh implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public gh(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.a();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.c = actionBarOverlayLayout.a.animate().translationY((float) (-this.a.a.getHeight())).setListener(this.a.d);
    }
}
