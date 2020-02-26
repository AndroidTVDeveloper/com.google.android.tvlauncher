package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: jj */
/* compiled from: PG */
public final class C0255jj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9693a;

    public C0255jj(RecyclerView recyclerView) {
        this.f9693a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f9693a;
        if (recyclerView.f1075o && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.f9693a;
            if (!recyclerView2.f1073m) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f1077q) {
                recyclerView2.f1076p = true;
            } else {
                recyclerView2.mo847c();
            }
        }
    }
}
