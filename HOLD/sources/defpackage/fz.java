package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: fz  reason: default package */
/* compiled from: PG */
final class fz implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ gb a;

    public fz(gb gbVar) {
        this.a = gbVar;
    }

    public final void onGlobalLayout() {
        if (this.a.e()) {
            gb gbVar = this.a;
            if (!gbVar.a.m) {
                View view = gbVar.c;
                if (view != null && view.isShown()) {
                    this.a.a.c();
                } else {
                    this.a.d();
                }
            }
        }
    }
}
