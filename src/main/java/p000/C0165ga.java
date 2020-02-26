package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ga */
/* compiled from: PG */
final class C0165ga implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C0166gb f9368a;

    public C0165ga(C0166gb gbVar) {
        this.f9368a = gbVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f9368a.f9372d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9368a.f9372d = view.getViewTreeObserver();
            }
            C0166gb gbVar = this.f9368a;
            gbVar.f9372d.removeGlobalOnLayoutListener(gbVar.f9370b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
