package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: cfy  reason: default package */
/* compiled from: PG */
final class cfy implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ cga b;

    public cfy(cga cga, View view) {
        this.b = cga;
        this.a = view;
    }

    public final void onGlobalLayout() {
        if (!this.b.c) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else if (this.a.getVisibility() == 0) {
            this.b.c();
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
