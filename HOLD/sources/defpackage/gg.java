package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: gg  reason: default package */
/* compiled from: PG */
public final class gg implements Runnable {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public gg(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        this.a.a();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.c = actionBarOverlayLayout.a.animate().translationY(0.0f).setListener(this.a.d);
    }
}
