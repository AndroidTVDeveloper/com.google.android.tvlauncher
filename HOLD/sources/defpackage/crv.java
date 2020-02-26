package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

/* renamed from: crv  reason: default package */
/* compiled from: PG */
final class crv implements Runnable {
    private final /* synthetic */ crz a;

    public crv(crz crz) {
        this.a = crz;
    }

    public final void run() {
        csa csa = this.a.o;
        if (csa != null) {
            con con = (con) csa;
            con.r.p.removeCallbacks(con.q);
            RecyclerView recyclerView = con.r.o;
            if (recyclerView != null && !recyclerView.l()) {
                con.q.run();
                return;
            }
            Log.w("ChannelItemsAdapter", "list is still computing layout => schedule live progress change");
            con.r.p.post(con.q);
        }
    }
}
