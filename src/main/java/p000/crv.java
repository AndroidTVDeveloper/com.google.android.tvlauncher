package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;

/* renamed from: crv */
/* compiled from: PG */
final class crv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ crz f7080a;

    public crv(crz crz) {
        this.f7080a = crz;
    }

    public final void run() {
        csa csa = this.f7080a.f7146o;
        if (csa != null) {
            con con = (con) csa;
            con.f6782r.f6799p.removeCallbacks(con.f6781q);
            RecyclerView recyclerView = con.f6782r.f6798o;
            if (recyclerView != null && !recyclerView.mo892l()) {
                con.f6781q.run();
                return;
            }
            Log.w("ChannelItemsAdapter", "list is still computing layout => schedule live progress change");
            con.f6782r.f6799p.post(con.f6781q);
        }
    }
}
