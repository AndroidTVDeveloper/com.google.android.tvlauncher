package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ga  reason: default package */
/* compiled from: PG */
final class ga implements View.OnAttachStateChangeListener {
    private final /* synthetic */ gb a;

    public ga(gb gbVar) {
        this.a = gbVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            gb gbVar = this.a;
            gbVar.d.removeGlobalOnLayoutListener(gbVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
