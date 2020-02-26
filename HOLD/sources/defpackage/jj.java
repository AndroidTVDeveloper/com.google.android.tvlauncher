package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: jj  reason: default package */
/* compiled from: PG */
public final class jj implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public jj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.o && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.a;
            if (!recyclerView2.m) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.q) {
                recyclerView2.p = true;
            } else {
                recyclerView2.c();
            }
        }
    }
}
