package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: fh  reason: default package */
/* compiled from: PG */
final class fh implements View.OnAttachStateChangeListener {
    private final /* synthetic */ fl a;

    public fh(fl flVar) {
        this.a = flVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            fl flVar = this.a;
            flVar.e.removeGlobalOnLayoutListener(flVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
