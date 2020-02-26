package p000;

import android.support.p002v7.widget.ActionBarOverlayLayout;

/* renamed from: gh */
/* compiled from: PG */
public final class C0172gh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9396a;

    public C0172gh(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9396a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f9396a.mo785a();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9396a;
        actionBarOverlayLayout.f989c = actionBarOverlayLayout.f987a.animate().translationY((float) (-this.f9396a.f987a.getHeight())).setListener(this.f9396a.f990d);
    }
}
