package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: fh */
/* compiled from: PG */
final class C0145fh implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C0149fl f9262a;

    public C0145fh(C0149fl flVar) {
        this.f9262a = flVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f9262a.f9275e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9262a.f9275e = view.getViewTreeObserver();
            }
            C0149fl flVar = this.f9262a;
            flVar.f9275e.removeGlobalOnLayoutListener(flVar.f9273c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
