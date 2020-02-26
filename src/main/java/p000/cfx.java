package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

/* renamed from: cfx */
/* compiled from: PG */
final class cfx implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ RecyclerView f5442a;

    /* renamed from: b */
    private final /* synthetic */ cga f5443b;

    public cfx(cga cga, RecyclerView recyclerView) {
        this.f5443b = cga;
        this.f5442a = recyclerView;
    }

    public final void onGlobalLayout() {
        if (!this.f5443b.f5452c) {
            this.f5442a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else if (cga.m4693a(this.f5442a)) {
            this.f5443b.mo2748c();
            this.f5442a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
