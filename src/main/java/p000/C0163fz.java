package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: fz */
/* compiled from: PG */
final class C0163fz implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ C0166gb f9364a;

    public C0163fz(C0166gb gbVar) {
        this.f9364a = gbVar;
    }

    public final void onGlobalLayout() {
        if (this.f9364a.mo4850e()) {
            C0166gb gbVar = this.f9364a;
            if (!gbVar.f9369a.f9673m) {
                View view = gbVar.f9371c;
                if (view != null && view.isShown()) {
                    this.f9364a.f9369a.mo4847c();
                } else {
                    this.f9364a.mo4849d();
                }
            }
        }
    }
}
