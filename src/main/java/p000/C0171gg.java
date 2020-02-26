package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;

/* renamed from: gg */
/* compiled from: PG */
public final class C0171gg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9395a;

    public C0171gg(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9395a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f9395a.mo785a();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9395a;
        actionBarOverlayLayout.f989c = actionBarOverlayLayout.f987a.animate().translationY(0.0f).setListener(this.f9395a.f990d);
    }
}
