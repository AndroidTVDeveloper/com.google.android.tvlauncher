package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: jk  reason: default package */
/* compiled from: PG */
public final class jk implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public jk(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        ju juVar = this.a.x;
        if (juVar != null) {
            juVar.a();
        }
        this.a.H = false;
    }
}
