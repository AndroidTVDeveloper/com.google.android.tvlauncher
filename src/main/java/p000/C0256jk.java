package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: jk */
/* compiled from: PG */
public final class C0256jk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9694a;

    public C0256jk(RecyclerView recyclerView) {
        this.f9694a = recyclerView;
    }

    public final void run() {
        C0266ju juVar = this.f9694a.f1084x;
        if (juVar != null) {
            juVar.mo4214a();
        }
        this.f9694a.f1028H = false;
    }
}
