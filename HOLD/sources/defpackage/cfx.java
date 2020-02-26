package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

/* renamed from: cfx  reason: default package */
/* compiled from: PG */
final class cfx implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ RecyclerView a;
    private final /* synthetic */ cga b;

    public cfx(cga cga, RecyclerView recyclerView) {
        this.b = cga;
        this.a = recyclerView;
    }

    public final void onGlobalLayout() {
        if (!this.b.c) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else if (cga.a(this.a)) {
            this.b.c();
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
