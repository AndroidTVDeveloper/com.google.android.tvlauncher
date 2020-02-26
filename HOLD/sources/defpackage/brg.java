package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: brg  reason: default package */
/* compiled from: PG */
final class brg implements Runnable {
    private final /* synthetic */ bno a;
    private final /* synthetic */ brh b;

    public brg(brh brh, bno bno) {
        this.b = brh;
        this.a = bno;
    }

    public final void run() {
        brh brh = this.b;
        bri bri = brh.f;
        Status status = bri.a;
        bre bre = (bre) bri.k.get(brh.b);
        if (bre == null) {
            return;
        }
        if (this.a.b()) {
            brh brh2 = this.b;
            brh2.e = true;
            if (!brh2.a.g()) {
                try {
                    boj boj = this.b.a;
                    boj.a((btp) null, boj.i());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    bre.a(new bno(10));
                }
            } else {
                this.b.a();
            }
        } else {
            bre.a(this.a);
        }
    }
}
