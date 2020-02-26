package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: brg */
/* compiled from: PG */
final class brg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bno f4677a;

    /* renamed from: b */
    private final /* synthetic */ brh f4678b;

    public brg(brh brh, bno bno) {
        this.f4678b = brh;
        this.f4677a = bno;
    }

    public final void run() {
        brh brh = this.f4678b;
        bri bri = brh.f4684f;
        Status status = bri.f4685a;
        bre bre = (bre) bri.f4696k.get(brh.f4680b);
        if (bre == null) {
            return;
        }
        if (this.f4677a.mo2195b()) {
            brh brh2 = this.f4678b;
            brh2.f4683e = true;
            if (!brh2.f4679a.mo2231g()) {
                try {
                    boj boj = this.f4678b.f4679a;
                    boj.mo2226a((btp) null, boj.mo2233i());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    bre.mo2290a(new bno(10));
                }
            } else {
                this.f4678b.mo2353a();
            }
        } else {
            bre.mo2290a(this.f4677a);
        }
    }
}
