package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: qs  reason: default package */
/* compiled from: PG */
final class qs implements Runnable {
    private final /* synthetic */ qx a;

    public qs(qx qxVar) {
        this.a = qxVar;
    }

    public final void run() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
